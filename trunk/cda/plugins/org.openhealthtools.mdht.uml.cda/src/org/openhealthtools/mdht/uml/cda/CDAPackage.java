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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.CDAFactory
 * @model kind="package"
 * @generated
 */
public interface CDAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cda";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:hl7-org:v3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cda";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDAPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl <em>Clinical Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getClinicalDocument()
	 * @generated
	 */
	int CLINICAL_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__CODE = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__TITLE = 5;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__EFFECTIVE_TIME = 6;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE = 7;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__LANGUAGE_CODE = 8;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__SET_ID = 9;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__VERSION_NUMBER = 10;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__COPY_TIME = 11;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__RECORD_TARGET = 12;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__AUTHOR = 13;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__DATA_ENTERER = 14;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__INFORMANT = 15;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__CUSTODIAN = 16;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__INFORMATION_RECIPIENT = 17;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR = 18;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__AUTHENTICATOR = 19;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__PARTICIPANT = 20;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__IN_FULFILLMENT_OF = 21;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__DOCUMENTATION_OF = 22;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__RELATED_DOCUMENT = 23;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__AUTHORIZATION = 24;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__COMPONENT_OF = 25;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__COMPONENT = 26;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__NULL_FLAVOR = 27;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__CLASS_CODE = 28;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT__MOOD_CODE = 29;

	/**
	 * The number of structural features of the '<em>Clinical Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DOCUMENT_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.InfrastructureRootTypeIdImpl <em>Infrastructure Root Type Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.InfrastructureRootTypeIdImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getInfrastructureRootTypeId()
	 * @generated
	 */
	int INFRASTRUCTURE_ROOT_TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ROOT_TYPE_ID__NULL_FLAVOR = DatatypesPackage.II__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ROOT_TYPE_ID__ROOT = DatatypesPackage.II__ROOT;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ROOT_TYPE_ID__EXTENSION = DatatypesPackage.II__EXTENSION;

	/**
	 * The feature id for the '<em><b>Assigning Authority Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ROOT_TYPE_ID__ASSIGNING_AUTHORITY_NAME = DatatypesPackage.II__ASSIGNING_AUTHORITY_NAME;

	/**
	 * The feature id for the '<em><b>Displayable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ROOT_TYPE_ID__DISPLAYABLE = DatatypesPackage.II__DISPLAYABLE;

	/**
	 * The feature id for the '<em><b>Redefined Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_ROOT = DatatypesPackage.II_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Redefined Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_EXTENSION = DatatypesPackage.II_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Infrastructure Root Type Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ROOT_TYPE_ID_FEATURE_COUNT = DatatypesPackage.II_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.RecordTargetImpl <em>Record Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.RecordTargetImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getRecordTarget()
	 * @generated
	 */
	int RECORD_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TARGET__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TARGET__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TARGET__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Patient Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TARGET__PATIENT_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TARGET__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TARGET__TYPE_CODE = 5;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TARGET__CONTEXT_CONTROL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Record Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TARGET_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.PatientRoleImpl <em>Patient Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.PatientRoleImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getPatientRole()
	 * @generated
	 */
	int PATIENT_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_ROLE__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_ROLE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_ROLE__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_ROLE__ID = 3;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_ROLE__ADDR = 4;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_ROLE__TELECOM = 5;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_ROLE__PATIENT = 6;

	/**
	 * The feature id for the '<em><b>Provider Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_ROLE__PROVIDER_ORGANIZATION = 7;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_ROLE__NULL_FLAVOR = 8;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_ROLE__CLASS_CODE = 9;

	/**
	 * The number of structural features of the '<em>Patient Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_ROLE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.PatientImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 4;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Administrative Gender Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ADMINISTRATIVE_GENDER_CODE = 5;

	/**
	 * The feature id for the '<em><b>Birth Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__BIRTH_TIME = 6;

	/**
	 * The feature id for the '<em><b>Marital Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__MARITAL_STATUS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Religious Affiliation Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__RELIGIOUS_AFFILIATION_CODE = 8;

	/**
	 * The feature id for the '<em><b>Race Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__RACE_CODE = 9;

	/**
	 * The feature id for the '<em><b>Ethnic Group Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ETHNIC_GROUP_CODE = 10;

	/**
	 * The feature id for the '<em><b>Guardian</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__GUARDIAN = 11;

	/**
	 * The feature id for the '<em><b>Birthplace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__BIRTHPLACE = 12;

	/**
	 * The feature id for the '<em><b>Language Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__LANGUAGE_COMMUNICATION = 13;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__NULL_FLAVOR = 14;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__CLASS_CODE = 15;

	/**
	 * The feature id for the '<em><b>Determiner Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__DETERMINER_CODE = 16;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.GuardianImpl <em>Guardian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.GuardianImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getGuardian()
	 * @generated
	 */
	int GUARDIAN = 5;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDIAN__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDIAN__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDIAN__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDIAN__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDIAN__CODE = 4;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDIAN__ADDR = 5;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDIAN__TELECOM = 6;

	/**
	 * The feature id for the '<em><b>Guardian Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDIAN__GUARDIAN_PERSON = 7;

	/**
	 * The feature id for the '<em><b>Guardian Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDIAN__GUARDIAN_ORGANIZATION = 8;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDIAN__NULL_FLAVOR = 9;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDIAN__CLASS_CODE = 10;

	/**
	 * The number of structural features of the '<em>Guardian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDIAN_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.PersonImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 6;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CLASS_CODE = 5;

	/**
	 * The feature id for the '<em><b>Determiner Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DETERMINER_CODE = 6;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 7;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TELECOM = 5;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ADDR = 6;

	/**
	 * The feature id for the '<em><b>Standard Industry Class Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__STANDARD_INDUSTRY_CLASS_CODE = 7;

	/**
	 * The feature id for the '<em><b>As Organization Part Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__AS_ORGANIZATION_PART_OF = 8;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NULL_FLAVOR = 9;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CLASS_CODE = 10;

	/**
	 * The feature id for the '<em><b>Determiner Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DETERMINER_CODE = 11;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.OrganizationPartOfImpl <em>Organization Part Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.OrganizationPartOfImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getOrganizationPartOf()
	 * @generated
	 */
	int ORGANIZATION_PART_OF = 8;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_PART_OF__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_PART_OF__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_PART_OF__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_PART_OF__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_PART_OF__CODE = 4;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_PART_OF__STATUS_CODE = 5;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_PART_OF__EFFECTIVE_TIME = 6;

	/**
	 * The feature id for the '<em><b>Whole Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_PART_OF__WHOLE_ORGANIZATION = 7;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_PART_OF__NULL_FLAVOR = 8;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_PART_OF__CLASS_CODE = 9;

	/**
	 * The number of structural features of the '<em>Organization Part Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_PART_OF_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.BirthplaceImpl <em>Birthplace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.BirthplaceImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getBirthplace()
	 * @generated
	 */
	int BIRTHPLACE = 9;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRTHPLACE__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRTHPLACE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRTHPLACE__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRTHPLACE__PLACE = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRTHPLACE__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRTHPLACE__CLASS_CODE = 5;

	/**
	 * The number of structural features of the '<em>Birthplace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRTHPLACE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.PlaceImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 10;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ADDR = 4;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NULL_FLAVOR = 5;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__CLASS_CODE = 6;

	/**
	 * The feature id for the '<em><b>Determiner Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__DETERMINER_CODE = 7;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.LanguageCommunicationImpl <em>Language Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.LanguageCommunicationImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getLanguageCommunication()
	 * @generated
	 */
	int LANGUAGE_COMMUNICATION = 11;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_COMMUNICATION__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_COMMUNICATION__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_COMMUNICATION__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_COMMUNICATION__LANGUAGE_CODE = 3;

	/**
	 * The feature id for the '<em><b>Mode Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_COMMUNICATION__MODE_CODE = 4;

	/**
	 * The feature id for the '<em><b>Proficiency Level Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_COMMUNICATION__PROFICIENCY_LEVEL_CODE = 5;

	/**
	 * The feature id for the '<em><b>Preference Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_COMMUNICATION__PREFERENCE_IND = 6;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_COMMUNICATION__NULL_FLAVOR = 7;

	/**
	 * The number of structural features of the '<em>Language Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_COMMUNICATION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.AuthorImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 12;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Function Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__FUNCTION_CODE = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__TIME = 4;

	/**
	 * The feature id for the '<em><b>Assigned Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__ASSIGNED_AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__TYPE_CODE = 7;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__CONTEXT_CONTROL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.AssignedAuthorImpl <em>Assigned Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.AssignedAuthorImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getAssignedAuthor()
	 * @generated
	 */
	int ASSIGNED_AUTHOR = 13;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_AUTHOR__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_AUTHOR__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_AUTHOR__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_AUTHOR__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_AUTHOR__CODE = 4;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_AUTHOR__ADDR = 5;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_AUTHOR__TELECOM = 6;

	/**
	 * The feature id for the '<em><b>Assigned Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_AUTHOR__ASSIGNED_PERSON = 7;

	/**
	 * The feature id for the '<em><b>Assigned Authoring Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_AUTHOR__ASSIGNED_AUTHORING_DEVICE = 8;

	/**
	 * The feature id for the '<em><b>Represented Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_AUTHOR__REPRESENTED_ORGANIZATION = 9;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_AUTHOR__NULL_FLAVOR = 10;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_AUTHOR__CLASS_CODE = 11;

	/**
	 * The number of structural features of the '<em>Assigned Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_AUTHOR_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.AuthoringDeviceImpl <em>Authoring Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.AuthoringDeviceImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getAuthoringDevice()
	 * @generated
	 */
	int AUTHORING_DEVICE = 14;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORING_DEVICE__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORING_DEVICE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORING_DEVICE__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORING_DEVICE__CODE = 3;

	/**
	 * The feature id for the '<em><b>Manufacturer Model Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORING_DEVICE__MANUFACTURER_MODEL_NAME = 4;

	/**
	 * The feature id for the '<em><b>Software Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORING_DEVICE__SOFTWARE_NAME = 5;

	/**
	 * The feature id for the '<em><b>As Maintained Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORING_DEVICE__AS_MAINTAINED_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORING_DEVICE__NULL_FLAVOR = 7;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORING_DEVICE__CLASS_CODE = 8;

	/**
	 * The feature id for the '<em><b>Determiner Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORING_DEVICE__DETERMINER_CODE = 9;

	/**
	 * The number of structural features of the '<em>Authoring Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORING_DEVICE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.MaintainedEntityImpl <em>Maintained Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.MaintainedEntityImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getMaintainedEntity()
	 * @generated
	 */
	int MAINTAINED_ENTITY = 15;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINED_ENTITY__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINED_ENTITY__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINED_ENTITY__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINED_ENTITY__EFFECTIVE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Maintaining Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINED_ENTITY__MAINTAINING_PERSON = 4;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINED_ENTITY__NULL_FLAVOR = 5;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINED_ENTITY__CLASS_CODE = 6;

	/**
	 * The number of structural features of the '<em>Maintained Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINED_ENTITY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.DataEntererImpl <em>Data Enterer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.DataEntererImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getDataEnterer()
	 * @generated
	 */
	int DATA_ENTERER = 16;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTERER__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTERER__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTERER__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTERER__TIME = 3;

	/**
	 * The feature id for the '<em><b>Assigned Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTERER__ASSIGNED_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTERER__NULL_FLAVOR = 5;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTERER__TYPE_CODE = 6;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTERER__CONTEXT_CONTROL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Data Enterer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTERER_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl <em>Assigned Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getAssignedEntity()
	 * @generated
	 */
	int ASSIGNED_ENTITY = 17;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_ENTITY__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_ENTITY__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_ENTITY__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_ENTITY__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_ENTITY__CODE = 4;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_ENTITY__ADDR = 5;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_ENTITY__TELECOM = 6;

	/**
	 * The feature id for the '<em><b>Assigned Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_ENTITY__ASSIGNED_PERSON = 7;

	/**
	 * The feature id for the '<em><b>Represented Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION = 8;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_ENTITY__NULL_FLAVOR = 9;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_ENTITY__CLASS_CODE = 10;

	/**
	 * The number of structural features of the '<em>Assigned Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_ENTITY_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.Informant12Impl <em>Informant12</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.Informant12Impl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getInformant12()
	 * @generated
	 */
	int INFORMANT12 = 18;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMANT12__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMANT12__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMANT12__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Assigned Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMANT12__ASSIGNED_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Related Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMANT12__RELATED_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMANT12__NULL_FLAVOR = 5;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMANT12__TYPE_CODE = 6;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMANT12__CONTEXT_CONTROL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Informant12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMANT12_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.RelatedEntityImpl <em>Related Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.RelatedEntityImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getRelatedEntity()
	 * @generated
	 */
	int RELATED_ENTITY = 19;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ENTITY__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ENTITY__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ENTITY__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ENTITY__CODE = 3;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ENTITY__ADDR = 4;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ENTITY__TELECOM = 5;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ENTITY__EFFECTIVE_TIME = 6;

	/**
	 * The feature id for the '<em><b>Related Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ENTITY__RELATED_PERSON = 7;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ENTITY__NULL_FLAVOR = 8;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ENTITY__CLASS_CODE = 9;

	/**
	 * The number of structural features of the '<em>Related Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ENTITY_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.CustodianImpl <em>Custodian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.CustodianImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getCustodian()
	 * @generated
	 */
	int CUSTODIAN = 20;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Assigned Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN__ASSIGNED_CUSTODIAN = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>Custodian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.AssignedCustodianImpl <em>Assigned Custodian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.AssignedCustodianImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getAssignedCustodian()
	 * @generated
	 */
	int ASSIGNED_CUSTODIAN = 21;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_CUSTODIAN__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_CUSTODIAN__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_CUSTODIAN__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Represented Custodian Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_CUSTODIAN__REPRESENTED_CUSTODIAN_ORGANIZATION = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_CUSTODIAN__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_CUSTODIAN__CLASS_CODE = 5;

	/**
	 * The number of structural features of the '<em>Assigned Custodian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNED_CUSTODIAN_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl <em>Custodian Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getCustodianOrganization()
	 * @generated
	 */
	int CUSTODIAN_ORGANIZATION = 22;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN_ORGANIZATION__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN_ORGANIZATION__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN_ORGANIZATION__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN_ORGANIZATION__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN_ORGANIZATION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN_ORGANIZATION__TELECOM = 5;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN_ORGANIZATION__ADDR = 6;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN_ORGANIZATION__NULL_FLAVOR = 7;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN_ORGANIZATION__CLASS_CODE = 8;

	/**
	 * The feature id for the '<em><b>Determiner Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN_ORGANIZATION__DETERMINER_CODE = 9;

	/**
	 * The number of structural features of the '<em>Custodian Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODIAN_ORGANIZATION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.InformationRecipientImpl <em>Information Recipient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.InformationRecipientImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getInformationRecipient()
	 * @generated
	 */
	int INFORMATION_RECIPIENT = 23;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RECIPIENT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RECIPIENT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RECIPIENT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Intended Recipient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RECIPIENT__INTENDED_RECIPIENT = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RECIPIENT__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RECIPIENT__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>Information Recipient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RECIPIENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl <em>Intended Recipient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getIntendedRecipient()
	 * @generated
	 */
	int INTENDED_RECIPIENT = 24;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENDED_RECIPIENT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENDED_RECIPIENT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENDED_RECIPIENT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENDED_RECIPIENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENDED_RECIPIENT__ADDR = 4;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENDED_RECIPIENT__TELECOM = 5;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENDED_RECIPIENT__INFORMATION_RECIPIENT = 6;

	/**
	 * The feature id for the '<em><b>Received Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENDED_RECIPIENT__RECEIVED_ORGANIZATION = 7;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENDED_RECIPIENT__NULL_FLAVOR = 8;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENDED_RECIPIENT__CLASS_CODE = 9;

	/**
	 * The number of structural features of the '<em>Intended Recipient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENDED_RECIPIENT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.LegalAuthenticatorImpl <em>Legal Authenticator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.LegalAuthenticatorImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getLegalAuthenticator()
	 * @generated
	 */
	int LEGAL_AUTHENTICATOR = 25;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_AUTHENTICATOR__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_AUTHENTICATOR__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_AUTHENTICATOR__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_AUTHENTICATOR__TIME = 3;

	/**
	 * The feature id for the '<em><b>Signature Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_AUTHENTICATOR__SIGNATURE_CODE = 4;

	/**
	 * The feature id for the '<em><b>Assigned Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_AUTHENTICATOR__ASSIGNED_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_AUTHENTICATOR__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_AUTHENTICATOR__TYPE_CODE = 7;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_AUTHENTICATOR__CONTEXT_CONTROL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Legal Authenticator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_AUTHENTICATOR_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.AuthenticatorImpl <em>Authenticator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.AuthenticatorImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getAuthenticator()
	 * @generated
	 */
	int AUTHENTICATOR = 26;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__TIME = 3;

	/**
	 * The feature id for the '<em><b>Signature Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__SIGNATURE_CODE = 4;

	/**
	 * The feature id for the '<em><b>Assigned Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__ASSIGNED_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__TYPE_CODE = 7;

	/**
	 * The number of structural features of the '<em>Authenticator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.Participant1Impl <em>Participant1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.Participant1Impl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getParticipant1()
	 * @generated
	 */
	int PARTICIPANT1 = 27;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT1__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT1__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT1__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Function Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT1__FUNCTION_CODE = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT1__TIME = 4;

	/**
	 * The feature id for the '<em><b>Associated Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT1__ASSOCIATED_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT1__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT1__TYPE_CODE = 7;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT1__CONTEXT_CONTROL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Participant1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT1_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.AssociatedEntityImpl <em>Associated Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.AssociatedEntityImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getAssociatedEntity()
	 * @generated
	 */
	int ASSOCIATED_ENTITY = 28;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITY__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITY__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITY__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITY__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITY__CODE = 4;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITY__ADDR = 5;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITY__TELECOM = 6;

	/**
	 * The feature id for the '<em><b>Associated Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITY__ASSOCIATED_PERSON = 7;

	/**
	 * The feature id for the '<em><b>Scoping Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITY__SCOPING_ORGANIZATION = 8;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITY__NULL_FLAVOR = 9;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITY__CLASS_CODE = 10;

	/**
	 * The number of structural features of the '<em>Associated Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITY_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.InFulfillmentOfImpl <em>In Fulfillment Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.InFulfillmentOfImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getInFulfillmentOf()
	 * @generated
	 */
	int IN_FULFILLMENT_OF = 29;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_FULFILLMENT_OF__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_FULFILLMENT_OF__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_FULFILLMENT_OF__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_FULFILLMENT_OF__ORDER = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_FULFILLMENT_OF__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_FULFILLMENT_OF__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>In Fulfillment Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_FULFILLMENT_OF_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.OrderImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 30;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__CODE = 4;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRIORITY_CODE = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__CLASS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__MOOD_CODE = 8;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.DocumentationOfImpl <em>Documentation Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.DocumentationOfImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getDocumentationOf()
	 * @generated
	 */
	int DOCUMENTATION_OF = 31;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OF__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OF__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OF__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Service Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OF__SERVICE_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OF__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OF__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>Documentation Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OF_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ServiceEventImpl <em>Service Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ServiceEventImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getServiceEvent()
	 * @generated
	 */
	int SERVICE_EVENT = 32;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EVENT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EVENT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EVENT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EVENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EVENT__CODE = 4;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EVENT__EFFECTIVE_TIME = 5;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EVENT__PERFORMER = 6;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EVENT__NULL_FLAVOR = 7;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EVENT__CLASS_CODE = 8;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EVENT__MOOD_CODE = 9;

	/**
	 * The number of structural features of the '<em>Service Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EVENT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.Performer1Impl <em>Performer1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.Performer1Impl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getPerformer1()
	 * @generated
	 */
	int PERFORMER1 = 33;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER1__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER1__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER1__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Function Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER1__FUNCTION_CODE = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER1__TIME = 4;

	/**
	 * The feature id for the '<em><b>Assigned Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER1__ASSIGNED_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER1__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER1__TYPE_CODE = 7;

	/**
	 * The number of structural features of the '<em>Performer1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER1_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.RelatedDocumentImpl <em>Related Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.RelatedDocumentImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getRelatedDocument()
	 * @generated
	 */
	int RELATED_DOCUMENT = 34;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_DOCUMENT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_DOCUMENT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_DOCUMENT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Parent Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_DOCUMENT__PARENT_DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_DOCUMENT__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_DOCUMENT__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>Related Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_DOCUMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ParentDocumentImpl <em>Parent Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ParentDocumentImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getParentDocument()
	 * @generated
	 */
	int PARENT_DOCUMENT = 35;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__CODE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__TEXT = 5;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__SET_ID = 6;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__VERSION_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__NULL_FLAVOR = 8;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__CLASS_CODE = 9;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__MOOD_CODE = 10;

	/**
	 * The number of structural features of the '<em>Parent Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.AuthorizationImpl <em>Authorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.AuthorizationImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getAuthorization()
	 * @generated
	 */
	int AUTHORIZATION = 36;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__CONSENT = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ConsentImpl <em>Consent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ConsentImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getConsent()
	 * @generated
	 */
	int CONSENT = 37;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__CODE = 4;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__STATUS_CODE = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__CLASS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__MOOD_CODE = 8;

	/**
	 * The number of structural features of the '<em>Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.Component1Impl <em>Component1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.Component1Impl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getComponent1()
	 * @generated
	 */
	int COMPONENT1 = 38;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT1__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT1__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT1__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Encompassing Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT1__ENCOMPASSING_ENCOUNTER = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT1__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT1__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>Component1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT1_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl <em>Encompassing Encounter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getEncompassingEncounter()
	 * @generated
	 */
	int ENCOMPASSING_ENCOUNTER = 39;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER__CODE = 4;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER__EFFECTIVE_TIME = 5;

	/**
	 * The feature id for the '<em><b>Discharge Disposition Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER__DISCHARGE_DISPOSITION_CODE = 6;

	/**
	 * The feature id for the '<em><b>Responsible Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER__RESPONSIBLE_PARTY = 7;

	/**
	 * The feature id for the '<em><b>Encounter Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER__ENCOUNTER_PARTICIPANT = 8;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER__LOCATION = 9;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER__NULL_FLAVOR = 10;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER__CLASS_CODE = 11;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER__MOOD_CODE = 12;

	/**
	 * The number of structural features of the '<em>Encompassing Encounter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOMPASSING_ENCOUNTER_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ResponsiblePartyImpl <em>Responsible Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ResponsiblePartyImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getResponsibleParty()
	 * @generated
	 */
	int RESPONSIBLE_PARTY = 40;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Assigned Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__ASSIGNED_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>Responsible Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.EncounterParticipantImpl <em>Encounter Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.EncounterParticipantImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getEncounterParticipant()
	 * @generated
	 */
	int ENCOUNTER_PARTICIPANT = 41;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_PARTICIPANT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_PARTICIPANT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_PARTICIPANT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_PARTICIPANT__TIME = 3;

	/**
	 * The feature id for the '<em><b>Assigned Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_PARTICIPANT__ASSIGNED_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_PARTICIPANT__NULL_FLAVOR = 5;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_PARTICIPANT__TYPE_CODE = 6;

	/**
	 * The number of structural features of the '<em>Encounter Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_PARTICIPANT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.LocationImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 42;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Health Care Facility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__HEALTH_CARE_FACILITY = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.HealthCareFacilityImpl <em>Health Care Facility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.HealthCareFacilityImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getHealthCareFacility()
	 * @generated
	 */
	int HEALTH_CARE_FACILITY = 43;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CARE_FACILITY__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CARE_FACILITY__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CARE_FACILITY__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CARE_FACILITY__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CARE_FACILITY__CODE = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CARE_FACILITY__LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Service Provider Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CARE_FACILITY__SERVICE_PROVIDER_ORGANIZATION = 6;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CARE_FACILITY__NULL_FLAVOR = 7;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CARE_FACILITY__CLASS_CODE = 8;

	/**
	 * The number of structural features of the '<em>Health Care Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CARE_FACILITY_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.Component2Impl <em>Component2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.Component2Impl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getComponent2()
	 * @generated
	 */
	int COMPONENT2 = 44;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Non XML Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2__NON_XML_BODY = 3;

	/**
	 * The feature id for the '<em><b>Structured Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2__STRUCTURED_BODY = 4;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2__NULL_FLAVOR = 5;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2__TYPE_CODE = 6;

	/**
	 * The feature id for the '<em><b>Context Conduction Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2__CONTEXT_CONDUCTION_IND = 7;

	/**
	 * The number of structural features of the '<em>Component2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.NonXMLBodyImpl <em>Non XML Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.NonXMLBodyImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getNonXMLBody()
	 * @generated
	 */
	int NON_XML_BODY = 45;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_XML_BODY__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_XML_BODY__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_XML_BODY__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_XML_BODY__TEXT = 3;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_XML_BODY__CONFIDENTIALITY_CODE = 4;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_XML_BODY__LANGUAGE_CODE = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_XML_BODY__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_XML_BODY__CLASS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_XML_BODY__MOOD_CODE = 8;

	/**
	 * The number of structural features of the '<em>Non XML Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_XML_BODY_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.StructuredBodyImpl <em>Structured Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.StructuredBodyImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getStructuredBody()
	 * @generated
	 */
	int STRUCTURED_BODY = 46;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_BODY__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_BODY__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_BODY__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_BODY__CONFIDENTIALITY_CODE = 3;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_BODY__LANGUAGE_CODE = 4;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_BODY__COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_BODY__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_BODY__CLASS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_BODY__MOOD_CODE = 8;

	/**
	 * The number of structural features of the '<em>Structured Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_BODY_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.Component3Impl <em>Component3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.Component3Impl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getComponent3()
	 * @generated
	 */
	int COMPONENT3 = 47;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT3__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT3__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT3__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT3__SECTION = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT3__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT3__TYPE_CODE = 5;

	/**
	 * The feature id for the '<em><b>Context Conduction Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT3__CONTEXT_CONDUCTION_IND = 6;

	/**
	 * The number of structural features of the '<em>Component3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT3_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.SectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 48;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CODE = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TEXT = 6;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONFIDENTIALITY_CODE = 7;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__LANGUAGE_CODE = 8;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SUBJECT = 9;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__AUTHOR = 10;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__INFORMANT = 11;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__COMPONENT = 13;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SECTION_ID = 14;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NULL_FLAVOR = 15;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CLASS_CODE = 16;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__MOOD_CODE = 17;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.StrucDocTextImpl <em>Struc Doc Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.StrucDocTextImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getStrucDocText()
	 * @generated
	 */
	int STRUC_DOC_TEXT = 49;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUC_DOC_TEXT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUC_DOC_TEXT__ANY = 1;

	/**
	 * The number of structural features of the '<em>Struc Doc Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUC_DOC_TEXT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.SubjectImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 50;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Awareness Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__AWARENESS_CODE = 3;

	/**
	 * The feature id for the '<em><b>Related Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__RELATED_SUBJECT = 4;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__NULL_FLAVOR = 5;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__TYPE_CODE = 6;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__CONTEXT_CONTROL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.RelatedSubjectImpl <em>Related Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.RelatedSubjectImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getRelatedSubject()
	 * @generated
	 */
	int RELATED_SUBJECT = 51;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_SUBJECT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_SUBJECT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_SUBJECT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_SUBJECT__CODE = 3;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_SUBJECT__ADDR = 4;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_SUBJECT__TELECOM = 5;

	/**
	 * The feature id for the '<em><b>Subject Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_SUBJECT__SUBJECT_PERSON = 6;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_SUBJECT__NULL_FLAVOR = 7;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_SUBJECT__CLASS_CODE = 8;

	/**
	 * The number of structural features of the '<em>Related Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_SUBJECT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl <em>Subject Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.SubjectPersonImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getSubjectPerson()
	 * @generated
	 */
	int SUBJECT_PERSON = 52;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_PERSON__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_PERSON__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_PERSON__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_PERSON__NAME = 3;

	/**
	 * The feature id for the '<em><b>Administrative Gender Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_PERSON__ADMINISTRATIVE_GENDER_CODE = 4;

	/**
	 * The feature id for the '<em><b>Birth Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_PERSON__BIRTH_TIME = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_PERSON__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_PERSON__CLASS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Determiner Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_PERSON__DETERMINER_CODE = 8;

	/**
	 * The number of structural features of the '<em>Subject Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_PERSON_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.EntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 53;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__ACT = 3;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__ENCOUNTER = 4;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__OBSERVATION = 5;

	/**
	 * The feature id for the '<em><b>Observation Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__OBSERVATION_MEDIA = 6;

	/**
	 * The feature id for the '<em><b>Organizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__ORGANIZER = 7;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__PROCEDURE = 8;

	/**
	 * The feature id for the '<em><b>Region Of Interest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__REGION_OF_INTEREST = 9;

	/**
	 * The feature id for the '<em><b>Substance Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__SUBSTANCE_ADMINISTRATION = 10;

	/**
	 * The feature id for the '<em><b>Supply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__SUPPLY = 11;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__NULL_FLAVOR = 12;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TYPE_CODE = 13;

	/**
	 * The feature id for the '<em><b>Context Conduction Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__CONTEXT_CONDUCTION_IND = 14;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ActImpl <em>Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ActImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getAct()
	 * @generated
	 */
	int ACT = 54;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__CODE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__TEXT = 5;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__STATUS_CODE = 6;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__EFFECTIVE_TIME = 7;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__PRIORITY_CODE = 8;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__LANGUAGE_CODE = 9;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__SUBJECT = 10;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__SPECIMEN = 11;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__PERFORMER = 12;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__AUTHOR = 13;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__INFORMANT = 14;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__PARTICIPANT = 15;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__ENTRY_RELATIONSHIP = 16;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__REFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__PRECONDITION = 18;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__NULL_FLAVOR = 19;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__CLASS_CODE = 20;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__MOOD_CODE = 21;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__NEGATION_IND = 22;

	/**
	 * The number of structural features of the '<em>Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_FEATURE_COUNT = 23;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.SpecimenImpl <em>Specimen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.SpecimenImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getSpecimen()
	 * @generated
	 */
	int SPECIMEN = 55;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Specimen Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN__SPECIMEN_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>Specimen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.SpecimenRoleImpl <em>Specimen Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.SpecimenRoleImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getSpecimenRole()
	 * @generated
	 */
	int SPECIMEN_ROLE = 56;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN_ROLE__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN_ROLE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN_ROLE__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN_ROLE__ID = 3;

	/**
	 * The feature id for the '<em><b>Specimen Playing Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN_ROLE__SPECIMEN_PLAYING_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN_ROLE__NULL_FLAVOR = 5;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN_ROLE__CLASS_CODE = 6;

	/**
	 * The number of structural features of the '<em>Specimen Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIMEN_ROLE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl <em>Playing Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getPlayingEntity()
	 * @generated
	 */
	int PLAYING_ENTITY = 57;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYING_ENTITY__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYING_ENTITY__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYING_ENTITY__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYING_ENTITY__CODE = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYING_ENTITY__QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYING_ENTITY__NAME = 5;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYING_ENTITY__DESC = 6;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYING_ENTITY__NULL_FLAVOR = 7;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYING_ENTITY__CLASS_CODE = 8;

	/**
	 * The feature id for the '<em><b>Determiner Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYING_ENTITY__DETERMINER_CODE = 9;

	/**
	 * The number of structural features of the '<em>Playing Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYING_ENTITY_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.Performer2Impl <em>Performer2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.Performer2Impl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getPerformer2()
	 * @generated
	 */
	int PERFORMER2 = 58;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER2__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER2__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER2__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER2__TIME = 3;

	/**
	 * The feature id for the '<em><b>Mode Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER2__MODE_CODE = 4;

	/**
	 * The feature id for the '<em><b>Assigned Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER2__ASSIGNED_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER2__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER2__TYPE_CODE = 7;

	/**
	 * The number of structural features of the '<em>Performer2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER2_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.Participant2Impl <em>Participant2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.Participant2Impl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getParticipant2()
	 * @generated
	 */
	int PARTICIPANT2 = 59;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT2__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT2__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT2__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT2__TIME = 3;

	/**
	 * The feature id for the '<em><b>Awareness Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT2__AWARENESS_CODE = 4;

	/**
	 * The feature id for the '<em><b>Participant Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT2__PARTICIPANT_ROLE = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT2__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT2__TYPE_CODE = 7;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT2__CONTEXT_CONTROL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Participant2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT2_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl <em>Participant Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getParticipantRole()
	 * @generated
	 */
	int PARTICIPANT_ROLE = 60;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__CODE = 4;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__ADDR = 5;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__TELECOM = 6;

	/**
	 * The feature id for the '<em><b>Playing Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__PLAYING_DEVICE = 7;

	/**
	 * The feature id for the '<em><b>Playing Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__PLAYING_ENTITY = 8;

	/**
	 * The feature id for the '<em><b>Scoping Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__SCOPING_ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__NULL_FLAVOR = 10;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__CLASS_CODE = 11;

	/**
	 * The number of structural features of the '<em>Participant Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.DeviceImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 61;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CODE = 3;

	/**
	 * The feature id for the '<em><b>Manufacturer Model Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__MANUFACTURER_MODEL_NAME = 4;

	/**
	 * The feature id for the '<em><b>Software Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__SOFTWARE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CLASS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Determiner Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DETERMINER_CODE = 8;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.EntityImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 62;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CODE = 4;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DESC = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CLASS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Determiner Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DETERMINER_CODE = 8;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.EntryRelationshipImpl <em>Entry Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.EntryRelationshipImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getEntryRelationship()
	 * @generated
	 */
	int ENTRY_RELATIONSHIP = 63;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__SEQUENCE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Seperatable Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__SEPERATABLE_IND = 4;

	/**
	 * The feature id for the '<em><b>Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__ACT = 5;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__ENCOUNTER = 6;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__OBSERVATION = 7;

	/**
	 * The feature id for the '<em><b>Observation Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__OBSERVATION_MEDIA = 8;

	/**
	 * The feature id for the '<em><b>Organizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__ORGANIZER = 9;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__PROCEDURE = 10;

	/**
	 * The feature id for the '<em><b>Region Of Interest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__REGION_OF_INTEREST = 11;

	/**
	 * The feature id for the '<em><b>Substance Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__SUBSTANCE_ADMINISTRATION = 12;

	/**
	 * The feature id for the '<em><b>Supply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__SUPPLY = 13;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__NULL_FLAVOR = 14;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__TYPE_CODE = 15;

	/**
	 * The feature id for the '<em><b>Inversion Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__INVERSION_IND = 16;

	/**
	 * The feature id for the '<em><b>Context Conduction Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__CONTEXT_CONDUCTION_IND = 17;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__NEGATION_IND = 18;

	/**
	 * The number of structural features of the '<em>Entry Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.EncounterImpl <em>Encounter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.EncounterImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getEncounter()
	 * @generated
	 */
	int ENCOUNTER = 64;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__CODE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__TEXT = 5;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__STATUS_CODE = 6;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__EFFECTIVE_TIME = 7;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__PRIORITY_CODE = 8;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__SUBJECT = 9;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__SPECIMEN = 10;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__PERFORMER = 11;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__AUTHOR = 12;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__INFORMANT = 13;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__PARTICIPANT = 14;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__ENTRY_RELATIONSHIP = 15;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__REFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__PRECONDITION = 17;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__NULL_FLAVOR = 18;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__CLASS_CODE = 19;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__MOOD_CODE = 20;

	/**
	 * The number of structural features of the '<em>Encounter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ReferenceImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 65;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Seperatable Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SEPERATABLE_IND = 3;

	/**
	 * The feature id for the '<em><b>External Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__EXTERNAL_ACT = 4;

	/**
	 * The feature id for the '<em><b>External Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__EXTERNAL_OBSERVATION = 5;

	/**
	 * The feature id for the '<em><b>External Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__EXTERNAL_PROCEDURE = 6;

	/**
	 * The feature id for the '<em><b>External Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__EXTERNAL_DOCUMENT = 7;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NULL_FLAVOR = 8;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TYPE_CODE = 9;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ExternalActImpl <em>External Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ExternalActImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getExternalAct()
	 * @generated
	 */
	int EXTERNAL_ACT = 66;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACT__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACT__CODE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACT__TEXT = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACT__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACT__CLASS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACT__MOOD_CODE = 8;

	/**
	 * The number of structural features of the '<em>External Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ExternalObservationImpl <em>External Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ExternalObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getExternalObservation()
	 * @generated
	 */
	int EXTERNAL_OBSERVATION = 67;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBSERVATION__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBSERVATION__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBSERVATION__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBSERVATION__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBSERVATION__CODE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBSERVATION__TEXT = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBSERVATION__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBSERVATION__CLASS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBSERVATION__MOOD_CODE = 8;

	/**
	 * The number of structural features of the '<em>External Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBSERVATION_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ExternalProcedureImpl <em>External Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ExternalProcedureImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getExternalProcedure()
	 * @generated
	 */
	int EXTERNAL_PROCEDURE = 68;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROCEDURE__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROCEDURE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROCEDURE__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROCEDURE__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROCEDURE__CODE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROCEDURE__TEXT = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROCEDURE__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROCEDURE__CLASS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROCEDURE__MOOD_CODE = 8;

	/**
	 * The number of structural features of the '<em>External Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PROCEDURE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ExternalDocumentImpl <em>External Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ExternalDocumentImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getExternalDocument()
	 * @generated
	 */
	int EXTERNAL_DOCUMENT = 69;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCUMENT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCUMENT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCUMENT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCUMENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCUMENT__CODE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCUMENT__TEXT = 5;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCUMENT__SET_ID = 6;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCUMENT__VERSION_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCUMENT__NULL_FLAVOR = 8;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCUMENT__CLASS_CODE = 9;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCUMENT__MOOD_CODE = 10;

	/**
	 * The number of structural features of the '<em>External Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCUMENT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.PreconditionImpl <em>Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.PreconditionImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getPrecondition()
	 * @generated
	 */
	int PRECONDITION = 70;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__CRITERION = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.CriterionImpl <em>Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.CriterionImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getCriterion()
	 * @generated
	 */
	int CRITERION = 71;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__CODE = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__VALUE = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__CLASS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__MOOD_CODE = 8;

	/**
	 * The number of structural features of the '<em>Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ObservationImpl <em>Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getObservation()
	 * @generated
	 */
	int OBSERVATION = 72;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__CODE = 4;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__DERIVATION_EXPR = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__TEXT = 6;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__STATUS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__EFFECTIVE_TIME = 8;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__PRIORITY_CODE = 9;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__REPEAT_NUMBER = 10;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__LANGUAGE_CODE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__VALUE = 12;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__INTERPRETATION_CODE = 13;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__METHOD_CODE = 14;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__TARGET_SITE_CODE = 15;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__SUBJECT = 16;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__SPECIMEN = 17;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__PERFORMER = 18;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__AUTHOR = 19;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__INFORMANT = 20;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__PARTICIPANT = 21;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__ENTRY_RELATIONSHIP = 22;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__REFERENCE = 23;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__PRECONDITION = 24;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__REFERENCE_RANGE = 25;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__NULL_FLAVOR = 26;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__CLASS_CODE = 27;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__MOOD_CODE = 28;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__NEGATION_IND = 29;

	/**
	 * The number of structural features of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ReferenceRangeImpl <em>Reference Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ReferenceRangeImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getReferenceRange()
	 * @generated
	 */
	int REFERENCE_RANGE = 73;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Observation Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__OBSERVATION_RANGE = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>Reference Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ObservationRangeImpl <em>Observation Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ObservationRangeImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getObservationRange()
	 * @generated
	 */
	int OBSERVATION_RANGE = 74;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_RANGE__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_RANGE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_RANGE__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_RANGE__CODE = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_RANGE__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_RANGE__VALUE = 5;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_RANGE__INTERPRETATION_CODE = 6;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_RANGE__NULL_FLAVOR = 7;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_RANGE__CLASS_CODE = 8;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_RANGE__MOOD_CODE = 9;

	/**
	 * The number of structural features of the '<em>Observation Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_RANGE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl <em>Observation Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ObservationMediaImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getObservationMedia()
	 * @generated
	 */
	int OBSERVATION_MEDIA = 75;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__ID = 3;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__LANGUAGE_CODE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__VALUE = 5;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__SUBJECT = 6;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__SPECIMEN = 7;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__PERFORMER = 8;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__AUTHOR = 9;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__INFORMANT = 10;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__PARTICIPANT = 11;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__ENTRY_RELATIONSHIP = 12;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__PRECONDITION = 14;

	/**
	 * The feature id for the '<em><b>Observation Media Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__OBSERVATION_MEDIA_ID = 15;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__NULL_FLAVOR = 16;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__CLASS_CODE = 17;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA__MOOD_CODE = 18;

	/**
	 * The number of structural features of the '<em>Observation Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_MEDIA_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl <em>Organizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getOrganizer()
	 * @generated
	 */
	int ORGANIZER = 76;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__CODE = 4;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__STATUS_CODE = 5;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__EFFECTIVE_TIME = 6;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__SUBJECT = 7;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__SPECIMEN = 8;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__PERFORMER = 9;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__AUTHOR = 10;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__INFORMANT = 11;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__PARTICIPANT = 12;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__PRECONDITION = 14;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__COMPONENT = 15;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__NULL_FLAVOR = 16;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__CLASS_CODE = 17;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER__MOOD_CODE = 18;

	/**
	 * The number of structural features of the '<em>Organizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZER_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl <em>Component4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.Component4Impl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getComponent4()
	 * @generated
	 */
	int COMPONENT4 = 77;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__SEQUENCE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Seperatable Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__SEPERATABLE_IND = 4;

	/**
	 * The feature id for the '<em><b>Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__ACT = 5;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__ENCOUNTER = 6;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__OBSERVATION = 7;

	/**
	 * The feature id for the '<em><b>Observation Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__OBSERVATION_MEDIA = 8;

	/**
	 * The feature id for the '<em><b>Organizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__ORGANIZER = 9;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__PROCEDURE = 10;

	/**
	 * The feature id for the '<em><b>Region Of Interest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__REGION_OF_INTEREST = 11;

	/**
	 * The feature id for the '<em><b>Substance Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__SUBSTANCE_ADMINISTRATION = 12;

	/**
	 * The feature id for the '<em><b>Supply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__SUPPLY = 13;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__NULL_FLAVOR = 14;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__TYPE_CODE = 15;

	/**
	 * The feature id for the '<em><b>Context Conduction Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4__CONTEXT_CONDUCTION_IND = 16;

	/**
	 * The number of structural features of the '<em>Component4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT4_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ProcedureImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 78;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CODE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TEXT = 5;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__STATUS_CODE = 6;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__EFFECTIVE_TIME = 7;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PRIORITY_CODE = 8;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__LANGUAGE_CODE = 9;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__METHOD_CODE = 10;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__APPROACH_SITE_CODE = 11;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TARGET_SITE_CODE = 12;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__SUBJECT = 13;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__SPECIMEN = 14;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PERFORMER = 15;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__AUTHOR = 16;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__INFORMANT = 17;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PARTICIPANT = 18;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ENTRY_RELATIONSHIP = 19;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__REFERENCE = 20;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PRECONDITION = 21;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NULL_FLAVOR = 22;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CLASS_CODE = 23;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__MOOD_CODE = 24;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NEGATION_IND = 25;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl <em>Region Of Interest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getRegionOfInterest()
	 * @generated
	 */
	int REGION_OF_INTEREST = 79;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__CODE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__VALUE = 5;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__SUBJECT = 6;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__SPECIMEN = 7;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__PERFORMER = 8;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__AUTHOR = 9;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__INFORMANT = 10;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__PARTICIPANT = 11;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__ENTRY_RELATIONSHIP = 12;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__PRECONDITION = 14;

	/**
	 * The feature id for the '<em><b>Region Of Interest Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__REGION_OF_INTEREST_ID = 15;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__NULL_FLAVOR = 16;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__CLASS_CODE = 17;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST__MOOD_CODE = 18;

	/**
	 * The number of structural features of the '<em>Region Of Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestValueImpl <em>Region Of Interest Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.RegionOfInterestValueImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getRegionOfInterestValue()
	 * @generated
	 */
	int REGION_OF_INTEREST_VALUE = 80;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST_VALUE__NULL_FLAVOR = DatatypesPackage.INT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST_VALUE__VALUE = DatatypesPackage.INT__VALUE;

	/**
	 * The feature id for the '<em><b>Unsorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST_VALUE__UNSORTED = DatatypesPackage.INT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Region Of Interest Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OF_INTEREST_VALUE_FEATURE_COUNT = DatatypesPackage.INT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl <em>Substance Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getSubstanceAdministration()
	 * @generated
	 */
	int SUBSTANCE_ADMINISTRATION = 81;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__CODE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__TEXT = 5;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__STATUS_CODE = 6;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME = 7;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__PRIORITY_CODE = 8;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER = 9;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__ROUTE_CODE = 10;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE = 11;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY = 12;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__RATE_QUANTITY = 13;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY = 14;

	/**
	 * The feature id for the '<em><b>Administrative Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__ADMINISTRATIVE_UNIT_CODE = 15;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__SUBJECT = 16;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__SPECIMEN = 17;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__CONSUMABLE = 18;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__PERFORMER = 19;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__AUTHOR = 20;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__INFORMANT = 21;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__REFERENCE = 22;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__PARTICIPANT = 23;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP = 24;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__PRECONDITION = 25;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__NULL_FLAVOR = 26;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__CLASS_CODE = 27;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__MOOD_CODE = 28;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION__NEGATION_IND = 29;

	/**
	 * The number of structural features of the '<em>Substance Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ConsumableImpl <em>Consumable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ConsumableImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getConsumable()
	 * @generated
	 */
	int CONSUMABLE = 82;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMABLE__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMABLE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMABLE__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Manufactured Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMABLE__MANUFACTURED_PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMABLE__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMABLE__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>Consumable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMABLE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl <em>Manufactured Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getManufacturedProduct()
	 * @generated
	 */
	int MANUFACTURED_PRODUCT = 83;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURED_PRODUCT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURED_PRODUCT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURED_PRODUCT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURED_PRODUCT__ID = 3;

	/**
	 * The feature id for the '<em><b>Manufactured Labeled Drug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURED_PRODUCT__MANUFACTURED_LABELED_DRUG = 4;

	/**
	 * The feature id for the '<em><b>Manufactured Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURED_PRODUCT__MANUFACTURED_MATERIAL = 5;

	/**
	 * The feature id for the '<em><b>Manufacturer Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURED_PRODUCT__MANUFACTURER_ORGANIZATION = 6;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURED_PRODUCT__NULL_FLAVOR = 7;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURED_PRODUCT__CLASS_CODE = 8;

	/**
	 * The number of structural features of the '<em>Manufactured Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURED_PRODUCT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.LabeledDrugImpl <em>Labeled Drug</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.LabeledDrugImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getLabeledDrug()
	 * @generated
	 */
	int LABELED_DRUG = 84;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_DRUG__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_DRUG__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_DRUG__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_DRUG__CODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_DRUG__NAME = 4;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_DRUG__NULL_FLAVOR = 5;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_DRUG__CLASS_CODE = 6;

	/**
	 * The feature id for the '<em><b>Determiner Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_DRUG__DETERMINER_CODE = 7;

	/**
	 * The number of structural features of the '<em>Labeled Drug</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_DRUG_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.MaterialImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getMaterial()
	 * @generated
	 */
	int MATERIAL = 85;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__CODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__NAME = 4;

	/**
	 * The feature id for the '<em><b>Lot Number Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__LOT_NUMBER_TEXT = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__NULL_FLAVOR = 6;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__CLASS_CODE = 7;

	/**
	 * The feature id for the '<em><b>Determiner Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__DETERMINER_CODE = 8;

	/**
	 * The number of structural features of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.SupplyImpl <em>Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.SupplyImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getSupply()
	 * @generated
	 */
	int SUPPLY = 86;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__ID = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__CODE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__TEXT = 5;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__STATUS_CODE = 6;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__EFFECTIVE_TIME = 7;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__PRIORITY_CODE = 8;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__REPEAT_NUMBER = 9;

	/**
	 * The feature id for the '<em><b>Independent Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__INDEPENDENT_IND = 10;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__QUANTITY = 11;

	/**
	 * The feature id for the '<em><b>Expected Use Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__EXPECTED_USE_TIME = 12;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__SUBJECT = 13;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__SPECIMEN = 14;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__PRODUCT = 15;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__PERFORMER = 16;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__AUTHOR = 17;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__INFORMANT = 18;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__PARTICIPANT = 19;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__ENTRY_RELATIONSHIP = 20;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__REFERENCE = 21;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__PRECONDITION = 22;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__NULL_FLAVOR = 23;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__CLASS_CODE = 24;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__MOOD_CODE = 25;

	/**
	 * The number of structural features of the '<em>Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.ProductImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 87;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Manufactured Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MANUFACTURED_PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TYPE_CODE = 5;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.Component5Impl <em>Component5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.Component5Impl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getComponent5()
	 * @generated
	 */
	int COMPONENT5 = 88;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT5__REALM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT5__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT5__TEMPLATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT5__SECTION = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT5__NULL_FLAVOR = 4;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT5__TYPE_CODE = 5;

	/**
	 * The feature id for the '<em><b>Context Conduction Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT5__CONTEXT_CONDUCTION_IND = 6;

	/**
	 * The number of structural features of the '<em>Component5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT5_FEATURE_COUNT = 7;


	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.impl.DocumentRootImpl
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 89;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Clinical Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLINICAL_DOCUMENT = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.RegistryDelegate <em>Registry Delegate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.RegistryDelegate
	 * @see org.openhealthtools.mdht.uml.cda.impl.CDAPackageImpl#getRegistryDelegate()
	 * @generated
	 */
	int REGISTRY_DELEGATE = 90;

	/**
	 * The number of structural features of the '<em>Registry Delegate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_DELEGATE_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clinical Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	EClass getClinicalDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getRealmCodes()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getTypeId()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getTemplateIds()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getId()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getCode()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getTitle()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getEffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effective Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getEffectiveTime()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_EffectiveTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getConfidentialityCode <em>Confidentiality Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidentiality Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getConfidentialityCode()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_ConfidentialityCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getLanguageCode()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_LanguageCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getSetId <em>Set Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getSetId()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_SetId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getVersionNumber <em>Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Number</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getVersionNumber()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_VersionNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getCopyTime <em>Copy Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copy Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getCopyTime()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_CopyTime();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getRecordTargets <em>Record Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record Target</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getRecordTargets()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_RecordTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getAuthors <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getAuthors()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_Author();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getDataEnterer <em>Data Enterer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Enterer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getDataEnterer()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_DataEnterer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getInformants <em>Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getInformants()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_Informant();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getCustodian <em>Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custodian</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getCustodian()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_Custodian();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getInformationRecipients <em>Information Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information Recipient</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getInformationRecipients()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_InformationRecipient();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getLegalAuthenticator <em>Legal Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legal Authenticator</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getLegalAuthenticator()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_LegalAuthenticator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getAuthenticators <em>Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authenticator</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getAuthenticators()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_Authenticator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getParticipants <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getParticipants()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getInFulfillmentOfs <em>In Fulfillment Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Fulfillment Of</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getInFulfillmentOfs()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_InFulfillmentOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getDocumentationOfs <em>Documentation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation Of</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getDocumentationOfs()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_DocumentationOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getRelatedDocuments <em>Related Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getRelatedDocuments()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_RelatedDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getAuthorizations <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getAuthorizations()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_Authorization();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getComponentOf <em>Component Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Of</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getComponentOf()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_ComponentOf();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getComponent()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EReference getClinicalDocument_Component();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getNullFlavor()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EAttribute getClinicalDocument_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getClassCode()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EAttribute getClinicalDocument_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument#getMoodCode()
	 * @see #getClinicalDocument()
	 * @generated
	 */
	EAttribute getClinicalDocument_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId <em>Infrastructure Root Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Root Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId
	 * @generated
	 */
	EClass getInfrastructureRootTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId <em>Redefined Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redefined Root</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId
	 * @see #getInfrastructureRootTypeId()
	 * @generated
	 */
	EAttribute getInfrastructureRootTypeId_RedefinedRoot();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId <em>Redefined Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redefined Extension</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId
	 * @see #getInfrastructureRootTypeId()
	 * @generated
	 */
	EAttribute getInfrastructureRootTypeId_RedefinedExtension();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.RecordTarget <em>Record Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Target</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RecordTarget
	 * @generated
	 */
	EClass getRecordTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RecordTarget#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RecordTarget#getRealmCodes()
	 * @see #getRecordTarget()
	 * @generated
	 */
	EReference getRecordTarget_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RecordTarget#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RecordTarget#getTypeId()
	 * @see #getRecordTarget()
	 * @generated
	 */
	EReference getRecordTarget_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RecordTarget#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RecordTarget#getTemplateIds()
	 * @see #getRecordTarget()
	 * @generated
	 */
	EReference getRecordTarget_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RecordTarget#getPatientRole <em>Patient Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patient Role</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RecordTarget#getPatientRole()
	 * @see #getRecordTarget()
	 * @generated
	 */
	EReference getRecordTarget_PatientRole();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RecordTarget#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RecordTarget#getNullFlavor()
	 * @see #getRecordTarget()
	 * @generated
	 */
	EAttribute getRecordTarget_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RecordTarget#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RecordTarget#getTypeCode()
	 * @see #getRecordTarget()
	 * @generated
	 */
	EAttribute getRecordTarget_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RecordTarget#getContextControlCode <em>Context Control Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Control Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RecordTarget#getContextControlCode()
	 * @see #getRecordTarget()
	 * @generated
	 */
	EAttribute getRecordTarget_ContextControlCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.PatientRole <em>Patient Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Role</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PatientRole
	 * @generated
	 */
	EClass getPatientRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.PatientRole#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PatientRole#getRealmCodes()
	 * @see #getPatientRole()
	 * @generated
	 */
	EReference getPatientRole_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.PatientRole#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PatientRole#getTypeId()
	 * @see #getPatientRole()
	 * @generated
	 */
	EReference getPatientRole_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.PatientRole#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PatientRole#getTemplateIds()
	 * @see #getPatientRole()
	 * @generated
	 */
	EReference getPatientRole_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.PatientRole#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PatientRole#getIds()
	 * @see #getPatientRole()
	 * @generated
	 */
	EReference getPatientRole_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.PatientRole#getAddrs <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addr</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PatientRole#getAddrs()
	 * @see #getPatientRole()
	 * @generated
	 */
	EReference getPatientRole_Addr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.PatientRole#getTelecoms <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PatientRole#getTelecoms()
	 * @see #getPatientRole()
	 * @generated
	 */
	EReference getPatientRole_Telecom();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.PatientRole#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patient</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PatientRole#getPatient()
	 * @see #getPatientRole()
	 * @generated
	 */
	EReference getPatientRole_Patient();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.PatientRole#getProviderOrganization <em>Provider Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provider Organization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PatientRole#getProviderOrganization()
	 * @see #getPatientRole()
	 * @generated
	 */
	EReference getPatientRole_ProviderOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.PatientRole#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PatientRole#getNullFlavor()
	 * @see #getPatientRole()
	 * @generated
	 */
	EAttribute getPatientRole_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.PatientRole#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PatientRole#getClassCode()
	 * @see #getPatientRole()
	 * @generated
	 */
	EAttribute getPatientRole_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Patient#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getRealmCodes()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Patient#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getTypeId()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Patient#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getTemplateIds()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Patient#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getId()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Patient#getNames <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getNames()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Patient#getAdministrativeGenderCode <em>Administrative Gender Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administrative Gender Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getAdministrativeGenderCode()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_AdministrativeGenderCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Patient#getBirthTime <em>Birth Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Birth Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getBirthTime()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_BirthTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Patient#getMaritalStatusCode <em>Marital Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marital Status Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getMaritalStatusCode()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_MaritalStatusCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Patient#getReligiousAffiliationCode <em>Religious Affiliation Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Religious Affiliation Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getReligiousAffiliationCode()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_ReligiousAffiliationCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Patient#getRaceCode <em>Race Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Race Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getRaceCode()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_RaceCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Patient#getEthnicGroupCode <em>Ethnic Group Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ethnic Group Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getEthnicGroupCode()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_EthnicGroupCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Patient#getGuardians <em>Guardian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guardian</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getGuardians()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Guardian();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Patient#getBirthplace <em>Birthplace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Birthplace</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getBirthplace()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Birthplace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Patient#getLanguageCommunications <em>Language Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language Communication</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getLanguageCommunications()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_LanguageCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Patient#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getNullFlavor()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Patient#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getClassCode()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Patient#getDeterminerCode <em>Determiner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determiner Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Patient#getDeterminerCode()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_DeterminerCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Guardian <em>Guardian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guardian</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Guardian
	 * @generated
	 */
	EClass getGuardian();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Guardian#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Guardian#getRealmCodes()
	 * @see #getGuardian()
	 * @generated
	 */
	EReference getGuardian_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Guardian#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Guardian#getTypeId()
	 * @see #getGuardian()
	 * @generated
	 */
	EReference getGuardian_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Guardian#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Guardian#getTemplateIds()
	 * @see #getGuardian()
	 * @generated
	 */
	EReference getGuardian_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Guardian#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Guardian#getIds()
	 * @see #getGuardian()
	 * @generated
	 */
	EReference getGuardian_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Guardian#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Guardian#getCode()
	 * @see #getGuardian()
	 * @generated
	 */
	EReference getGuardian_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Guardian#getAddrs <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addr</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Guardian#getAddrs()
	 * @see #getGuardian()
	 * @generated
	 */
	EReference getGuardian_Addr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Guardian#getTelecoms <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Guardian#getTelecoms()
	 * @see #getGuardian()
	 * @generated
	 */
	EReference getGuardian_Telecom();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Guardian#getGuardianPerson <em>Guardian Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guardian Person</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Guardian#getGuardianPerson()
	 * @see #getGuardian()
	 * @generated
	 */
	EReference getGuardian_GuardianPerson();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Guardian#getGuardianOrganization <em>Guardian Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guardian Organization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Guardian#getGuardianOrganization()
	 * @see #getGuardian()
	 * @generated
	 */
	EReference getGuardian_GuardianOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Guardian#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Guardian#getNullFlavor()
	 * @see #getGuardian()
	 * @generated
	 */
	EAttribute getGuardian_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Guardian#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Guardian#getClassCode()
	 * @see #getGuardian()
	 * @generated
	 */
	EAttribute getGuardian_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Person#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Person#getRealmCodes()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Person#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Person#getTypeId()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Person#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Person#getTemplateIds()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Person#getNames <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Person#getNames()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Person#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Person#getNullFlavor()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Person#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Person#getClassCode()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Person#getDeterminerCode <em>Determiner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determiner Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Person#getDeterminerCode()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DeterminerCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organization#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organization#getRealmCodes()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Organization#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organization#getTypeId()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organization#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organization#getTemplateIds()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organization#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organization#getIds()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organization#getNames <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organization#getNames()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organization#getTelecoms <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organization#getTelecoms()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Telecom();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organization#getAddrs <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addr</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organization#getAddrs()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Addr();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Organization#getStandardIndustryClassCode <em>Standard Industry Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standard Industry Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organization#getStandardIndustryClassCode()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_StandardIndustryClassCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Organization#getAsOrganizationPartOf <em>As Organization Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>As Organization Part Of</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organization#getAsOrganizationPartOf()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_AsOrganizationPartOf();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Organization#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organization#getNullFlavor()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Organization#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organization#getClassCode()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Organization#getDeterminerCode <em>Determiner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determiner Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organization#getDeterminerCode()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_DeterminerCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.OrganizationPartOf <em>Organization Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Part Of</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.OrganizationPartOf
	 * @generated
	 */
	EClass getOrganizationPartOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getRealmCodes()
	 * @see #getOrganizationPartOf()
	 * @generated
	 */
	EReference getOrganizationPartOf_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getTypeId()
	 * @see #getOrganizationPartOf()
	 * @generated
	 */
	EReference getOrganizationPartOf_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getTemplateIds()
	 * @see #getOrganizationPartOf()
	 * @generated
	 */
	EReference getOrganizationPartOf_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getIds()
	 * @see #getOrganizationPartOf()
	 * @generated
	 */
	EReference getOrganizationPartOf_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getCode()
	 * @see #getOrganizationPartOf()
	 * @generated
	 */
	EReference getOrganizationPartOf_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getStatusCode()
	 * @see #getOrganizationPartOf()
	 * @generated
	 */
	EReference getOrganizationPartOf_StatusCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getEffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effective Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getEffectiveTime()
	 * @see #getOrganizationPartOf()
	 * @generated
	 */
	EReference getOrganizationPartOf_EffectiveTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getWholeOrganization <em>Whole Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Whole Organization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getWholeOrganization()
	 * @see #getOrganizationPartOf()
	 * @generated
	 */
	EReference getOrganizationPartOf_WholeOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getNullFlavor()
	 * @see #getOrganizationPartOf()
	 * @generated
	 */
	EAttribute getOrganizationPartOf_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.OrganizationPartOf#getClassCode()
	 * @see #getOrganizationPartOf()
	 * @generated
	 */
	EAttribute getOrganizationPartOf_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Birthplace <em>Birthplace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Birthplace</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Birthplace
	 * @generated
	 */
	EClass getBirthplace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Birthplace#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Birthplace#getRealmCodes()
	 * @see #getBirthplace()
	 * @generated
	 */
	EReference getBirthplace_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Birthplace#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Birthplace#getTypeId()
	 * @see #getBirthplace()
	 * @generated
	 */
	EReference getBirthplace_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Birthplace#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Birthplace#getTemplateIds()
	 * @see #getBirthplace()
	 * @generated
	 */
	EReference getBirthplace_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Birthplace#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Place</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Birthplace#getPlace()
	 * @see #getBirthplace()
	 * @generated
	 */
	EReference getBirthplace_Place();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Birthplace#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Birthplace#getNullFlavor()
	 * @see #getBirthplace()
	 * @generated
	 */
	EAttribute getBirthplace_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Birthplace#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Birthplace#getClassCode()
	 * @see #getBirthplace()
	 * @generated
	 */
	EAttribute getBirthplace_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Place#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Place#getRealmCodes()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Place#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Place#getTypeId()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Place#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Place#getTemplateIds()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Place#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Place#getName()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Place#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Addr</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Place#getAddr()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Addr();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Place#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Place#getNullFlavor()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Place#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Place#getClassCode()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Place#getDeterminerCode <em>Determiner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determiner Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Place#getDeterminerCode()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_DeterminerCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.LanguageCommunication <em>Language Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Communication</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LanguageCommunication
	 * @generated
	 */
	EClass getLanguageCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.LanguageCommunication#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LanguageCommunication#getRealmCodes()
	 * @see #getLanguageCommunication()
	 * @generated
	 */
	EReference getLanguageCommunication_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.LanguageCommunication#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LanguageCommunication#getTypeId()
	 * @see #getLanguageCommunication()
	 * @generated
	 */
	EReference getLanguageCommunication_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.LanguageCommunication#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LanguageCommunication#getTemplateIds()
	 * @see #getLanguageCommunication()
	 * @generated
	 */
	EReference getLanguageCommunication_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.LanguageCommunication#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LanguageCommunication#getLanguageCode()
	 * @see #getLanguageCommunication()
	 * @generated
	 */
	EReference getLanguageCommunication_LanguageCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.LanguageCommunication#getModeCode <em>Mode Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mode Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LanguageCommunication#getModeCode()
	 * @see #getLanguageCommunication()
	 * @generated
	 */
	EReference getLanguageCommunication_ModeCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.LanguageCommunication#getProficiencyLevelCode <em>Proficiency Level Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Proficiency Level Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LanguageCommunication#getProficiencyLevelCode()
	 * @see #getLanguageCommunication()
	 * @generated
	 */
	EReference getLanguageCommunication_ProficiencyLevelCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.LanguageCommunication#getPreferenceInd <em>Preference Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preference Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LanguageCommunication#getPreferenceInd()
	 * @see #getLanguageCommunication()
	 * @generated
	 */
	EReference getLanguageCommunication_PreferenceInd();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.LanguageCommunication#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LanguageCommunication#getNullFlavor()
	 * @see #getLanguageCommunication()
	 * @generated
	 */
	EAttribute getLanguageCommunication_NullFlavor();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Author#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Author#getRealmCodes()
	 * @see #getAuthor()
	 * @generated
	 */
	EReference getAuthor_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Author#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Author#getTypeId()
	 * @see #getAuthor()
	 * @generated
	 */
	EReference getAuthor_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Author#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Author#getTemplateIds()
	 * @see #getAuthor()
	 * @generated
	 */
	EReference getAuthor_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Author#getFunctionCode <em>Function Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Author#getFunctionCode()
	 * @see #getAuthor()
	 * @generated
	 */
	EReference getAuthor_FunctionCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Author#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Author#getTime()
	 * @see #getAuthor()
	 * @generated
	 */
	EReference getAuthor_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Author#getAssignedAuthor <em>Assigned Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Author#getAssignedAuthor()
	 * @see #getAuthor()
	 * @generated
	 */
	EReference getAuthor_AssignedAuthor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Author#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Author#getNullFlavor()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Author#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Author#getTypeCode()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Author#getContextControlCode <em>Context Control Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Control Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Author#getContextControlCode()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_ContextControlCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor <em>Assigned Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assigned Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor
	 * @generated
	 */
	EClass getAssignedAuthor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor#getRealmCodes()
	 * @see #getAssignedAuthor()
	 * @generated
	 */
	EReference getAssignedAuthor_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor#getTypeId()
	 * @see #getAssignedAuthor()
	 * @generated
	 */
	EReference getAssignedAuthor_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor#getTemplateIds()
	 * @see #getAssignedAuthor()
	 * @generated
	 */
	EReference getAssignedAuthor_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor#getIds()
	 * @see #getAssignedAuthor()
	 * @generated
	 */
	EReference getAssignedAuthor_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor#getCode()
	 * @see #getAssignedAuthor()
	 * @generated
	 */
	EReference getAssignedAuthor_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor#getAddrs <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addr</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor#getAddrs()
	 * @see #getAssignedAuthor()
	 * @generated
	 */
	EReference getAssignedAuthor_Addr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor#getTelecoms <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor#getTelecoms()
	 * @see #getAssignedAuthor()
	 * @generated
	 */
	EReference getAssignedAuthor_Telecom();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor#getAssignedPerson <em>Assigned Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Person</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor#getAssignedPerson()
	 * @see #getAssignedAuthor()
	 * @generated
	 */
	EReference getAssignedAuthor_AssignedPerson();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor#getAssignedAuthoringDevice <em>Assigned Authoring Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Authoring Device</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor#getAssignedAuthoringDevice()
	 * @see #getAssignedAuthor()
	 * @generated
	 */
	EReference getAssignedAuthor_AssignedAuthoringDevice();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor#getRepresentedOrganization <em>Represented Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Represented Organization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor#getRepresentedOrganization()
	 * @see #getAssignedAuthor()
	 * @generated
	 */
	EReference getAssignedAuthor_RepresentedOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor#getNullFlavor()
	 * @see #getAssignedAuthor()
	 * @generated
	 */
	EAttribute getAssignedAuthor_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedAuthor#getClassCode()
	 * @see #getAssignedAuthor()
	 * @generated
	 */
	EAttribute getAssignedAuthor_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.AuthoringDevice <em>Authoring Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authoring Device</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AuthoringDevice
	 * @generated
	 */
	EClass getAuthoringDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AuthoringDevice#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AuthoringDevice#getRealmCodes()
	 * @see #getAuthoringDevice()
	 * @generated
	 */
	EReference getAuthoringDevice_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AuthoringDevice#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AuthoringDevice#getTypeId()
	 * @see #getAuthoringDevice()
	 * @generated
	 */
	EReference getAuthoringDevice_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AuthoringDevice#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AuthoringDevice#getTemplateIds()
	 * @see #getAuthoringDevice()
	 * @generated
	 */
	EReference getAuthoringDevice_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AuthoringDevice#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AuthoringDevice#getCode()
	 * @see #getAuthoringDevice()
	 * @generated
	 */
	EReference getAuthoringDevice_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AuthoringDevice#getManufacturerModelName <em>Manufacturer Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manufacturer Model Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AuthoringDevice#getManufacturerModelName()
	 * @see #getAuthoringDevice()
	 * @generated
	 */
	EReference getAuthoringDevice_ManufacturerModelName();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AuthoringDevice#getSoftwareName <em>Software Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AuthoringDevice#getSoftwareName()
	 * @see #getAuthoringDevice()
	 * @generated
	 */
	EReference getAuthoringDevice_SoftwareName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AuthoringDevice#getAsMaintainedEntities <em>As Maintained Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>As Maintained Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AuthoringDevice#getAsMaintainedEntities()
	 * @see #getAuthoringDevice()
	 * @generated
	 */
	EReference getAuthoringDevice_AsMaintainedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.AuthoringDevice#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AuthoringDevice#getNullFlavor()
	 * @see #getAuthoringDevice()
	 * @generated
	 */
	EAttribute getAuthoringDevice_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.AuthoringDevice#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AuthoringDevice#getClassCode()
	 * @see #getAuthoringDevice()
	 * @generated
	 */
	EAttribute getAuthoringDevice_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.AuthoringDevice#getDeterminerCode <em>Determiner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determiner Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AuthoringDevice#getDeterminerCode()
	 * @see #getAuthoringDevice()
	 * @generated
	 */
	EAttribute getAuthoringDevice_DeterminerCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.MaintainedEntity <em>Maintained Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintained Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.MaintainedEntity
	 * @generated
	 */
	EClass getMaintainedEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.MaintainedEntity#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.MaintainedEntity#getRealmCodes()
	 * @see #getMaintainedEntity()
	 * @generated
	 */
	EReference getMaintainedEntity_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.MaintainedEntity#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.MaintainedEntity#getTypeId()
	 * @see #getMaintainedEntity()
	 * @generated
	 */
	EReference getMaintainedEntity_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.MaintainedEntity#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.MaintainedEntity#getTemplateIds()
	 * @see #getMaintainedEntity()
	 * @generated
	 */
	EReference getMaintainedEntity_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.MaintainedEntity#getEffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effective Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.MaintainedEntity#getEffectiveTime()
	 * @see #getMaintainedEntity()
	 * @generated
	 */
	EReference getMaintainedEntity_EffectiveTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.MaintainedEntity#getMaintainingPerson <em>Maintaining Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maintaining Person</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.MaintainedEntity#getMaintainingPerson()
	 * @see #getMaintainedEntity()
	 * @generated
	 */
	EReference getMaintainedEntity_MaintainingPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.MaintainedEntity#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.MaintainedEntity#getNullFlavor()
	 * @see #getMaintainedEntity()
	 * @generated
	 */
	EAttribute getMaintainedEntity_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.MaintainedEntity#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.MaintainedEntity#getClassCode()
	 * @see #getMaintainedEntity()
	 * @generated
	 */
	EAttribute getMaintainedEntity_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.DataEnterer <em>Data Enterer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Enterer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DataEnterer
	 * @generated
	 */
	EClass getDataEnterer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.DataEnterer#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DataEnterer#getRealmCodes()
	 * @see #getDataEnterer()
	 * @generated
	 */
	EReference getDataEnterer_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.DataEnterer#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DataEnterer#getTypeId()
	 * @see #getDataEnterer()
	 * @generated
	 */
	EReference getDataEnterer_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.DataEnterer#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DataEnterer#getTemplateIds()
	 * @see #getDataEnterer()
	 * @generated
	 */
	EReference getDataEnterer_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.DataEnterer#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DataEnterer#getTime()
	 * @see #getDataEnterer()
	 * @generated
	 */
	EReference getDataEnterer_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.DataEnterer#getAssignedEntity <em>Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DataEnterer#getAssignedEntity()
	 * @see #getDataEnterer()
	 * @generated
	 */
	EReference getDataEnterer_AssignedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.DataEnterer#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DataEnterer#getNullFlavor()
	 * @see #getDataEnterer()
	 * @generated
	 */
	EAttribute getDataEnterer_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.DataEnterer#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DataEnterer#getTypeCode()
	 * @see #getDataEnterer()
	 * @generated
	 */
	EAttribute getDataEnterer_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.DataEnterer#getContextControlCode <em>Context Control Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Control Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DataEnterer#getContextControlCode()
	 * @see #getDataEnterer()
	 * @generated
	 */
	EAttribute getDataEnterer_ContextControlCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity <em>Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assigned Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedEntity
	 * @generated
	 */
	EClass getAssignedEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedEntity#getRealmCodes()
	 * @see #getAssignedEntity()
	 * @generated
	 */
	EReference getAssignedEntity_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedEntity#getTypeId()
	 * @see #getAssignedEntity()
	 * @generated
	 */
	EReference getAssignedEntity_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedEntity#getTemplateIds()
	 * @see #getAssignedEntity()
	 * @generated
	 */
	EReference getAssignedEntity_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedEntity#getIds()
	 * @see #getAssignedEntity()
	 * @generated
	 */
	EReference getAssignedEntity_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedEntity#getCode()
	 * @see #getAssignedEntity()
	 * @generated
	 */
	EReference getAssignedEntity_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getAddrs <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addr</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedEntity#getAddrs()
	 * @see #getAssignedEntity()
	 * @generated
	 */
	EReference getAssignedEntity_Addr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getTelecoms <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedEntity#getTelecoms()
	 * @see #getAssignedEntity()
	 * @generated
	 */
	EReference getAssignedEntity_Telecom();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getAssignedPerson <em>Assigned Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Person</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedEntity#getAssignedPerson()
	 * @see #getAssignedEntity()
	 * @generated
	 */
	EReference getAssignedEntity_AssignedPerson();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getRepresentedOrganizations <em>Represented Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Represented Organization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedEntity#getRepresentedOrganizations()
	 * @see #getAssignedEntity()
	 * @generated
	 */
	EReference getAssignedEntity_RepresentedOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedEntity#getNullFlavor()
	 * @see #getAssignedEntity()
	 * @generated
	 */
	EAttribute getAssignedEntity_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedEntity#getClassCode()
	 * @see #getAssignedEntity()
	 * @generated
	 */
	EAttribute getAssignedEntity_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Informant12 <em>Informant12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Informant12</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Informant12
	 * @generated
	 */
	EClass getInformant12();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Informant12#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Informant12#getRealmCodes()
	 * @see #getInformant12()
	 * @generated
	 */
	EReference getInformant12_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Informant12#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Informant12#getTypeId()
	 * @see #getInformant12()
	 * @generated
	 */
	EReference getInformant12_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Informant12#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Informant12#getTemplateIds()
	 * @see #getInformant12()
	 * @generated
	 */
	EReference getInformant12_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Informant12#getAssignedEntity <em>Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Informant12#getAssignedEntity()
	 * @see #getInformant12()
	 * @generated
	 */
	EReference getInformant12_AssignedEntity();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Informant12#getRelatedEntity <em>Related Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Related Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Informant12#getRelatedEntity()
	 * @see #getInformant12()
	 * @generated
	 */
	EReference getInformant12_RelatedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Informant12#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Informant12#getNullFlavor()
	 * @see #getInformant12()
	 * @generated
	 */
	EAttribute getInformant12_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Informant12#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Informant12#getTypeCode()
	 * @see #getInformant12()
	 * @generated
	 */
	EAttribute getInformant12_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Informant12#getContextControlCode <em>Context Control Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Control Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Informant12#getContextControlCode()
	 * @see #getInformant12()
	 * @generated
	 */
	EAttribute getInformant12_ContextControlCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.RelatedEntity <em>Related Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedEntity
	 * @generated
	 */
	EClass getRelatedEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RelatedEntity#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedEntity#getRealmCodes()
	 * @see #getRelatedEntity()
	 * @generated
	 */
	EReference getRelatedEntity_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RelatedEntity#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedEntity#getTypeId()
	 * @see #getRelatedEntity()
	 * @generated
	 */
	EReference getRelatedEntity_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RelatedEntity#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedEntity#getTemplateIds()
	 * @see #getRelatedEntity()
	 * @generated
	 */
	EReference getRelatedEntity_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RelatedEntity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedEntity#getCode()
	 * @see #getRelatedEntity()
	 * @generated
	 */
	EReference getRelatedEntity_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RelatedEntity#getAddrs <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addr</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedEntity#getAddrs()
	 * @see #getRelatedEntity()
	 * @generated
	 */
	EReference getRelatedEntity_Addr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RelatedEntity#getTelecoms <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedEntity#getTelecoms()
	 * @see #getRelatedEntity()
	 * @generated
	 */
	EReference getRelatedEntity_Telecom();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RelatedEntity#getEffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effective Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedEntity#getEffectiveTime()
	 * @see #getRelatedEntity()
	 * @generated
	 */
	EReference getRelatedEntity_EffectiveTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RelatedEntity#getRelatedPerson <em>Related Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Related Person</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedEntity#getRelatedPerson()
	 * @see #getRelatedEntity()
	 * @generated
	 */
	EReference getRelatedEntity_RelatedPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RelatedEntity#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedEntity#getNullFlavor()
	 * @see #getRelatedEntity()
	 * @generated
	 */
	EAttribute getRelatedEntity_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RelatedEntity#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedEntity#getClassCode()
	 * @see #getRelatedEntity()
	 * @generated
	 */
	EAttribute getRelatedEntity_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Custodian <em>Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custodian</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Custodian
	 * @generated
	 */
	EClass getCustodian();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Custodian#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Custodian#getRealmCodes()
	 * @see #getCustodian()
	 * @generated
	 */
	EReference getCustodian_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Custodian#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Custodian#getTypeId()
	 * @see #getCustodian()
	 * @generated
	 */
	EReference getCustodian_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Custodian#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Custodian#getTemplateIds()
	 * @see #getCustodian()
	 * @generated
	 */
	EReference getCustodian_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Custodian#getAssignedCustodian <em>Assigned Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Custodian</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Custodian#getAssignedCustodian()
	 * @see #getCustodian()
	 * @generated
	 */
	EReference getCustodian_AssignedCustodian();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Custodian#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Custodian#getNullFlavor()
	 * @see #getCustodian()
	 * @generated
	 */
	EAttribute getCustodian_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Custodian#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Custodian#getTypeCode()
	 * @see #getCustodian()
	 * @generated
	 */
	EAttribute getCustodian_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.AssignedCustodian <em>Assigned Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assigned Custodian</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedCustodian
	 * @generated
	 */
	EClass getAssignedCustodian();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssignedCustodian#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedCustodian#getRealmCodes()
	 * @see #getAssignedCustodian()
	 * @generated
	 */
	EReference getAssignedCustodian_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssignedCustodian#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedCustodian#getTypeId()
	 * @see #getAssignedCustodian()
	 * @generated
	 */
	EReference getAssignedCustodian_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssignedCustodian#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedCustodian#getTemplateIds()
	 * @see #getAssignedCustodian()
	 * @generated
	 */
	EReference getAssignedCustodian_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssignedCustodian#getRepresentedCustodianOrganization <em>Represented Custodian Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Represented Custodian Organization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedCustodian#getRepresentedCustodianOrganization()
	 * @see #getAssignedCustodian()
	 * @generated
	 */
	EReference getAssignedCustodian_RepresentedCustodianOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.AssignedCustodian#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedCustodian#getNullFlavor()
	 * @see #getAssignedCustodian()
	 * @generated
	 */
	EAttribute getAssignedCustodian_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.AssignedCustodian#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssignedCustodian#getClassCode()
	 * @see #getAssignedCustodian()
	 * @generated
	 */
	EAttribute getAssignedCustodian_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization <em>Custodian Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custodian Organization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.CustodianOrganization
	 * @generated
	 */
	EClass getCustodianOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.CustodianOrganization#getRealmCodes()
	 * @see #getCustodianOrganization()
	 * @generated
	 */
	EReference getCustodianOrganization_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.CustodianOrganization#getTypeId()
	 * @see #getCustodianOrganization()
	 * @generated
	 */
	EReference getCustodianOrganization_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.CustodianOrganization#getTemplateIds()
	 * @see #getCustodianOrganization()
	 * @generated
	 */
	EReference getCustodianOrganization_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.CustodianOrganization#getIds()
	 * @see #getCustodianOrganization()
	 * @generated
	 */
	EReference getCustodianOrganization_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.CustodianOrganization#getName()
	 * @see #getCustodianOrganization()
	 * @generated
	 */
	EReference getCustodianOrganization_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getTelecom <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Telecom</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.CustodianOrganization#getTelecom()
	 * @see #getCustodianOrganization()
	 * @generated
	 */
	EReference getCustodianOrganization_Telecom();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Addr</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.CustodianOrganization#getAddr()
	 * @see #getCustodianOrganization()
	 * @generated
	 */
	EReference getCustodianOrganization_Addr();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.CustodianOrganization#getNullFlavor()
	 * @see #getCustodianOrganization()
	 * @generated
	 */
	EAttribute getCustodianOrganization_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.CustodianOrganization#getClassCode()
	 * @see #getCustodianOrganization()
	 * @generated
	 */
	EAttribute getCustodianOrganization_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getDeterminerCode <em>Determiner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determiner Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.CustodianOrganization#getDeterminerCode()
	 * @see #getCustodianOrganization()
	 * @generated
	 */
	EAttribute getCustodianOrganization_DeterminerCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.InformationRecipient <em>Information Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Recipient</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InformationRecipient
	 * @generated
	 */
	EClass getInformationRecipient();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.InformationRecipient#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InformationRecipient#getRealmCodes()
	 * @see #getInformationRecipient()
	 * @generated
	 */
	EReference getInformationRecipient_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.InformationRecipient#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InformationRecipient#getTypeId()
	 * @see #getInformationRecipient()
	 * @generated
	 */
	EReference getInformationRecipient_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.InformationRecipient#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InformationRecipient#getTemplateIds()
	 * @see #getInformationRecipient()
	 * @generated
	 */
	EReference getInformationRecipient_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.InformationRecipient#getIntendedRecipient <em>Intended Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intended Recipient</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InformationRecipient#getIntendedRecipient()
	 * @see #getInformationRecipient()
	 * @generated
	 */
	EReference getInformationRecipient_IntendedRecipient();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.InformationRecipient#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InformationRecipient#getNullFlavor()
	 * @see #getInformationRecipient()
	 * @generated
	 */
	EAttribute getInformationRecipient_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.InformationRecipient#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InformationRecipient#getTypeCode()
	 * @see #getInformationRecipient()
	 * @generated
	 */
	EAttribute getInformationRecipient_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.IntendedRecipient <em>Intended Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intended Recipient</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.IntendedRecipient
	 * @generated
	 */
	EClass getIntendedRecipient();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.IntendedRecipient#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.IntendedRecipient#getRealmCodes()
	 * @see #getIntendedRecipient()
	 * @generated
	 */
	EReference getIntendedRecipient_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.IntendedRecipient#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.IntendedRecipient#getTypeId()
	 * @see #getIntendedRecipient()
	 * @generated
	 */
	EReference getIntendedRecipient_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.IntendedRecipient#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.IntendedRecipient#getTemplateIds()
	 * @see #getIntendedRecipient()
	 * @generated
	 */
	EReference getIntendedRecipient_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.IntendedRecipient#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.IntendedRecipient#getIds()
	 * @see #getIntendedRecipient()
	 * @generated
	 */
	EReference getIntendedRecipient_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.IntendedRecipient#getAddrs <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addr</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.IntendedRecipient#getAddrs()
	 * @see #getIntendedRecipient()
	 * @generated
	 */
	EReference getIntendedRecipient_Addr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.IntendedRecipient#getTelecoms <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.IntendedRecipient#getTelecoms()
	 * @see #getIntendedRecipient()
	 * @generated
	 */
	EReference getIntendedRecipient_Telecom();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.IntendedRecipient#getInformationRecipient <em>Information Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Information Recipient</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.IntendedRecipient#getInformationRecipient()
	 * @see #getIntendedRecipient()
	 * @generated
	 */
	EReference getIntendedRecipient_InformationRecipient();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.IntendedRecipient#getReceivedOrganization <em>Received Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Received Organization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.IntendedRecipient#getReceivedOrganization()
	 * @see #getIntendedRecipient()
	 * @generated
	 */
	EReference getIntendedRecipient_ReceivedOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.IntendedRecipient#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.IntendedRecipient#getNullFlavor()
	 * @see #getIntendedRecipient()
	 * @generated
	 */
	EAttribute getIntendedRecipient_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.IntendedRecipient#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.IntendedRecipient#getClassCode()
	 * @see #getIntendedRecipient()
	 * @generated
	 */
	EAttribute getIntendedRecipient_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.LegalAuthenticator <em>Legal Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Authenticator</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LegalAuthenticator
	 * @generated
	 */
	EClass getLegalAuthenticator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getRealmCodes()
	 * @see #getLegalAuthenticator()
	 * @generated
	 */
	EReference getLegalAuthenticator_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getTypeId()
	 * @see #getLegalAuthenticator()
	 * @generated
	 */
	EReference getLegalAuthenticator_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getTemplateIds()
	 * @see #getLegalAuthenticator()
	 * @generated
	 */
	EReference getLegalAuthenticator_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getTime()
	 * @see #getLegalAuthenticator()
	 * @generated
	 */
	EReference getLegalAuthenticator_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getSignatureCode <em>Signature Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getSignatureCode()
	 * @see #getLegalAuthenticator()
	 * @generated
	 */
	EReference getLegalAuthenticator_SignatureCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getAssignedEntity <em>Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getAssignedEntity()
	 * @see #getLegalAuthenticator()
	 * @generated
	 */
	EReference getLegalAuthenticator_AssignedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getNullFlavor()
	 * @see #getLegalAuthenticator()
	 * @generated
	 */
	EAttribute getLegalAuthenticator_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getTypeCode()
	 * @see #getLegalAuthenticator()
	 * @generated
	 */
	EAttribute getLegalAuthenticator_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getContextControlCode <em>Context Control Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Control Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LegalAuthenticator#getContextControlCode()
	 * @see #getLegalAuthenticator()
	 * @generated
	 */
	EAttribute getLegalAuthenticator_ContextControlCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Authenticator <em>Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authenticator</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authenticator
	 * @generated
	 */
	EClass getAuthenticator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Authenticator#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authenticator#getRealmCodes()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EReference getAuthenticator_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Authenticator#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authenticator#getTypeId()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EReference getAuthenticator_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Authenticator#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authenticator#getTemplateIds()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EReference getAuthenticator_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Authenticator#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authenticator#getTime()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EReference getAuthenticator_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Authenticator#getSignatureCode <em>Signature Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authenticator#getSignatureCode()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EReference getAuthenticator_SignatureCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Authenticator#getAssignedEntities <em>Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assigned Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authenticator#getAssignedEntities()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EReference getAuthenticator_AssignedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Authenticator#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authenticator#getNullFlavor()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EAttribute getAuthenticator_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Authenticator#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authenticator#getTypeCode()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EAttribute getAuthenticator_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Participant1 <em>Participant1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant1</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant1
	 * @generated
	 */
	EClass getParticipant1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Participant1#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant1#getRealmCodes()
	 * @see #getParticipant1()
	 * @generated
	 */
	EReference getParticipant1_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Participant1#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant1#getTypeId()
	 * @see #getParticipant1()
	 * @generated
	 */
	EReference getParticipant1_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Participant1#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant1#getTemplateIds()
	 * @see #getParticipant1()
	 * @generated
	 */
	EReference getParticipant1_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Participant1#getFunctionCode <em>Function Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant1#getFunctionCode()
	 * @see #getParticipant1()
	 * @generated
	 */
	EReference getParticipant1_FunctionCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Participant1#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant1#getTime()
	 * @see #getParticipant1()
	 * @generated
	 */
	EReference getParticipant1_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Participant1#getAssociatedEntity <em>Associated Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Associated Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant1#getAssociatedEntity()
	 * @see #getParticipant1()
	 * @generated
	 */
	EReference getParticipant1_AssociatedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Participant1#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant1#getNullFlavor()
	 * @see #getParticipant1()
	 * @generated
	 */
	EAttribute getParticipant1_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Participant1#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant1#getTypeCode()
	 * @see #getParticipant1()
	 * @generated
	 */
	EAttribute getParticipant1_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Participant1#getContextControlCode <em>Context Control Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Control Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant1#getContextControlCode()
	 * @see #getParticipant1()
	 * @generated
	 */
	EAttribute getParticipant1_ContextControlCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.AssociatedEntity <em>Associated Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associated Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssociatedEntity
	 * @generated
	 */
	EClass getAssociatedEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssociatedEntity#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssociatedEntity#getRealmCodes()
	 * @see #getAssociatedEntity()
	 * @generated
	 */
	EReference getAssociatedEntity_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssociatedEntity#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssociatedEntity#getTypeId()
	 * @see #getAssociatedEntity()
	 * @generated
	 */
	EReference getAssociatedEntity_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssociatedEntity#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssociatedEntity#getTemplateIds()
	 * @see #getAssociatedEntity()
	 * @generated
	 */
	EReference getAssociatedEntity_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssociatedEntity#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssociatedEntity#getIds()
	 * @see #getAssociatedEntity()
	 * @generated
	 */
	EReference getAssociatedEntity_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssociatedEntity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssociatedEntity#getCode()
	 * @see #getAssociatedEntity()
	 * @generated
	 */
	EReference getAssociatedEntity_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssociatedEntity#getAddrs <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addr</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssociatedEntity#getAddrs()
	 * @see #getAssociatedEntity()
	 * @generated
	 */
	EReference getAssociatedEntity_Addr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.AssociatedEntity#getTelecoms <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssociatedEntity#getTelecoms()
	 * @see #getAssociatedEntity()
	 * @generated
	 */
	EReference getAssociatedEntity_Telecom();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssociatedEntity#getAssociatedPerson <em>Associated Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Associated Person</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssociatedEntity#getAssociatedPerson()
	 * @see #getAssociatedEntity()
	 * @generated
	 */
	EReference getAssociatedEntity_AssociatedPerson();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.AssociatedEntity#getScopingOrganization <em>Scoping Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoping Organization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssociatedEntity#getScopingOrganization()
	 * @see #getAssociatedEntity()
	 * @generated
	 */
	EReference getAssociatedEntity_ScopingOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.AssociatedEntity#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssociatedEntity#getNullFlavor()
	 * @see #getAssociatedEntity()
	 * @generated
	 */
	EAttribute getAssociatedEntity_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.AssociatedEntity#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.AssociatedEntity#getClassCode()
	 * @see #getAssociatedEntity()
	 * @generated
	 */
	EAttribute getAssociatedEntity_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.InFulfillmentOf <em>In Fulfillment Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Fulfillment Of</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InFulfillmentOf
	 * @generated
	 */
	EClass getInFulfillmentOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.InFulfillmentOf#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InFulfillmentOf#getRealmCodes()
	 * @see #getInFulfillmentOf()
	 * @generated
	 */
	EReference getInFulfillmentOf_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.InFulfillmentOf#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InFulfillmentOf#getTypeId()
	 * @see #getInFulfillmentOf()
	 * @generated
	 */
	EReference getInFulfillmentOf_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.InFulfillmentOf#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InFulfillmentOf#getTemplateIds()
	 * @see #getInFulfillmentOf()
	 * @generated
	 */
	EReference getInFulfillmentOf_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.InFulfillmentOf#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InFulfillmentOf#getOrder()
	 * @see #getInFulfillmentOf()
	 * @generated
	 */
	EReference getInFulfillmentOf_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.InFulfillmentOf#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InFulfillmentOf#getNullFlavor()
	 * @see #getInFulfillmentOf()
	 * @generated
	 */
	EAttribute getInFulfillmentOf_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.InFulfillmentOf#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.InFulfillmentOf#getTypeCode()
	 * @see #getInFulfillmentOf()
	 * @generated
	 */
	EAttribute getInFulfillmentOf_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Order#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Order#getRealmCodes()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Order#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Order#getTypeId()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Order#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Order#getTemplateIds()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Order#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Order#getIds()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Order#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Order#getCode()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Order#getPriorityCode <em>Priority Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Order#getPriorityCode()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_PriorityCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Order#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Order#getNullFlavor()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Order#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Order#getClassCode()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Order#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Order#getMoodCode()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.DocumentationOf <em>Documentation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Of</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DocumentationOf
	 * @generated
	 */
	EClass getDocumentationOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.DocumentationOf#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DocumentationOf#getRealmCodes()
	 * @see #getDocumentationOf()
	 * @generated
	 */
	EReference getDocumentationOf_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.DocumentationOf#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DocumentationOf#getTypeId()
	 * @see #getDocumentationOf()
	 * @generated
	 */
	EReference getDocumentationOf_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.DocumentationOf#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DocumentationOf#getTemplateIds()
	 * @see #getDocumentationOf()
	 * @generated
	 */
	EReference getDocumentationOf_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.DocumentationOf#getServiceEvent <em>Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Event</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DocumentationOf#getServiceEvent()
	 * @see #getDocumentationOf()
	 * @generated
	 */
	EReference getDocumentationOf_ServiceEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.DocumentationOf#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DocumentationOf#getNullFlavor()
	 * @see #getDocumentationOf()
	 * @generated
	 */
	EAttribute getDocumentationOf_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.DocumentationOf#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DocumentationOf#getTypeCode()
	 * @see #getDocumentationOf()
	 * @generated
	 */
	EAttribute getDocumentationOf_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ServiceEvent <em>Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Event</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ServiceEvent
	 * @generated
	 */
	EClass getServiceEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ServiceEvent#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ServiceEvent#getRealmCodes()
	 * @see #getServiceEvent()
	 * @generated
	 */
	EReference getServiceEvent_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ServiceEvent#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ServiceEvent#getTypeId()
	 * @see #getServiceEvent()
	 * @generated
	 */
	EReference getServiceEvent_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ServiceEvent#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ServiceEvent#getTemplateIds()
	 * @see #getServiceEvent()
	 * @generated
	 */
	EReference getServiceEvent_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ServiceEvent#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ServiceEvent#getIds()
	 * @see #getServiceEvent()
	 * @generated
	 */
	EReference getServiceEvent_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ServiceEvent#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ServiceEvent#getCode()
	 * @see #getServiceEvent()
	 * @generated
	 */
	EReference getServiceEvent_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ServiceEvent#getEffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effective Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ServiceEvent#getEffectiveTime()
	 * @see #getServiceEvent()
	 * @generated
	 */
	EReference getServiceEvent_EffectiveTime();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ServiceEvent#getPerformers <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ServiceEvent#getPerformers()
	 * @see #getServiceEvent()
	 * @generated
	 */
	EReference getServiceEvent_Performer();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ServiceEvent#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ServiceEvent#getNullFlavor()
	 * @see #getServiceEvent()
	 * @generated
	 */
	EAttribute getServiceEvent_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ServiceEvent#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ServiceEvent#getClassCode()
	 * @see #getServiceEvent()
	 * @generated
	 */
	EAttribute getServiceEvent_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ServiceEvent#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ServiceEvent#getMoodCode()
	 * @see #getServiceEvent()
	 * @generated
	 */
	EAttribute getServiceEvent_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Performer1 <em>Performer1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performer1</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer1
	 * @generated
	 */
	EClass getPerformer1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Performer1#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer1#getRealmCodes()
	 * @see #getPerformer1()
	 * @generated
	 */
	EReference getPerformer1_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Performer1#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer1#getTypeId()
	 * @see #getPerformer1()
	 * @generated
	 */
	EReference getPerformer1_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Performer1#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer1#getTemplateIds()
	 * @see #getPerformer1()
	 * @generated
	 */
	EReference getPerformer1_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Performer1#getFunctionCode <em>Function Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer1#getFunctionCode()
	 * @see #getPerformer1()
	 * @generated
	 */
	EReference getPerformer1_FunctionCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Performer1#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer1#getTime()
	 * @see #getPerformer1()
	 * @generated
	 */
	EReference getPerformer1_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Performer1#getAssignedEntity <em>Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer1#getAssignedEntity()
	 * @see #getPerformer1()
	 * @generated
	 */
	EReference getPerformer1_AssignedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Performer1#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer1#getNullFlavor()
	 * @see #getPerformer1()
	 * @generated
	 */
	EAttribute getPerformer1_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Performer1#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer1#getTypeCode()
	 * @see #getPerformer1()
	 * @generated
	 */
	EAttribute getPerformer1_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.RelatedDocument <em>Related Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedDocument
	 * @generated
	 */
	EClass getRelatedDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RelatedDocument#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedDocument#getRealmCodes()
	 * @see #getRelatedDocument()
	 * @generated
	 */
	EReference getRelatedDocument_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RelatedDocument#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedDocument#getTypeId()
	 * @see #getRelatedDocument()
	 * @generated
	 */
	EReference getRelatedDocument_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RelatedDocument#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedDocument#getTemplateIds()
	 * @see #getRelatedDocument()
	 * @generated
	 */
	EReference getRelatedDocument_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RelatedDocument#getParentDocument <em>Parent Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedDocument#getParentDocument()
	 * @see #getRelatedDocument()
	 * @generated
	 */
	EReference getRelatedDocument_ParentDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RelatedDocument#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedDocument#getNullFlavor()
	 * @see #getRelatedDocument()
	 * @generated
	 */
	EAttribute getRelatedDocument_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RelatedDocument#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedDocument#getTypeCode()
	 * @see #getRelatedDocument()
	 * @generated
	 */
	EAttribute getRelatedDocument_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ParentDocument <em>Parent Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParentDocument
	 * @generated
	 */
	EClass getParentDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ParentDocument#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParentDocument#getRealmCodes()
	 * @see #getParentDocument()
	 * @generated
	 */
	EReference getParentDocument_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ParentDocument#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParentDocument#getTypeId()
	 * @see #getParentDocument()
	 * @generated
	 */
	EReference getParentDocument_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ParentDocument#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParentDocument#getTemplateIds()
	 * @see #getParentDocument()
	 * @generated
	 */
	EReference getParentDocument_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ParentDocument#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParentDocument#getIds()
	 * @see #getParentDocument()
	 * @generated
	 */
	EReference getParentDocument_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ParentDocument#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParentDocument#getCode()
	 * @see #getParentDocument()
	 * @generated
	 */
	EReference getParentDocument_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ParentDocument#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParentDocument#getText()
	 * @see #getParentDocument()
	 * @generated
	 */
	EReference getParentDocument_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ParentDocument#getSetId <em>Set Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParentDocument#getSetId()
	 * @see #getParentDocument()
	 * @generated
	 */
	EReference getParentDocument_SetId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ParentDocument#getVersionNumber <em>Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Number</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParentDocument#getVersionNumber()
	 * @see #getParentDocument()
	 * @generated
	 */
	EReference getParentDocument_VersionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ParentDocument#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParentDocument#getNullFlavor()
	 * @see #getParentDocument()
	 * @generated
	 */
	EAttribute getParentDocument_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ParentDocument#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParentDocument#getClassCode()
	 * @see #getParentDocument()
	 * @generated
	 */
	EAttribute getParentDocument_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ParentDocument#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParentDocument#getMoodCode()
	 * @see #getParentDocument()
	 * @generated
	 */
	EAttribute getParentDocument_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Authorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authorization
	 * @generated
	 */
	EClass getAuthorization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Authorization#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authorization#getRealmCodes()
	 * @see #getAuthorization()
	 * @generated
	 */
	EReference getAuthorization_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Authorization#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authorization#getTypeId()
	 * @see #getAuthorization()
	 * @generated
	 */
	EReference getAuthorization_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Authorization#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authorization#getTemplateIds()
	 * @see #getAuthorization()
	 * @generated
	 */
	EReference getAuthorization_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Authorization#getConsent <em>Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consent</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authorization#getConsent()
	 * @see #getAuthorization()
	 * @generated
	 */
	EReference getAuthorization_Consent();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Authorization#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authorization#getNullFlavor()
	 * @see #getAuthorization()
	 * @generated
	 */
	EAttribute getAuthorization_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Authorization#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Authorization#getTypeCode()
	 * @see #getAuthorization()
	 * @generated
	 */
	EAttribute getAuthorization_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Consent <em>Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consent</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consent
	 * @generated
	 */
	EClass getConsent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Consent#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consent#getRealmCodes()
	 * @see #getConsent()
	 * @generated
	 */
	EReference getConsent_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Consent#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consent#getTypeId()
	 * @see #getConsent()
	 * @generated
	 */
	EReference getConsent_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Consent#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consent#getTemplateIds()
	 * @see #getConsent()
	 * @generated
	 */
	EReference getConsent_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Consent#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consent#getIds()
	 * @see #getConsent()
	 * @generated
	 */
	EReference getConsent_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Consent#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consent#getCode()
	 * @see #getConsent()
	 * @generated
	 */
	EReference getConsent_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Consent#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consent#getStatusCode()
	 * @see #getConsent()
	 * @generated
	 */
	EReference getConsent_StatusCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Consent#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consent#getNullFlavor()
	 * @see #getConsent()
	 * @generated
	 */
	EAttribute getConsent_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Consent#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consent#getClassCode()
	 * @see #getConsent()
	 * @generated
	 */
	EAttribute getConsent_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Consent#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consent#getMoodCode()
	 * @see #getConsent()
	 * @generated
	 */
	EAttribute getConsent_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Component1 <em>Component1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component1</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component1
	 * @generated
	 */
	EClass getComponent1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Component1#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component1#getRealmCodes()
	 * @see #getComponent1()
	 * @generated
	 */
	EReference getComponent1_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component1#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component1#getTypeId()
	 * @see #getComponent1()
	 * @generated
	 */
	EReference getComponent1_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Component1#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component1#getTemplateIds()
	 * @see #getComponent1()
	 * @generated
	 */
	EReference getComponent1_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component1#getEncompassingEncounter <em>Encompassing Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encompassing Encounter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component1#getEncompassingEncounter()
	 * @see #getComponent1()
	 * @generated
	 */
	EReference getComponent1_EncompassingEncounter();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component1#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component1#getNullFlavor()
	 * @see #getComponent1()
	 * @generated
	 */
	EAttribute getComponent1_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component1#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component1#getTypeCode()
	 * @see #getComponent1()
	 * @generated
	 */
	EAttribute getComponent1_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter <em>Encompassing Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encompassing Encounter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter
	 * @generated
	 */
	EClass getEncompassingEncounter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getRealmCodes()
	 * @see #getEncompassingEncounter()
	 * @generated
	 */
	EReference getEncompassingEncounter_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getTypeId()
	 * @see #getEncompassingEncounter()
	 * @generated
	 */
	EReference getEncompassingEncounter_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getTemplateIds()
	 * @see #getEncompassingEncounter()
	 * @generated
	 */
	EReference getEncompassingEncounter_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getIds()
	 * @see #getEncompassingEncounter()
	 * @generated
	 */
	EReference getEncompassingEncounter_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getCode()
	 * @see #getEncompassingEncounter()
	 * @generated
	 */
	EReference getEncompassingEncounter_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getEffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effective Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getEffectiveTime()
	 * @see #getEncompassingEncounter()
	 * @generated
	 */
	EReference getEncompassingEncounter_EffectiveTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getDischargeDispositionCode <em>Discharge Disposition Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discharge Disposition Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getDischargeDispositionCode()
	 * @see #getEncompassingEncounter()
	 * @generated
	 */
	EReference getEncompassingEncounter_DischargeDispositionCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responsible Party</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getResponsibleParty()
	 * @see #getEncompassingEncounter()
	 * @generated
	 */
	EReference getEncompassingEncounter_ResponsibleParty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getEncounterParticipants <em>Encounter Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Encounter Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getEncounterParticipants()
	 * @see #getEncompassingEncounter()
	 * @generated
	 */
	EReference getEncompassingEncounter_EncounterParticipant();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getLocation()
	 * @see #getEncompassingEncounter()
	 * @generated
	 */
	EReference getEncompassingEncounter_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getNullFlavor()
	 * @see #getEncompassingEncounter()
	 * @generated
	 */
	EAttribute getEncompassingEncounter_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getClassCode()
	 * @see #getEncompassingEncounter()
	 * @generated
	 */
	EAttribute getEncompassingEncounter_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncompassingEncounter#getMoodCode()
	 * @see #getEncompassingEncounter()
	 * @generated
	 */
	EAttribute getEncompassingEncounter_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible Party</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ResponsibleParty
	 * @generated
	 */
	EClass getResponsibleParty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ResponsibleParty#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ResponsibleParty#getRealmCodes()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EReference getResponsibleParty_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ResponsibleParty#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ResponsibleParty#getTypeId()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EReference getResponsibleParty_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ResponsibleParty#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ResponsibleParty#getTemplateIds()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EReference getResponsibleParty_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ResponsibleParty#getAssignedEntity <em>Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ResponsibleParty#getAssignedEntity()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EReference getResponsibleParty_AssignedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ResponsibleParty#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ResponsibleParty#getNullFlavor()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EAttribute getResponsibleParty_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ResponsibleParty#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ResponsibleParty#getTypeCode()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EAttribute getResponsibleParty_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.EncounterParticipant <em>Encounter Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounter Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncounterParticipant
	 * @generated
	 */
	EClass getEncounterParticipant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.EncounterParticipant#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncounterParticipant#getRealmCodes()
	 * @see #getEncounterParticipant()
	 * @generated
	 */
	EReference getEncounterParticipant_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EncounterParticipant#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncounterParticipant#getTypeId()
	 * @see #getEncounterParticipant()
	 * @generated
	 */
	EReference getEncounterParticipant_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.EncounterParticipant#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncounterParticipant#getTemplateIds()
	 * @see #getEncounterParticipant()
	 * @generated
	 */
	EReference getEncounterParticipant_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EncounterParticipant#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncounterParticipant#getTime()
	 * @see #getEncounterParticipant()
	 * @generated
	 */
	EReference getEncounterParticipant_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EncounterParticipant#getAssignedEntity <em>Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncounterParticipant#getAssignedEntity()
	 * @see #getEncounterParticipant()
	 * @generated
	 */
	EReference getEncounterParticipant_AssignedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.EncounterParticipant#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncounterParticipant#getNullFlavor()
	 * @see #getEncounterParticipant()
	 * @generated
	 */
	EAttribute getEncounterParticipant_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.EncounterParticipant#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EncounterParticipant#getTypeCode()
	 * @see #getEncounterParticipant()
	 * @generated
	 */
	EAttribute getEncounterParticipant_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Location#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Location#getRealmCodes()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Location#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Location#getTypeId()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Location#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Location#getTemplateIds()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Location#getHealthCareFacility <em>Health Care Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Health Care Facility</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Location#getHealthCareFacility()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_HealthCareFacility();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Location#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Location#getNullFlavor()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Location#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Location#getTypeCode()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.HealthCareFacility <em>Health Care Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Care Facility</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.HealthCareFacility
	 * @generated
	 */
	EClass getHealthCareFacility();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.HealthCareFacility#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.HealthCareFacility#getRealmCodes()
	 * @see #getHealthCareFacility()
	 * @generated
	 */
	EReference getHealthCareFacility_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.HealthCareFacility#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.HealthCareFacility#getTypeId()
	 * @see #getHealthCareFacility()
	 * @generated
	 */
	EReference getHealthCareFacility_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.HealthCareFacility#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.HealthCareFacility#getTemplateIds()
	 * @see #getHealthCareFacility()
	 * @generated
	 */
	EReference getHealthCareFacility_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.HealthCareFacility#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.HealthCareFacility#getIds()
	 * @see #getHealthCareFacility()
	 * @generated
	 */
	EReference getHealthCareFacility_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.HealthCareFacility#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.HealthCareFacility#getCode()
	 * @see #getHealthCareFacility()
	 * @generated
	 */
	EReference getHealthCareFacility_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.HealthCareFacility#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.HealthCareFacility#getLocation()
	 * @see #getHealthCareFacility()
	 * @generated
	 */
	EReference getHealthCareFacility_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.HealthCareFacility#getServiceProviderOrganization <em>Service Provider Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Provider Organization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.HealthCareFacility#getServiceProviderOrganization()
	 * @see #getHealthCareFacility()
	 * @generated
	 */
	EReference getHealthCareFacility_ServiceProviderOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.HealthCareFacility#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.HealthCareFacility#getNullFlavor()
	 * @see #getHealthCareFacility()
	 * @generated
	 */
	EAttribute getHealthCareFacility_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.HealthCareFacility#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.HealthCareFacility#getClassCode()
	 * @see #getHealthCareFacility()
	 * @generated
	 */
	EAttribute getHealthCareFacility_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Component2 <em>Component2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component2</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component2
	 * @generated
	 */
	EClass getComponent2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Component2#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component2#getRealmCodes()
	 * @see #getComponent2()
	 * @generated
	 */
	EReference getComponent2_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component2#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component2#getTypeId()
	 * @see #getComponent2()
	 * @generated
	 */
	EReference getComponent2_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Component2#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component2#getTemplateIds()
	 * @see #getComponent2()
	 * @generated
	 */
	EReference getComponent2_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component2#getNonXMLBody <em>Non XML Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Non XML Body</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component2#getNonXMLBody()
	 * @see #getComponent2()
	 * @generated
	 */
	EReference getComponent2_NonXMLBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component2#getStructuredBody <em>Structured Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structured Body</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component2#getStructuredBody()
	 * @see #getComponent2()
	 * @generated
	 */
	EReference getComponent2_StructuredBody();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component2#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component2#getNullFlavor()
	 * @see #getComponent2()
	 * @generated
	 */
	EAttribute getComponent2_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component2#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component2#getTypeCode()
	 * @see #getComponent2()
	 * @generated
	 */
	EAttribute getComponent2_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component2#getContextConductionInd <em>Context Conduction Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Conduction Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component2#getContextConductionInd()
	 * @see #getComponent2()
	 * @generated
	 */
	EAttribute getComponent2_ContextConductionInd();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.NonXMLBody <em>Non XML Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non XML Body</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.NonXMLBody
	 * @generated
	 */
	EClass getNonXMLBody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.NonXMLBody#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.NonXMLBody#getRealmCodes()
	 * @see #getNonXMLBody()
	 * @generated
	 */
	EReference getNonXMLBody_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.NonXMLBody#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.NonXMLBody#getTypeId()
	 * @see #getNonXMLBody()
	 * @generated
	 */
	EReference getNonXMLBody_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.NonXMLBody#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.NonXMLBody#getTemplateIds()
	 * @see #getNonXMLBody()
	 * @generated
	 */
	EReference getNonXMLBody_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.NonXMLBody#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.NonXMLBody#getText()
	 * @see #getNonXMLBody()
	 * @generated
	 */
	EReference getNonXMLBody_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.NonXMLBody#getConfidentialityCode <em>Confidentiality Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidentiality Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.NonXMLBody#getConfidentialityCode()
	 * @see #getNonXMLBody()
	 * @generated
	 */
	EReference getNonXMLBody_ConfidentialityCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.NonXMLBody#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.NonXMLBody#getLanguageCode()
	 * @see #getNonXMLBody()
	 * @generated
	 */
	EReference getNonXMLBody_LanguageCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.NonXMLBody#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.NonXMLBody#getNullFlavor()
	 * @see #getNonXMLBody()
	 * @generated
	 */
	EAttribute getNonXMLBody_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.NonXMLBody#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.NonXMLBody#getClassCode()
	 * @see #getNonXMLBody()
	 * @generated
	 */
	EAttribute getNonXMLBody_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.NonXMLBody#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.NonXMLBody#getMoodCode()
	 * @see #getNonXMLBody()
	 * @generated
	 */
	EAttribute getNonXMLBody_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.StructuredBody <em>Structured Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Body</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.StructuredBody
	 * @generated
	 */
	EClass getStructuredBody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.StructuredBody#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.StructuredBody#getRealmCodes()
	 * @see #getStructuredBody()
	 * @generated
	 */
	EReference getStructuredBody_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.StructuredBody#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.StructuredBody#getTypeId()
	 * @see #getStructuredBody()
	 * @generated
	 */
	EReference getStructuredBody_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.StructuredBody#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.StructuredBody#getTemplateIds()
	 * @see #getStructuredBody()
	 * @generated
	 */
	EReference getStructuredBody_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.StructuredBody#getConfidentialityCode <em>Confidentiality Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidentiality Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.StructuredBody#getConfidentialityCode()
	 * @see #getStructuredBody()
	 * @generated
	 */
	EReference getStructuredBody_ConfidentialityCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.StructuredBody#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.StructuredBody#getLanguageCode()
	 * @see #getStructuredBody()
	 * @generated
	 */
	EReference getStructuredBody_LanguageCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.StructuredBody#getComponents <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.StructuredBody#getComponents()
	 * @see #getStructuredBody()
	 * @generated
	 */
	EReference getStructuredBody_Component();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.StructuredBody#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.StructuredBody#getNullFlavor()
	 * @see #getStructuredBody()
	 * @generated
	 */
	EAttribute getStructuredBody_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.StructuredBody#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.StructuredBody#getClassCode()
	 * @see #getStructuredBody()
	 * @generated
	 */
	EAttribute getStructuredBody_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.StructuredBody#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.StructuredBody#getMoodCode()
	 * @see #getStructuredBody()
	 * @generated
	 */
	EAttribute getStructuredBody_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Component3 <em>Component3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component3</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component3
	 * @generated
	 */
	EClass getComponent3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Component3#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component3#getRealmCodes()
	 * @see #getComponent3()
	 * @generated
	 */
	EReference getComponent3_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component3#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component3#getTypeId()
	 * @see #getComponent3()
	 * @generated
	 */
	EReference getComponent3_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Component3#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component3#getTemplateIds()
	 * @see #getComponent3()
	 * @generated
	 */
	EReference getComponent3_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component3#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component3#getSection()
	 * @see #getComponent3()
	 * @generated
	 */
	EReference getComponent3_Section();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component3#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component3#getNullFlavor()
	 * @see #getComponent3()
	 * @generated
	 */
	EAttribute getComponent3_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component3#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component3#getTypeCode()
	 * @see #getComponent3()
	 * @generated
	 */
	EAttribute getComponent3_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component3#getContextConductionInd <em>Context Conduction Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Conduction Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component3#getContextConductionInd()
	 * @see #getComponent3()
	 * @generated
	 */
	EAttribute getComponent3_ContextConductionInd();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Section#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getRealmCodes()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Section#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getTypeId()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Section#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getTemplateIds()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Section#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getId()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Section#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getCode()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Section#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getTitle()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Section#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getText()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Section#getConfidentialityCode <em>Confidentiality Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidentiality Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getConfidentialityCode()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_ConfidentialityCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Section#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getLanguageCode()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_LanguageCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Section#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getSubject()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Section#getAuthors <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getAuthors()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Section#getInformants <em>Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getInformants()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Informant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Section#getEntries <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getEntries()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Entry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Section#getComponents <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getComponents()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Component();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Section#getSectionId <em>Section Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getSectionId()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_SectionId();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Section#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getNullFlavor()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Section#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getClassCode()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Section#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Section#getMoodCode()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.StrucDocText <em>Struc Doc Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struc Doc Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.StrucDocText
	 * @generated
	 */
	EClass getStrucDocText();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.cda.StrucDocText#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.StrucDocText#getMixed()
	 * @see #getStrucDocText()
	 * @generated
	 */
	EAttribute getStrucDocText_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.cda.StrucDocText#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.StrucDocText#getAny()
	 * @see #getStrucDocText()
	 * @generated
	 */
	EAttribute getStrucDocText_Any();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Subject#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Subject#getRealmCodes()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Subject#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Subject#getTypeId()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Subject#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Subject#getTemplateIds()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Subject#getAwarenessCode <em>Awareness Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Awareness Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Subject#getAwarenessCode()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_AwarenessCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Subject#getRelatedSubject <em>Related Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Related Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Subject#getRelatedSubject()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_RelatedSubject();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Subject#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Subject#getNullFlavor()
	 * @see #getSubject()
	 * @generated
	 */
	EAttribute getSubject_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Subject#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Subject#getTypeCode()
	 * @see #getSubject()
	 * @generated
	 */
	EAttribute getSubject_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Subject#getContextControlCode <em>Context Control Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Control Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Subject#getContextControlCode()
	 * @see #getSubject()
	 * @generated
	 */
	EAttribute getSubject_ContextControlCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.RelatedSubject <em>Related Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedSubject
	 * @generated
	 */
	EClass getRelatedSubject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RelatedSubject#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedSubject#getRealmCodes()
	 * @see #getRelatedSubject()
	 * @generated
	 */
	EReference getRelatedSubject_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RelatedSubject#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedSubject#getTypeId()
	 * @see #getRelatedSubject()
	 * @generated
	 */
	EReference getRelatedSubject_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RelatedSubject#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedSubject#getTemplateIds()
	 * @see #getRelatedSubject()
	 * @generated
	 */
	EReference getRelatedSubject_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RelatedSubject#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedSubject#getCode()
	 * @see #getRelatedSubject()
	 * @generated
	 */
	EReference getRelatedSubject_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RelatedSubject#getAddrs <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addr</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedSubject#getAddrs()
	 * @see #getRelatedSubject()
	 * @generated
	 */
	EReference getRelatedSubject_Addr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RelatedSubject#getTelecoms <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedSubject#getTelecoms()
	 * @see #getRelatedSubject()
	 * @generated
	 */
	EReference getRelatedSubject_Telecom();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RelatedSubject#getSubjectPerson <em>Subject Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject Person</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedSubject#getSubjectPerson()
	 * @see #getRelatedSubject()
	 * @generated
	 */
	EReference getRelatedSubject_SubjectPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RelatedSubject#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedSubject#getNullFlavor()
	 * @see #getRelatedSubject()
	 * @generated
	 */
	EAttribute getRelatedSubject_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RelatedSubject#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedSubject#getClassCode()
	 * @see #getRelatedSubject()
	 * @generated
	 */
	EAttribute getRelatedSubject_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.SubjectPerson <em>Subject Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Person</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubjectPerson
	 * @generated
	 */
	EClass getSubjectPerson();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubjectPerson#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubjectPerson#getRealmCodes()
	 * @see #getSubjectPerson()
	 * @generated
	 */
	EReference getSubjectPerson_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubjectPerson#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubjectPerson#getTypeId()
	 * @see #getSubjectPerson()
	 * @generated
	 */
	EReference getSubjectPerson_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubjectPerson#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubjectPerson#getTemplateIds()
	 * @see #getSubjectPerson()
	 * @generated
	 */
	EReference getSubjectPerson_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubjectPerson#getNames <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubjectPerson#getNames()
	 * @see #getSubjectPerson()
	 * @generated
	 */
	EReference getSubjectPerson_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubjectPerson#getAdministrativeGenderCode <em>Administrative Gender Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administrative Gender Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubjectPerson#getAdministrativeGenderCode()
	 * @see #getSubjectPerson()
	 * @generated
	 */
	EReference getSubjectPerson_AdministrativeGenderCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubjectPerson#getBirthTime <em>Birth Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Birth Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubjectPerson#getBirthTime()
	 * @see #getSubjectPerson()
	 * @generated
	 */
	EReference getSubjectPerson_BirthTime();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.SubjectPerson#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubjectPerson#getNullFlavor()
	 * @see #getSubjectPerson()
	 * @generated
	 */
	EAttribute getSubjectPerson_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.SubjectPerson#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubjectPerson#getClassCode()
	 * @see #getSubjectPerson()
	 * @generated
	 */
	EAttribute getSubjectPerson_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.SubjectPerson#getDeterminerCode <em>Determiner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determiner Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubjectPerson#getDeterminerCode()
	 * @see #getSubjectPerson()
	 * @generated
	 */
	EAttribute getSubjectPerson_DeterminerCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Entry#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getRealmCodes()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Entry#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getTypeId()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Entry#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getTemplateIds()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Entry#getAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Act</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getAct()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Act();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Entry#getEncounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encounter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getEncounter()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Encounter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Entry#getObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getObservation()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Observation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Entry#getObservationMedia <em>Observation Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observation Media</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getObservationMedia()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_ObservationMedia();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Entry#getOrganizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getOrganizer()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Organizer();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Entry#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getProcedure()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Procedure();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Entry#getRegionOfInterest <em>Region Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region Of Interest</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getRegionOfInterest()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_RegionOfInterest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Entry#getSubstanceAdministration <em>Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substance Administration</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getSubstanceAdministration()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_SubstanceAdministration();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Entry#getSupply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supply</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getSupply()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Supply();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Entry#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getNullFlavor()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Entry#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getTypeCode()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Entry#getContextConductionInd <em>Context Conduction Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Conduction Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entry#getContextConductionInd()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_ContextConductionInd();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Act</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act
	 * @generated
	 */
	EClass getAct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Act#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getRealmCodes()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Act#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getTypeId()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Act#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getTemplateIds()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Act#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getIds()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Act#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getCode()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Act#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getText()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Act#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getStatusCode()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_StatusCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Act#getEffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effective Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getEffectiveTime()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_EffectiveTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Act#getPriorityCode <em>Priority Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getPriorityCode()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_PriorityCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Act#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getLanguageCode()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_LanguageCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Act#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getSubject()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Act#getSpecimens <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specimen</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getSpecimens()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Specimen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Act#getPerformers <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getPerformers()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Performer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Act#getAuthors <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getAuthors()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Act#getInformants <em>Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getInformants()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Informant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Act#getParticipants <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getParticipants()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Act#getEntryRelationships <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getEntryRelationships()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_EntryRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Act#getReferences <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getReferences()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Act#getPreconditions <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getPreconditions()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Act#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getNullFlavor()
	 * @see #getAct()
	 * @generated
	 */
	EAttribute getAct_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Act#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getClassCode()
	 * @see #getAct()
	 * @generated
	 */
	EAttribute getAct_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Act#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getMoodCode()
	 * @see #getAct()
	 * @generated
	 */
	EAttribute getAct_MoodCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Act#getNegationInd <em>Negation Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negation Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Act#getNegationInd()
	 * @see #getAct()
	 * @generated
	 */
	EAttribute getAct_NegationInd();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Specimen <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specimen</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Specimen
	 * @generated
	 */
	EClass getSpecimen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Specimen#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Specimen#getRealmCodes()
	 * @see #getSpecimen()
	 * @generated
	 */
	EReference getSpecimen_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Specimen#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Specimen#getTypeId()
	 * @see #getSpecimen()
	 * @generated
	 */
	EReference getSpecimen_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Specimen#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Specimen#getTemplateIds()
	 * @see #getSpecimen()
	 * @generated
	 */
	EReference getSpecimen_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Specimen#getSpecimenRole <em>Specimen Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specimen Role</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Specimen#getSpecimenRole()
	 * @see #getSpecimen()
	 * @generated
	 */
	EReference getSpecimen_SpecimenRole();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Specimen#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Specimen#getNullFlavor()
	 * @see #getSpecimen()
	 * @generated
	 */
	EAttribute getSpecimen_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Specimen#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Specimen#getTypeCode()
	 * @see #getSpecimen()
	 * @generated
	 */
	EAttribute getSpecimen_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.SpecimenRole <em>Specimen Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specimen Role</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SpecimenRole
	 * @generated
	 */
	EClass getSpecimenRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SpecimenRole#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SpecimenRole#getRealmCodes()
	 * @see #getSpecimenRole()
	 * @generated
	 */
	EReference getSpecimenRole_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SpecimenRole#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SpecimenRole#getTypeId()
	 * @see #getSpecimenRole()
	 * @generated
	 */
	EReference getSpecimenRole_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SpecimenRole#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SpecimenRole#getTemplateIds()
	 * @see #getSpecimenRole()
	 * @generated
	 */
	EReference getSpecimenRole_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SpecimenRole#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SpecimenRole#getIds()
	 * @see #getSpecimenRole()
	 * @generated
	 */
	EReference getSpecimenRole_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SpecimenRole#getSpecimenPlayingEntity <em>Specimen Playing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specimen Playing Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SpecimenRole#getSpecimenPlayingEntity()
	 * @see #getSpecimenRole()
	 * @generated
	 */
	EReference getSpecimenRole_SpecimenPlayingEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.SpecimenRole#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SpecimenRole#getNullFlavor()
	 * @see #getSpecimenRole()
	 * @generated
	 */
	EAttribute getSpecimenRole_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.SpecimenRole#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SpecimenRole#getClassCode()
	 * @see #getSpecimenRole()
	 * @generated
	 */
	EAttribute getSpecimenRole_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.PlayingEntity <em>Playing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playing Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PlayingEntity
	 * @generated
	 */
	EClass getPlayingEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.PlayingEntity#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PlayingEntity#getRealmCodes()
	 * @see #getPlayingEntity()
	 * @generated
	 */
	EReference getPlayingEntity_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.PlayingEntity#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PlayingEntity#getTypeId()
	 * @see #getPlayingEntity()
	 * @generated
	 */
	EReference getPlayingEntity_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.PlayingEntity#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PlayingEntity#getTemplateIds()
	 * @see #getPlayingEntity()
	 * @generated
	 */
	EReference getPlayingEntity_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.PlayingEntity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PlayingEntity#getCode()
	 * @see #getPlayingEntity()
	 * @generated
	 */
	EReference getPlayingEntity_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.PlayingEntity#getQuantities <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PlayingEntity#getQuantities()
	 * @see #getPlayingEntity()
	 * @generated
	 */
	EReference getPlayingEntity_Quantity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.PlayingEntity#getNames <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PlayingEntity#getNames()
	 * @see #getPlayingEntity()
	 * @generated
	 */
	EReference getPlayingEntity_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.PlayingEntity#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Desc</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PlayingEntity#getDesc()
	 * @see #getPlayingEntity()
	 * @generated
	 */
	EReference getPlayingEntity_Desc();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.PlayingEntity#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PlayingEntity#getNullFlavor()
	 * @see #getPlayingEntity()
	 * @generated
	 */
	EAttribute getPlayingEntity_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.PlayingEntity#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PlayingEntity#getClassCode()
	 * @see #getPlayingEntity()
	 * @generated
	 */
	EAttribute getPlayingEntity_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.PlayingEntity#getDeterminerCode <em>Determiner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determiner Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.PlayingEntity#getDeterminerCode()
	 * @see #getPlayingEntity()
	 * @generated
	 */
	EAttribute getPlayingEntity_DeterminerCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Performer2 <em>Performer2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performer2</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer2
	 * @generated
	 */
	EClass getPerformer2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Performer2#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer2#getRealmCodes()
	 * @see #getPerformer2()
	 * @generated
	 */
	EReference getPerformer2_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Performer2#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer2#getTypeId()
	 * @see #getPerformer2()
	 * @generated
	 */
	EReference getPerformer2_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Performer2#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer2#getTemplateIds()
	 * @see #getPerformer2()
	 * @generated
	 */
	EReference getPerformer2_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Performer2#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer2#getTime()
	 * @see #getPerformer2()
	 * @generated
	 */
	EReference getPerformer2_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Performer2#getModeCode <em>Mode Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mode Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer2#getModeCode()
	 * @see #getPerformer2()
	 * @generated
	 */
	EReference getPerformer2_ModeCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Performer2#getAssignedEntity <em>Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer2#getAssignedEntity()
	 * @see #getPerformer2()
	 * @generated
	 */
	EReference getPerformer2_AssignedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Performer2#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer2#getNullFlavor()
	 * @see #getPerformer2()
	 * @generated
	 */
	EAttribute getPerformer2_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Performer2#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Performer2#getTypeCode()
	 * @see #getPerformer2()
	 * @generated
	 */
	EAttribute getPerformer2_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Participant2 <em>Participant2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant2</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant2
	 * @generated
	 */
	EClass getParticipant2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Participant2#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant2#getRealmCodes()
	 * @see #getParticipant2()
	 * @generated
	 */
	EReference getParticipant2_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Participant2#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant2#getTypeId()
	 * @see #getParticipant2()
	 * @generated
	 */
	EReference getParticipant2_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Participant2#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant2#getTemplateIds()
	 * @see #getParticipant2()
	 * @generated
	 */
	EReference getParticipant2_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Participant2#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant2#getTime()
	 * @see #getParticipant2()
	 * @generated
	 */
	EReference getParticipant2_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Participant2#getAwarenessCode <em>Awareness Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Awareness Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant2#getAwarenessCode()
	 * @see #getParticipant2()
	 * @generated
	 */
	EReference getParticipant2_AwarenessCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Participant2#getParticipantRole <em>Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Participant Role</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant2#getParticipantRole()
	 * @see #getParticipant2()
	 * @generated
	 */
	EReference getParticipant2_ParticipantRole();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Participant2#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant2#getNullFlavor()
	 * @see #getParticipant2()
	 * @generated
	 */
	EAttribute getParticipant2_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Participant2#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant2#getTypeCode()
	 * @see #getParticipant2()
	 * @generated
	 */
	EAttribute getParticipant2_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Participant2#getContextControlCode <em>Context Control Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Control Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Participant2#getContextControlCode()
	 * @see #getParticipant2()
	 * @generated
	 */
	EAttribute getParticipant2_ContextControlCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole <em>Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Role</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole
	 * @generated
	 */
	EClass getParticipantRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole#getRealmCodes()
	 * @see #getParticipantRole()
	 * @generated
	 */
	EReference getParticipantRole_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole#getTypeId()
	 * @see #getParticipantRole()
	 * @generated
	 */
	EReference getParticipantRole_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole#getTemplateIds()
	 * @see #getParticipantRole()
	 * @generated
	 */
	EReference getParticipantRole_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole#getIds()
	 * @see #getParticipantRole()
	 * @generated
	 */
	EReference getParticipantRole_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole#getCode()
	 * @see #getParticipantRole()
	 * @generated
	 */
	EReference getParticipantRole_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole#getAddrs <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addr</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole#getAddrs()
	 * @see #getParticipantRole()
	 * @generated
	 */
	EReference getParticipantRole_Addr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole#getTelecoms <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole#getTelecoms()
	 * @see #getParticipantRole()
	 * @generated
	 */
	EReference getParticipantRole_Telecom();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole#getPlayingDevice <em>Playing Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Playing Device</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole#getPlayingDevice()
	 * @see #getParticipantRole()
	 * @generated
	 */
	EReference getParticipantRole_PlayingDevice();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole#getPlayingEntity <em>Playing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Playing Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole#getPlayingEntity()
	 * @see #getParticipantRole()
	 * @generated
	 */
	EReference getParticipantRole_PlayingEntity();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole#getScopingEntity <em>Scoping Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoping Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole#getScopingEntity()
	 * @see #getParticipantRole()
	 * @generated
	 */
	EReference getParticipantRole_ScopingEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole#getNullFlavor()
	 * @see #getParticipantRole()
	 * @generated
	 */
	EAttribute getParticipantRole_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole#getClassCode()
	 * @see #getParticipantRole()
	 * @generated
	 */
	EAttribute getParticipantRole_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Device#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Device#getRealmCodes()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Device#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Device#getTypeId()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Device#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Device#getTemplateIds()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Device#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Device#getCode()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Device#getManufacturerModelName <em>Manufacturer Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manufacturer Model Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Device#getManufacturerModelName()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_ManufacturerModelName();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Device#getSoftwareName <em>Software Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Device#getSoftwareName()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_SoftwareName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Device#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Device#getNullFlavor()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Device#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Device#getClassCode()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Device#getDeterminerCode <em>Determiner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determiner Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Device#getDeterminerCode()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_DeterminerCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Entity#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entity#getRealmCodes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Entity#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entity#getTypeId()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Entity#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entity#getTemplateIds()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Entity#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entity#getIds()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Entity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entity#getCode()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Entity#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Desc</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entity#getDesc()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Desc();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Entity#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entity#getNullFlavor()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Entity#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entity#getClassCode()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Entity#getDeterminerCode <em>Determiner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determiner Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Entity#getDeterminerCode()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_DeterminerCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship
	 * @generated
	 */
	EClass getEntryRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getRealmCodes()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getTypeId()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getTemplateIds()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Number</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getSequenceNumber()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_SequenceNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getSeperatableInd <em>Seperatable Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seperatable Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getSeperatableInd()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_SeperatableInd();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Act</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getAct()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_Act();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getEncounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encounter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getEncounter()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_Encounter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getObservation()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_Observation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getObservationMedia <em>Observation Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observation Media</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getObservationMedia()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_ObservationMedia();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getOrganizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getOrganizer()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_Organizer();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getProcedure()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_Procedure();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getRegionOfInterest <em>Region Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region Of Interest</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getRegionOfInterest()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_RegionOfInterest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getSubstanceAdministration <em>Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substance Administration</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getSubstanceAdministration()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_SubstanceAdministration();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getSupply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supply</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getSupply()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EReference getEntryRelationship_Supply();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getNullFlavor()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EAttribute getEntryRelationship_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getTypeCode()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EAttribute getEntryRelationship_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getInversionInd <em>Inversion Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inversion Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getInversionInd()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EAttribute getEntryRelationship_InversionInd();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getContextConductionInd <em>Context Conduction Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Conduction Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getContextConductionInd()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EAttribute getEntryRelationship_ContextConductionInd();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#getNegationInd <em>Negation Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negation Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.EntryRelationship#getNegationInd()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EAttribute getEntryRelationship_NegationInd();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Encounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter
	 * @generated
	 */
	EClass getEncounter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Encounter#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getRealmCodes()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Encounter#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getTypeId()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Encounter#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getTemplateIds()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Encounter#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getIds()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Encounter#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getCode()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Encounter#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getText()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Encounter#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getStatusCode()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_StatusCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Encounter#getEffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effective Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getEffectiveTime()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_EffectiveTime();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.Encounter#getPriorityCode <em>Priority Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Priority Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getPriorityCode()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_PriorityCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Encounter#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getSubject()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Encounter#getSpecimens <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specimen</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getSpecimens()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_Specimen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Encounter#getPerformers <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getPerformers()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_Performer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Encounter#getAuthors <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getAuthors()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Encounter#getInformants <em>Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getInformants()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_Informant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Encounter#getParticipants <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getParticipants()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Encounter#getEntryRelationships <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getEntryRelationships()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_EntryRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Encounter#getReferences <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getReferences()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Encounter#getPreconditions <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getPreconditions()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Encounter#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getNullFlavor()
	 * @see #getEncounter()
	 * @generated
	 */
	EAttribute getEncounter_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Encounter#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getClassCode()
	 * @see #getEncounter()
	 * @generated
	 */
	EAttribute getEncounter_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Encounter#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter#getMoodCode()
	 * @see #getEncounter()
	 * @generated
	 */
	EAttribute getEncounter_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Reference#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Reference#getRealmCodes()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Reference#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Reference#getTypeId()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Reference#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Reference#getTemplateIds()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Reference#getSeperatableInd <em>Seperatable Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seperatable Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Reference#getSeperatableInd()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_SeperatableInd();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Reference#getExternalAct <em>External Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Act</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Reference#getExternalAct()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_ExternalAct();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Reference#getExternalObservation <em>External Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Reference#getExternalObservation()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_ExternalObservation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Reference#getExternalProcedure <em>External Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Reference#getExternalProcedure()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_ExternalProcedure();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Reference#getExternalDocument <em>External Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Reference#getExternalDocument()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_ExternalDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Reference#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Reference#getNullFlavor()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Reference#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Reference#getTypeCode()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ExternalAct <em>External Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Act</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalAct
	 * @generated
	 */
	EClass getExternalAct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ExternalAct#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalAct#getRealmCodes()
	 * @see #getExternalAct()
	 * @generated
	 */
	EReference getExternalAct_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalAct#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalAct#getTypeId()
	 * @see #getExternalAct()
	 * @generated
	 */
	EReference getExternalAct_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ExternalAct#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalAct#getTemplateIds()
	 * @see #getExternalAct()
	 * @generated
	 */
	EReference getExternalAct_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ExternalAct#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalAct#getIds()
	 * @see #getExternalAct()
	 * @generated
	 */
	EReference getExternalAct_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalAct#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalAct#getCode()
	 * @see #getExternalAct()
	 * @generated
	 */
	EReference getExternalAct_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalAct#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalAct#getText()
	 * @see #getExternalAct()
	 * @generated
	 */
	EReference getExternalAct_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ExternalAct#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalAct#getNullFlavor()
	 * @see #getExternalAct()
	 * @generated
	 */
	EAttribute getExternalAct_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ExternalAct#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalAct#getClassCode()
	 * @see #getExternalAct()
	 * @generated
	 */
	EAttribute getExternalAct_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ExternalAct#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalAct#getMoodCode()
	 * @see #getExternalAct()
	 * @generated
	 */
	EAttribute getExternalAct_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ExternalObservation <em>External Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalObservation
	 * @generated
	 */
	EClass getExternalObservation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ExternalObservation#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalObservation#getRealmCodes()
	 * @see #getExternalObservation()
	 * @generated
	 */
	EReference getExternalObservation_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalObservation#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalObservation#getTypeId()
	 * @see #getExternalObservation()
	 * @generated
	 */
	EReference getExternalObservation_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ExternalObservation#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalObservation#getTemplateIds()
	 * @see #getExternalObservation()
	 * @generated
	 */
	EReference getExternalObservation_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ExternalObservation#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalObservation#getIds()
	 * @see #getExternalObservation()
	 * @generated
	 */
	EReference getExternalObservation_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalObservation#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalObservation#getCode()
	 * @see #getExternalObservation()
	 * @generated
	 */
	EReference getExternalObservation_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalObservation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalObservation#getText()
	 * @see #getExternalObservation()
	 * @generated
	 */
	EReference getExternalObservation_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ExternalObservation#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalObservation#getNullFlavor()
	 * @see #getExternalObservation()
	 * @generated
	 */
	EAttribute getExternalObservation_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ExternalObservation#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalObservation#getClassCode()
	 * @see #getExternalObservation()
	 * @generated
	 */
	EAttribute getExternalObservation_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ExternalObservation#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalObservation#getMoodCode()
	 * @see #getExternalObservation()
	 * @generated
	 */
	EAttribute getExternalObservation_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ExternalProcedure <em>External Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalProcedure
	 * @generated
	 */
	EClass getExternalProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ExternalProcedure#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalProcedure#getRealmCodes()
	 * @see #getExternalProcedure()
	 * @generated
	 */
	EReference getExternalProcedure_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalProcedure#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalProcedure#getTypeId()
	 * @see #getExternalProcedure()
	 * @generated
	 */
	EReference getExternalProcedure_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ExternalProcedure#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalProcedure#getTemplateIds()
	 * @see #getExternalProcedure()
	 * @generated
	 */
	EReference getExternalProcedure_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ExternalProcedure#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalProcedure#getIds()
	 * @see #getExternalProcedure()
	 * @generated
	 */
	EReference getExternalProcedure_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalProcedure#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalProcedure#getCode()
	 * @see #getExternalProcedure()
	 * @generated
	 */
	EReference getExternalProcedure_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalProcedure#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalProcedure#getText()
	 * @see #getExternalProcedure()
	 * @generated
	 */
	EReference getExternalProcedure_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ExternalProcedure#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalProcedure#getNullFlavor()
	 * @see #getExternalProcedure()
	 * @generated
	 */
	EAttribute getExternalProcedure_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ExternalProcedure#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalProcedure#getClassCode()
	 * @see #getExternalProcedure()
	 * @generated
	 */
	EAttribute getExternalProcedure_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ExternalProcedure#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalProcedure#getMoodCode()
	 * @see #getExternalProcedure()
	 * @generated
	 */
	EAttribute getExternalProcedure_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ExternalDocument <em>External Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalDocument
	 * @generated
	 */
	EClass getExternalDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ExternalDocument#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalDocument#getRealmCodes()
	 * @see #getExternalDocument()
	 * @generated
	 */
	EReference getExternalDocument_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalDocument#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalDocument#getTypeId()
	 * @see #getExternalDocument()
	 * @generated
	 */
	EReference getExternalDocument_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ExternalDocument#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalDocument#getTemplateIds()
	 * @see #getExternalDocument()
	 * @generated
	 */
	EReference getExternalDocument_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ExternalDocument#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalDocument#getIds()
	 * @see #getExternalDocument()
	 * @generated
	 */
	EReference getExternalDocument_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalDocument#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalDocument#getCode()
	 * @see #getExternalDocument()
	 * @generated
	 */
	EReference getExternalDocument_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalDocument#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalDocument#getText()
	 * @see #getExternalDocument()
	 * @generated
	 */
	EReference getExternalDocument_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalDocument#getSetId <em>Set Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalDocument#getSetId()
	 * @see #getExternalDocument()
	 * @generated
	 */
	EReference getExternalDocument_SetId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ExternalDocument#getVersionNumber <em>Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Number</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalDocument#getVersionNumber()
	 * @see #getExternalDocument()
	 * @generated
	 */
	EReference getExternalDocument_VersionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ExternalDocument#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalDocument#getNullFlavor()
	 * @see #getExternalDocument()
	 * @generated
	 */
	EAttribute getExternalDocument_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ExternalDocument#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalDocument#getClassCode()
	 * @see #getExternalDocument()
	 * @generated
	 */
	EAttribute getExternalDocument_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ExternalDocument#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ExternalDocument#getMoodCode()
	 * @see #getExternalDocument()
	 * @generated
	 */
	EAttribute getExternalDocument_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Precondition
	 * @generated
	 */
	EClass getPrecondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Precondition#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Precondition#getRealmCodes()
	 * @see #getPrecondition()
	 * @generated
	 */
	EReference getPrecondition_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Precondition#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Precondition#getTypeId()
	 * @see #getPrecondition()
	 * @generated
	 */
	EReference getPrecondition_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Precondition#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Precondition#getTemplateIds()
	 * @see #getPrecondition()
	 * @generated
	 */
	EReference getPrecondition_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Precondition#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Criterion</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Precondition#getCriterion()
	 * @see #getPrecondition()
	 * @generated
	 */
	EReference getPrecondition_Criterion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Precondition#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Precondition#getNullFlavor()
	 * @see #getPrecondition()
	 * @generated
	 */
	EAttribute getPrecondition_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Precondition#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Precondition#getTypeCode()
	 * @see #getPrecondition()
	 * @generated
	 */
	EAttribute getPrecondition_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Criterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterion</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Criterion
	 * @generated
	 */
	EClass getCriterion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Criterion#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Criterion#getRealmCodes()
	 * @see #getCriterion()
	 * @generated
	 */
	EReference getCriterion_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Criterion#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Criterion#getTypeId()
	 * @see #getCriterion()
	 * @generated
	 */
	EReference getCriterion_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Criterion#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Criterion#getTemplateIds()
	 * @see #getCriterion()
	 * @generated
	 */
	EReference getCriterion_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Criterion#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Criterion#getCode()
	 * @see #getCriterion()
	 * @generated
	 */
	EReference getCriterion_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Criterion#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Criterion#getText()
	 * @see #getCriterion()
	 * @generated
	 */
	EReference getCriterion_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Criterion#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Criterion#getValue()
	 * @see #getCriterion()
	 * @generated
	 */
	EReference getCriterion_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Criterion#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Criterion#getNullFlavor()
	 * @see #getCriterion()
	 * @generated
	 */
	EAttribute getCriterion_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Criterion#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Criterion#getClassCode()
	 * @see #getCriterion()
	 * @generated
	 */
	EAttribute getCriterion_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Criterion#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Criterion#getMoodCode()
	 * @see #getCriterion()
	 * @generated
	 */
	EAttribute getCriterion_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation
	 * @generated
	 */
	EClass getObservation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getRealmCodes()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Observation#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getTypeId()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getTemplateIds()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getIds()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Observation#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getCode()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Observation#getDerivationExpr <em>Derivation Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derivation Expr</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getDerivationExpr()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_DerivationExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Observation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getText()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Observation#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getStatusCode()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_StatusCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Observation#getEffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effective Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getEffectiveTime()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_EffectiveTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Observation#getPriorityCode <em>Priority Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getPriorityCode()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_PriorityCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Observation#getRepeatNumber <em>Repeat Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Number</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getRepeatNumber()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_RepeatNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Observation#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getLanguageCode()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_LanguageCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getValues <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getValues()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getInterpretationCodes <em>Interpretation Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interpretation Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getInterpretationCodes()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_InterpretationCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getMethodCodes <em>Method Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getMethodCodes()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_MethodCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getTargetSiteCodes <em>Target Site Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Site Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getTargetSiteCodes()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_TargetSiteCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Observation#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getSubject()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getSpecimens <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specimen</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getSpecimens()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Specimen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getPerformers <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getPerformers()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Performer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getAuthors <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getAuthors()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getInformants <em>Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getInformants()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Informant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getParticipants <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getParticipants()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getEntryRelationships <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getEntryRelationships()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_EntryRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getReferences <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getReferences()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getPreconditions <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getPreconditions()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Observation#getReferenceRanges <em>Reference Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Range</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getReferenceRanges()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_ReferenceRange();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Observation#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getNullFlavor()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Observation#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getClassCode()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Observation#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getMoodCode()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_MoodCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Observation#getNegationInd <em>Negation Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negation Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Observation#getNegationInd()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_NegationInd();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ReferenceRange <em>Reference Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Range</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ReferenceRange
	 * @generated
	 */
	EClass getReferenceRange();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ReferenceRange#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ReferenceRange#getRealmCodes()
	 * @see #getReferenceRange()
	 * @generated
	 */
	EReference getReferenceRange_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ReferenceRange#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ReferenceRange#getTypeId()
	 * @see #getReferenceRange()
	 * @generated
	 */
	EReference getReferenceRange_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ReferenceRange#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ReferenceRange#getTemplateIds()
	 * @see #getReferenceRange()
	 * @generated
	 */
	EReference getReferenceRange_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ReferenceRange#getObservationRange <em>Observation Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observation Range</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ReferenceRange#getObservationRange()
	 * @see #getReferenceRange()
	 * @generated
	 */
	EReference getReferenceRange_ObservationRange();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ReferenceRange#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ReferenceRange#getNullFlavor()
	 * @see #getReferenceRange()
	 * @generated
	 */
	EAttribute getReferenceRange_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ReferenceRange#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ReferenceRange#getTypeCode()
	 * @see #getReferenceRange()
	 * @generated
	 */
	EAttribute getReferenceRange_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ObservationRange <em>Observation Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation Range</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationRange
	 * @generated
	 */
	EClass getObservationRange();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ObservationRange#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationRange#getRealmCodes()
	 * @see #getObservationRange()
	 * @generated
	 */
	EReference getObservationRange_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ObservationRange#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationRange#getTypeId()
	 * @see #getObservationRange()
	 * @generated
	 */
	EReference getObservationRange_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ObservationRange#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationRange#getTemplateIds()
	 * @see #getObservationRange()
	 * @generated
	 */
	EReference getObservationRange_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ObservationRange#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationRange#getCode()
	 * @see #getObservationRange()
	 * @generated
	 */
	EReference getObservationRange_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ObservationRange#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationRange#getText()
	 * @see #getObservationRange()
	 * @generated
	 */
	EReference getObservationRange_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ObservationRange#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationRange#getValue()
	 * @see #getObservationRange()
	 * @generated
	 */
	EReference getObservationRange_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ObservationRange#getInterpretationCode <em>Interpretation Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interpretation Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationRange#getInterpretationCode()
	 * @see #getObservationRange()
	 * @generated
	 */
	EReference getObservationRange_InterpretationCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ObservationRange#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationRange#getNullFlavor()
	 * @see #getObservationRange()
	 * @generated
	 */
	EAttribute getObservationRange_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ObservationRange#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationRange#getClassCode()
	 * @see #getObservationRange()
	 * @generated
	 */
	EAttribute getObservationRange_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ObservationRange#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationRange#getMoodCode()
	 * @see #getObservationRange()
	 * @generated
	 */
	EAttribute getObservationRange_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia <em>Observation Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation Media</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia
	 * @generated
	 */
	EClass getObservationMedia();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getRealmCodes()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getTypeId()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getTemplateIds()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getIds()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getLanguageCode()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_LanguageCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getValue()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getSubject()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getSpecimens <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specimen</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getSpecimens()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_Specimen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getPerformers <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getPerformers()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_Performer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getAuthors <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getAuthors()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getInformants <em>Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getInformants()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_Informant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getParticipants <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getParticipants()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getEntryRelationships <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getEntryRelationships()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_EntryRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getReferences <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getReferences()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getPreconditions <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getPreconditions()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EReference getObservationMedia_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getObservationMediaId <em>Observation Media Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observation Media Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getObservationMediaId()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EAttribute getObservationMedia_ObservationMediaId();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getNullFlavor()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EAttribute getObservationMedia_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getClassCode()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EAttribute getObservationMedia_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ObservationMedia#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ObservationMedia#getMoodCode()
	 * @see #getObservationMedia()
	 * @generated
	 */
	EAttribute getObservationMedia_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Organizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer
	 * @generated
	 */
	EClass getOrganizer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organizer#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getRealmCodes()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Organizer#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getTypeId()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organizer#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getTemplateIds()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organizer#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getIds()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Organizer#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getCode()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Organizer#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getStatusCode()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_StatusCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Organizer#getEffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effective Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getEffectiveTime()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_EffectiveTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Organizer#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getSubject()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organizer#getSpecimens <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specimen</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getSpecimens()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_Specimen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organizer#getPerformers <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getPerformers()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_Performer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organizer#getAuthors <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getAuthors()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organizer#getInformants <em>Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getInformants()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_Informant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organizer#getParticipants <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getParticipants()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organizer#getReferences <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getReferences()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organizer#getPreconditions <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getPreconditions()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Organizer#getComponents <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getComponents()
	 * @see #getOrganizer()
	 * @generated
	 */
	EReference getOrganizer_Component();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Organizer#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getNullFlavor()
	 * @see #getOrganizer()
	 * @generated
	 */
	EAttribute getOrganizer_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Organizer#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getClassCode()
	 * @see #getOrganizer()
	 * @generated
	 */
	EAttribute getOrganizer_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Organizer#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer#getMoodCode()
	 * @see #getOrganizer()
	 * @generated
	 */
	EAttribute getOrganizer_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Component4 <em>Component4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component4</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4
	 * @generated
	 */
	EClass getComponent4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Component4#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getRealmCodes()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component4#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getTypeId()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Component4#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getTemplateIds()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component4#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Number</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getSequenceNumber()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_SequenceNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component4#getSeperatableInd <em>Seperatable Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seperatable Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getSeperatableInd()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_SeperatableInd();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component4#getAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Act</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getAct()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_Act();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component4#getEncounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encounter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getEncounter()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_Encounter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component4#getObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getObservation()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_Observation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component4#getObservationMedia <em>Observation Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observation Media</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getObservationMedia()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_ObservationMedia();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component4#getOrganizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getOrganizer()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_Organizer();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component4#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getProcedure()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_Procedure();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component4#getRegionOfInterest <em>Region Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region Of Interest</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getRegionOfInterest()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_RegionOfInterest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component4#getSubstanceAdministration <em>Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substance Administration</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getSubstanceAdministration()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_SubstanceAdministration();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component4#getSupply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supply</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getSupply()
	 * @see #getComponent4()
	 * @generated
	 */
	EReference getComponent4_Supply();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component4#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getNullFlavor()
	 * @see #getComponent4()
	 * @generated
	 */
	EAttribute getComponent4_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component4#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getTypeCode()
	 * @see #getComponent4()
	 * @generated
	 */
	EAttribute getComponent4_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component4#getContextConductionInd <em>Context Conduction Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Conduction Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component4#getContextConductionInd()
	 * @see #getComponent4()
	 * @generated
	 */
	EAttribute getComponent4_ContextConductionInd();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getRealmCodes()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Procedure#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getTypeId()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getTemplateIds()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getIds()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Procedure#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getCode()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Procedure#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getText()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Procedure#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getStatusCode()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_StatusCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Procedure#getEffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effective Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getEffectiveTime()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_EffectiveTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Procedure#getPriorityCode <em>Priority Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getPriorityCode()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_PriorityCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Procedure#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getLanguageCode()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_LanguageCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getMethodCodes <em>Method Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getMethodCodes()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_MethodCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getApproachSiteCodes <em>Approach Site Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Approach Site Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getApproachSiteCodes()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_ApproachSiteCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getTargetSiteCodes <em>Target Site Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Site Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getTargetSiteCodes()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_TargetSiteCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Procedure#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getSubject()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getSpecimens <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specimen</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getSpecimens()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Specimen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getPerformers <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getPerformers()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Performer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getAuthors <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getAuthors()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getInformants <em>Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getInformants()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Informant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getParticipants <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getParticipants()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getEntryRelationships <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getEntryRelationships()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_EntryRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getReferences <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getReferences()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Procedure#getPreconditions <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getPreconditions()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Procedure#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getNullFlavor()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Procedure#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getClassCode()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Procedure#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getMoodCode()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_MoodCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Procedure#getNegationInd <em>Negation Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negation Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure#getNegationInd()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_NegationInd();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest <em>Region Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Of Interest</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest
	 * @generated
	 */
	EClass getRegionOfInterest();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getRealmCodes()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getTypeId()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getTemplateIds()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getIds()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getCode()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getValues <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getValues()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getSubject()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getSpecimens <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specimen</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getSpecimens()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_Specimen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getPerformers <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getPerformers()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_Performer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getAuthors <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getAuthors()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getInformants <em>Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getInformants()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_Informant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getParticipants <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getParticipants()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getEntryRelationships <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getEntryRelationships()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_EntryRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getReferences <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getReferences()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getPreconditions <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getPreconditions()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EReference getRegionOfInterest_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getRegionOfInterestId <em>Region Of Interest Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Of Interest Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getRegionOfInterestId()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EAttribute getRegionOfInterest_RegionOfInterestId();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getNullFlavor()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EAttribute getRegionOfInterest_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getClassCode()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EAttribute getRegionOfInterest_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterest#getMoodCode()
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	EAttribute getRegionOfInterest_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterestValue <em>Region Of Interest Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Of Interest Value</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterestValue
	 * @generated
	 */
	EClass getRegionOfInterestValue();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterestValue#isUnsorted <em>Unsorted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsorted</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegionOfInterestValue#isUnsorted()
	 * @see #getRegionOfInterestValue()
	 * @generated
	 */
	EAttribute getRegionOfInterestValue_Unsorted();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration <em>Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Administration</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration
	 * @generated
	 */
	EClass getSubstanceAdministration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getRealmCodes()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getTypeId()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getTemplateIds()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getIds()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getCode()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getText()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getStatusCode()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_StatusCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getEffectiveTimes <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effective Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getEffectiveTimes()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_EffectiveTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getPriorityCode <em>Priority Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getPriorityCode()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_PriorityCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getRepeatNumber <em>Repeat Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Number</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getRepeatNumber()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_RepeatNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getRouteCode <em>Route Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getRouteCode()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_RouteCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getApproachSiteCodes <em>Approach Site Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Approach Site Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getApproachSiteCodes()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_ApproachSiteCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getDoseQuantity <em>Dose Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dose Quantity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getDoseQuantity()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_DoseQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getRateQuantity <em>Rate Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate Quantity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getRateQuantity()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_RateQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getMaxDoseQuantity <em>Max Dose Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Dose Quantity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getMaxDoseQuantity()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_MaxDoseQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getAdministrativeUnitCode <em>Administrative Unit Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administrative Unit Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getAdministrativeUnitCode()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_AdministrativeUnitCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getSubject()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getSpecimens <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specimen</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getSpecimens()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_Specimen();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getConsumable <em>Consumable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consumable</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getConsumable()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_Consumable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getPerformers <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getPerformers()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_Performer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getAuthors <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getAuthors()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getInformants <em>Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getInformants()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_Informant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getReferences <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getReferences()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getParticipants <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getParticipants()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getEntryRelationships <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getEntryRelationships()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_EntryRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getPreconditions <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getPreconditions()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EReference getSubstanceAdministration_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getNullFlavor()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EAttribute getSubstanceAdministration_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getClassCode()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EAttribute getSubstanceAdministration_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getMoodCode()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EAttribute getSubstanceAdministration_MoodCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getNegationInd <em>Negation Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negation Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getNegationInd()
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	EAttribute getSubstanceAdministration_NegationInd();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Consumable <em>Consumable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumable</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consumable
	 * @generated
	 */
	EClass getConsumable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Consumable#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consumable#getRealmCodes()
	 * @see #getConsumable()
	 * @generated
	 */
	EReference getConsumable_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Consumable#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consumable#getTypeId()
	 * @see #getConsumable()
	 * @generated
	 */
	EReference getConsumable_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Consumable#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consumable#getTemplateIds()
	 * @see #getConsumable()
	 * @generated
	 */
	EReference getConsumable_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Consumable#getManufacturedProduct <em>Manufactured Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manufactured Product</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consumable#getManufacturedProduct()
	 * @see #getConsumable()
	 * @generated
	 */
	EReference getConsumable_ManufacturedProduct();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Consumable#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consumable#getNullFlavor()
	 * @see #getConsumable()
	 * @generated
	 */
	EAttribute getConsumable_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Consumable#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Consumable#getTypeCode()
	 * @see #getConsumable()
	 * @generated
	 */
	EAttribute getConsumable_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct <em>Manufactured Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manufactured Product</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ManufacturedProduct
	 * @generated
	 */
	EClass getManufacturedProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getRealmCodes()
	 * @see #getManufacturedProduct()
	 * @generated
	 */
	EReference getManufacturedProduct_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getTypeId()
	 * @see #getManufacturedProduct()
	 * @generated
	 */
	EReference getManufacturedProduct_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getTemplateIds()
	 * @see #getManufacturedProduct()
	 * @generated
	 */
	EReference getManufacturedProduct_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getIds()
	 * @see #getManufacturedProduct()
	 * @generated
	 */
	EReference getManufacturedProduct_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getManufacturedLabeledDrug <em>Manufactured Labeled Drug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manufactured Labeled Drug</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getManufacturedLabeledDrug()
	 * @see #getManufacturedProduct()
	 * @generated
	 */
	EReference getManufacturedProduct_ManufacturedLabeledDrug();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getManufacturedMaterial <em>Manufactured Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manufactured Material</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getManufacturedMaterial()
	 * @see #getManufacturedProduct()
	 * @generated
	 */
	EReference getManufacturedProduct_ManufacturedMaterial();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getManufacturerOrganization <em>Manufacturer Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manufacturer Organization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getManufacturerOrganization()
	 * @see #getManufacturedProduct()
	 * @generated
	 */
	EReference getManufacturedProduct_ManufacturerOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getNullFlavor()
	 * @see #getManufacturedProduct()
	 * @generated
	 */
	EAttribute getManufacturedProduct_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ManufacturedProduct#getClassCode()
	 * @see #getManufacturedProduct()
	 * @generated
	 */
	EAttribute getManufacturedProduct_ClassCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.LabeledDrug <em>Labeled Drug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Drug</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LabeledDrug
	 * @generated
	 */
	EClass getLabeledDrug();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.LabeledDrug#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LabeledDrug#getRealmCodes()
	 * @see #getLabeledDrug()
	 * @generated
	 */
	EReference getLabeledDrug_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.LabeledDrug#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LabeledDrug#getTypeId()
	 * @see #getLabeledDrug()
	 * @generated
	 */
	EReference getLabeledDrug_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.LabeledDrug#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LabeledDrug#getTemplateIds()
	 * @see #getLabeledDrug()
	 * @generated
	 */
	EReference getLabeledDrug_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.LabeledDrug#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LabeledDrug#getCode()
	 * @see #getLabeledDrug()
	 * @generated
	 */
	EReference getLabeledDrug_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.LabeledDrug#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LabeledDrug#getName()
	 * @see #getLabeledDrug()
	 * @generated
	 */
	EReference getLabeledDrug_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.LabeledDrug#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LabeledDrug#getNullFlavor()
	 * @see #getLabeledDrug()
	 * @generated
	 */
	EAttribute getLabeledDrug_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.LabeledDrug#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LabeledDrug#getClassCode()
	 * @see #getLabeledDrug()
	 * @generated
	 */
	EAttribute getLabeledDrug_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.LabeledDrug#getDeterminerCode <em>Determiner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determiner Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.LabeledDrug#getDeterminerCode()
	 * @see #getLabeledDrug()
	 * @generated
	 */
	EAttribute getLabeledDrug_DeterminerCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Material#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Material#getRealmCodes()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Material#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Material#getTypeId()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Material#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Material#getTemplateIds()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Material#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Material#getCode()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Material#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Material#getName()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Material#getLotNumberText <em>Lot Number Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lot Number Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Material#getLotNumberText()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_LotNumberText();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Material#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Material#getNullFlavor()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Material#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Material#getClassCode()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Material#getDeterminerCode <em>Determiner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determiner Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Material#getDeterminerCode()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_DeterminerCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Supply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply
	 * @generated
	 */
	EClass getSupply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Supply#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getRealmCodes()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Supply#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getTypeId()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Supply#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getTemplateIds()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_TemplateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Supply#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getIds()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Supply#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getCode()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Supply#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getText()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Supply#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getStatusCode()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_StatusCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Supply#getEffectiveTimes <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effective Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getEffectiveTimes()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_EffectiveTime();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Supply#getPriorityCodes <em>Priority Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Priority Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getPriorityCodes()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_PriorityCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Supply#getRepeatNumber <em>Repeat Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Number</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getRepeatNumber()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_RepeatNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Supply#getIndependentInd <em>Independent Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Independent Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getIndependentInd()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_IndependentInd();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Supply#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getQuantity()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Quantity();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Supply#getExpectedUseTime <em>Expected Use Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expected Use Time</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getExpectedUseTime()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_ExpectedUseTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Supply#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getSubject()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Supply#getSpecimens <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specimen</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getSpecimens()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Specimen();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Supply#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getProduct()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Product();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Supply#getPerformers <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getPerformers()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Performer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Supply#getAuthors <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getAuthors()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Supply#getInformants <em>Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getInformants()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Informant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Supply#getParticipants <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getParticipants()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Supply#getEntryRelationships <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getEntryRelationships()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_EntryRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Supply#getReferences <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getReferences()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Supply#getPreconditions <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getPreconditions()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Supply#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getNullFlavor()
	 * @see #getSupply()
	 * @generated
	 */
	EAttribute getSupply_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Supply#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getClassCode()
	 * @see #getSupply()
	 * @generated
	 */
	EAttribute getSupply_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Supply#getMoodCode <em>Mood Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Supply#getMoodCode()
	 * @see #getSupply()
	 * @generated
	 */
	EAttribute getSupply_MoodCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Product#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Product#getRealmCodes()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Product#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Product#getTypeId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Product#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Product#getTemplateIds()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Product#getManufacturedProduct <em>Manufactured Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manufactured Product</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Product#getManufacturedProduct()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ManufacturedProduct();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Product#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Product#getNullFlavor()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Product#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Product#getTypeCode()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.Component5 <em>Component5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component5</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component5
	 * @generated
	 */
	EClass getComponent5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Component5#getRealmCodes <em>Realm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realm Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component5#getRealmCodes()
	 * @see #getComponent5()
	 * @generated
	 */
	EReference getComponent5_RealmCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component5#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component5#getTypeId()
	 * @see #getComponent5()
	 * @generated
	 */
	EReference getComponent5_TypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cda.Component5#getTemplateIds <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component5#getTemplateIds()
	 * @see #getComponent5()
	 * @generated
	 */
	EReference getComponent5_TemplateId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.Component5#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component5#getSection()
	 * @see #getComponent5()
	 * @generated
	 */
	EReference getComponent5_Section();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component5#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component5#getNullFlavor()
	 * @see #getComponent5()
	 * @generated
	 */
	EAttribute getComponent5_NullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component5#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component5#getTypeCode()
	 * @see #getComponent5()
	 * @generated
	 */
	EAttribute getComponent5_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.Component5#getContextConductionInd <em>Context Conduction Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Conduction Ind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.Component5#getContextConductionInd()
	 * @see #getComponent5()
	 * @generated
	 */
	EAttribute getComponent5_ContextConductionInd();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.cda.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.uml.cda.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.uml.cda.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cda.DocumentRoot#getClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clinical Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.DocumentRoot#getClinicalDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClinicalDocument();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.RegistryDelegate <em>Registry Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Delegate</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.RegistryDelegate
	 * @generated
	 */
	EClass getRegistryDelegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CDAFactory getCDAFactory();

} //CDAPackage
