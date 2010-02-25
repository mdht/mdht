/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.cdaprofile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.openhealthtools.mdht.uml.cts.core.ctsprofile.CTSPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAFactory
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
	String eNAME = "cdaprofile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/schemas/cda/4";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CDA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDAPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ValidationSupportImpl <em>Validation Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ValidationSupportImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getValidationSupport()
	 * @generated
	 */
	int VALIDATION_SUPPORT = 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_SUPPORT__SEVERITY = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_SUPPORT__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_SUPPORT__BASE_ASSOCIATION = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_SUPPORT__BASE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_SUPPORT__BASE_PROPERTY = 4;

	/**
	 * The number of structural features of the '<em>Validation Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_SUPPORT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ValidationImpl <em>Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ValidationImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getValidation()
	 * @generated
	 */
	int VALIDATION = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__SEVERITY = 1;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__RULE_ID = 2;

	/**
	 * The number of structural features of the '<em>Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.AssociationValidationImpl <em>Association Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.AssociationValidationImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getAssociationValidation()
	 * @generated
	 */
	int ASSOCIATION_VALIDATION = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION__MESSAGE = VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION__SEVERITY = VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION__RULE_ID = VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION__BASE_ASSOCIATION = VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION_FEATURE_COUNT = VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.EntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__MESSAGE = ASSOCIATION_VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__SEVERITY = ASSOCIATION_VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__RULE_ID = ASSOCIATION_VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__BASE_ASSOCIATION = ASSOCIATION_VALIDATION__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TYPE_CODE = ASSOCIATION_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = ASSOCIATION_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.EntryRelationshipImpl <em>Entry Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.EntryRelationshipImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getEntryRelationship()
	 * @generated
	 */
	int ENTRY_RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__MESSAGE = ASSOCIATION_VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__SEVERITY = ASSOCIATION_VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__RULE_ID = ASSOCIATION_VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__BASE_ASSOCIATION = ASSOCIATION_VALIDATION__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__TYPE_CODE = ASSOCIATION_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP_FEATURE_COUNT = ASSOCIATION_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CodegenSupportImpl <em>Codegen Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CodegenSupportImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getCodegenSupport()
	 * @generated
	 */
	int CODEGEN_SUPPORT = 5;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT__NS_PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT__NS_URI = 2;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT__PACKAGE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT__PREFIX = 4;

	/**
	 * The feature id for the '<em><b>Base Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT__BASE_NAMESPACE = 5;

	/**
	 * The number of structural features of the '<em>Codegen Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.PropertyValidationImpl <em>Property Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.PropertyValidationImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getPropertyValidation()
	 * @generated
	 */
	int PROPERTY_VALIDATION = 6;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION__MESSAGE = VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION__SEVERITY = VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION__RULE_ID = VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION__BASE_PROPERTY = VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION_FEATURE_COUNT = VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ClassValidationImpl <em>Class Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ClassValidationImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getClassValidation()
	 * @generated
	 */
	int CLASS_VALIDATION = 7;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION__MESSAGE = VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION__SEVERITY = VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION__RULE_ID = VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION__BASE_CLASS = VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION_FEATURE_COUNT = VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.VocabSpecificationImpl <em>Vocab Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.VocabSpecificationImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getVocabSpecification()
	 * @generated
	 */
	int VOCAB_SPECIFICATION = 8;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__MESSAGE = PROPERTY_VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__SEVERITY = PROPERTY_VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__RULE_ID = PROPERTY_VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__BASE_PROPERTY = PROPERTY_VALIDATION__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__CODE = PROPERTY_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__CODE_SYSTEM = PROPERTY_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__CODE_SYSTEM_NAME = PROPERTY_VALIDATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__CODE_SYSTEM_VERSION = PROPERTY_VALIDATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__DISPLAY_NAME = PROPERTY_VALIDATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vocab Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION_FEATURE_COUNT = PROPERTY_VALIDATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.NullFlavorImpl <em>Null Flavor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.NullFlavorImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getNullFlavor()
	 * @generated
	 */
	int NULL_FLAVOR = 9;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__MESSAGE = PROPERTY_VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__SEVERITY = PROPERTY_VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__RULE_ID = PROPERTY_VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__BASE_PROPERTY = PROPERTY_VALIDATION__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__NULL_FLAVOR = PROPERTY_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Null Flavor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR_FEATURE_COUNT = PROPERTY_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.TextValueImpl <em>Text Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.TextValueImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getTextValue()
	 * @generated
	 */
	int TEXT_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__MESSAGE = PROPERTY_VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__SEVERITY = PROPERTY_VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__RULE_ID = PROPERTY_VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__BASE_PROPERTY = PROPERTY_VALIDATION__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__VALUE = PROPERTY_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__IGNORE_CASE = PROPERTY_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_FEATURE_COUNT = PROPERTY_VALIDATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDATemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDATemplateImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getCDATemplate()
	 * @generated
	 */
	int CDA_TEMPLATE = 11;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__MESSAGE = CLASS_VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__SEVERITY = CLASS_VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__RULE_ID = CLASS_VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__BASE_CLASS = CLASS_VALIDATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__TEMPLATE_ID = CLASS_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assigning Authority Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME = CLASS_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__CONTEXT_DEPENDENT = CLASS_VALIDATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE_FEATURE_COUNT = CLASS_VALIDATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ConstraintValidationImpl <em>Constraint Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ConstraintValidationImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getConstraintValidation()
	 * @generated
	 */
	int CONSTRAINT_VALIDATION = 12;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__MESSAGE = VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__SEVERITY = VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__RULE_ID = VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__BASE_CONSTRAINT = VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION_FEATURE_COUNT = VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ConformsToImpl <em>Conforms To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ConformsToImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getConformsTo()
	 * @generated
	 */
	int CONFORMS_TO = 13;

	/**
	 * The feature id for the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__BASE_GENERALIZATION = 0;

	/**
	 * The number of structural features of the '<em>Conforms To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ConceptDomainConstraintImpl <em>Concept Domain Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ConceptDomainConstraintImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getConceptDomainConstraint()
	 * @generated
	 */
	int CONCEPT_DOMAIN_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__REFERENCE = CTSPackage.CONCEPT_DOMAIN_CONSTRAINT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER = CTSPackage.CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__NAME = CTSPackage.CONCEPT_DOMAIN_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY = CTSPackage.CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__MESSAGE = CTSPackage.CONCEPT_DOMAIN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__SEVERITY = CTSPackage.CONCEPT_DOMAIN_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__RULE_ID = CTSPackage.CONCEPT_DOMAIN_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concept Domain Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT_FEATURE_COUNT = CTSPackage.CONCEPT_DOMAIN_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CodeSystemConstraintImpl <em>Code System Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CodeSystemConstraintImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getCodeSystemConstraint()
	 * @generated
	 */
	int CODE_SYSTEM_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__REFERENCE = CTSPackage.CODE_SYSTEM_CONSTRAINT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__IDENTIFIER = CTSPackage.CODE_SYSTEM_CONSTRAINT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__NAME = CTSPackage.CODE_SYSTEM_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__VERSION = CTSPackage.CODE_SYSTEM_CONSTRAINT__VERSION;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__BINDING = CTSPackage.CODE_SYSTEM_CONSTRAINT__BINDING;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__CODE = CTSPackage.CODE_SYSTEM_CONSTRAINT__CODE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME = CTSPackage.CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__QUALIFIER = CTSPackage.CODE_SYSTEM_CONSTRAINT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY = CTSPackage.CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__MESSAGE = CTSPackage.CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__SEVERITY = CTSPackage.CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__RULE_ID = CTSPackage.CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Code System Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT = CTSPackage.CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ValueSetConstraintImpl <em>Value Set Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ValueSetConstraintImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getValueSetConstraint()
	 * @generated
	 */
	int VALUE_SET_CONSTRAINT = 16;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__REFERENCE = CTSPackage.VALUE_SET_CONSTRAINT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__IDENTIFIER = CTSPackage.VALUE_SET_CONSTRAINT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__NAME = CTSPackage.VALUE_SET_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__VERSION = CTSPackage.VALUE_SET_CONSTRAINT__VERSION;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__BINDING = CTSPackage.VALUE_SET_CONSTRAINT__BINDING;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__BASE_PROPERTY = CTSPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__MESSAGE = CTSPackage.VALUE_SET_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__SEVERITY = CTSPackage.VALUE_SET_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__RULE_ID = CTSPackage.VALUE_SET_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value Set Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT_FEATURE_COUNT = CTSPackage.VALUE_SET_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.SeverityKind <em>Severity Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.SeverityKind
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getSeverityKind()
	 * @generated
	 */
	int SEVERITY_KIND = 17;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryKind <em>Entry Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryKind
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getEntryKind()
	 * @generated
	 */
	int ENTRY_KIND = 18;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationshipKind <em>Entry Relationship Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationshipKind
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getEntryRelationshipKind()
	 * @generated
	 */
	int ENTRY_RELATIONSHIP_KIND = 19;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavorKind <em>Null Flavor Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavorKind
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getNullFlavorKind()
	 * @generated
	 */
	int NULL_FLAVOR_KIND = 20;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport <em>Validation Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Support</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport
	 * @generated
	 */
	EClass getValidationSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport#getSeverity()
	 * @see #getValidationSupport()
	 * @generated
	 */
	EAttribute getValidationSupport_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport#getMessage()
	 * @see #getValidationSupport()
	 * @generated
	 */
	EAttribute getValidationSupport_Message();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport#getBase_Association()
	 * @see #getValidationSupport()
	 * @generated
	 */
	EReference getValidationSupport_Base_Association();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport#getBase_Class()
	 * @see #getValidationSupport()
	 * @generated
	 */
	EReference getValidationSupport_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport#getBase_Property()
	 * @see #getValidationSupport()
	 * @generated
	 */
	EReference getValidationSupport_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Entry#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.Entry#getTypeCode()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.AssociationValidation <em>Association Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Validation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.AssociationValidation
	 * @generated
	 */
	EClass getAssociationValidation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.AssociationValidation#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.AssociationValidation#getBase_Association()
	 * @see #getAssociationValidation()
	 * @generated
	 */
	EReference getAssociationValidation_Base_Association();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation
	 * @generated
	 */
	EClass getValidation();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation#getMessage()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation#getSeverity()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_Severity();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation#getRuleId <em>Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rule Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation#getRuleId()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_RuleId();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationship <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationship
	 * @generated
	 */
	EClass getEntryRelationship();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationship#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationship#getTypeCode()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EAttribute getEntryRelationship_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport <em>Codegen Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Codegen Support</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport
	 * @generated
	 */
	EClass getCodegenSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport#getBasePackage()
	 * @see #getCodegenSupport()
	 * @generated
	 */
	EAttribute getCodegenSupport_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport#getNsPrefix <em>Ns Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns Prefix</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport#getNsPrefix()
	 * @see #getCodegenSupport()
	 * @generated
	 */
	EAttribute getCodegenSupport_NsPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport#getNsURI <em>Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns URI</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport#getNsURI()
	 * @see #getCodegenSupport()
	 * @generated
	 */
	EAttribute getCodegenSupport_NsURI();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport#getPackageName()
	 * @see #getCodegenSupport()
	 * @generated
	 */
	EAttribute getCodegenSupport_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport#getPrefix()
	 * @see #getCodegenSupport()
	 * @generated
	 */
	EAttribute getCodegenSupport_Prefix();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport#getBase_Namespace <em>Base Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Namespace</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport#getBase_Namespace()
	 * @see #getCodegenSupport()
	 * @generated
	 */
	EReference getCodegenSupport_Base_Namespace();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.PropertyValidation <em>Property Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Validation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.PropertyValidation
	 * @generated
	 */
	EClass getPropertyValidation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.PropertyValidation#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.PropertyValidation#getBase_Property()
	 * @see #getPropertyValidation()
	 * @generated
	 */
	EReference getPropertyValidation_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ClassValidation <em>Class Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Validation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ClassValidation
	 * @generated
	 */
	EClass getClassValidation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ClassValidation#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ClassValidation#getBase_Class()
	 * @see #getClassValidation()
	 * @generated
	 */
	EReference getClassValidation_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification <em>Vocab Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vocab Specification</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification
	 * @generated
	 */
	EClass getVocabSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification#getCode()
	 * @see #getVocabSpecification()
	 * @generated
	 */
	EAttribute getVocabSpecification_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification#getCodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification#getCodeSystem()
	 * @see #getVocabSpecification()
	 * @generated
	 */
	EAttribute getVocabSpecification_CodeSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification#getCodeSystemName <em>Code System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification#getCodeSystemName()
	 * @see #getVocabSpecification()
	 * @generated
	 */
	EAttribute getVocabSpecification_CodeSystemName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification#getCodeSystemVersion <em>Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System Version</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification#getCodeSystemVersion()
	 * @see #getVocabSpecification()
	 * @generated
	 */
	EAttribute getVocabSpecification_CodeSystemVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification#getDisplayName()
	 * @see #getVocabSpecification()
	 * @generated
	 */
	EAttribute getVocabSpecification_DisplayName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavor
	 * @generated
	 */
	EClass getNullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavor#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavor#getNullFlavor()
	 * @see #getNullFlavor()
	 * @generated
	 */
	EAttribute getNullFlavor_NullFlavor();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.TextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Value</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.TextValue
	 * @generated
	 */
	EClass getTextValue();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.TextValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.TextValue#getValue()
	 * @see #getTextValue()
	 * @generated
	 */
	EAttribute getTextValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.TextValue#isIgnoreCase <em>Ignore Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Case</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.TextValue#isIgnoreCase()
	 * @see #getTextValue()
	 * @generated
	 */
	EAttribute getTextValue_IgnoreCase();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate
	 * @generated
	 */
	EClass getCDATemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate#getTemplateId <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate#getTemplateId()
	 * @see #getCDATemplate()
	 * @generated
	 */
	EAttribute getCDATemplate_TemplateId();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate#getAssigningAuthorityName <em>Assigning Authority Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigning Authority Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate#getAssigningAuthorityName()
	 * @see #getCDATemplate()
	 * @generated
	 */
	EAttribute getCDATemplate_AssigningAuthorityName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate#isContextDependent <em>Context Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Dependent</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate#isContextDependent()
	 * @see #getCDATemplate()
	 * @generated
	 */
	EAttribute getCDATemplate_ContextDependent();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConstraintValidation <em>Constraint Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Validation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConstraintValidation
	 * @generated
	 */
	EClass getConstraintValidation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConstraintValidation#getBase_Constraint <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConstraintValidation#getBase_Constraint()
	 * @see #getConstraintValidation()
	 * @generated
	 */
	EReference getConstraintValidation_Base_Constraint();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conforms To</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConformsTo
	 * @generated
	 */
	EClass getConformsTo();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConformsTo#getBase_Generalization <em>Base Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Generalization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConformsTo#getBase_Generalization()
	 * @see #getConformsTo()
	 * @generated
	 */
	EReference getConformsTo_Base_Generalization();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConceptDomainConstraint <em>Concept Domain Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Domain Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConceptDomainConstraint
	 * @generated
	 */
	EClass getConceptDomainConstraint();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodeSystemConstraint <em>Code System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code System Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodeSystemConstraint
	 * @generated
	 */
	EClass getCodeSystemConstraint();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValueSetConstraint <em>Value Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValueSetConstraint
	 * @generated
	 */
	EClass getValueSetConstraint();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.SeverityKind <em>Severity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.SeverityKind
	 * @generated
	 */
	EEnum getSeverityKind();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryKind <em>Entry Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entry Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryKind
	 * @generated
	 */
	EEnum getEntryKind();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationshipKind <em>Entry Relationship Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entry Relationship Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationshipKind
	 * @generated
	 */
	EEnum getEntryRelationshipKind();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavorKind <em>Null Flavor Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Null Flavor Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavorKind
	 * @generated
	 */
	EEnum getNullFlavorKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CDAFactory getCDAFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ValidationSupportImpl <em>Validation Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ValidationSupportImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getValidationSupport()
		 * @generated
		 */
		EClass VALIDATION_SUPPORT = eINSTANCE.getValidationSupport();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_SUPPORT__SEVERITY = eINSTANCE.getValidationSupport_Severity();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_SUPPORT__MESSAGE = eINSTANCE.getValidationSupport_Message();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_SUPPORT__BASE_ASSOCIATION = eINSTANCE.getValidationSupport_Base_Association();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_SUPPORT__BASE_CLASS = eINSTANCE.getValidationSupport_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_SUPPORT__BASE_PROPERTY = eINSTANCE.getValidationSupport_Base_Property();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.EntryImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__TYPE_CODE = eINSTANCE.getEntry_TypeCode();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.AssociationValidationImpl <em>Association Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.AssociationValidationImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getAssociationValidation()
		 * @generated
		 */
		EClass ASSOCIATION_VALIDATION = eINSTANCE.getAssociationValidation();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_VALIDATION__BASE_ASSOCIATION = eINSTANCE.getAssociationValidation_Base_Association();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ValidationImpl <em>Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ValidationImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getValidation()
		 * @generated
		 */
		EClass VALIDATION = eINSTANCE.getValidation();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION__MESSAGE = eINSTANCE.getValidation_Message();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION__SEVERITY = eINSTANCE.getValidation_Severity();

		/**
		 * The meta object literal for the '<em><b>Rule Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION__RULE_ID = eINSTANCE.getValidation_RuleId();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.EntryRelationshipImpl <em>Entry Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.EntryRelationshipImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getEntryRelationship()
		 * @generated
		 */
		EClass ENTRY_RELATIONSHIP = eINSTANCE.getEntryRelationship();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_RELATIONSHIP__TYPE_CODE = eINSTANCE.getEntryRelationship_TypeCode();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CodegenSupportImpl <em>Codegen Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CodegenSupportImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getCodegenSupport()
		 * @generated
		 */
		EClass CODEGEN_SUPPORT = eINSTANCE.getCodegenSupport();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODEGEN_SUPPORT__BASE_PACKAGE = eINSTANCE.getCodegenSupport_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Ns Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODEGEN_SUPPORT__NS_PREFIX = eINSTANCE.getCodegenSupport_NsPrefix();

		/**
		 * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODEGEN_SUPPORT__NS_URI = eINSTANCE.getCodegenSupport_NsURI();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODEGEN_SUPPORT__PACKAGE_NAME = eINSTANCE.getCodegenSupport_PackageName();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODEGEN_SUPPORT__PREFIX = eINSTANCE.getCodegenSupport_Prefix();

		/**
		 * The meta object literal for the '<em><b>Base Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODEGEN_SUPPORT__BASE_NAMESPACE = eINSTANCE.getCodegenSupport_Base_Namespace();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.PropertyValidationImpl <em>Property Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.PropertyValidationImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getPropertyValidation()
		 * @generated
		 */
		EClass PROPERTY_VALIDATION = eINSTANCE.getPropertyValidation();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALIDATION__BASE_PROPERTY = eINSTANCE.getPropertyValidation_Base_Property();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ClassValidationImpl <em>Class Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ClassValidationImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getClassValidation()
		 * @generated
		 */
		EClass CLASS_VALIDATION = eINSTANCE.getClassValidation();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_VALIDATION__BASE_CLASS = eINSTANCE.getClassValidation_Base_Class();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.VocabSpecificationImpl <em>Vocab Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.VocabSpecificationImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getVocabSpecification()
		 * @generated
		 */
		EClass VOCAB_SPECIFICATION = eINSTANCE.getVocabSpecification();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCAB_SPECIFICATION__CODE = eINSTANCE.getVocabSpecification_Code();

		/**
		 * The meta object literal for the '<em><b>Code System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCAB_SPECIFICATION__CODE_SYSTEM = eINSTANCE.getVocabSpecification_CodeSystem();

		/**
		 * The meta object literal for the '<em><b>Code System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCAB_SPECIFICATION__CODE_SYSTEM_NAME = eINSTANCE.getVocabSpecification_CodeSystemName();

		/**
		 * The meta object literal for the '<em><b>Code System Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCAB_SPECIFICATION__CODE_SYSTEM_VERSION = eINSTANCE.getVocabSpecification_CodeSystemVersion();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCAB_SPECIFICATION__DISPLAY_NAME = eINSTANCE.getVocabSpecification_DisplayName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.NullFlavorImpl <em>Null Flavor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.NullFlavorImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getNullFlavor()
		 * @generated
		 */
		EClass NULL_FLAVOR = eINSTANCE.getNullFlavor();

		/**
		 * The meta object literal for the '<em><b>Null Flavor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL_FLAVOR__NULL_FLAVOR = eINSTANCE.getNullFlavor_NullFlavor();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.TextValueImpl <em>Text Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.TextValueImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getTextValue()
		 * @generated
		 */
		EClass TEXT_VALUE = eINSTANCE.getTextValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VALUE__VALUE = eINSTANCE.getTextValue_Value();

		/**
		 * The meta object literal for the '<em><b>Ignore Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VALUE__IGNORE_CASE = eINSTANCE.getTextValue_IgnoreCase();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDATemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDATemplateImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getCDATemplate()
		 * @generated
		 */
		EClass CDA_TEMPLATE = eINSTANCE.getCDATemplate();

		/**
		 * The meta object literal for the '<em><b>Template Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDA_TEMPLATE__TEMPLATE_ID = eINSTANCE.getCDATemplate_TemplateId();

		/**
		 * The meta object literal for the '<em><b>Assigning Authority Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME = eINSTANCE.getCDATemplate_AssigningAuthorityName();

		/**
		 * The meta object literal for the '<em><b>Context Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDA_TEMPLATE__CONTEXT_DEPENDENT = eINSTANCE.getCDATemplate_ContextDependent();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ConstraintValidationImpl <em>Constraint Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ConstraintValidationImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getConstraintValidation()
		 * @generated
		 */
		EClass CONSTRAINT_VALIDATION = eINSTANCE.getConstraintValidation();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_VALIDATION__BASE_CONSTRAINT = eINSTANCE.getConstraintValidation_Base_Constraint();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ConformsToImpl <em>Conforms To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ConformsToImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getConformsTo()
		 * @generated
		 */
		EClass CONFORMS_TO = eINSTANCE.getConformsTo();

		/**
		 * The meta object literal for the '<em><b>Base Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORMS_TO__BASE_GENERALIZATION = eINSTANCE.getConformsTo_Base_Generalization();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ConceptDomainConstraintImpl <em>Concept Domain Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ConceptDomainConstraintImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getConceptDomainConstraint()
		 * @generated
		 */
		EClass CONCEPT_DOMAIN_CONSTRAINT = eINSTANCE.getConceptDomainConstraint();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CodeSystemConstraintImpl <em>Code System Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CodeSystemConstraintImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getCodeSystemConstraint()
		 * @generated
		 */
		EClass CODE_SYSTEM_CONSTRAINT = eINSTANCE.getCodeSystemConstraint();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ValueSetConstraintImpl <em>Value Set Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.ValueSetConstraintImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getValueSetConstraint()
		 * @generated
		 */
		EClass VALUE_SET_CONSTRAINT = eINSTANCE.getValueSetConstraint();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.SeverityKind <em>Severity Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.SeverityKind
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getSeverityKind()
		 * @generated
		 */
		EEnum SEVERITY_KIND = eINSTANCE.getSeverityKind();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryKind <em>Entry Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryKind
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getEntryKind()
		 * @generated
		 */
		EEnum ENTRY_KIND = eINSTANCE.getEntryKind();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationshipKind <em>Entry Relationship Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationshipKind
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getEntryRelationshipKind()
		 * @generated
		 */
		EEnum ENTRY_RELATIONSHIP_KIND = eINSTANCE.getEntryRelationshipKind();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavorKind <em>Null Flavor Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavorKind
		 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAPackageImpl#getNullFlavorKind()
		 * @generated
		 */
		EEnum NULL_FLAVOR_KIND = eINSTANCE.getNullFlavorKind();

	}

} //CDAPackage
