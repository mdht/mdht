/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.ihe;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEFactory
 * @model kind="package"
 * @generated
 */
public interface IHEPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ihe";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/ihe";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ihe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IHEPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.ConcernEntryImpl <em>Concern Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.ConcernEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getConcernEntry()
	 * @generated
	 */
	int CONCERN_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__REALM_CODE = CCDPackage.PROBLEM_ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__TYPE_ID = CCDPackage.PROBLEM_ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__TEMPLATE_ID = CCDPackage.PROBLEM_ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__ID = CCDPackage.PROBLEM_ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__CODE = CCDPackage.PROBLEM_ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__TEXT = CCDPackage.PROBLEM_ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__STATUS_CODE = CCDPackage.PROBLEM_ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__EFFECTIVE_TIME = CCDPackage.PROBLEM_ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__PRIORITY_CODE = CCDPackage.PROBLEM_ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__LANGUAGE_CODE = CCDPackage.PROBLEM_ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__SUBJECT = CCDPackage.PROBLEM_ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__SPECIMEN = CCDPackage.PROBLEM_ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__PERFORMER = CCDPackage.PROBLEM_ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__AUTHOR = CCDPackage.PROBLEM_ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__INFORMANT = CCDPackage.PROBLEM_ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__PARTICIPANT = CCDPackage.PROBLEM_ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__ENTRY_RELATIONSHIP = CCDPackage.PROBLEM_ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__REFERENCE = CCDPackage.PROBLEM_ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__PRECONDITION = CCDPackage.PROBLEM_ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__NULL_FLAVOR = CCDPackage.PROBLEM_ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__CLASS_CODE = CCDPackage.PROBLEM_ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__MOOD_CODE = CCDPackage.PROBLEM_ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY__NEGATION_IND = CCDPackage.PROBLEM_ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Concern Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_ENTRY_FEATURE_COUNT = CCDPackage.PROBLEM_ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.MedicalDocumentImpl <em>Medical Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.MedicalDocumentImpl
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getMedicalDocument()
	 * @generated
	 */
	int MEDICAL_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__REALM_CODE = CDAPackage.CLINICAL_DOCUMENT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__TYPE_ID = CDAPackage.CLINICAL_DOCUMENT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__TEMPLATE_ID = CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__ID = CDAPackage.CLINICAL_DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__CODE = CDAPackage.CLINICAL_DOCUMENT__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__TITLE = CDAPackage.CLINICAL_DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__EFFECTIVE_TIME = CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__CONFIDENTIALITY_CODE = CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__LANGUAGE_CODE = CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__SET_ID = CDAPackage.CLINICAL_DOCUMENT__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__VERSION_NUMBER = CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__COPY_TIME = CDAPackage.CLINICAL_DOCUMENT__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__RECORD_TARGET = CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__AUTHOR = CDAPackage.CLINICAL_DOCUMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__DATA_ENTERER = CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__INFORMANT = CDAPackage.CLINICAL_DOCUMENT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__CUSTODIAN = CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__INFORMATION_RECIPIENT = CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__LEGAL_AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__PARTICIPANT = CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__IN_FULFILLMENT_OF = CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__DOCUMENTATION_OF = CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__RELATED_DOCUMENT = CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__AUTHORIZATION = CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__COMPONENT_OF = CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__COMPONENT = CDAPackage.CLINICAL_DOCUMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__NULL_FLAVOR = CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__CLASS_CODE = CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT__MOOD_CODE = CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Medical Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_DOCUMENT_FEATURE_COUNT = CDAPackage.CLINICAL_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.ActiveProblemsSectionImpl <em>Active Problems Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.ActiveProblemsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getActiveProblemsSection()
	 * @generated
	 */
	int ACTIVE_PROBLEMS_SECTION = 2;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__REALM_CODE = CCDPackage.PROBLEM_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__TYPE_ID = CCDPackage.PROBLEM_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__TEMPLATE_ID = CCDPackage.PROBLEM_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__ID = CCDPackage.PROBLEM_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__CODE = CCDPackage.PROBLEM_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__TITLE = CCDPackage.PROBLEM_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__TEXT = CCDPackage.PROBLEM_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__CONFIDENTIALITY_CODE = CCDPackage.PROBLEM_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__LANGUAGE_CODE = CCDPackage.PROBLEM_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__SUBJECT = CCDPackage.PROBLEM_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__AUTHOR = CCDPackage.PROBLEM_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__INFORMANT = CCDPackage.PROBLEM_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__ENTRY = CCDPackage.PROBLEM_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__COMPONENT = CCDPackage.PROBLEM_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__SECTION_ID = CCDPackage.PROBLEM_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__NULL_FLAVOR = CCDPackage.PROBLEM_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__CLASS_CODE = CCDPackage.PROBLEM_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION__MOOD_CODE = CCDPackage.PROBLEM_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Active Problems Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_PROBLEMS_SECTION_FEATURE_COUNT = CCDPackage.PROBLEM_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.ProblemConcernEntryImpl <em>Problem Concern Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.ProblemConcernEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getProblemConcernEntry()
	 * @generated
	 */
	int PROBLEM_CONCERN_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__REALM_CODE = CONCERN_ENTRY__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__TYPE_ID = CONCERN_ENTRY__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__TEMPLATE_ID = CONCERN_ENTRY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__ID = CONCERN_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__CODE = CONCERN_ENTRY__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__TEXT = CONCERN_ENTRY__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__STATUS_CODE = CONCERN_ENTRY__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__EFFECTIVE_TIME = CONCERN_ENTRY__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__PRIORITY_CODE = CONCERN_ENTRY__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__LANGUAGE_CODE = CONCERN_ENTRY__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__SUBJECT = CONCERN_ENTRY__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__SPECIMEN = CONCERN_ENTRY__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__PERFORMER = CONCERN_ENTRY__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__AUTHOR = CONCERN_ENTRY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__INFORMANT = CONCERN_ENTRY__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__PARTICIPANT = CONCERN_ENTRY__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__ENTRY_RELATIONSHIP = CONCERN_ENTRY__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__REFERENCE = CONCERN_ENTRY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__PRECONDITION = CONCERN_ENTRY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__NULL_FLAVOR = CONCERN_ENTRY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__CLASS_CODE = CONCERN_ENTRY__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__MOOD_CODE = CONCERN_ENTRY__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY__NEGATION_IND = CONCERN_ENTRY__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Problem Concern Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_CONCERN_ENTRY_FEATURE_COUNT = CONCERN_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.ProblemEntryImpl <em>Problem Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.ProblemEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getProblemEntry()
	 * @generated
	 */
	int PROBLEM_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__REALM_CODE = CCDPackage.PROBLEM_OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__TYPE_ID = CCDPackage.PROBLEM_OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__TEMPLATE_ID = CCDPackage.PROBLEM_OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__ID = CCDPackage.PROBLEM_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__CODE = CCDPackage.PROBLEM_OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__DERIVATION_EXPR = CCDPackage.PROBLEM_OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__TEXT = CCDPackage.PROBLEM_OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__STATUS_CODE = CCDPackage.PROBLEM_OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__EFFECTIVE_TIME = CCDPackage.PROBLEM_OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__PRIORITY_CODE = CCDPackage.PROBLEM_OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__REPEAT_NUMBER = CCDPackage.PROBLEM_OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__LANGUAGE_CODE = CCDPackage.PROBLEM_OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__VALUE = CCDPackage.PROBLEM_OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__INTERPRETATION_CODE = CCDPackage.PROBLEM_OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__METHOD_CODE = CCDPackage.PROBLEM_OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__TARGET_SITE_CODE = CCDPackage.PROBLEM_OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__SUBJECT = CCDPackage.PROBLEM_OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__SPECIMEN = CCDPackage.PROBLEM_OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__PERFORMER = CCDPackage.PROBLEM_OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__AUTHOR = CCDPackage.PROBLEM_OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__INFORMANT = CCDPackage.PROBLEM_OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__PARTICIPANT = CCDPackage.PROBLEM_OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__ENTRY_RELATIONSHIP = CCDPackage.PROBLEM_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__REFERENCE = CCDPackage.PROBLEM_OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__PRECONDITION = CCDPackage.PROBLEM_OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__REFERENCE_RANGE = CCDPackage.PROBLEM_OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__NULL_FLAVOR = CCDPackage.PROBLEM_OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__CLASS_CODE = CCDPackage.PROBLEM_OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__MOOD_CODE = CCDPackage.PROBLEM_OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__NEGATION_IND = CCDPackage.PROBLEM_OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Problem Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_FEATURE_COUNT = CCDPackage.PROBLEM_OBSERVATION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.MedicationImpl <em>Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.MedicationImpl
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getMedication()
	 * @generated
	 */
	int MEDICATION = 5;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__REALM_CODE = CCDPackage.MEDICATION_ACTIVITY__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__TYPE_ID = CCDPackage.MEDICATION_ACTIVITY__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__TEMPLATE_ID = CCDPackage.MEDICATION_ACTIVITY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ID = CCDPackage.MEDICATION_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CODE = CCDPackage.MEDICATION_ACTIVITY__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__TEXT = CCDPackage.MEDICATION_ACTIVITY__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__STATUS_CODE = CCDPackage.MEDICATION_ACTIVITY__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__EFFECTIVE_TIME = CCDPackage.MEDICATION_ACTIVITY__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PRIORITY_CODE = CCDPackage.MEDICATION_ACTIVITY__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__REPEAT_NUMBER = CCDPackage.MEDICATION_ACTIVITY__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ROUTE_CODE = CCDPackage.MEDICATION_ACTIVITY__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__APPROACH_SITE_CODE = CCDPackage.MEDICATION_ACTIVITY__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__DOSE_QUANTITY = CCDPackage.MEDICATION_ACTIVITY__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__RATE_QUANTITY = CCDPackage.MEDICATION_ACTIVITY__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__MAX_DOSE_QUANTITY = CCDPackage.MEDICATION_ACTIVITY__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administrative Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ADMINISTRATIVE_UNIT_CODE = CCDPackage.MEDICATION_ACTIVITY__ADMINISTRATIVE_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__SUBJECT = CCDPackage.MEDICATION_ACTIVITY__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__SPECIMEN = CCDPackage.MEDICATION_ACTIVITY__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CONSUMABLE = CCDPackage.MEDICATION_ACTIVITY__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PERFORMER = CCDPackage.MEDICATION_ACTIVITY__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__AUTHOR = CCDPackage.MEDICATION_ACTIVITY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__INFORMANT = CCDPackage.MEDICATION_ACTIVITY__INFORMANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__REFERENCE = CCDPackage.MEDICATION_ACTIVITY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PARTICIPANT = CCDPackage.MEDICATION_ACTIVITY__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ENTRY_RELATIONSHIP = CCDPackage.MEDICATION_ACTIVITY__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PRECONDITION = CCDPackage.MEDICATION_ACTIVITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__NULL_FLAVOR = CCDPackage.MEDICATION_ACTIVITY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CLASS_CODE = CCDPackage.MEDICATION_ACTIVITY__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__MOOD_CODE = CCDPackage.MEDICATION_ACTIVITY__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__NEGATION_IND = CCDPackage.MEDICATION_ACTIVITY__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FEATURE_COUNT = CCDPackage.MEDICATION_ACTIVITY_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.MedicationsSectionImpl <em>Medications Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.MedicationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getMedicationsSection()
	 * @generated
	 */
	int MEDICATIONS_SECTION = 6;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__REALM_CODE = CCDPackage.MEDICATION_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__TYPE_ID = CCDPackage.MEDICATION_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__TEMPLATE_ID = CCDPackage.MEDICATION_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__ID = CCDPackage.MEDICATION_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__CODE = CCDPackage.MEDICATION_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__TITLE = CCDPackage.MEDICATION_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__TEXT = CCDPackage.MEDICATION_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__CONFIDENTIALITY_CODE = CCDPackage.MEDICATION_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__LANGUAGE_CODE = CCDPackage.MEDICATION_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__SUBJECT = CCDPackage.MEDICATION_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__AUTHOR = CCDPackage.MEDICATION_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__INFORMANT = CCDPackage.MEDICATION_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__ENTRY = CCDPackage.MEDICATION_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__COMPONENT = CCDPackage.MEDICATION_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__SECTION_ID = CCDPackage.MEDICATION_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__NULL_FLAVOR = CCDPackage.MEDICATION_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__CLASS_CODE = CCDPackage.MEDICATION_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__MOOD_CODE = CCDPackage.MEDICATION_SECTION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Code1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__CODE1 = CCDPackage.MEDICATION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Medications Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION_FEATURE_COUNT = CCDPackage.MEDICATION_SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.AllergyIntoleranceConcernImpl <em>Allergy Intolerance Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.AllergyIntoleranceConcernImpl
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getAllergyIntoleranceConcern()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_CONCERN = 7;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__REALM_CODE = CONCERN_ENTRY__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__TYPE_ID = CONCERN_ENTRY__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__TEMPLATE_ID = CONCERN_ENTRY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__ID = CONCERN_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__CODE = CONCERN_ENTRY__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__TEXT = CONCERN_ENTRY__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__STATUS_CODE = CONCERN_ENTRY__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__EFFECTIVE_TIME = CONCERN_ENTRY__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__PRIORITY_CODE = CONCERN_ENTRY__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__LANGUAGE_CODE = CONCERN_ENTRY__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__SUBJECT = CONCERN_ENTRY__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__SPECIMEN = CONCERN_ENTRY__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__PERFORMER = CONCERN_ENTRY__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__AUTHOR = CONCERN_ENTRY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__INFORMANT = CONCERN_ENTRY__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__PARTICIPANT = CONCERN_ENTRY__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__ENTRY_RELATIONSHIP = CONCERN_ENTRY__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__REFERENCE = CONCERN_ENTRY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__PRECONDITION = CONCERN_ENTRY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__NULL_FLAVOR = CONCERN_ENTRY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__CLASS_CODE = CONCERN_ENTRY__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__MOOD_CODE = CONCERN_ENTRY__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN__NEGATION_IND = CONCERN_ENTRY__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Allergy Intolerance Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_CONCERN_FEATURE_COUNT = CONCERN_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.AllergyIntoleranceImpl <em>Allergy Intolerance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.AllergyIntoleranceImpl
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getAllergyIntolerance()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE = 8;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__REALM_CODE = PROBLEM_ENTRY__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__TYPE_ID = PROBLEM_ENTRY__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__TEMPLATE_ID = PROBLEM_ENTRY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__ID = PROBLEM_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__CODE = PROBLEM_ENTRY__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__DERIVATION_EXPR = PROBLEM_ENTRY__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__TEXT = PROBLEM_ENTRY__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__STATUS_CODE = PROBLEM_ENTRY__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__EFFECTIVE_TIME = PROBLEM_ENTRY__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__PRIORITY_CODE = PROBLEM_ENTRY__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__REPEAT_NUMBER = PROBLEM_ENTRY__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__LANGUAGE_CODE = PROBLEM_ENTRY__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__VALUE = PROBLEM_ENTRY__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__INTERPRETATION_CODE = PROBLEM_ENTRY__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__METHOD_CODE = PROBLEM_ENTRY__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__TARGET_SITE_CODE = PROBLEM_ENTRY__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__SUBJECT = PROBLEM_ENTRY__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__SPECIMEN = PROBLEM_ENTRY__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__PERFORMER = PROBLEM_ENTRY__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__AUTHOR = PROBLEM_ENTRY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__INFORMANT = PROBLEM_ENTRY__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__PARTICIPANT = PROBLEM_ENTRY__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__ENTRY_RELATIONSHIP = PROBLEM_ENTRY__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__REFERENCE = PROBLEM_ENTRY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__PRECONDITION = PROBLEM_ENTRY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__REFERENCE_RANGE = PROBLEM_ENTRY__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__NULL_FLAVOR = PROBLEM_ENTRY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__CLASS_CODE = PROBLEM_ENTRY__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__MOOD_CODE = PROBLEM_ENTRY__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__NEGATION_IND = PROBLEM_ENTRY__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Allergy Intolerance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_FEATURE_COUNT = PROBLEM_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.AllergiesReactionsSectionImpl <em>Allergies Reactions Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.AllergiesReactionsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getAllergiesReactionsSection()
	 * @generated
	 */
	int ALLERGIES_REACTIONS_SECTION = 9;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__REALM_CODE = CCDPackage.ALERTS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__TYPE_ID = CCDPackage.ALERTS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__TEMPLATE_ID = CCDPackage.ALERTS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__ID = CCDPackage.ALERTS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__CODE = CCDPackage.ALERTS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__TITLE = CCDPackage.ALERTS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__TEXT = CCDPackage.ALERTS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__CONFIDENTIALITY_CODE = CCDPackage.ALERTS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__LANGUAGE_CODE = CCDPackage.ALERTS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__SUBJECT = CCDPackage.ALERTS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__AUTHOR = CCDPackage.ALERTS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__INFORMANT = CCDPackage.ALERTS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__ENTRY = CCDPackage.ALERTS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__COMPONENT = CCDPackage.ALERTS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__SECTION_ID = CCDPackage.ALERTS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__NULL_FLAVOR = CCDPackage.ALERTS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__CLASS_CODE = CCDPackage.ALERTS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__MOOD_CODE = CCDPackage.ALERTS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Allergies Reactions Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION_FEATURE_COUNT = CCDPackage.ALERTS_SECTION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry <em>Concern Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry
	 * @generated
	 */
	EClass getConcernEntry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.MedicalDocument <em>Medical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medical Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.MedicalDocument
	 * @generated
	 */
	EClass getMedicalDocument();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection <em>Active Problems Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Problems Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection
	 * @generated
	 */
	EClass getActiveProblemsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry <em>Problem Concern Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Concern Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry
	 * @generated
	 */
	EClass getProblemConcernEntry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry <em>Problem Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry
	 * @generated
	 */
	EClass getProblemEntry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.Medication
	 * @generated
	 */
	EClass getMedication();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection <em>Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medications Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection
	 * @generated
	 */
	EClass getMedicationsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection <em>Code1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code1</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection
	 * @see #getMedicationsSection()
	 * @generated
	 */
	EReference getMedicationsSection_Code1();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern <em>Allergy Intolerance Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergy Intolerance Concern</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern
	 * @generated
	 */
	EClass getAllergyIntoleranceConcern();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance <em>Allergy Intolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergy Intolerance</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance
	 * @generated
	 */
	EClass getAllergyIntolerance();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection <em>Allergies Reactions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergies Reactions Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection
	 * @generated
	 */
	EClass getAllergiesReactionsSection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IHEFactory getIHEFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.ConcernEntryImpl <em>Concern Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.ConcernEntryImpl
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getConcernEntry()
		 * @generated
		 */
		EClass CONCERN_ENTRY = eINSTANCE.getConcernEntry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.MedicalDocumentImpl <em>Medical Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.MedicalDocumentImpl
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getMedicalDocument()
		 * @generated
		 */
		EClass MEDICAL_DOCUMENT = eINSTANCE.getMedicalDocument();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.ActiveProblemsSectionImpl <em>Active Problems Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.ActiveProblemsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getActiveProblemsSection()
		 * @generated
		 */
		EClass ACTIVE_PROBLEMS_SECTION = eINSTANCE.getActiveProblemsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.ProblemConcernEntryImpl <em>Problem Concern Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.ProblemConcernEntryImpl
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getProblemConcernEntry()
		 * @generated
		 */
		EClass PROBLEM_CONCERN_ENTRY = eINSTANCE.getProblemConcernEntry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.ProblemEntryImpl <em>Problem Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.ProblemEntryImpl
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getProblemEntry()
		 * @generated
		 */
		EClass PROBLEM_ENTRY = eINSTANCE.getProblemEntry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.MedicationImpl <em>Medication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.MedicationImpl
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getMedication()
		 * @generated
		 */
		EClass MEDICATION = eINSTANCE.getMedication();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.MedicationsSectionImpl <em>Medications Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.MedicationsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getMedicationsSection()
		 * @generated
		 */
		EClass MEDICATIONS_SECTION = eINSTANCE.getMedicationsSection();

		/**
		 * The meta object literal for the '<em><b>Code1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATIONS_SECTION__CODE1 = eINSTANCE.getMedicationsSection_Code1();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.AllergyIntoleranceConcernImpl <em>Allergy Intolerance Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.AllergyIntoleranceConcernImpl
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getAllergyIntoleranceConcern()
		 * @generated
		 */
		EClass ALLERGY_INTOLERANCE_CONCERN = eINSTANCE.getAllergyIntoleranceConcern();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.AllergyIntoleranceImpl <em>Allergy Intolerance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.AllergyIntoleranceImpl
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getAllergyIntolerance()
		 * @generated
		 */
		EClass ALLERGY_INTOLERANCE = eINSTANCE.getAllergyIntolerance();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.ihe.impl.AllergiesReactionsSectionImpl <em>Allergies Reactions Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.AllergiesReactionsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.ihe.impl.IHEPackageImpl#getAllergiesReactionsSection()
		 * @generated
		 */
		EClass ALLERGIES_REACTIONS_SECTION = eINSTANCE.getAllergiesReactionsSection();

	}

} //IHEPackage
