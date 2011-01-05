/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory
 * @model kind="package"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation registryDelegate='HITSPRegistryDelegate'"
 * @generated
 */
public interface HITSPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hitsp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/hitsp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hitsp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HITSPPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.AllergyDrugSensitivityImpl <em>Allergy Drug Sensitivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.AllergyDrugSensitivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getAllergyDrugSensitivity()
	 * @generated
	 */
	int ALLERGY_DRUG_SENSITIVITY = 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__REALM_CODE = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__TYPE_ID = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__TEMPLATE_ID = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__ID = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__CODE = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__TEXT = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__STATUS_CODE = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__EFFECTIVE_TIME = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__PRIORITY_CODE = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__LANGUAGE_CODE = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__SUBJECT = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__SPECIMEN = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__PERFORMER = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__AUTHOR = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__INFORMANT = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__PARTICIPANT = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__ENTRY_RELATIONSHIP = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__REFERENCE = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__PRECONDITION = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__NULL_FLAVOR = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__CLASS_CODE = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__MOOD_CODE = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__NEGATION_IND = IHEPackage.ALLERGY_INTOLERANCE_CONCERN__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Allergy Drug Sensitivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY_FEATURE_COUNT = IHEPackage.ALLERGY_INTOLERANCE_CONCERN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationImpl <em>Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedication()
	 * @generated
	 */
	int MEDICATION = 1;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__REALM_CODE = IHEPackage.MEDICATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__TYPE_ID = IHEPackage.MEDICATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__TEMPLATE_ID = IHEPackage.MEDICATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ID = IHEPackage.MEDICATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CODE = IHEPackage.MEDICATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__TEXT = IHEPackage.MEDICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__STATUS_CODE = IHEPackage.MEDICATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__EFFECTIVE_TIME = IHEPackage.MEDICATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PRIORITY_CODE = IHEPackage.MEDICATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__REPEAT_NUMBER = IHEPackage.MEDICATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ROUTE_CODE = IHEPackage.MEDICATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__APPROACH_SITE_CODE = IHEPackage.MEDICATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__DOSE_QUANTITY = IHEPackage.MEDICATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__RATE_QUANTITY = IHEPackage.MEDICATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__MAX_DOSE_QUANTITY = IHEPackage.MEDICATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ADMINISTRATION_UNIT_CODE = IHEPackage.MEDICATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__SUBJECT = IHEPackage.MEDICATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__SPECIMEN = IHEPackage.MEDICATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CONSUMABLE = IHEPackage.MEDICATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PERFORMER = IHEPackage.MEDICATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__AUTHOR = IHEPackage.MEDICATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__INFORMANT = IHEPackage.MEDICATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__REFERENCE = IHEPackage.MEDICATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PARTICIPANT = IHEPackage.MEDICATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ENTRY_RELATIONSHIP = IHEPackage.MEDICATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PRECONDITION = IHEPackage.MEDICATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__NULL_FLAVOR = IHEPackage.MEDICATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CLASS_CODE = IHEPackage.MEDICATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__MOOD_CODE = IHEPackage.MEDICATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__NEGATION_IND = IHEPackage.MEDICATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FEATURE_COUNT = IHEPackage.MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ConditionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__REALM_CODE = IHEPackage.PROBLEM_CONCERN_ENTRY__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TYPE_ID = IHEPackage.PROBLEM_CONCERN_ENTRY__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TEMPLATE_ID = IHEPackage.PROBLEM_CONCERN_ENTRY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ID = IHEPackage.PROBLEM_CONCERN_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CODE = IHEPackage.PROBLEM_CONCERN_ENTRY__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TEXT = IHEPackage.PROBLEM_CONCERN_ENTRY__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STATUS_CODE = IHEPackage.PROBLEM_CONCERN_ENTRY__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EFFECTIVE_TIME = IHEPackage.PROBLEM_CONCERN_ENTRY__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PRIORITY_CODE = IHEPackage.PROBLEM_CONCERN_ENTRY__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__LANGUAGE_CODE = IHEPackage.PROBLEM_CONCERN_ENTRY__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SUBJECT = IHEPackage.PROBLEM_CONCERN_ENTRY__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SPECIMEN = IHEPackage.PROBLEM_CONCERN_ENTRY__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PERFORMER = IHEPackage.PROBLEM_CONCERN_ENTRY__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__AUTHOR = IHEPackage.PROBLEM_CONCERN_ENTRY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__INFORMANT = IHEPackage.PROBLEM_CONCERN_ENTRY__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PARTICIPANT = IHEPackage.PROBLEM_CONCERN_ENTRY__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ENTRY_RELATIONSHIP = IHEPackage.PROBLEM_CONCERN_ENTRY__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__REFERENCE = IHEPackage.PROBLEM_CONCERN_ENTRY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PRECONDITION = IHEPackage.PROBLEM_CONCERN_ENTRY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NULL_FLAVOR = IHEPackage.PROBLEM_CONCERN_ENTRY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CLASS_CODE = IHEPackage.PROBLEM_CONCERN_ENTRY__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__MOOD_CODE = IHEPackage.PROBLEM_CONCERN_ENTRY__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NEGATION_IND = IHEPackage.PROBLEM_CONCERN_ENTRY__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = IHEPackage.PROBLEM_CONCERN_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.PatientSummaryImpl <em>Patient Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.PatientSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getPatientSummary()
	 * @generated
	 */
	int PATIENT_SUMMARY = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.VitalSignsSectionImpl <em>Vital Signs Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.VitalSignsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getVitalSignsSection()
	 * @generated
	 */
	int VITAL_SIGNS_SECTION = 17;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.VitalSignImpl <em>Vital Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.VitalSignImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getVitalSign()
	 * @generated
	 */
	int VITAL_SIGN = 20;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.PayersSectionImpl <em>Payers Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.PayersSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getPayersSection()
	 * @generated
	 */
	int PAYERS_SECTION = 13;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.AllergiesReactionsSectionImpl <em>Allergies Reactions Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.AllergiesReactionsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getAllergiesReactionsSection()
	 * @generated
	 */
	int ALLERGIES_REACTIONS_SECTION = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ProblemListSectionImpl <em>Problem List Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ProblemListSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getProblemListSection()
	 * @generated
	 */
	int PROBLEM_LIST_SECTION = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HistoryOfPastIllnessSectionImpl <em>History Of Past Illness Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HistoryOfPastIllnessSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHistoryOfPastIllnessSection()
	 * @generated
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION = 21;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ChiefComplaintSectionImpl <em>Chief Complaint Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ChiefComplaintSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getChiefComplaintSection()
	 * @generated
	 */
	int CHIEF_COMPLAINT_SECTION = 22;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ReasonForReferralSectionImpl <em>Reason For Referral Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ReasonForReferralSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getReasonForReferralSection()
	 * @generated
	 */
	int REASON_FOR_REFERRAL_SECTION = 23;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HistoryOfPresentIllnessImpl <em>History Of Present Illness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HistoryOfPresentIllnessImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHistoryOfPresentIllness()
	 * @generated
	 */
	int HISTORY_OF_PRESENT_ILLNESS = 24;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.SurgeriesSectionImpl <em>Surgeries Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.SurgeriesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getSurgeriesSection()
	 * @generated
	 */
	int SURGERIES_SECTION = 14;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.FunctionalStatusSectionImpl <em>Functional Status Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.FunctionalStatusSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getFunctionalStatusSection()
	 * @generated
	 */
	int FUNCTIONAL_STATUS_SECTION = 25;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HospitalAdmissionDiagnosisSectionImpl <em>Hospital Admission Diagnosis Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HospitalAdmissionDiagnosisSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHospitalAdmissionDiagnosisSection()
	 * @generated
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION = 26;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.DischargeDiagnosisSectionImpl <em>Discharge Diagnosis Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.DischargeDiagnosisSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getDischargeDiagnosisSection()
	 * @generated
	 */
	int DISCHARGE_DIAGNOSIS_SECTION = 27;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationsSectionImpl <em>Medications Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationsSection()
	 * @generated
	 */
	int MEDICATIONS_SECTION = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.AdmissionMedicationHistorySectionImpl <em>Admission Medication History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.AdmissionMedicationHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getAdmissionMedicationHistorySection()
	 * @generated
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION = 28;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HospitalDischargeMedicationsSectionImpl <em>Hospital Discharge Medications Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HospitalDischargeMedicationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHospitalDischargeMedicationsSection()
	 * @generated
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION = 29;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationsAdministeredSectionImpl <em>Medications Administered Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationsAdministeredSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationsAdministeredSection()
	 * @generated
	 */
	int MEDICATIONS_ADMINISTERED_SECTION = 30;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.AdvanceDirectivesSectionImpl <em>Advance Directives Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.AdvanceDirectivesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getAdvanceDirectivesSection()
	 * @generated
	 */
	int ADVANCE_DIRECTIVES_SECTION = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ImmunizationsSectionImpl <em>Immunizations Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ImmunizationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getImmunizationsSection()
	 * @generated
	 */
	int IMMUNIZATIONS_SECTION = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.PhysicalExamSectionImpl <em>Physical Exam Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.PhysicalExamSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getPhysicalExamSection()
	 * @generated
	 */
	int PHYSICAL_EXAM_SECTION = 31;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ReviewOfSystemsSectionImpl <em>Review Of Systems Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ReviewOfSystemsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getReviewOfSystemsSection()
	 * @generated
	 */
	int REVIEW_OF_SYSTEMS_SECTION = 32;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HospitalCourseSectionImpl <em>Hospital Course Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HospitalCourseSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHospitalCourseSection()
	 * @generated
	 */
	int HOSPITAL_COURSE_SECTION = 33;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.DiagnosticResultsSectionImpl <em>Diagnostic Results Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.DiagnosticResultsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getDiagnosticResultsSection()
	 * @generated
	 */
	int DIAGNOSTIC_RESULTS_SECTION = 18;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.AssessmentAndPlanSectionImpl <em>Assessment And Plan Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.AssessmentAndPlanSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getAssessmentAndPlanSection()
	 * @generated
	 */
	int ASSESSMENT_AND_PLAN_SECTION = 34;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.PlanOfCareSectionImpl <em>Plan Of Care Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.PlanOfCareSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getPlanOfCareSection()
	 * @generated
	 */
	int PLAN_OF_CARE_SECTION = 16;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.FamilyHistorySectionImpl <em>Family History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.FamilyHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getFamilyHistorySection()
	 * @generated
	 */
	int FAMILY_HISTORY_SECTION = 35;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.SocialHistorySectionImpl <em>Social History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.SocialHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getSocialHistorySection()
	 * @generated
	 */
	int SOCIAL_HISTORY_SECTION = 36;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.EncountersSectionImpl <em>Encounters Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.EncountersSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getEncountersSection()
	 * @generated
	 */
	int ENCOUNTERS_SECTION = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicalEquipmentSectionImpl <em>Medical Equipment Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicalEquipmentSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicalEquipmentSection()
	 * @generated
	 */
	int MEDICAL_EQUIPMENT_SECTION = 37;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ConditionEntryImpl <em>Condition Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ConditionEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getConditionEntry()
	 * @generated
	 */
	int CONDITION_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__REALM_CODE = IHEPackage.PROBLEM_ENTRY__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__TYPE_ID = IHEPackage.PROBLEM_ENTRY__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__TEMPLATE_ID = IHEPackage.PROBLEM_ENTRY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__ID = IHEPackage.PROBLEM_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__CODE = IHEPackage.PROBLEM_ENTRY__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__DERIVATION_EXPR = IHEPackage.PROBLEM_ENTRY__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__TEXT = IHEPackage.PROBLEM_ENTRY__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__STATUS_CODE = IHEPackage.PROBLEM_ENTRY__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__EFFECTIVE_TIME = IHEPackage.PROBLEM_ENTRY__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__PRIORITY_CODE = IHEPackage.PROBLEM_ENTRY__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__REPEAT_NUMBER = IHEPackage.PROBLEM_ENTRY__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__LANGUAGE_CODE = IHEPackage.PROBLEM_ENTRY__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__VALUE = IHEPackage.PROBLEM_ENTRY__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__INTERPRETATION_CODE = IHEPackage.PROBLEM_ENTRY__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__METHOD_CODE = IHEPackage.PROBLEM_ENTRY__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__TARGET_SITE_CODE = IHEPackage.PROBLEM_ENTRY__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__SUBJECT = IHEPackage.PROBLEM_ENTRY__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__SPECIMEN = IHEPackage.PROBLEM_ENTRY__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__PERFORMER = IHEPackage.PROBLEM_ENTRY__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__AUTHOR = IHEPackage.PROBLEM_ENTRY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__INFORMANT = IHEPackage.PROBLEM_ENTRY__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__PARTICIPANT = IHEPackage.PROBLEM_ENTRY__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__ENTRY_RELATIONSHIP = IHEPackage.PROBLEM_ENTRY__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__REFERENCE = IHEPackage.PROBLEM_ENTRY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__PRECONDITION = IHEPackage.PROBLEM_ENTRY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__REFERENCE_RANGE = IHEPackage.PROBLEM_ENTRY__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__NULL_FLAVOR = IHEPackage.PROBLEM_ENTRY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__CLASS_CODE = IHEPackage.PROBLEM_ENTRY__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__MOOD_CODE = IHEPackage.PROBLEM_ENTRY__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__NEGATION_IND = IHEPackage.PROBLEM_ENTRY__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Condition Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY_FEATURE_COUNT = IHEPackage.PROBLEM_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__REALM_CODE = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__TYPE_ID = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__TEMPLATE_ID = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__ID = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__CODE = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__TITLE = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__EFFECTIVE_TIME = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__CONFIDENTIALITY_CODE = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__LANGUAGE_CODE = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__SET_ID = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__VERSION_NUMBER = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__COPY_TIME = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__RECORD_TARGET = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__AUTHOR = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__DATA_ENTERER = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__INFORMANT = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__CUSTODIAN = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__INFORMATION_RECIPIENT = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__LEGAL_AUTHENTICATOR = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__AUTHENTICATOR = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__PARTICIPANT = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__IN_FULFILLMENT_OF = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__DOCUMENTATION_OF = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__RELATED_DOCUMENT = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__AUTHORIZATION = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__COMPONENT_OF = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__COMPONENT = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__NULL_FLAVOR = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__CLASS_CODE = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__MOOD_CODE = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Patient Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY_FEATURE_COUNT = CCDPackage.CONTINUITY_OF_CARE_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__REALM_CODE = IHEPackage.ACTIVE_PROBLEMS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__TYPE_ID = IHEPackage.ACTIVE_PROBLEMS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__TEMPLATE_ID = IHEPackage.ACTIVE_PROBLEMS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__ID = IHEPackage.ACTIVE_PROBLEMS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__CODE = IHEPackage.ACTIVE_PROBLEMS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__TITLE = IHEPackage.ACTIVE_PROBLEMS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__TEXT = IHEPackage.ACTIVE_PROBLEMS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__CONFIDENTIALITY_CODE = IHEPackage.ACTIVE_PROBLEMS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__LANGUAGE_CODE = IHEPackage.ACTIVE_PROBLEMS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__SUBJECT = IHEPackage.ACTIVE_PROBLEMS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__AUTHOR = IHEPackage.ACTIVE_PROBLEMS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__INFORMANT = IHEPackage.ACTIVE_PROBLEMS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__ENTRY = IHEPackage.ACTIVE_PROBLEMS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__COMPONENT = IHEPackage.ACTIVE_PROBLEMS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__SECTION_ID = IHEPackage.ACTIVE_PROBLEMS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__NULL_FLAVOR = IHEPackage.ACTIVE_PROBLEMS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__CLASS_CODE = IHEPackage.ACTIVE_PROBLEMS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__MOOD_CODE = IHEPackage.ACTIVE_PROBLEMS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Problem List Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION_FEATURE_COUNT = IHEPackage.ACTIVE_PROBLEMS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__REALM_CODE = IHEPackage.MEDICATIONS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__TYPE_ID = IHEPackage.MEDICATIONS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__TEMPLATE_ID = IHEPackage.MEDICATIONS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__ID = IHEPackage.MEDICATIONS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__CODE = IHEPackage.MEDICATIONS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__TITLE = IHEPackage.MEDICATIONS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__TEXT = IHEPackage.MEDICATIONS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__CONFIDENTIALITY_CODE = IHEPackage.MEDICATIONS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__LANGUAGE_CODE = IHEPackage.MEDICATIONS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__SUBJECT = IHEPackage.MEDICATIONS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__AUTHOR = IHEPackage.MEDICATIONS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__INFORMANT = IHEPackage.MEDICATIONS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__ENTRY = IHEPackage.MEDICATIONS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__COMPONENT = IHEPackage.MEDICATIONS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__SECTION_ID = IHEPackage.MEDICATIONS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__NULL_FLAVOR = IHEPackage.MEDICATIONS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__CLASS_CODE = IHEPackage.MEDICATIONS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__MOOD_CODE = IHEPackage.MEDICATIONS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Medications Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION_FEATURE_COUNT = IHEPackage.MEDICATIONS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__REALM_CODE = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__TYPE_ID = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__TEMPLATE_ID = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__ID = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__CODE = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__TITLE = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__TEXT = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__CONFIDENTIALITY_CODE = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__LANGUAGE_CODE = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__SUBJECT = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__AUTHOR = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__INFORMANT = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__ENTRY = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__COMPONENT = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__SECTION_ID = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__NULL_FLAVOR = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__CLASS_CODE = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__MOOD_CODE = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Advance Directives Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION_FEATURE_COUNT = IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__REALM_CODE = IHEPackage.ALLERGIES_REACTIONS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__TYPE_ID = IHEPackage.ALLERGIES_REACTIONS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__TEMPLATE_ID = IHEPackage.ALLERGIES_REACTIONS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__ID = IHEPackage.ALLERGIES_REACTIONS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__CODE = IHEPackage.ALLERGIES_REACTIONS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__TITLE = IHEPackage.ALLERGIES_REACTIONS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__TEXT = IHEPackage.ALLERGIES_REACTIONS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__CONFIDENTIALITY_CODE = IHEPackage.ALLERGIES_REACTIONS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__LANGUAGE_CODE = IHEPackage.ALLERGIES_REACTIONS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__SUBJECT = IHEPackage.ALLERGIES_REACTIONS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__AUTHOR = IHEPackage.ALLERGIES_REACTIONS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__INFORMANT = IHEPackage.ALLERGIES_REACTIONS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__ENTRY = IHEPackage.ALLERGIES_REACTIONS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__COMPONENT = IHEPackage.ALLERGIES_REACTIONS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__SECTION_ID = IHEPackage.ALLERGIES_REACTIONS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__NULL_FLAVOR = IHEPackage.ALLERGIES_REACTIONS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__CLASS_CODE = IHEPackage.ALLERGIES_REACTIONS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__MOOD_CODE = IHEPackage.ALLERGIES_REACTIONS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Allergies Reactions Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION_FEATURE_COUNT = IHEPackage.ALLERGIES_REACTIONS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__REALM_CODE = IHEPackage.ENCOUNTER_HISTORY_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__TYPE_ID = IHEPackage.ENCOUNTER_HISTORY_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__TEMPLATE_ID = IHEPackage.ENCOUNTER_HISTORY_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__ID = IHEPackage.ENCOUNTER_HISTORY_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__CODE = IHEPackage.ENCOUNTER_HISTORY_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__TITLE = IHEPackage.ENCOUNTER_HISTORY_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__TEXT = IHEPackage.ENCOUNTER_HISTORY_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__CONFIDENTIALITY_CODE = IHEPackage.ENCOUNTER_HISTORY_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__LANGUAGE_CODE = IHEPackage.ENCOUNTER_HISTORY_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__SUBJECT = IHEPackage.ENCOUNTER_HISTORY_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__AUTHOR = IHEPackage.ENCOUNTER_HISTORY_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__INFORMANT = IHEPackage.ENCOUNTER_HISTORY_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__ENTRY = IHEPackage.ENCOUNTER_HISTORY_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__COMPONENT = IHEPackage.ENCOUNTER_HISTORY_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__SECTION_ID = IHEPackage.ENCOUNTER_HISTORY_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__NULL_FLAVOR = IHEPackage.ENCOUNTER_HISTORY_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__CLASS_CODE = IHEPackage.ENCOUNTER_HISTORY_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__MOOD_CODE = IHEPackage.ENCOUNTER_HISTORY_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Encounters Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION_FEATURE_COUNT = IHEPackage.ENCOUNTER_HISTORY_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ResultImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 19;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.LanguageSpokenImpl <em>Language Spoken</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.LanguageSpokenImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getLanguageSpoken()
	 * @generated
	 */
	int LANGUAGE_SPOKEN = 38;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.InsuranceProviderImpl <em>Insurance Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.InsuranceProviderImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getInsuranceProvider()
	 * @generated
	 */
	int INSURANCE_PROVIDER = 39;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HealthcareProviderImpl <em>Healthcare Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HealthcareProviderImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHealthcareProvider()
	 * @generated
	 */
	int HEALTHCARE_PROVIDER = 40;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ImmunizationImpl <em>Immunization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ImmunizationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getImmunization()
	 * @generated
	 */
	int IMMUNIZATION = 12;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.CommentImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 41;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationNormalDoseImpl <em>Medication Normal Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationNormalDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationNormalDose()
	 * @generated
	 */
	int MEDICATION_NORMAL_DOSE = 42;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationSplitDoseImpl <em>Medication Split Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationSplitDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationSplitDose()
	 * @generated
	 */
	int MEDICATION_SPLIT_DOSE = 43;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationTaperedDoseImpl <em>Medication Tapered Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationTaperedDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationTaperedDose()
	 * @generated
	 */
	int MEDICATION_TAPERED_DOSE = 44;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationConditionalDoseImpl <em>Medication Conditional Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationConditionalDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationConditionalDose()
	 * @generated
	 */
	int MEDICATION_CONDITIONAL_DOSE = 45;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationCombinationMedicationImpl <em>Medication Combination Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationCombinationMedicationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationCombinationMedication()
	 * @generated
	 */
	int MEDICATION_COMBINATION_MEDICATION = 46;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ProcedureImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 15;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.EncounterImpl <em>Encounter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.EncounterImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getEncounter()
	 * @generated
	 */
	int ENCOUNTER = 10;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__REALM_CODE = IHEPackage.ENCOUNTER_ACTIVITY__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__TYPE_ID = IHEPackage.ENCOUNTER_ACTIVITY__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__TEMPLATE_ID = IHEPackage.ENCOUNTER_ACTIVITY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__ID = IHEPackage.ENCOUNTER_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__CODE = IHEPackage.ENCOUNTER_ACTIVITY__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__TEXT = IHEPackage.ENCOUNTER_ACTIVITY__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__STATUS_CODE = IHEPackage.ENCOUNTER_ACTIVITY__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__EFFECTIVE_TIME = IHEPackage.ENCOUNTER_ACTIVITY__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__PRIORITY_CODE = IHEPackage.ENCOUNTER_ACTIVITY__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__SUBJECT = IHEPackage.ENCOUNTER_ACTIVITY__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__SPECIMEN = IHEPackage.ENCOUNTER_ACTIVITY__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__PERFORMER = IHEPackage.ENCOUNTER_ACTIVITY__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__AUTHOR = IHEPackage.ENCOUNTER_ACTIVITY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__INFORMANT = IHEPackage.ENCOUNTER_ACTIVITY__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__PARTICIPANT = IHEPackage.ENCOUNTER_ACTIVITY__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__ENTRY_RELATIONSHIP = IHEPackage.ENCOUNTER_ACTIVITY__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__REFERENCE = IHEPackage.ENCOUNTER_ACTIVITY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__PRECONDITION = IHEPackage.ENCOUNTER_ACTIVITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__NULL_FLAVOR = IHEPackage.ENCOUNTER_ACTIVITY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__CLASS_CODE = IHEPackage.ENCOUNTER_ACTIVITY__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__MOOD_CODE = IHEPackage.ENCOUNTER_ACTIVITY__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Encounter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_FEATURE_COUNT = IHEPackage.ENCOUNTER_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__REALM_CODE = IHEPackage.IMMUNIZATIONS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__TYPE_ID = IHEPackage.IMMUNIZATIONS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__TEMPLATE_ID = IHEPackage.IMMUNIZATIONS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__ID = IHEPackage.IMMUNIZATIONS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__CODE = IHEPackage.IMMUNIZATIONS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__TITLE = IHEPackage.IMMUNIZATIONS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__TEXT = IHEPackage.IMMUNIZATIONS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__CONFIDENTIALITY_CODE = IHEPackage.IMMUNIZATIONS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__LANGUAGE_CODE = IHEPackage.IMMUNIZATIONS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__SUBJECT = IHEPackage.IMMUNIZATIONS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__AUTHOR = IHEPackage.IMMUNIZATIONS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__INFORMANT = IHEPackage.IMMUNIZATIONS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__ENTRY = IHEPackage.IMMUNIZATIONS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__COMPONENT = IHEPackage.IMMUNIZATIONS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__SECTION_ID = IHEPackage.IMMUNIZATIONS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__NULL_FLAVOR = IHEPackage.IMMUNIZATIONS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__CLASS_CODE = IHEPackage.IMMUNIZATIONS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__MOOD_CODE = IHEPackage.IMMUNIZATIONS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Immunizations Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION_FEATURE_COUNT = IHEPackage.IMMUNIZATIONS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__REALM_CODE = IHEPackage.IMMUNIZATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__TYPE_ID = IHEPackage.IMMUNIZATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__TEMPLATE_ID = IHEPackage.IMMUNIZATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__ID = IHEPackage.IMMUNIZATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__CODE = IHEPackage.IMMUNIZATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__TEXT = IHEPackage.IMMUNIZATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__STATUS_CODE = IHEPackage.IMMUNIZATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__EFFECTIVE_TIME = IHEPackage.IMMUNIZATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__PRIORITY_CODE = IHEPackage.IMMUNIZATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__REPEAT_NUMBER = IHEPackage.IMMUNIZATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__ROUTE_CODE = IHEPackage.IMMUNIZATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__APPROACH_SITE_CODE = IHEPackage.IMMUNIZATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__DOSE_QUANTITY = IHEPackage.IMMUNIZATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__RATE_QUANTITY = IHEPackage.IMMUNIZATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__MAX_DOSE_QUANTITY = IHEPackage.IMMUNIZATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__ADMINISTRATION_UNIT_CODE = IHEPackage.IMMUNIZATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__SUBJECT = IHEPackage.IMMUNIZATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__SPECIMEN = IHEPackage.IMMUNIZATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__CONSUMABLE = IHEPackage.IMMUNIZATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__PERFORMER = IHEPackage.IMMUNIZATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__AUTHOR = IHEPackage.IMMUNIZATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__INFORMANT = IHEPackage.IMMUNIZATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__REFERENCE = IHEPackage.IMMUNIZATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__PARTICIPANT = IHEPackage.IMMUNIZATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__ENTRY_RELATIONSHIP = IHEPackage.IMMUNIZATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__PRECONDITION = IHEPackage.IMMUNIZATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__NULL_FLAVOR = IHEPackage.IMMUNIZATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__CLASS_CODE = IHEPackage.IMMUNIZATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__MOOD_CODE = IHEPackage.IMMUNIZATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__NEGATION_IND = IHEPackage.IMMUNIZATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Immunization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION_FEATURE_COUNT = IHEPackage.IMMUNIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__REALM_CODE = IHEPackage.PAYERS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__TYPE_ID = IHEPackage.PAYERS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__TEMPLATE_ID = IHEPackage.PAYERS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__ID = IHEPackage.PAYERS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__CODE = IHEPackage.PAYERS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__TITLE = IHEPackage.PAYERS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__TEXT = IHEPackage.PAYERS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__CONFIDENTIALITY_CODE = IHEPackage.PAYERS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__LANGUAGE_CODE = IHEPackage.PAYERS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__SUBJECT = IHEPackage.PAYERS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__AUTHOR = IHEPackage.PAYERS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__INFORMANT = IHEPackage.PAYERS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__ENTRY = IHEPackage.PAYERS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__COMPONENT = IHEPackage.PAYERS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__SECTION_ID = IHEPackage.PAYERS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__NULL_FLAVOR = IHEPackage.PAYERS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__CLASS_CODE = IHEPackage.PAYERS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__MOOD_CODE = IHEPackage.PAYERS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Payers Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION_FEATURE_COUNT = IHEPackage.PAYERS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__REALM_CODE = IHEPackage.CODED_SURGERIES_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__TYPE_ID = IHEPackage.CODED_SURGERIES_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__TEMPLATE_ID = IHEPackage.CODED_SURGERIES_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__ID = IHEPackage.CODED_SURGERIES_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__CODE = IHEPackage.CODED_SURGERIES_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__TITLE = IHEPackage.CODED_SURGERIES_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__TEXT = IHEPackage.CODED_SURGERIES_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__CONFIDENTIALITY_CODE = IHEPackage.CODED_SURGERIES_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__LANGUAGE_CODE = IHEPackage.CODED_SURGERIES_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__SUBJECT = IHEPackage.CODED_SURGERIES_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__AUTHOR = IHEPackage.CODED_SURGERIES_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__INFORMANT = IHEPackage.CODED_SURGERIES_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__ENTRY = IHEPackage.CODED_SURGERIES_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__COMPONENT = IHEPackage.CODED_SURGERIES_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__SECTION_ID = IHEPackage.CODED_SURGERIES_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__NULL_FLAVOR = IHEPackage.CODED_SURGERIES_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__CLASS_CODE = IHEPackage.CODED_SURGERIES_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__MOOD_CODE = IHEPackage.CODED_SURGERIES_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Surgeries Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION_FEATURE_COUNT = IHEPackage.CODED_SURGERIES_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__REALM_CODE = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TYPE_ID = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TEMPLATE_ID = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ID = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CODE = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TEXT = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__STATUS_CODE = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__EFFECTIVE_TIME = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PRIORITY_CODE = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__LANGUAGE_CODE = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__METHOD_CODE = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__APPROACH_SITE_CODE = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TARGET_SITE_CODE = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__SUBJECT = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__SPECIMEN = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PERFORMER = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__AUTHOR = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__INFORMANT = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PARTICIPANT = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ENTRY_RELATIONSHIP = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__REFERENCE = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PRECONDITION = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NULL_FLAVOR = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CLASS_CODE = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__MOOD_CODE = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NEGATION_IND = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__REALM_CODE = IHEPackage.CARE_PLAN_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__TYPE_ID = IHEPackage.CARE_PLAN_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__TEMPLATE_ID = IHEPackage.CARE_PLAN_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__ID = IHEPackage.CARE_PLAN_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__CODE = IHEPackage.CARE_PLAN_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__TITLE = IHEPackage.CARE_PLAN_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__TEXT = IHEPackage.CARE_PLAN_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__CONFIDENTIALITY_CODE = IHEPackage.CARE_PLAN_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__LANGUAGE_CODE = IHEPackage.CARE_PLAN_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__SUBJECT = IHEPackage.CARE_PLAN_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__AUTHOR = IHEPackage.CARE_PLAN_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__INFORMANT = IHEPackage.CARE_PLAN_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__ENTRY = IHEPackage.CARE_PLAN_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__COMPONENT = IHEPackage.CARE_PLAN_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__SECTION_ID = IHEPackage.CARE_PLAN_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__NULL_FLAVOR = IHEPackage.CARE_PLAN_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__CLASS_CODE = IHEPackage.CARE_PLAN_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__MOOD_CODE = IHEPackage.CARE_PLAN_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Plan Of Care Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION_FEATURE_COUNT = IHEPackage.CARE_PLAN_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__REALM_CODE = IHEPackage.CODED_VITAL_SIGNS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__TYPE_ID = IHEPackage.CODED_VITAL_SIGNS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__TEMPLATE_ID = IHEPackage.CODED_VITAL_SIGNS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__ID = IHEPackage.CODED_VITAL_SIGNS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__CODE = IHEPackage.CODED_VITAL_SIGNS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__TITLE = IHEPackage.CODED_VITAL_SIGNS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__TEXT = IHEPackage.CODED_VITAL_SIGNS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__CONFIDENTIALITY_CODE = IHEPackage.CODED_VITAL_SIGNS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__LANGUAGE_CODE = IHEPackage.CODED_VITAL_SIGNS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__SUBJECT = IHEPackage.CODED_VITAL_SIGNS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__AUTHOR = IHEPackage.CODED_VITAL_SIGNS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__INFORMANT = IHEPackage.CODED_VITAL_SIGNS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__ENTRY = IHEPackage.CODED_VITAL_SIGNS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__COMPONENT = IHEPackage.CODED_VITAL_SIGNS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__SECTION_ID = IHEPackage.CODED_VITAL_SIGNS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__NULL_FLAVOR = IHEPackage.CODED_VITAL_SIGNS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__CLASS_CODE = IHEPackage.CODED_VITAL_SIGNS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__MOOD_CODE = IHEPackage.CODED_VITAL_SIGNS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Vital Signs Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION_FEATURE_COUNT = IHEPackage.CODED_VITAL_SIGNS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__REALM_CODE = IHEPackage.CODED_RESULTS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__TYPE_ID = IHEPackage.CODED_RESULTS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__TEMPLATE_ID = IHEPackage.CODED_RESULTS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__ID = IHEPackage.CODED_RESULTS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__CODE = IHEPackage.CODED_RESULTS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__TITLE = IHEPackage.CODED_RESULTS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__TEXT = IHEPackage.CODED_RESULTS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__CONFIDENTIALITY_CODE = IHEPackage.CODED_RESULTS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__LANGUAGE_CODE = IHEPackage.CODED_RESULTS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__SUBJECT = IHEPackage.CODED_RESULTS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__AUTHOR = IHEPackage.CODED_RESULTS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__INFORMANT = IHEPackage.CODED_RESULTS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__ENTRY = IHEPackage.CODED_RESULTS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__COMPONENT = IHEPackage.CODED_RESULTS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__SECTION_ID = IHEPackage.CODED_RESULTS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__NULL_FLAVOR = IHEPackage.CODED_RESULTS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__CLASS_CODE = IHEPackage.CODED_RESULTS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__MOOD_CODE = IHEPackage.CODED_RESULTS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Diagnostic Results Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION_FEATURE_COUNT = IHEPackage.CODED_RESULTS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REALM_CODE = CCDPackage.RESULT_OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TYPE_ID = CCDPackage.RESULT_OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TEMPLATE_ID = CCDPackage.RESULT_OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__ID = CCDPackage.RESULT_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__CODE = CCDPackage.RESULT_OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__DERIVATION_EXPR = CCDPackage.RESULT_OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TEXT = CCDPackage.RESULT_OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__STATUS_CODE = CCDPackage.RESULT_OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__EFFECTIVE_TIME = CCDPackage.RESULT_OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PRIORITY_CODE = CCDPackage.RESULT_OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REPEAT_NUMBER = CCDPackage.RESULT_OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__LANGUAGE_CODE = CCDPackage.RESULT_OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__VALUE = CCDPackage.RESULT_OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__INTERPRETATION_CODE = CCDPackage.RESULT_OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__METHOD_CODE = CCDPackage.RESULT_OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TARGET_SITE_CODE = CCDPackage.RESULT_OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SUBJECT = CCDPackage.RESULT_OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SPECIMEN = CCDPackage.RESULT_OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PERFORMER = CCDPackage.RESULT_OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__AUTHOR = CCDPackage.RESULT_OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__INFORMANT = CCDPackage.RESULT_OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PARTICIPANT = CCDPackage.RESULT_OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__ENTRY_RELATIONSHIP = CCDPackage.RESULT_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REFERENCE = CCDPackage.RESULT_OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PRECONDITION = CCDPackage.RESULT_OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REFERENCE_RANGE = CCDPackage.RESULT_OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__NULL_FLAVOR = CCDPackage.RESULT_OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__CLASS_CODE = CCDPackage.RESULT_OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__MOOD_CODE = CCDPackage.RESULT_OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__NEGATION_IND = CCDPackage.RESULT_OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = CCDPackage.RESULT_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__REALM_CODE = IHEPackage.VITAL_SIGN_OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__TYPE_ID = IHEPackage.VITAL_SIGN_OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__TEMPLATE_ID = IHEPackage.VITAL_SIGN_OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__ID = IHEPackage.VITAL_SIGN_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__CODE = IHEPackage.VITAL_SIGN_OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__DERIVATION_EXPR = IHEPackage.VITAL_SIGN_OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__TEXT = IHEPackage.VITAL_SIGN_OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__STATUS_CODE = IHEPackage.VITAL_SIGN_OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__EFFECTIVE_TIME = IHEPackage.VITAL_SIGN_OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__PRIORITY_CODE = IHEPackage.VITAL_SIGN_OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__REPEAT_NUMBER = IHEPackage.VITAL_SIGN_OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__LANGUAGE_CODE = IHEPackage.VITAL_SIGN_OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__VALUE = IHEPackage.VITAL_SIGN_OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__INTERPRETATION_CODE = IHEPackage.VITAL_SIGN_OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__METHOD_CODE = IHEPackage.VITAL_SIGN_OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__TARGET_SITE_CODE = IHEPackage.VITAL_SIGN_OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__SUBJECT = IHEPackage.VITAL_SIGN_OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__SPECIMEN = IHEPackage.VITAL_SIGN_OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__PERFORMER = IHEPackage.VITAL_SIGN_OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__AUTHOR = IHEPackage.VITAL_SIGN_OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__INFORMANT = IHEPackage.VITAL_SIGN_OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__PARTICIPANT = IHEPackage.VITAL_SIGN_OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__ENTRY_RELATIONSHIP = IHEPackage.VITAL_SIGN_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__REFERENCE = IHEPackage.VITAL_SIGN_OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__PRECONDITION = IHEPackage.VITAL_SIGN_OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__REFERENCE_RANGE = IHEPackage.VITAL_SIGN_OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__NULL_FLAVOR = IHEPackage.VITAL_SIGN_OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__CLASS_CODE = IHEPackage.VITAL_SIGN_OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__MOOD_CODE = IHEPackage.VITAL_SIGN_OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__NEGATION_IND = IHEPackage.VITAL_SIGN_OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Vital Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN_FEATURE_COUNT = IHEPackage.VITAL_SIGN_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__REALM_CODE = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__TYPE_ID = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__TEMPLATE_ID = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__ID = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__CODE = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__TITLE = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__TEXT = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__CONFIDENTIALITY_CODE = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__LANGUAGE_CODE = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__SUBJECT = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__AUTHOR = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__INFORMANT = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__ENTRY = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__COMPONENT = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__SECTION_ID = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__NULL_FLAVOR = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__CLASS_CODE = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__MOOD_CODE = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>History Of Past Illness Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION_FEATURE_COUNT = IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__REALM_CODE = IHEPackage.CHIEF_COMPLAINT_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__TYPE_ID = IHEPackage.CHIEF_COMPLAINT_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__TEMPLATE_ID = IHEPackage.CHIEF_COMPLAINT_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__ID = IHEPackage.CHIEF_COMPLAINT_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__CODE = IHEPackage.CHIEF_COMPLAINT_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__TITLE = IHEPackage.CHIEF_COMPLAINT_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__TEXT = IHEPackage.CHIEF_COMPLAINT_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__CONFIDENTIALITY_CODE = IHEPackage.CHIEF_COMPLAINT_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__LANGUAGE_CODE = IHEPackage.CHIEF_COMPLAINT_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__SUBJECT = IHEPackage.CHIEF_COMPLAINT_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__AUTHOR = IHEPackage.CHIEF_COMPLAINT_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__INFORMANT = IHEPackage.CHIEF_COMPLAINT_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__ENTRY = IHEPackage.CHIEF_COMPLAINT_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__COMPONENT = IHEPackage.CHIEF_COMPLAINT_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__SECTION_ID = IHEPackage.CHIEF_COMPLAINT_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__NULL_FLAVOR = IHEPackage.CHIEF_COMPLAINT_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__CLASS_CODE = IHEPackage.CHIEF_COMPLAINT_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__MOOD_CODE = IHEPackage.CHIEF_COMPLAINT_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Chief Complaint Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION_FEATURE_COUNT = IHEPackage.CHIEF_COMPLAINT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__REALM_CODE = IHEPackage.REASON_FOR_REFERRAL_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__TYPE_ID = IHEPackage.REASON_FOR_REFERRAL_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__TEMPLATE_ID = IHEPackage.REASON_FOR_REFERRAL_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__ID = IHEPackage.REASON_FOR_REFERRAL_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__CODE = IHEPackage.REASON_FOR_REFERRAL_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__TITLE = IHEPackage.REASON_FOR_REFERRAL_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__TEXT = IHEPackage.REASON_FOR_REFERRAL_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__CONFIDENTIALITY_CODE = IHEPackage.REASON_FOR_REFERRAL_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__LANGUAGE_CODE = IHEPackage.REASON_FOR_REFERRAL_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__SUBJECT = IHEPackage.REASON_FOR_REFERRAL_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__AUTHOR = IHEPackage.REASON_FOR_REFERRAL_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__INFORMANT = IHEPackage.REASON_FOR_REFERRAL_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__ENTRY = IHEPackage.REASON_FOR_REFERRAL_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__COMPONENT = IHEPackage.REASON_FOR_REFERRAL_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__SECTION_ID = IHEPackage.REASON_FOR_REFERRAL_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__NULL_FLAVOR = IHEPackage.REASON_FOR_REFERRAL_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__CLASS_CODE = IHEPackage.REASON_FOR_REFERRAL_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__MOOD_CODE = IHEPackage.REASON_FOR_REFERRAL_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Reason For Referral Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION_FEATURE_COUNT = IHEPackage.REASON_FOR_REFERRAL_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__REALM_CODE = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__TYPE_ID = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__TEMPLATE_ID = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__ID = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__CODE = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__TITLE = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__TEXT = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__CONFIDENTIALITY_CODE = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__LANGUAGE_CODE = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__SUBJECT = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__AUTHOR = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__INFORMANT = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__ENTRY = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__COMPONENT = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__SECTION_ID = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__NULL_FLAVOR = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__CLASS_CODE = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__MOOD_CODE = IHEPackage.HISTORY_OF_PRESENT_ILLNESS__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>History Of Present Illness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS_FEATURE_COUNT = IHEPackage.HISTORY_OF_PRESENT_ILLNESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__REALM_CODE = CCDPackage.FUNCTIONAL_STATUS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__TYPE_ID = CCDPackage.FUNCTIONAL_STATUS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__TEMPLATE_ID = CCDPackage.FUNCTIONAL_STATUS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__ID = CCDPackage.FUNCTIONAL_STATUS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__CODE = CCDPackage.FUNCTIONAL_STATUS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__TITLE = CCDPackage.FUNCTIONAL_STATUS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__TEXT = CCDPackage.FUNCTIONAL_STATUS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__CONFIDENTIALITY_CODE = CCDPackage.FUNCTIONAL_STATUS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__LANGUAGE_CODE = CCDPackage.FUNCTIONAL_STATUS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__SUBJECT = CCDPackage.FUNCTIONAL_STATUS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__AUTHOR = CCDPackage.FUNCTIONAL_STATUS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__INFORMANT = CCDPackage.FUNCTIONAL_STATUS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__ENTRY = CCDPackage.FUNCTIONAL_STATUS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__COMPONENT = CCDPackage.FUNCTIONAL_STATUS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__SECTION_ID = CCDPackage.FUNCTIONAL_STATUS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__NULL_FLAVOR = CCDPackage.FUNCTIONAL_STATUS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__CLASS_CODE = CCDPackage.FUNCTIONAL_STATUS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__MOOD_CODE = CCDPackage.FUNCTIONAL_STATUS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Functional Status Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION_FEATURE_COUNT = CCDPackage.FUNCTIONAL_STATUS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__REALM_CODE = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__TYPE_ID = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__TEMPLATE_ID = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__ID = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__CODE = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__TITLE = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__TEXT = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__CONFIDENTIALITY_CODE = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__LANGUAGE_CODE = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__SUBJECT = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__AUTHOR = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__INFORMANT = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__ENTRY = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__COMPONENT = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__SECTION_ID = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__NULL_FLAVOR = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__CLASS_CODE = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__MOOD_CODE = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Hospital Admission Diagnosis Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_FEATURE_COUNT = IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__REALM_CODE = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__TYPE_ID = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__TEMPLATE_ID = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__ID = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__CODE = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__TITLE = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__TEXT = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__CONFIDENTIALITY_CODE = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__LANGUAGE_CODE = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__SUBJECT = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__AUTHOR = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__INFORMANT = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__ENTRY = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__COMPONENT = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__SECTION_ID = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__NULL_FLAVOR = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__CLASS_CODE = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__MOOD_CODE = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Discharge Diagnosis Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION_FEATURE_COUNT = IHEPackage.DISCHARGE_DIAGNOSIS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__REALM_CODE = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__TYPE_ID = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__TEMPLATE_ID = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__ID = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__CODE = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__TITLE = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__TEXT = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__CONFIDENTIALITY_CODE = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__LANGUAGE_CODE = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__SUBJECT = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__AUTHOR = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__INFORMANT = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__ENTRY = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__COMPONENT = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__SECTION_ID = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__NULL_FLAVOR = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__CLASS_CODE = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__MOOD_CODE = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Admission Medication History Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION_FEATURE_COUNT = IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__REALM_CODE = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__TYPE_ID = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__TEMPLATE_ID = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__ID = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__CODE = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__TITLE = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__TEXT = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__CONFIDENTIALITY_CODE = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__LANGUAGE_CODE = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__SUBJECT = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__AUTHOR = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__INFORMANT = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__ENTRY = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__COMPONENT = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__SECTION_ID = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__NULL_FLAVOR = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__CLASS_CODE = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__MOOD_CODE = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Hospital Discharge Medications Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_FEATURE_COUNT = IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__REALM_CODE = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__TYPE_ID = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__TEMPLATE_ID = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__ID = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__CODE = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__TITLE = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__TEXT = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__CONFIDENTIALITY_CODE = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__LANGUAGE_CODE = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__SUBJECT = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__AUTHOR = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__INFORMANT = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__ENTRY = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__COMPONENT = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__SECTION_ID = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__NULL_FLAVOR = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__CLASS_CODE = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__MOOD_CODE = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Medications Administered Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION_FEATURE_COUNT = IHEPackage.MEDICATIONS_ADMINISTERED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__REALM_CODE = IHEPackage.PHYSICAL_EXAM_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__TYPE_ID = IHEPackage.PHYSICAL_EXAM_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__TEMPLATE_ID = IHEPackage.PHYSICAL_EXAM_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__ID = IHEPackage.PHYSICAL_EXAM_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__CODE = IHEPackage.PHYSICAL_EXAM_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__TITLE = IHEPackage.PHYSICAL_EXAM_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__TEXT = IHEPackage.PHYSICAL_EXAM_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__CONFIDENTIALITY_CODE = IHEPackage.PHYSICAL_EXAM_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__LANGUAGE_CODE = IHEPackage.PHYSICAL_EXAM_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__SUBJECT = IHEPackage.PHYSICAL_EXAM_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__AUTHOR = IHEPackage.PHYSICAL_EXAM_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__INFORMANT = IHEPackage.PHYSICAL_EXAM_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__ENTRY = IHEPackage.PHYSICAL_EXAM_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__COMPONENT = IHEPackage.PHYSICAL_EXAM_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__SECTION_ID = IHEPackage.PHYSICAL_EXAM_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__NULL_FLAVOR = IHEPackage.PHYSICAL_EXAM_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__CLASS_CODE = IHEPackage.PHYSICAL_EXAM_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__MOOD_CODE = IHEPackage.PHYSICAL_EXAM_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Physical Exam Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION_FEATURE_COUNT = IHEPackage.PHYSICAL_EXAM_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__REALM_CODE = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__TYPE_ID = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__TEMPLATE_ID = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__ID = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__CODE = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__TITLE = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__TEXT = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__CONFIDENTIALITY_CODE = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__LANGUAGE_CODE = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__SUBJECT = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__AUTHOR = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__INFORMANT = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__ENTRY = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__COMPONENT = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__SECTION_ID = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__NULL_FLAVOR = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__CLASS_CODE = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__MOOD_CODE = IHEPackage.REVIEW_OF_SYSTEMS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Review Of Systems Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION_FEATURE_COUNT = IHEPackage.REVIEW_OF_SYSTEMS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__REALM_CODE = IHEPackage.HOSPITAL_COURSE_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__TYPE_ID = IHEPackage.HOSPITAL_COURSE_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__TEMPLATE_ID = IHEPackage.HOSPITAL_COURSE_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__ID = IHEPackage.HOSPITAL_COURSE_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__CODE = IHEPackage.HOSPITAL_COURSE_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__TITLE = IHEPackage.HOSPITAL_COURSE_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__TEXT = IHEPackage.HOSPITAL_COURSE_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__CONFIDENTIALITY_CODE = IHEPackage.HOSPITAL_COURSE_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__LANGUAGE_CODE = IHEPackage.HOSPITAL_COURSE_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__SUBJECT = IHEPackage.HOSPITAL_COURSE_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__AUTHOR = IHEPackage.HOSPITAL_COURSE_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__INFORMANT = IHEPackage.HOSPITAL_COURSE_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__ENTRY = IHEPackage.HOSPITAL_COURSE_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__COMPONENT = IHEPackage.HOSPITAL_COURSE_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__SECTION_ID = IHEPackage.HOSPITAL_COURSE_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__NULL_FLAVOR = IHEPackage.HOSPITAL_COURSE_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__CLASS_CODE = IHEPackage.HOSPITAL_COURSE_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__MOOD_CODE = IHEPackage.HOSPITAL_COURSE_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Hospital Course Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION_FEATURE_COUNT = IHEPackage.HOSPITAL_COURSE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__REALM_CODE = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__TYPE_ID = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__TEMPLATE_ID = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__ID = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__CODE = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__TITLE = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__TEXT = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__CONFIDENTIALITY_CODE = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__LANGUAGE_CODE = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__SUBJECT = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__AUTHOR = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__INFORMANT = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__ENTRY = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__COMPONENT = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__SECTION_ID = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__NULL_FLAVOR = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__CLASS_CODE = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__MOOD_CODE = IHEPackage.ASSESSMENT_AND_PLAN_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Assessment And Plan Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION_FEATURE_COUNT = IHEPackage.ASSESSMENT_AND_PLAN_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__REALM_CODE = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__TYPE_ID = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__TEMPLATE_ID = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__ID = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__CODE = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__TITLE = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__TEXT = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__CONFIDENTIALITY_CODE = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__LANGUAGE_CODE = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__SUBJECT = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__AUTHOR = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__INFORMANT = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__ENTRY = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__COMPONENT = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__SECTION_ID = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__NULL_FLAVOR = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__CLASS_CODE = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__MOOD_CODE = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Family History Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION_FEATURE_COUNT = IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__REALM_CODE = IHEPackage.SOCIAL_HISTORY_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__TYPE_ID = IHEPackage.SOCIAL_HISTORY_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__TEMPLATE_ID = IHEPackage.SOCIAL_HISTORY_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__ID = IHEPackage.SOCIAL_HISTORY_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__CODE = IHEPackage.SOCIAL_HISTORY_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__TITLE = IHEPackage.SOCIAL_HISTORY_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__TEXT = IHEPackage.SOCIAL_HISTORY_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE = IHEPackage.SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__LANGUAGE_CODE = IHEPackage.SOCIAL_HISTORY_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__SUBJECT = IHEPackage.SOCIAL_HISTORY_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__AUTHOR = IHEPackage.SOCIAL_HISTORY_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__INFORMANT = IHEPackage.SOCIAL_HISTORY_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__ENTRY = IHEPackage.SOCIAL_HISTORY_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__COMPONENT = IHEPackage.SOCIAL_HISTORY_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__SECTION_ID = IHEPackage.SOCIAL_HISTORY_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__NULL_FLAVOR = IHEPackage.SOCIAL_HISTORY_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__CLASS_CODE = IHEPackage.SOCIAL_HISTORY_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__MOOD_CODE = IHEPackage.SOCIAL_HISTORY_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Social History Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION_FEATURE_COUNT = IHEPackage.SOCIAL_HISTORY_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__REALM_CODE = IHEPackage.MEDICAL_DEVICES_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__TYPE_ID = IHEPackage.MEDICAL_DEVICES_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__TEMPLATE_ID = IHEPackage.MEDICAL_DEVICES_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__ID = IHEPackage.MEDICAL_DEVICES_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__CODE = IHEPackage.MEDICAL_DEVICES_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__TITLE = IHEPackage.MEDICAL_DEVICES_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__TEXT = IHEPackage.MEDICAL_DEVICES_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__CONFIDENTIALITY_CODE = IHEPackage.MEDICAL_DEVICES_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__LANGUAGE_CODE = IHEPackage.MEDICAL_DEVICES_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__SUBJECT = IHEPackage.MEDICAL_DEVICES_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__AUTHOR = IHEPackage.MEDICAL_DEVICES_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__INFORMANT = IHEPackage.MEDICAL_DEVICES_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__ENTRY = IHEPackage.MEDICAL_DEVICES_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__COMPONENT = IHEPackage.MEDICAL_DEVICES_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__SECTION_ID = IHEPackage.MEDICAL_DEVICES_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__NULL_FLAVOR = IHEPackage.MEDICAL_DEVICES_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__CLASS_CODE = IHEPackage.MEDICAL_DEVICES_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__MOOD_CODE = IHEPackage.MEDICAL_DEVICES_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Medical Equipment Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION_FEATURE_COUNT = IHEPackage.MEDICAL_DEVICES_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__REALM_CODE = IHEPackage.LANGUAGE_COMMUNICATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__TYPE_ID = IHEPackage.LANGUAGE_COMMUNICATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__TEMPLATE_ID = IHEPackage.LANGUAGE_COMMUNICATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__LANGUAGE_CODE = IHEPackage.LANGUAGE_COMMUNICATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Mode Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__MODE_CODE = IHEPackage.LANGUAGE_COMMUNICATION__MODE_CODE;

	/**
	 * The feature id for the '<em><b>Proficiency Level Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__PROFICIENCY_LEVEL_CODE = IHEPackage.LANGUAGE_COMMUNICATION__PROFICIENCY_LEVEL_CODE;

	/**
	 * The feature id for the '<em><b>Preference Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__PREFERENCE_IND = IHEPackage.LANGUAGE_COMMUNICATION__PREFERENCE_IND;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__NULL_FLAVOR = IHEPackage.LANGUAGE_COMMUNICATION__NULL_FLAVOR;

	/**
	 * The number of structural features of the '<em>Language Spoken</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN_FEATURE_COUNT = IHEPackage.LANGUAGE_COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__REALM_CODE = IHEPackage.COVERAGE_ENTRY__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__TYPE_ID = IHEPackage.COVERAGE_ENTRY__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__TEMPLATE_ID = IHEPackage.COVERAGE_ENTRY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__ID = IHEPackage.COVERAGE_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__CODE = IHEPackage.COVERAGE_ENTRY__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__TEXT = IHEPackage.COVERAGE_ENTRY__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__STATUS_CODE = IHEPackage.COVERAGE_ENTRY__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__EFFECTIVE_TIME = IHEPackage.COVERAGE_ENTRY__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__PRIORITY_CODE = IHEPackage.COVERAGE_ENTRY__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__LANGUAGE_CODE = IHEPackage.COVERAGE_ENTRY__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__SUBJECT = IHEPackage.COVERAGE_ENTRY__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__SPECIMEN = IHEPackage.COVERAGE_ENTRY__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__PERFORMER = IHEPackage.COVERAGE_ENTRY__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__AUTHOR = IHEPackage.COVERAGE_ENTRY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__INFORMANT = IHEPackage.COVERAGE_ENTRY__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__PARTICIPANT = IHEPackage.COVERAGE_ENTRY__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__ENTRY_RELATIONSHIP = IHEPackage.COVERAGE_ENTRY__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__REFERENCE = IHEPackage.COVERAGE_ENTRY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__PRECONDITION = IHEPackage.COVERAGE_ENTRY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__NULL_FLAVOR = IHEPackage.COVERAGE_ENTRY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__CLASS_CODE = IHEPackage.COVERAGE_ENTRY__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__MOOD_CODE = IHEPackage.COVERAGE_ENTRY__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__NEGATION_IND = IHEPackage.COVERAGE_ENTRY__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Insurance Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER_FEATURE_COUNT = IHEPackage.COVERAGE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__REALM_CODE = IHEPackage.HEALTHCARE_PROVIDERS_PHARMACIES__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__TYPE_ID = IHEPackage.HEALTHCARE_PROVIDERS_PHARMACIES__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__TEMPLATE_ID = IHEPackage.HEALTHCARE_PROVIDERS_PHARMACIES__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Function Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__FUNCTION_CODE = IHEPackage.HEALTHCARE_PROVIDERS_PHARMACIES__FUNCTION_CODE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__TIME = IHEPackage.HEALTHCARE_PROVIDERS_PHARMACIES__TIME;

	/**
	 * The feature id for the '<em><b>Assigned Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__ASSIGNED_ENTITY = IHEPackage.HEALTHCARE_PROVIDERS_PHARMACIES__ASSIGNED_ENTITY;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__NULL_FLAVOR = IHEPackage.HEALTHCARE_PROVIDERS_PHARMACIES__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__TYPE_CODE = IHEPackage.HEALTHCARE_PROVIDERS_PHARMACIES__TYPE_CODE;

	/**
	 * The number of structural features of the '<em>Healthcare Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER_FEATURE_COUNT = IHEPackage.HEALTHCARE_PROVIDERS_PHARMACIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__REALM_CODE = IHEPackage.COMMENT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TYPE_ID = IHEPackage.COMMENT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEMPLATE_ID = IHEPackage.COMMENT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ID = IHEPackage.COMMENT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CODE = IHEPackage.COMMENT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEXT = IHEPackage.COMMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__STATUS_CODE = IHEPackage.COMMENT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__EFFECTIVE_TIME = IHEPackage.COMMENT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PRIORITY_CODE = IHEPackage.COMMENT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__LANGUAGE_CODE = IHEPackage.COMMENT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SUBJECT = IHEPackage.COMMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SPECIMEN = IHEPackage.COMMENT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PERFORMER = IHEPackage.COMMENT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__AUTHOR = IHEPackage.COMMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__INFORMANT = IHEPackage.COMMENT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PARTICIPANT = IHEPackage.COMMENT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ENTRY_RELATIONSHIP = IHEPackage.COMMENT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__REFERENCE = IHEPackage.COMMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PRECONDITION = IHEPackage.COMMENT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NULL_FLAVOR = IHEPackage.COMMENT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CLASS_CODE = IHEPackage.COMMENT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__MOOD_CODE = IHEPackage.COMMENT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NEGATION_IND = IHEPackage.COMMENT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = IHEPackage.COMMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__REALM_CODE = MEDICATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__TYPE_ID = MEDICATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__TEMPLATE_ID = MEDICATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__ID = MEDICATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__CODE = MEDICATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__TEXT = MEDICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__STATUS_CODE = MEDICATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__EFFECTIVE_TIME = MEDICATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__PRIORITY_CODE = MEDICATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__REPEAT_NUMBER = MEDICATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__ROUTE_CODE = MEDICATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__APPROACH_SITE_CODE = MEDICATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__DOSE_QUANTITY = MEDICATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__RATE_QUANTITY = MEDICATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__MAX_DOSE_QUANTITY = MEDICATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__ADMINISTRATION_UNIT_CODE = MEDICATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__SUBJECT = MEDICATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__SPECIMEN = MEDICATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__CONSUMABLE = MEDICATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__PERFORMER = MEDICATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__AUTHOR = MEDICATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__INFORMANT = MEDICATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__REFERENCE = MEDICATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__PARTICIPANT = MEDICATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__ENTRY_RELATIONSHIP = MEDICATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__PRECONDITION = MEDICATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__NULL_FLAVOR = MEDICATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__CLASS_CODE = MEDICATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__MOOD_CODE = MEDICATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__NEGATION_IND = MEDICATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Normal Dose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE_FEATURE_COUNT = MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__REALM_CODE = MEDICATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__TYPE_ID = MEDICATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__TEMPLATE_ID = MEDICATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__ID = MEDICATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__CODE = MEDICATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__TEXT = MEDICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__STATUS_CODE = MEDICATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__EFFECTIVE_TIME = MEDICATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__PRIORITY_CODE = MEDICATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__REPEAT_NUMBER = MEDICATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__ROUTE_CODE = MEDICATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__APPROACH_SITE_CODE = MEDICATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__DOSE_QUANTITY = MEDICATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__RATE_QUANTITY = MEDICATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__MAX_DOSE_QUANTITY = MEDICATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__ADMINISTRATION_UNIT_CODE = MEDICATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__SUBJECT = MEDICATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__SPECIMEN = MEDICATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__CONSUMABLE = MEDICATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__PERFORMER = MEDICATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__AUTHOR = MEDICATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__INFORMANT = MEDICATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__REFERENCE = MEDICATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__PARTICIPANT = MEDICATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__ENTRY_RELATIONSHIP = MEDICATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__PRECONDITION = MEDICATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__NULL_FLAVOR = MEDICATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__CLASS_CODE = MEDICATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__MOOD_CODE = MEDICATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__NEGATION_IND = MEDICATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Split Dose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE_FEATURE_COUNT = MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__REALM_CODE = MEDICATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__TYPE_ID = MEDICATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__TEMPLATE_ID = MEDICATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__ID = MEDICATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__CODE = MEDICATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__TEXT = MEDICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__STATUS_CODE = MEDICATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__EFFECTIVE_TIME = MEDICATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__PRIORITY_CODE = MEDICATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__REPEAT_NUMBER = MEDICATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__ROUTE_CODE = MEDICATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__APPROACH_SITE_CODE = MEDICATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__DOSE_QUANTITY = MEDICATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__RATE_QUANTITY = MEDICATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__MAX_DOSE_QUANTITY = MEDICATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__ADMINISTRATION_UNIT_CODE = MEDICATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__SUBJECT = MEDICATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__SPECIMEN = MEDICATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__CONSUMABLE = MEDICATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__PERFORMER = MEDICATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__AUTHOR = MEDICATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__INFORMANT = MEDICATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__REFERENCE = MEDICATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__PARTICIPANT = MEDICATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__ENTRY_RELATIONSHIP = MEDICATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__PRECONDITION = MEDICATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__NULL_FLAVOR = MEDICATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__CLASS_CODE = MEDICATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__MOOD_CODE = MEDICATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__NEGATION_IND = MEDICATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Tapered Dose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE_FEATURE_COUNT = MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__REALM_CODE = IHEPackage.CONDITIONAL_DOSE__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__TYPE_ID = IHEPackage.CONDITIONAL_DOSE__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__TEMPLATE_ID = IHEPackage.CONDITIONAL_DOSE__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__ID = IHEPackage.CONDITIONAL_DOSE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__CODE = IHEPackage.CONDITIONAL_DOSE__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__TEXT = IHEPackage.CONDITIONAL_DOSE__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__STATUS_CODE = IHEPackage.CONDITIONAL_DOSE__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__EFFECTIVE_TIME = IHEPackage.CONDITIONAL_DOSE__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__PRIORITY_CODE = IHEPackage.CONDITIONAL_DOSE__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__REPEAT_NUMBER = IHEPackage.CONDITIONAL_DOSE__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__ROUTE_CODE = IHEPackage.CONDITIONAL_DOSE__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__APPROACH_SITE_CODE = IHEPackage.CONDITIONAL_DOSE__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__DOSE_QUANTITY = IHEPackage.CONDITIONAL_DOSE__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__RATE_QUANTITY = IHEPackage.CONDITIONAL_DOSE__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__MAX_DOSE_QUANTITY = IHEPackage.CONDITIONAL_DOSE__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__ADMINISTRATION_UNIT_CODE = IHEPackage.CONDITIONAL_DOSE__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__SUBJECT = IHEPackage.CONDITIONAL_DOSE__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__SPECIMEN = IHEPackage.CONDITIONAL_DOSE__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__CONSUMABLE = IHEPackage.CONDITIONAL_DOSE__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__PERFORMER = IHEPackage.CONDITIONAL_DOSE__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__AUTHOR = IHEPackage.CONDITIONAL_DOSE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__INFORMANT = IHEPackage.CONDITIONAL_DOSE__INFORMANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__REFERENCE = IHEPackage.CONDITIONAL_DOSE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__PARTICIPANT = IHEPackage.CONDITIONAL_DOSE__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__ENTRY_RELATIONSHIP = IHEPackage.CONDITIONAL_DOSE__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__PRECONDITION = IHEPackage.CONDITIONAL_DOSE__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__NULL_FLAVOR = IHEPackage.CONDITIONAL_DOSE__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__CLASS_CODE = IHEPackage.CONDITIONAL_DOSE__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__MOOD_CODE = IHEPackage.CONDITIONAL_DOSE__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__NEGATION_IND = IHEPackage.CONDITIONAL_DOSE__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Conditional Dose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE_FEATURE_COUNT = IHEPackage.CONDITIONAL_DOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__REALM_CODE = IHEPackage.COMBINATION_MEDICATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__TYPE_ID = IHEPackage.COMBINATION_MEDICATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__TEMPLATE_ID = IHEPackage.COMBINATION_MEDICATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__ID = IHEPackage.COMBINATION_MEDICATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__CODE = IHEPackage.COMBINATION_MEDICATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__TEXT = IHEPackage.COMBINATION_MEDICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__STATUS_CODE = IHEPackage.COMBINATION_MEDICATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__EFFECTIVE_TIME = IHEPackage.COMBINATION_MEDICATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__PRIORITY_CODE = IHEPackage.COMBINATION_MEDICATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__REPEAT_NUMBER = IHEPackage.COMBINATION_MEDICATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__ROUTE_CODE = IHEPackage.COMBINATION_MEDICATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__APPROACH_SITE_CODE = IHEPackage.COMBINATION_MEDICATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__DOSE_QUANTITY = IHEPackage.COMBINATION_MEDICATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__RATE_QUANTITY = IHEPackage.COMBINATION_MEDICATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__MAX_DOSE_QUANTITY = IHEPackage.COMBINATION_MEDICATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__ADMINISTRATION_UNIT_CODE = IHEPackage.COMBINATION_MEDICATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__SUBJECT = IHEPackage.COMBINATION_MEDICATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__SPECIMEN = IHEPackage.COMBINATION_MEDICATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__CONSUMABLE = IHEPackage.COMBINATION_MEDICATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__PERFORMER = IHEPackage.COMBINATION_MEDICATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__AUTHOR = IHEPackage.COMBINATION_MEDICATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__INFORMANT = IHEPackage.COMBINATION_MEDICATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__REFERENCE = IHEPackage.COMBINATION_MEDICATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__PARTICIPANT = IHEPackage.COMBINATION_MEDICATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__ENTRY_RELATIONSHIP = IHEPackage.COMBINATION_MEDICATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__PRECONDITION = IHEPackage.COMBINATION_MEDICATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__NULL_FLAVOR = IHEPackage.COMBINATION_MEDICATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__CLASS_CODE = IHEPackage.COMBINATION_MEDICATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__MOOD_CODE = IHEPackage.COMBINATION_MEDICATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__NEGATION_IND = IHEPackage.COMBINATION_MEDICATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Combination Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION_FEATURE_COUNT = IHEPackage.COMBINATION_MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.SupportImpl <em>Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.SupportImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getSupport()
	 * @generated
	 */
	int SUPPORT = 47;

	/**
	 * The number of structural features of the '<em>Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_FEATURE_COUNT = IHEPackage.PATIENT_CONTACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.SupportGuardianImpl <em>Support Guardian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.SupportGuardianImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getSupportGuardian()
	 * @generated
	 */
	int SUPPORT_GUARDIAN = 48;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN__REALM_CODE = IHEPackage.PATIENT_CONTACT_GUARDIAN__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN__TYPE_ID = IHEPackage.PATIENT_CONTACT_GUARDIAN__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN__TEMPLATE_ID = IHEPackage.PATIENT_CONTACT_GUARDIAN__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN__ID = IHEPackage.PATIENT_CONTACT_GUARDIAN__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN__CODE = IHEPackage.PATIENT_CONTACT_GUARDIAN__CODE;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN__ADDR = IHEPackage.PATIENT_CONTACT_GUARDIAN__ADDR;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN__TELECOM = IHEPackage.PATIENT_CONTACT_GUARDIAN__TELECOM;

	/**
	 * The feature id for the '<em><b>Guardian Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN__GUARDIAN_PERSON = IHEPackage.PATIENT_CONTACT_GUARDIAN__GUARDIAN_PERSON;

	/**
	 * The feature id for the '<em><b>Guardian Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN__GUARDIAN_ORGANIZATION = IHEPackage.PATIENT_CONTACT_GUARDIAN__GUARDIAN_ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN__NULL_FLAVOR = IHEPackage.PATIENT_CONTACT_GUARDIAN__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN__CLASS_CODE = IHEPackage.PATIENT_CONTACT_GUARDIAN__CLASS_CODE;

	/**
	 * The number of structural features of the '<em>Support Guardian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN_FEATURE_COUNT = IHEPackage.PATIENT_CONTACT_GUARDIAN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.SupportParticipantImpl <em>Support Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.SupportParticipantImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getSupportParticipant()
	 * @generated
	 */
	int SUPPORT_PARTICIPANT = 49;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PARTICIPANT__REALM_CODE = IHEPackage.PATIENT_CONTACT_PARTICIPANT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PARTICIPANT__TYPE_ID = IHEPackage.PATIENT_CONTACT_PARTICIPANT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PARTICIPANT__TEMPLATE_ID = IHEPackage.PATIENT_CONTACT_PARTICIPANT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Function Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PARTICIPANT__FUNCTION_CODE = IHEPackage.PATIENT_CONTACT_PARTICIPANT__FUNCTION_CODE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PARTICIPANT__TIME = IHEPackage.PATIENT_CONTACT_PARTICIPANT__TIME;

	/**
	 * The feature id for the '<em><b>Associated Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PARTICIPANT__ASSOCIATED_ENTITY = IHEPackage.PATIENT_CONTACT_PARTICIPANT__ASSOCIATED_ENTITY;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PARTICIPANT__NULL_FLAVOR = IHEPackage.PATIENT_CONTACT_PARTICIPANT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PARTICIPANT__TYPE_CODE = IHEPackage.PATIENT_CONTACT_PARTICIPANT__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PARTICIPANT__CONTEXT_CONTROL_CODE = IHEPackage.PATIENT_CONTACT_PARTICIPANT__CONTEXT_CONTROL_CODE;

	/**
	 * The number of structural features of the '<em>Support Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PARTICIPANT_FEATURE_COUNT = IHEPackage.PATIENT_CONTACT_PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.UnstructuredDocumentImpl <em>Unstructured Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.UnstructuredDocumentImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getUnstructuredDocument()
	 * @generated
	 */
	int UNSTRUCTURED_DOCUMENT = 50;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__REALM_CODE = IHEPackage.MEDICAL_DOCUMENT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__TYPE_ID = IHEPackage.MEDICAL_DOCUMENT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__TEMPLATE_ID = IHEPackage.MEDICAL_DOCUMENT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__ID = IHEPackage.MEDICAL_DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__CODE = IHEPackage.MEDICAL_DOCUMENT__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__TITLE = IHEPackage.MEDICAL_DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__EFFECTIVE_TIME = IHEPackage.MEDICAL_DOCUMENT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__CONFIDENTIALITY_CODE = IHEPackage.MEDICAL_DOCUMENT__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__LANGUAGE_CODE = IHEPackage.MEDICAL_DOCUMENT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__SET_ID = IHEPackage.MEDICAL_DOCUMENT__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__VERSION_NUMBER = IHEPackage.MEDICAL_DOCUMENT__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__COPY_TIME = IHEPackage.MEDICAL_DOCUMENT__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__RECORD_TARGET = IHEPackage.MEDICAL_DOCUMENT__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__AUTHOR = IHEPackage.MEDICAL_DOCUMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__DATA_ENTERER = IHEPackage.MEDICAL_DOCUMENT__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__INFORMANT = IHEPackage.MEDICAL_DOCUMENT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__CUSTODIAN = IHEPackage.MEDICAL_DOCUMENT__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__INFORMATION_RECIPIENT = IHEPackage.MEDICAL_DOCUMENT__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__LEGAL_AUTHENTICATOR = IHEPackage.MEDICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__AUTHENTICATOR = IHEPackage.MEDICAL_DOCUMENT__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__PARTICIPANT = IHEPackage.MEDICAL_DOCUMENT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__IN_FULFILLMENT_OF = IHEPackage.MEDICAL_DOCUMENT__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__DOCUMENTATION_OF = IHEPackage.MEDICAL_DOCUMENT__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__RELATED_DOCUMENT = IHEPackage.MEDICAL_DOCUMENT__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__AUTHORIZATION = IHEPackage.MEDICAL_DOCUMENT__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__COMPONENT_OF = IHEPackage.MEDICAL_DOCUMENT__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__COMPONENT = IHEPackage.MEDICAL_DOCUMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__NULL_FLAVOR = IHEPackage.MEDICAL_DOCUMENT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__CLASS_CODE = IHEPackage.MEDICAL_DOCUMENT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__MOOD_CODE = IHEPackage.MEDICAL_DOCUMENT__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Unstructured Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT_FEATURE_COUNT = IHEPackage.MEDICAL_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationInformationImpl <em>Medication Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationInformationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationInformation()
	 * @generated
	 */
	int MEDICATION_INFORMATION = 51;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__REALM_CODE = IHEPackage.PRODUCT_ENTRY__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__TYPE_ID = IHEPackage.PRODUCT_ENTRY__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__TEMPLATE_ID = IHEPackage.PRODUCT_ENTRY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__ID = IHEPackage.PRODUCT_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Manufactured Labeled Drug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__MANUFACTURED_LABELED_DRUG = IHEPackage.PRODUCT_ENTRY__MANUFACTURED_LABELED_DRUG;

	/**
	 * The feature id for the '<em><b>Manufactured Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__MANUFACTURED_MATERIAL = IHEPackage.PRODUCT_ENTRY__MANUFACTURED_MATERIAL;

	/**
	 * The feature id for the '<em><b>Manufacturer Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__MANUFACTURER_ORGANIZATION = IHEPackage.PRODUCT_ENTRY__MANUFACTURER_ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__NULL_FLAVOR = IHEPackage.PRODUCT_ENTRY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__CLASS_CODE = IHEPackage.PRODUCT_ENTRY__CLASS_CODE;

	/**
	 * The number of structural features of the '<em>Medication Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION_FEATURE_COUNT = IHEPackage.PRODUCT_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPRegistryDelegateImpl <em>Registry Delegate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPRegistryDelegateImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHITSPRegistryDelegate()
	 * @generated
	 */
	int HITSP_REGISTRY_DELEGATE = 52;

	/**
	 * The number of structural features of the '<em>Registry Delegate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HITSP_REGISTRY_DELEGATE_FEATURE_COUNT = CDAPackage.REGISTRY_DELEGATE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity <em>Allergy Drug Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergy Drug Sensitivity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity
	 * @generated
	 */
	EClass getAllergyDrugSensitivity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.Medication
	 * @generated
	 */
	EClass getMedication();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary <em>Patient Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Summary</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary
	 * @generated
	 */
	EClass getPatientSummary();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Signs Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection
	 * @generated
	 */
	EClass getVitalSignsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.VitalSign <em>Vital Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Sign</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.VitalSign
	 * @generated
	 */
	EClass getVitalSign();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.PayersSection <em>Payers Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payers Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.PayersSection
	 * @generated
	 */
	EClass getPayersSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection <em>Allergies Reactions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergies Reactions Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection
	 * @generated
	 */
	EClass getAllergiesReactionsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection <em>Problem List Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem List Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection
	 * @generated
	 */
	EClass getProblemListSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection <em>History Of Past Illness Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Of Past Illness Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection
	 * @generated
	 */
	EClass getHistoryOfPastIllnessSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection <em>Chief Complaint Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chief Complaint Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection
	 * @generated
	 */
	EClass getChiefComplaintSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection <em>Reason For Referral Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reason For Referral Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection
	 * @generated
	 */
	EClass getReasonForReferralSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness <em>History Of Present Illness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Of Present Illness</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness
	 * @generated
	 */
	EClass getHistoryOfPresentIllness();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection <em>Surgeries Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surgeries Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection
	 * @generated
	 */
	EClass getSurgeriesSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection <em>Functional Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Status Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection
	 * @generated
	 */
	EClass getFunctionalStatusSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection <em>Hospital Admission Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Admission Diagnosis Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection
	 * @generated
	 */
	EClass getHospitalAdmissionDiagnosisSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection <em>Discharge Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge Diagnosis Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection
	 * @generated
	 */
	EClass getDischargeDiagnosisSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection <em>Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medications Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection
	 * @generated
	 */
	EClass getMedicationsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.AdmissionMedicationHistorySection <em>Admission Medication History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admission Medication History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.AdmissionMedicationHistorySection
	 * @generated
	 */
	EClass getAdmissionMedicationHistorySection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection <em>Hospital Discharge Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Discharge Medications Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection
	 * @generated
	 */
	EClass getHospitalDischargeMedicationsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationsAdministeredSection <em>Medications Administered Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medications Administered Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.MedicationsAdministeredSection
	 * @generated
	 */
	EClass getMedicationsAdministeredSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection <em>Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directives Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection
	 * @generated
	 */
	EClass getAdvanceDirectivesSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection <em>Immunizations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immunizations Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection
	 * @generated
	 */
	EClass getImmunizationsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection <em>Physical Exam Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Exam Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection
	 * @generated
	 */
	EClass getPhysicalExamSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection <em>Review Of Systems Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review Of Systems Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection
	 * @generated
	 */
	EClass getReviewOfSystemsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection <em>Hospital Course Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Course Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection
	 * @generated
	 */
	EClass getHospitalCourseSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection <em>Diagnostic Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnostic Results Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection
	 * @generated
	 */
	EClass getDiagnosticResultsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection <em>Assessment And Plan Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment And Plan Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection
	 * @generated
	 */
	EClass getAssessmentAndPlanSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection <em>Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection
	 * @generated
	 */
	EClass getPlanOfCareSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection <em>Family History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection
	 * @generated
	 */
	EClass getFamilyHistorySection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection
	 * @generated
	 */
	EClass getSocialHistorySection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection <em>Encounters Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounters Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection
	 * @generated
	 */
	EClass getEncountersSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection <em>Medical Equipment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medical Equipment Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection
	 * @generated
	 */
	EClass getMedicalEquipmentSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken <em>Language Spoken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Spoken</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken
	 * @generated
	 */
	EClass getLanguageSpoken();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider <em>Insurance Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insurance Provider</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider
	 * @generated
	 */
	EClass getInsuranceProvider();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.HealthcareProvider <em>Healthcare Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Healthcare Provider</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.HealthcareProvider
	 * @generated
	 */
	EClass getHealthcareProvider();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.Immunization <em>Immunization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immunization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.Immunization
	 * @generated
	 */
	EClass getImmunization();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationNormalDose <em>Medication Normal Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Normal Dose</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.MedicationNormalDose
	 * @generated
	 */
	EClass getMedicationNormalDose();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationSplitDose <em>Medication Split Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Split Dose</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.MedicationSplitDose
	 * @generated
	 */
	EClass getMedicationSplitDose();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationTaperedDose <em>Medication Tapered Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Tapered Dose</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.MedicationTaperedDose
	 * @generated
	 */
	EClass getMedicationTaperedDose();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationConditionalDose <em>Medication Conditional Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Conditional Dose</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.MedicationConditionalDose
	 * @generated
	 */
	EClass getMedicationConditionalDose();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationCombinationMedication <em>Medication Combination Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Combination Medication</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.MedicationCombinationMedication
	 * @generated
	 */
	EClass getMedicationCombinationMedication();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.Support <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.Support
	 * @generated
	 */
	EClass getSupport();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.SupportGuardian <em>Support Guardian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Guardian</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.SupportGuardian
	 * @generated
	 */
	EClass getSupportGuardian();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.SupportParticipant <em>Support Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.SupportParticipant
	 * @generated
	 */
	EClass getSupportParticipant();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument <em>Unstructured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstructured Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument
	 * @generated
	 */
	EClass getUnstructuredDocument();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation <em>Medication Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Information</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation
	 * @generated
	 */
	EClass getMedicationInformation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.Encounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.Encounter
	 * @generated
	 */
	EClass getEncounter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.HITSPRegistryDelegate <em>Registry Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Delegate</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPRegistryDelegate
	 * @generated
	 */
	EClass getHITSPRegistryDelegate();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry <em>Condition Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry
	 * @generated
	 */
	EClass getConditionEntry();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HITSPFactory getHITSPFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.AllergyDrugSensitivityImpl <em>Allergy Drug Sensitivity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.AllergyDrugSensitivityImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getAllergyDrugSensitivity()
		 * @generated
		 */
		EClass ALLERGY_DRUG_SENSITIVITY = eINSTANCE.getAllergyDrugSensitivity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationImpl <em>Medication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedication()
		 * @generated
		 */
		EClass MEDICATION = eINSTANCE.getMedication();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ConditionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.PatientSummaryImpl <em>Patient Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.PatientSummaryImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getPatientSummary()
		 * @generated
		 */
		EClass PATIENT_SUMMARY = eINSTANCE.getPatientSummary();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.VitalSignsSectionImpl <em>Vital Signs Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.VitalSignsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getVitalSignsSection()
		 * @generated
		 */
		EClass VITAL_SIGNS_SECTION = eINSTANCE.getVitalSignsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.VitalSignImpl <em>Vital Sign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.VitalSignImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getVitalSign()
		 * @generated
		 */
		EClass VITAL_SIGN = eINSTANCE.getVitalSign();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.PayersSectionImpl <em>Payers Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.PayersSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getPayersSection()
		 * @generated
		 */
		EClass PAYERS_SECTION = eINSTANCE.getPayersSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.AllergiesReactionsSectionImpl <em>Allergies Reactions Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.AllergiesReactionsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getAllergiesReactionsSection()
		 * @generated
		 */
		EClass ALLERGIES_REACTIONS_SECTION = eINSTANCE.getAllergiesReactionsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ProblemListSectionImpl <em>Problem List Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ProblemListSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getProblemListSection()
		 * @generated
		 */
		EClass PROBLEM_LIST_SECTION = eINSTANCE.getProblemListSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HistoryOfPastIllnessSectionImpl <em>History Of Past Illness Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HistoryOfPastIllnessSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHistoryOfPastIllnessSection()
		 * @generated
		 */
		EClass HISTORY_OF_PAST_ILLNESS_SECTION = eINSTANCE.getHistoryOfPastIllnessSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ChiefComplaintSectionImpl <em>Chief Complaint Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ChiefComplaintSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getChiefComplaintSection()
		 * @generated
		 */
		EClass CHIEF_COMPLAINT_SECTION = eINSTANCE.getChiefComplaintSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ReasonForReferralSectionImpl <em>Reason For Referral Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ReasonForReferralSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getReasonForReferralSection()
		 * @generated
		 */
		EClass REASON_FOR_REFERRAL_SECTION = eINSTANCE.getReasonForReferralSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HistoryOfPresentIllnessImpl <em>History Of Present Illness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HistoryOfPresentIllnessImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHistoryOfPresentIllness()
		 * @generated
		 */
		EClass HISTORY_OF_PRESENT_ILLNESS = eINSTANCE.getHistoryOfPresentIllness();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.SurgeriesSectionImpl <em>Surgeries Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.SurgeriesSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getSurgeriesSection()
		 * @generated
		 */
		EClass SURGERIES_SECTION = eINSTANCE.getSurgeriesSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.FunctionalStatusSectionImpl <em>Functional Status Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.FunctionalStatusSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getFunctionalStatusSection()
		 * @generated
		 */
		EClass FUNCTIONAL_STATUS_SECTION = eINSTANCE.getFunctionalStatusSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HospitalAdmissionDiagnosisSectionImpl <em>Hospital Admission Diagnosis Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HospitalAdmissionDiagnosisSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHospitalAdmissionDiagnosisSection()
		 * @generated
		 */
		EClass HOSPITAL_ADMISSION_DIAGNOSIS_SECTION = eINSTANCE.getHospitalAdmissionDiagnosisSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.DischargeDiagnosisSectionImpl <em>Discharge Diagnosis Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.DischargeDiagnosisSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getDischargeDiagnosisSection()
		 * @generated
		 */
		EClass DISCHARGE_DIAGNOSIS_SECTION = eINSTANCE.getDischargeDiagnosisSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationsSectionImpl <em>Medications Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationsSection()
		 * @generated
		 */
		EClass MEDICATIONS_SECTION = eINSTANCE.getMedicationsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.AdmissionMedicationHistorySectionImpl <em>Admission Medication History Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.AdmissionMedicationHistorySectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getAdmissionMedicationHistorySection()
		 * @generated
		 */
		EClass ADMISSION_MEDICATION_HISTORY_SECTION = eINSTANCE.getAdmissionMedicationHistorySection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HospitalDischargeMedicationsSectionImpl <em>Hospital Discharge Medications Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HospitalDischargeMedicationsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHospitalDischargeMedicationsSection()
		 * @generated
		 */
		EClass HOSPITAL_DISCHARGE_MEDICATIONS_SECTION = eINSTANCE.getHospitalDischargeMedicationsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationsAdministeredSectionImpl <em>Medications Administered Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationsAdministeredSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationsAdministeredSection()
		 * @generated
		 */
		EClass MEDICATIONS_ADMINISTERED_SECTION = eINSTANCE.getMedicationsAdministeredSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.AdvanceDirectivesSectionImpl <em>Advance Directives Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.AdvanceDirectivesSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getAdvanceDirectivesSection()
		 * @generated
		 */
		EClass ADVANCE_DIRECTIVES_SECTION = eINSTANCE.getAdvanceDirectivesSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ImmunizationsSectionImpl <em>Immunizations Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ImmunizationsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getImmunizationsSection()
		 * @generated
		 */
		EClass IMMUNIZATIONS_SECTION = eINSTANCE.getImmunizationsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.PhysicalExamSectionImpl <em>Physical Exam Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.PhysicalExamSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getPhysicalExamSection()
		 * @generated
		 */
		EClass PHYSICAL_EXAM_SECTION = eINSTANCE.getPhysicalExamSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ReviewOfSystemsSectionImpl <em>Review Of Systems Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ReviewOfSystemsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getReviewOfSystemsSection()
		 * @generated
		 */
		EClass REVIEW_OF_SYSTEMS_SECTION = eINSTANCE.getReviewOfSystemsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HospitalCourseSectionImpl <em>Hospital Course Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HospitalCourseSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHospitalCourseSection()
		 * @generated
		 */
		EClass HOSPITAL_COURSE_SECTION = eINSTANCE.getHospitalCourseSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.DiagnosticResultsSectionImpl <em>Diagnostic Results Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.DiagnosticResultsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getDiagnosticResultsSection()
		 * @generated
		 */
		EClass DIAGNOSTIC_RESULTS_SECTION = eINSTANCE.getDiagnosticResultsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.AssessmentAndPlanSectionImpl <em>Assessment And Plan Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.AssessmentAndPlanSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getAssessmentAndPlanSection()
		 * @generated
		 */
		EClass ASSESSMENT_AND_PLAN_SECTION = eINSTANCE.getAssessmentAndPlanSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.PlanOfCareSectionImpl <em>Plan Of Care Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.PlanOfCareSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getPlanOfCareSection()
		 * @generated
		 */
		EClass PLAN_OF_CARE_SECTION = eINSTANCE.getPlanOfCareSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.FamilyHistorySectionImpl <em>Family History Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.FamilyHistorySectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getFamilyHistorySection()
		 * @generated
		 */
		EClass FAMILY_HISTORY_SECTION = eINSTANCE.getFamilyHistorySection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.SocialHistorySectionImpl <em>Social History Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.SocialHistorySectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getSocialHistorySection()
		 * @generated
		 */
		EClass SOCIAL_HISTORY_SECTION = eINSTANCE.getSocialHistorySection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.EncountersSectionImpl <em>Encounters Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.EncountersSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getEncountersSection()
		 * @generated
		 */
		EClass ENCOUNTERS_SECTION = eINSTANCE.getEncountersSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicalEquipmentSectionImpl <em>Medical Equipment Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicalEquipmentSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicalEquipmentSection()
		 * @generated
		 */
		EClass MEDICAL_EQUIPMENT_SECTION = eINSTANCE.getMedicalEquipmentSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ResultImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.LanguageSpokenImpl <em>Language Spoken</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.LanguageSpokenImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getLanguageSpoken()
		 * @generated
		 */
		EClass LANGUAGE_SPOKEN = eINSTANCE.getLanguageSpoken();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.InsuranceProviderImpl <em>Insurance Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.InsuranceProviderImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getInsuranceProvider()
		 * @generated
		 */
		EClass INSURANCE_PROVIDER = eINSTANCE.getInsuranceProvider();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HealthcareProviderImpl <em>Healthcare Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HealthcareProviderImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHealthcareProvider()
		 * @generated
		 */
		EClass HEALTHCARE_PROVIDER = eINSTANCE.getHealthcareProvider();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ImmunizationImpl <em>Immunization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ImmunizationImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getImmunization()
		 * @generated
		 */
		EClass IMMUNIZATION = eINSTANCE.getImmunization();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.CommentImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationNormalDoseImpl <em>Medication Normal Dose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationNormalDoseImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationNormalDose()
		 * @generated
		 */
		EClass MEDICATION_NORMAL_DOSE = eINSTANCE.getMedicationNormalDose();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationSplitDoseImpl <em>Medication Split Dose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationSplitDoseImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationSplitDose()
		 * @generated
		 */
		EClass MEDICATION_SPLIT_DOSE = eINSTANCE.getMedicationSplitDose();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationTaperedDoseImpl <em>Medication Tapered Dose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationTaperedDoseImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationTaperedDose()
		 * @generated
		 */
		EClass MEDICATION_TAPERED_DOSE = eINSTANCE.getMedicationTaperedDose();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationConditionalDoseImpl <em>Medication Conditional Dose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationConditionalDoseImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationConditionalDose()
		 * @generated
		 */
		EClass MEDICATION_CONDITIONAL_DOSE = eINSTANCE.getMedicationConditionalDose();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationCombinationMedicationImpl <em>Medication Combination Medication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationCombinationMedicationImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationCombinationMedication()
		 * @generated
		 */
		EClass MEDICATION_COMBINATION_MEDICATION = eINSTANCE.getMedicationCombinationMedication();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ProcedureImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.SupportImpl <em>Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.SupportImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getSupport()
		 * @generated
		 */
		EClass SUPPORT = eINSTANCE.getSupport();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.SupportGuardianImpl <em>Support Guardian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.SupportGuardianImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getSupportGuardian()
		 * @generated
		 */
		EClass SUPPORT_GUARDIAN = eINSTANCE.getSupportGuardian();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.SupportParticipantImpl <em>Support Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.SupportParticipantImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getSupportParticipant()
		 * @generated
		 */
		EClass SUPPORT_PARTICIPANT = eINSTANCE.getSupportParticipant();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.UnstructuredDocumentImpl <em>Unstructured Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.UnstructuredDocumentImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getUnstructuredDocument()
		 * @generated
		 */
		EClass UNSTRUCTURED_DOCUMENT = eINSTANCE.getUnstructuredDocument();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationInformationImpl <em>Medication Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.MedicationInformationImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getMedicationInformation()
		 * @generated
		 */
		EClass MEDICATION_INFORMATION = eINSTANCE.getMedicationInformation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.EncounterImpl <em>Encounter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.EncounterImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getEncounter()
		 * @generated
		 */
		EClass ENCOUNTER = eINSTANCE.getEncounter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPRegistryDelegateImpl <em>Registry Delegate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPRegistryDelegateImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getHITSPRegistryDelegate()
		 * @generated
		 */
		EClass HITSP_REGISTRY_DELEGATE = eINSTANCE.getHITSPRegistryDelegate();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.impl.ConditionEntryImpl <em>Condition Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.ConditionEntryImpl
		 * @see org.openhealthtools.mdht.uml.cda.hitsp.impl.HITSPPackageImpl#getConditionEntry()
		 * @generated
		 */
		EClass CONDITION_ENTRY = eINSTANCE.getConditionEntry();

	}

} //HITSPPackage
