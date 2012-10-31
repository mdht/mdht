/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.openhealthtools.mdht.cts2.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface ValueSetDefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "valuesetdefinition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "valuesetdefinition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ValueSetDefinitionPackage eINSTANCE = org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.AssociatedEntitiesReferenceImpl
	 * <em>Associated Entities Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.AssociatedEntitiesReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getAssociatedEntitiesReference()
	 * @generated
	 */
	int ASSOCIATED_ENTITIES_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Referenced Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITIES_REFERENCE__PREDICATE = 3;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITIES_REFERENCE__DIRECTION = 4;

	/**
	 * The feature id for the '<em><b>Leaf Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITIES_REFERENCE__LEAF_ONLY = 5;

	/**
	 * The feature id for the '<em><b>Transitivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITIES_REFERENCE__TRANSITIVITY = 6;

	/**
	 * The number of structural features of the '<em>Associated Entities Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ENTITIES_REFERENCE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.CompleteCodeSystemReferenceImpl
	 * <em>Complete Code System Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.CompleteCodeSystemReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getCompleteCodeSystemReference()
	 * @generated
	 */
	int COMPLETE_CODE_SYSTEM_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Complete Code System Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPLETE_CODE_SYSTEM_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.CompleteValueSetReferenceImpl
	 * <em>Complete Value Set Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.CompleteValueSetReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getCompleteValueSetReference()
	 * @generated
	 */
	int COMPLETE_VALUE_SET_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPLETE_VALUE_SET_REFERENCE__VALUE_SET = 0;

	/**
	 * The feature id for the '<em><b>Value Set Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPLETE_VALUE_SET_REFERENCE__VALUE_SET_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Reference Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPLETE_VALUE_SET_REFERENCE__REFERENCE_CODE_SYSTEM_VERSION = 2;

	/**
	 * The number of structural features of the '<em>Complete Value Set Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPLETE_VALUE_SET_REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Iteratable Resolved Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET = 3;

	/**
	 * The feature id for the '<em><b>Resolved Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOLVED_VALUE_SET = 4;

	/**
	 * The feature id for the '<em><b>Resolved Value Set Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY = 5;

	/**
	 * The feature id for the '<em><b>Resolved Value Set Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG = 6;

	/**
	 * The feature id for the '<em><b>Resolved Value Set Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY = 7;

	/**
	 * The feature id for the '<em><b>Value Set Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_SET_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Value Set Definition Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY = 9;

	/**
	 * The feature id for the '<em><b>Value Set Definition Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Value Set Definition List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST = 11;

	/**
	 * The feature id for the '<em><b>Value Set Definition Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG = 12;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ExternalValueSetDefinitionImpl
	 * <em>External Value Set Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ExternalValueSetDefinitionImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getExternalValueSetDefinition()
	 * @generated
	 */
	int EXTERNAL_VALUE_SET_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VALUE_SET_DEFINITION__VALUE = CorePackage.OPAQUE_DATA__VALUE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VALUE_SET_DEFINITION__FORMAT = CorePackage.OPAQUE_DATA__FORMAT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VALUE_SET_DEFINITION__LANGUAGE = CorePackage.OPAQUE_DATA__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VALUE_SET_DEFINITION__SCHEMA = CorePackage.OPAQUE_DATA__SCHEMA;

	/**
	 * The number of structural features of the '<em>External Value Set Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VALUE_SET_DEFINITION_FEATURE_COUNT = CorePackage.OPAQUE_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.IteratableResolvedValueSetImpl
	 * <em>Iteratable Resolved Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.IteratableResolvedValueSetImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getIteratableResolvedValueSet()
	 * @generated
	 */
	int ITERATABLE_RESOLVED_VALUE_SET = 5;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATABLE_RESOLVED_VALUE_SET__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATABLE_RESOLVED_VALUE_SET__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATABLE_RESOLVED_VALUE_SET__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATABLE_RESOLVED_VALUE_SET__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATABLE_RESOLVED_VALUE_SET__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATABLE_RESOLVED_VALUE_SET__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATABLE_RESOLVED_VALUE_SET__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Resolution Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATABLE_RESOLVED_VALUE_SET__RESOLUTION_INFO = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATABLE_RESOLVED_VALUE_SET__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iteratable Resolved Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITERATABLE_RESOLVED_VALUE_SET_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.PropertyQueryReferenceImpl
	 * <em>Property Query Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.PropertyQueryReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getPropertyQueryReference()
	 * @generated
	 */
	int PROPERTY_QUERY_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_QUERY_REFERENCE__CODE_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_QUERY_REFERENCE__CODE_SYSTEM_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_QUERY_REFERENCE__FILTER = 2;

	/**
	 * The number of structural features of the '<em>Property Query Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_QUERY_REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetImpl <em>Resolved Value Set</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getResolvedValueSet()
	 * @generated
	 */
	int RESOLVED_VALUE_SET = 7;

	/**
	 * The feature id for the '<em><b>Resolution Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET__RESOLUTION_INFO = 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET__MEMBER = 1;

	/**
	 * The number of structural features of the '<em>Resolved Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetDirectoryImpl
	 * <em>Resolved Value Set Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetDirectoryImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getResolvedValueSetDirectory()
	 * @generated
	 */
	int RESOLVED_VALUE_SET_DIRECTORY = 8;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolved Value Set Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetSummaryImpl
	 * <em>Resolved Value Set Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetSummaryImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getResolvedValueSetSummary()
	 * @generated
	 */
	int RESOLVED_VALUE_SET_SUMMARY = 12;

	/**
	 * The feature id for the '<em><b>Resolved Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_SUMMARY__RESOLVED_HEADER = 0;

	/**
	 * The feature id for the '<em><b>Resolved Value Set URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_SUMMARY__RESOLVED_VALUE_SET_URI = 1;

	/**
	 * The number of structural features of the '<em>Resolved Value Set Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_SUMMARY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetDirectoryEntryImpl
	 * <em>Resolved Value Set Directory Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetDirectoryEntryImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getResolvedValueSetDirectoryEntry()
	 * @generated
	 */
	int RESOLVED_VALUE_SET_DIRECTORY_ENTRY = 9;

	/**
	 * The feature id for the '<em><b>Resolved Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY_ENTRY__RESOLVED_HEADER = RESOLVED_VALUE_SET_SUMMARY__RESOLVED_HEADER;

	/**
	 * The feature id for the '<em><b>Resolved Value Set URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY_ENTRY__RESOLVED_VALUE_SET_URI = RESOLVED_VALUE_SET_SUMMARY__RESOLVED_VALUE_SET_URI;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY_ENTRY__HREF = RESOLVED_VALUE_SET_SUMMARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY_ENTRY__MATCH_STRENGTH = RESOLVED_VALUE_SET_SUMMARY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY_ENTRY__RESOURCE_NAME = RESOLVED_VALUE_SET_SUMMARY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resolved Value Set Directory Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_DIRECTORY_ENTRY_FEATURE_COUNT = RESOLVED_VALUE_SET_SUMMARY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetHeaderImpl
	 * <em>Resolved Value Set Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetHeaderImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getResolvedValueSetHeader()
	 * @generated
	 */
	int RESOLVED_VALUE_SET_HEADER = 10;

	/**
	 * The feature id for the '<em><b>Resolution Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_HEADER__RESOLUTION_OF = 0;

	/**
	 * The feature id for the '<em><b>Resolved Using Code System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_HEADER__RESOLVED_USING_CODE_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Includes Resolved Value Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_HEADER__INCLUDES_RESOLVED_VALUE_SET = 2;

	/**
	 * The number of structural features of the '<em>Resolved Value Set Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_HEADER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetMsgImpl
	 * <em>Resolved Value Set Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetMsgImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getResolvedValueSetMsg()
	 * @generated
	 */
	int RESOLVED_VALUE_SET_MSG = 11;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_MSG__HEADING = CorePackage.MESSAGE__HEADING;

	/**
	 * The feature id for the '<em><b>Resolved Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_MSG__RESOLVED_VALUE_SET = CorePackage.MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolved Value Set Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLVED_VALUE_SET_MSG_FEATURE_COUNT = CorePackage.MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.SpecificEntityListImpl <em>Specific Entity List</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.SpecificEntityListImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getSpecificEntityList()
	 * @generated
	 */
	int SPECIFIC_ENTITY_LIST = 13;

	/**
	 * The feature id for the '<em><b>Referenced Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ENTITY_LIST__REFERENCED_ENTITY = 0;

	/**
	 * The number of structural features of the '<em>Specific Entity List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ENTITY_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionImpl <em>Value Set Definition</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinition()
	 * @generated
	 */
	int VALUE_SET_DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__STATUS = CorePackage.RESOURCE_VERSION_DESCRIPTION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__CHANGE_DESCRIPTION = CorePackage.RESOURCE_VERSION_DESCRIPTION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__ENTRY_STATE = CorePackage.RESOURCE_VERSION_DESCRIPTION__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__KEYWORD = CorePackage.RESOURCE_VERSION_DESCRIPTION__KEYWORD;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__RESOURCE_TYPE = CorePackage.RESOURCE_VERSION_DESCRIPTION__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__RESOURCE_SYNOPSIS = CorePackage.RESOURCE_VERSION_DESCRIPTION__RESOURCE_SYNOPSIS;

	/**
	 * The feature id for the '<em><b>Additional Documentation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__ADDITIONAL_DOCUMENTATION = CorePackage.RESOURCE_VERSION_DESCRIPTION__ADDITIONAL_DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Source And Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__SOURCE_AND_ROLE = CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_ROLE;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__RIGHTS = CorePackage.RESOURCE_VERSION_DESCRIPTION__RIGHTS;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__NOTE = CorePackage.RESOURCE_VERSION_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__PROPERTY = CorePackage.RESOURCE_VERSION_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Alternate ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__ALTERNATE_ID = CorePackage.RESOURCE_VERSION_DESCRIPTION__ALTERNATE_ID;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__SOURCE_STATEMENTS = CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__ABOUT = CorePackage.RESOURCE_VERSION_DESCRIPTION__ABOUT;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__FORMAL_NAME = CorePackage.RESOURCE_VERSION_DESCRIPTION__FORMAL_NAME;

	/**
	 * The feature id for the '<em><b>Source And Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__SOURCE_AND_NOTATION = CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__PREDECESSOR = CorePackage.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Official Resource Version Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__OFFICIAL_RESOURCE_VERSION_ID = CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RESOURCE_VERSION_ID;

	/**
	 * The feature id for the '<em><b>Official Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__OFFICIAL_RELEASE_DATE = CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RELEASE_DATE;

	/**
	 * The feature id for the '<em><b>Official Activation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__OFFICIAL_ACTIVATION_DATE = CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_ACTIVATION_DATE;

	/**
	 * The feature id for the '<em><b>Document URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__DOCUMENT_URI = CorePackage.RESOURCE_VERSION_DESCRIPTION__DOCUMENT_URI;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__STATE = CorePackage.RESOURCE_VERSION_DESCRIPTION__STATE;

	/**
	 * The feature id for the '<em><b>Defined Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__DEFINED_VALUE_SET = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__VERSION_TAG = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION__ENTRY = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value Set Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_FEATURE_COUNT = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionDirectoryImpl <em>Directory</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionDirectoryImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinitionDirectory()
	 * @generated
	 */
	int VALUE_SET_DEFINITION_DIRECTORY = 15;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionDirectoryEntryImpl
	 * <em>Directory Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionDirectoryEntryImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinitionDirectoryEntry()
	 * @generated
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_ENTRY__HREF = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_ENTRY__MATCH_STRENGTH = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_ENTRY__RESOURCE_NAME = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_ENTRY__ABOUT = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__ABOUT;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_ENTRY__FORMAL_NAME = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME;

	/**
	 * The feature id for the '<em><b>Official Resource Version Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_ENTRY__OFFICIAL_RESOURCE_VERSION_ID = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RESOURCE_VERSION_ID;

	/**
	 * The feature id for the '<em><b>Official Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_ENTRY__OFFICIAL_RELEASE_DATE = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RELEASE_DATE;

	/**
	 * The feature id for the '<em><b>Document URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_ENTRY__DOCUMENT_URI = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__DOCUMENT_URI;

	/**
	 * The feature id for the '<em><b>Defined Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_ENTRY__DEFINED_VALUE_SET = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_ENTRY__VERSION_TAG = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Directory Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_ENTRY_FEATURE_COUNT = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionEntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionEntryImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinitionEntry()
	 * @generated
	 */
	int VALUE_SET_DEFINITION_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Associated Entities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Complete Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Complete Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET = 2;

	/**
	 * The feature id for the '<em><b>External Value Set Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Property Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY = 4;

	/**
	 * The feature id for the '<em><b>Entity List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST = 5;

	/**
	 * The feature id for the '<em><b>Entry Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_ENTRY__ENTRY_ORDER = 6;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_ENTRY__OPERATOR = 7;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_ENTRY_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionListImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinitionList()
	 * @generated
	 */
	int VALUE_SET_DEFINITION_LIST = 18;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionListEntryImpl <em>List Entry</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionListEntryImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinitionListEntry()
	 * @generated
	 */
	int VALUE_SET_DEFINITION_LIST_ENTRY = 19;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST_ENTRY__HREF = CorePackage.DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST_ENTRY__MATCH_STRENGTH = CorePackage.DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST_ENTRY__RESOURCE_NAME = CorePackage.DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST_ENTRY__ENTRY = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_LIST_ENTRY_FEATURE_COUNT = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionMsgImpl <em>Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionMsgImpl
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinitionMsg()
	 * @generated
	 */
	int VALUE_SET_DEFINITION_MSG = 20;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_MSG__HEADING = CorePackage.MESSAGE__HEADING;

	/**
	 * The feature id for the '<em><b>Value Set Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_MSG__VALUE_SET_DEFINITION = CorePackage.MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_MSG_FEATURE_COUNT = CorePackage.MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll <em>Leaf Or All</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getLeafOrAll()
	 * @generated
	 */
	int LEAF_OR_ALL = 21;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.SetOperator <em>Set Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.SetOperator
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getSetOperator()
	 * @generated
	 */
	int SET_OPERATOR = 22;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure <em>Transitive Closure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getTransitiveClosure()
	 * @generated
	 */
	int TRANSITIVE_CLOSURE = 23;

	/**
	 * The meta object id for the '<em>Leaf Or All Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getLeafOrAllObject()
	 * @generated
	 */
	int LEAF_OR_ALL_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Set Operator Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.SetOperator
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getSetOperatorObject()
	 * @generated
	 */
	int SET_OPERATOR_OBJECT = 25;

	/**
	 * The meta object id for the '<em>Transitive Closure Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getTransitiveClosureObject()
	 * @generated
	 */
	int TRANSITIVE_CLOSURE_OBJECT = 26;

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference
	 * <em>Associated Entities Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Associated Entities Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference
	 * @generated
	 */
	EClass getAssociatedEntitiesReference();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getReferencedEntity <em>Referenced Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Referenced Entity</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getReferencedEntity()
	 * @see #getAssociatedEntitiesReference()
	 * @generated
	 */
	EReference getAssociatedEntitiesReference_ReferencedEntity();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getCodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getCodeSystem()
	 * @see #getAssociatedEntitiesReference()
	 * @generated
	 */
	EReference getAssociatedEntitiesReference_CodeSystem();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getCodeSystemVersion <em>Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Version</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getCodeSystemVersion()
	 * @see #getAssociatedEntitiesReference()
	 * @generated
	 */
	EReference getAssociatedEntitiesReference_CodeSystemVersion();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getPredicate()
	 * @see #getAssociatedEntitiesReference()
	 * @generated
	 */
	EReference getAssociatedEntitiesReference_Predicate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getDirection
	 * <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getDirection()
	 * @see #getAssociatedEntitiesReference()
	 * @generated
	 */
	EAttribute getAssociatedEntitiesReference_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getLeafOnly
	 * <em>Leaf Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Leaf Only</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getLeafOnly()
	 * @see #getAssociatedEntitiesReference()
	 * @generated
	 */
	EAttribute getAssociatedEntitiesReference_LeafOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getTransitivity
	 * <em>Transitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Transitivity</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getTransitivity()
	 * @see #getAssociatedEntitiesReference()
	 * @generated
	 */
	EAttribute getAssociatedEntitiesReference_Transitivity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference
	 * <em>Complete Code System Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Complete Code System Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference
	 * @generated
	 */
	EClass getCompleteCodeSystemReference();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference#getCodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference#getCodeSystem()
	 * @see #getCompleteCodeSystemReference()
	 * @generated
	 */
	EReference getCompleteCodeSystemReference_CodeSystem();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference#getCodeSystemVersion <em>Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Version</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference#getCodeSystemVersion()
	 * @see #getCompleteCodeSystemReference()
	 * @generated
	 */
	EReference getCompleteCodeSystemReference_CodeSystemVersion();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference
	 * <em>Complete Value Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Complete Value Set Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference
	 * @generated
	 */
	EClass getCompleteValueSetReference();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference#getValueSet()
	 * @see #getCompleteValueSetReference()
	 * @generated
	 */
	EReference getCompleteValueSetReference_ValueSet();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference#getValueSetDefinition <em>Value Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set Definition</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference#getValueSetDefinition()
	 * @see #getCompleteValueSetReference()
	 * @generated
	 */
	EReference getCompleteValueSetReference_ValueSetDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference#getReferenceCodeSystemVersion
	 * <em>Reference Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Reference Code System Version</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference#getReferenceCodeSystemVersion()
	 * @see #getCompleteValueSetReference()
	 * @generated
	 */
	EReference getCompleteValueSetReference_ReferenceCodeSystemVersion();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getXMLNSPrefixMap
	 * <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getXSISchemaLocation
	 * <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getIteratableResolvedValueSet <em>Iteratable Resolved Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Iteratable Resolved Value Set</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getIteratableResolvedValueSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IteratableResolvedValueSet();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSet <em>Resolved Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Resolved Value Set</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResolvedValueSet();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSetDirectory <em>Resolved Value Set Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Resolved Value Set Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSetDirectory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResolvedValueSetDirectory();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSetMsg <em>Resolved Value Set Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Resolved Value Set Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSetMsg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResolvedValueSetMsg();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSetSummary <em>Resolved Value Set Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Resolved Value Set Summary</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSetSummary()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResolvedValueSetSummary();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinition <em>Value Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set Definition</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueSetDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionDirectory <em>Value Set Definition Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set Definition Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionDirectory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueSetDefinitionDirectory();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionEntry <em>Value Set Definition Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set Definition Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueSetDefinitionEntry();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionList <em>Value Set Definition List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set Definition List</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueSetDefinitionList();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionMsg <em>Value Set Definition Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set Definition Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionMsg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueSetDefinitionMsg();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ExternalValueSetDefinition
	 * <em>External Value Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>External Value Set Definition</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ExternalValueSetDefinition
	 * @generated
	 */
	EClass getExternalValueSetDefinition();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet
	 * <em>Iteratable Resolved Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Iteratable Resolved Value Set</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet
	 * @generated
	 */
	EClass getIteratableResolvedValueSet();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet#getResolutionInfo <em>Resolution Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Resolution Info</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet#getResolutionInfo()
	 * @see #getIteratableResolvedValueSet()
	 * @generated
	 */
	EReference getIteratableResolvedValueSet_ResolutionInfo();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet#getEntry()
	 * @see #getIteratableResolvedValueSet()
	 * @generated
	 */
	EReference getIteratableResolvedValueSet_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference
	 * <em>Property Query Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Property Query Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference
	 * @generated
	 */
	EClass getPropertyQueryReference();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference#getCodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference#getCodeSystem()
	 * @see #getPropertyQueryReference()
	 * @generated
	 */
	EReference getPropertyQueryReference_CodeSystem();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference#getCodeSystemVersion <em>Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Version</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference#getCodeSystemVersion()
	 * @see #getPropertyQueryReference()
	 * @generated
	 */
	EReference getPropertyQueryReference_CodeSystemVersion();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference#getFilter()
	 * @see #getPropertyQueryReference()
	 * @generated
	 */
	EReference getPropertyQueryReference_Filter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet <em>Resolved Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resolved Value Set</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet
	 * @generated
	 */
	EClass getResolvedValueSet();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet#getResolutionInfo <em>Resolution Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Resolution Info</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet#getResolutionInfo()
	 * @see #getResolvedValueSet()
	 * @generated
	 */
	EReference getResolvedValueSet_ResolutionInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet#getMember
	 * <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet#getMember()
	 * @see #getResolvedValueSet()
	 * @generated
	 */
	EReference getResolvedValueSet_Member();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectory
	 * <em>Resolved Value Set Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resolved Value Set Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectory
	 * @generated
	 */
	EClass getResolvedValueSetDirectory();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectory#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectory#getEntry()
	 * @see #getResolvedValueSetDirectory()
	 * @generated
	 */
	EReference getResolvedValueSetDirectory_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry
	 * <em>Resolved Value Set Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resolved Value Set Directory Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry
	 * @generated
	 */
	EClass getResolvedValueSetDirectoryEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry#getHref
	 * <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry#getHref()
	 * @see #getResolvedValueSetDirectoryEntry()
	 * @generated
	 */
	EAttribute getResolvedValueSetDirectoryEntry_Href();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry#getMatchStrength <em>Match Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Match Strength</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry#getMatchStrength()
	 * @see #getResolvedValueSetDirectoryEntry()
	 * @generated
	 */
	EAttribute getResolvedValueSetDirectoryEntry_MatchStrength();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry#getResourceName()
	 * @see #getResolvedValueSetDirectoryEntry()
	 * @generated
	 */
	EAttribute getResolvedValueSetDirectoryEntry_ResourceName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader
	 * <em>Resolved Value Set Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resolved Value Set Header</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader
	 * @generated
	 */
	EClass getResolvedValueSetHeader();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader#getResolutionOf <em>Resolution Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Resolution Of</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader#getResolutionOf()
	 * @see #getResolvedValueSetHeader()
	 * @generated
	 */
	EReference getResolvedValueSetHeader_ResolutionOf();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader#getResolvedUsingCodeSystem <em>Resolved Using Code System</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Resolved Using Code System</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader#getResolvedUsingCodeSystem()
	 * @see #getResolvedValueSetHeader()
	 * @generated
	 */
	EReference getResolvedValueSetHeader_ResolvedUsingCodeSystem();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader#getIncludesResolvedValueSet
	 * <em>Includes Resolved Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Includes Resolved Value Set</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader#getIncludesResolvedValueSet()
	 * @see #getResolvedValueSetHeader()
	 * @generated
	 */
	EReference getResolvedValueSetHeader_IncludesResolvedValueSet();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg <em>Resolved Value Set Msg</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resolved Value Set Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg
	 * @generated
	 */
	EClass getResolvedValueSetMsg();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg#getResolvedValueSet <em>Resolved Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Resolved Value Set</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg#getResolvedValueSet()
	 * @see #getResolvedValueSetMsg()
	 * @generated
	 */
	EReference getResolvedValueSetMsg_ResolvedValueSet();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary
	 * <em>Resolved Value Set Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resolved Value Set Summary</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary
	 * @generated
	 */
	EClass getResolvedValueSetSummary();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary#getResolvedHeader <em>Resolved Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Resolved Header</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary#getResolvedHeader()
	 * @see #getResolvedValueSetSummary()
	 * @generated
	 */
	EReference getResolvedValueSetSummary_ResolvedHeader();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary#getResolvedValueSetURI <em>Resolved Value Set URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resolved Value Set URI</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary#getResolvedValueSetURI()
	 * @see #getResolvedValueSetSummary()
	 * @generated
	 */
	EAttribute getResolvedValueSetSummary_ResolvedValueSetURI();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList <em>Specific Entity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Specific Entity List</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList
	 * @generated
	 */
	EClass getSpecificEntityList();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList#getReferencedEntity <em>Referenced Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Referenced Entity</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList#getReferencedEntity()
	 * @see #getSpecificEntityList()
	 * @generated
	 */
	EReference getSpecificEntityList_ReferencedEntity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition <em>Value Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Value Set Definition</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition
	 * @generated
	 */
	EClass getValueSetDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition#getDefinedValueSet <em>Defined Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Defined Value Set</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition#getDefinedValueSet()
	 * @see #getValueSetDefinition()
	 * @generated
	 */
	EReference getValueSetDefinition_DefinedValueSet();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition#getVersionTag <em>Version Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Version Tag</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition#getVersionTag()
	 * @see #getValueSetDefinition()
	 * @generated
	 */
	EReference getValueSetDefinition_VersionTag();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition#getEntry()
	 * @see #getValueSetDefinition()
	 * @generated
	 */
	EReference getValueSetDefinition_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectory
	 * @generated
	 */
	EClass getValueSetDefinitionDirectory();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectory#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectory#getEntry()
	 * @see #getValueSetDefinitionDirectory()
	 * @generated
	 */
	EReference getValueSetDefinitionDirectory_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry
	 * <em>Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Directory Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry
	 * @generated
	 */
	EClass getValueSetDefinitionDirectoryEntry();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry#getDefinedValueSet <em>Defined Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Defined Value Set</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry#getDefinedValueSet()
	 * @see #getValueSetDefinitionDirectoryEntry()
	 * @generated
	 */
	EReference getValueSetDefinitionDirectoryEntry_DefinedValueSet();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry#getVersionTag <em>Version Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Version Tag</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry#getVersionTag()
	 * @see #getValueSetDefinitionDirectoryEntry()
	 * @generated
	 */
	EReference getValueSetDefinitionDirectoryEntry_VersionTag();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry
	 * @generated
	 */
	EClass getValueSetDefinitionEntry();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getAssociatedEntities <em>Associated Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Associated Entities</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getAssociatedEntities()
	 * @see #getValueSetDefinitionEntry()
	 * @generated
	 */
	EReference getValueSetDefinitionEntry_AssociatedEntities();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getCompleteCodeSystem <em>Complete Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Complete Code System</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getCompleteCodeSystem()
	 * @see #getValueSetDefinitionEntry()
	 * @generated
	 */
	EReference getValueSetDefinitionEntry_CompleteCodeSystem();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getCompleteValueSet <em>Complete Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Complete Value Set</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getCompleteValueSet()
	 * @see #getValueSetDefinitionEntry()
	 * @generated
	 */
	EReference getValueSetDefinitionEntry_CompleteValueSet();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getExternalValueSetDefinition
	 * <em>External Value Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>External Value Set Definition</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getExternalValueSetDefinition()
	 * @see #getValueSetDefinitionEntry()
	 * @generated
	 */
	EReference getValueSetDefinitionEntry_ExternalValueSetDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getPropertyQuery <em>Property Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Property Query</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getPropertyQuery()
	 * @see #getValueSetDefinitionEntry()
	 * @generated
	 */
	EReference getValueSetDefinitionEntry_PropertyQuery();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getEntityList <em>Entity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entity List</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getEntityList()
	 * @see #getValueSetDefinitionEntry()
	 * @generated
	 */
	EReference getValueSetDefinitionEntry_EntityList();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getEntryOrder
	 * <em>Entry Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Entry Order</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getEntryOrder()
	 * @see #getValueSetDefinitionEntry()
	 * @generated
	 */
	EAttribute getValueSetDefinitionEntry_EntryOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getOperator
	 * <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getOperator()
	 * @see #getValueSetDefinitionEntry()
	 * @generated
	 */
	EAttribute getValueSetDefinitionEntry_Operator();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList
	 * @generated
	 */
	EClass getValueSetDefinitionList();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList#getEntry()
	 * @see #getValueSetDefinitionList()
	 * @generated
	 */
	EReference getValueSetDefinitionList_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry <em>List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>List Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry
	 * @generated
	 */
	EClass getValueSetDefinitionListEntry();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry#getEntry()
	 * @see #getValueSetDefinitionListEntry()
	 * @generated
	 */
	EReference getValueSetDefinitionListEntry_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg
	 * @generated
	 */
	EClass getValueSetDefinitionMsg();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg#getValueSetDefinition <em>Value Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set Definition</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg#getValueSetDefinition()
	 * @see #getValueSetDefinitionMsg()
	 * @generated
	 */
	EReference getValueSetDefinitionMsg_ValueSetDefinition();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll <em>Leaf Or All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Leaf Or All</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll
	 * @generated
	 */
	EEnum getLeafOrAll();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.SetOperator <em>Set Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Set Operator</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.SetOperator
	 * @generated
	 */
	EEnum getSetOperator();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure <em>Transitive Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Transitive Closure</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure
	 * @generated
	 */
	EEnum getTransitiveClosure();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll <em>Leaf Or All Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Leaf Or All Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll
	 * @model instanceClass="org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll"
	 *        extendedMetaData="name='LeafOrAll:Object' baseType='LeafOrAll'"
	 * @generated
	 */
	EDataType getLeafOrAllObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.SetOperator <em>Set Operator Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Set Operator Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.SetOperator
	 * @model instanceClass="org.openhealthtools.mdht.cts2.valuesetdefinition.SetOperator"
	 *        extendedMetaData="name='SetOperator:Object' baseType='SetOperator'"
	 * @generated
	 */
	EDataType getSetOperatorObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure
	 * <em>Transitive Closure Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Transitive Closure Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure
	 * @model instanceClass="org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure"
	 *        extendedMetaData="name='TransitiveClosure:Object' baseType='TransitiveClosure'"
	 * @generated
	 */
	EDataType getTransitiveClosureObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValueSetDefinitionFactory getValueSetDefinitionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.AssociatedEntitiesReferenceImpl
		 * <em>Associated Entities Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.AssociatedEntitiesReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getAssociatedEntitiesReference()
		 * @generated
		 */
		EClass ASSOCIATED_ENTITIES_REFERENCE = eINSTANCE.getAssociatedEntitiesReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY = eINSTANCE.getAssociatedEntitiesReference_ReferencedEntity();

		/**
		 * The meta object literal for the '<em><b>Code System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM = eINSTANCE.getAssociatedEntitiesReference_CodeSystem();

		/**
		 * The meta object literal for the '<em><b>Code System Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION = eINSTANCE.getAssociatedEntitiesReference_CodeSystemVersion();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATED_ENTITIES_REFERENCE__PREDICATE = eINSTANCE.getAssociatedEntitiesReference_Predicate();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATED_ENTITIES_REFERENCE__DIRECTION = eINSTANCE.getAssociatedEntitiesReference_Direction();

		/**
		 * The meta object literal for the '<em><b>Leaf Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATED_ENTITIES_REFERENCE__LEAF_ONLY = eINSTANCE.getAssociatedEntitiesReference_LeafOnly();

		/**
		 * The meta object literal for the '<em><b>Transitivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATED_ENTITIES_REFERENCE__TRANSITIVITY = eINSTANCE.getAssociatedEntitiesReference_Transitivity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.CompleteCodeSystemReferenceImpl
		 * <em>Complete Code System Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.CompleteCodeSystemReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getCompleteCodeSystemReference()
		 * @generated
		 */
		EClass COMPLETE_CODE_SYSTEM_REFERENCE = eINSTANCE.getCompleteCodeSystemReference();

		/**
		 * The meta object literal for the '<em><b>Code System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM = eINSTANCE.getCompleteCodeSystemReference_CodeSystem();

		/**
		 * The meta object literal for the '<em><b>Code System Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM_VERSION = eINSTANCE.getCompleteCodeSystemReference_CodeSystemVersion();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.CompleteValueSetReferenceImpl
		 * <em>Complete Value Set Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.CompleteValueSetReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getCompleteValueSetReference()
		 * @generated
		 */
		EClass COMPLETE_VALUE_SET_REFERENCE = eINSTANCE.getCompleteValueSetReference();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPLETE_VALUE_SET_REFERENCE__VALUE_SET = eINSTANCE.getCompleteValueSetReference_ValueSet();

		/**
		 * The meta object literal for the '<em><b>Value Set Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPLETE_VALUE_SET_REFERENCE__VALUE_SET_DEFINITION = eINSTANCE.getCompleteValueSetReference_ValueSetDefinition();

		/**
		 * The meta object literal for the '<em><b>Reference Code System Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPLETE_VALUE_SET_REFERENCE__REFERENCE_CODE_SYSTEM_VERSION = eINSTANCE.getCompleteValueSetReference_ReferenceCodeSystemVersion();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl <em>Document Root</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Iteratable Resolved Value Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET = eINSTANCE.getDocumentRoot_IteratableResolvedValueSet();

		/**
		 * The meta object literal for the '<em><b>Resolved Value Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESOLVED_VALUE_SET = eINSTANCE.getDocumentRoot_ResolvedValueSet();

		/**
		 * The meta object literal for the '<em><b>Resolved Value Set Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY = eINSTANCE.getDocumentRoot_ResolvedValueSetDirectory();

		/**
		 * The meta object literal for the '<em><b>Resolved Value Set Msg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG = eINSTANCE.getDocumentRoot_ResolvedValueSetMsg();

		/**
		 * The meta object literal for the '<em><b>Resolved Value Set Summary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY = eINSTANCE.getDocumentRoot_ResolvedValueSetSummary();

		/**
		 * The meta object literal for the '<em><b>Value Set Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE_SET_DEFINITION = eINSTANCE.getDocumentRoot_ValueSetDefinition();

		/**
		 * The meta object literal for the '<em><b>Value Set Definition Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY = eINSTANCE.getDocumentRoot_ValueSetDefinitionDirectory();

		/**
		 * The meta object literal for the '<em><b>Value Set Definition Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY = eINSTANCE.getDocumentRoot_ValueSetDefinitionEntry();

		/**
		 * The meta object literal for the '<em><b>Value Set Definition List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST = eINSTANCE.getDocumentRoot_ValueSetDefinitionList();

		/**
		 * The meta object literal for the '<em><b>Value Set Definition Msg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG = eINSTANCE.getDocumentRoot_ValueSetDefinitionMsg();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ExternalValueSetDefinitionImpl
		 * <em>External Value Set Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ExternalValueSetDefinitionImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getExternalValueSetDefinition()
		 * @generated
		 */
		EClass EXTERNAL_VALUE_SET_DEFINITION = eINSTANCE.getExternalValueSetDefinition();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.IteratableResolvedValueSetImpl
		 * <em>Iteratable Resolved Value Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.IteratableResolvedValueSetImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getIteratableResolvedValueSet()
		 * @generated
		 */
		EClass ITERATABLE_RESOLVED_VALUE_SET = eINSTANCE.getIteratableResolvedValueSet();

		/**
		 * The meta object literal for the '<em><b>Resolution Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ITERATABLE_RESOLVED_VALUE_SET__RESOLUTION_INFO = eINSTANCE.getIteratableResolvedValueSet_ResolutionInfo();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ITERATABLE_RESOLVED_VALUE_SET__ENTRY = eINSTANCE.getIteratableResolvedValueSet_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.PropertyQueryReferenceImpl
		 * <em>Property Query Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.PropertyQueryReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getPropertyQueryReference()
		 * @generated
		 */
		EClass PROPERTY_QUERY_REFERENCE = eINSTANCE.getPropertyQueryReference();

		/**
		 * The meta object literal for the '<em><b>Code System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPERTY_QUERY_REFERENCE__CODE_SYSTEM = eINSTANCE.getPropertyQueryReference_CodeSystem();

		/**
		 * The meta object literal for the '<em><b>Code System Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPERTY_QUERY_REFERENCE__CODE_SYSTEM_VERSION = eINSTANCE.getPropertyQueryReference_CodeSystemVersion();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPERTY_QUERY_REFERENCE__FILTER = eINSTANCE.getPropertyQueryReference_Filter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetImpl
		 * <em>Resolved Value Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getResolvedValueSet()
		 * @generated
		 */
		EClass RESOLVED_VALUE_SET = eINSTANCE.getResolvedValueSet();

		/**
		 * The meta object literal for the '<em><b>Resolution Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOLVED_VALUE_SET__RESOLUTION_INFO = eINSTANCE.getResolvedValueSet_ResolutionInfo();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOLVED_VALUE_SET__MEMBER = eINSTANCE.getResolvedValueSet_Member();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetDirectoryImpl
		 * <em>Resolved Value Set Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetDirectoryImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getResolvedValueSetDirectory()
		 * @generated
		 */
		EClass RESOLVED_VALUE_SET_DIRECTORY = eINSTANCE.getResolvedValueSetDirectory();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOLVED_VALUE_SET_DIRECTORY__ENTRY = eINSTANCE.getResolvedValueSetDirectory_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetDirectoryEntryImpl
		 * <em>Resolved Value Set Directory Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetDirectoryEntryImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getResolvedValueSetDirectoryEntry()
		 * @generated
		 */
		EClass RESOLVED_VALUE_SET_DIRECTORY_ENTRY = eINSTANCE.getResolvedValueSetDirectoryEntry();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOLVED_VALUE_SET_DIRECTORY_ENTRY__HREF = eINSTANCE.getResolvedValueSetDirectoryEntry_Href();

		/**
		 * The meta object literal for the '<em><b>Match Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOLVED_VALUE_SET_DIRECTORY_ENTRY__MATCH_STRENGTH = eINSTANCE.getResolvedValueSetDirectoryEntry_MatchStrength();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOLVED_VALUE_SET_DIRECTORY_ENTRY__RESOURCE_NAME = eINSTANCE.getResolvedValueSetDirectoryEntry_ResourceName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetHeaderImpl
		 * <em>Resolved Value Set Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetHeaderImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getResolvedValueSetHeader()
		 * @generated
		 */
		EClass RESOLVED_VALUE_SET_HEADER = eINSTANCE.getResolvedValueSetHeader();

		/**
		 * The meta object literal for the '<em><b>Resolution Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOLVED_VALUE_SET_HEADER__RESOLUTION_OF = eINSTANCE.getResolvedValueSetHeader_ResolutionOf();

		/**
		 * The meta object literal for the '<em><b>Resolved Using Code System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOLVED_VALUE_SET_HEADER__RESOLVED_USING_CODE_SYSTEM = eINSTANCE.getResolvedValueSetHeader_ResolvedUsingCodeSystem();

		/**
		 * The meta object literal for the '<em><b>Includes Resolved Value Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOLVED_VALUE_SET_HEADER__INCLUDES_RESOLVED_VALUE_SET = eINSTANCE.getResolvedValueSetHeader_IncludesResolvedValueSet();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetMsgImpl
		 * <em>Resolved Value Set Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetMsgImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getResolvedValueSetMsg()
		 * @generated
		 */
		EClass RESOLVED_VALUE_SET_MSG = eINSTANCE.getResolvedValueSetMsg();

		/**
		 * The meta object literal for the '<em><b>Resolved Value Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOLVED_VALUE_SET_MSG__RESOLVED_VALUE_SET = eINSTANCE.getResolvedValueSetMsg_ResolvedValueSet();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetSummaryImpl
		 * <em>Resolved Value Set Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetSummaryImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getResolvedValueSetSummary()
		 * @generated
		 */
		EClass RESOLVED_VALUE_SET_SUMMARY = eINSTANCE.getResolvedValueSetSummary();

		/**
		 * The meta object literal for the '<em><b>Resolved Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOLVED_VALUE_SET_SUMMARY__RESOLVED_HEADER = eINSTANCE.getResolvedValueSetSummary_ResolvedHeader();

		/**
		 * The meta object literal for the '<em><b>Resolved Value Set URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOLVED_VALUE_SET_SUMMARY__RESOLVED_VALUE_SET_URI = eINSTANCE.getResolvedValueSetSummary_ResolvedValueSetURI();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.SpecificEntityListImpl
		 * <em>Specific Entity List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.SpecificEntityListImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getSpecificEntityList()
		 * @generated
		 */
		EClass SPECIFIC_ENTITY_LIST = eINSTANCE.getSpecificEntityList();

		/**
		 * The meta object literal for the '<em><b>Referenced Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SPECIFIC_ENTITY_LIST__REFERENCED_ENTITY = eINSTANCE.getSpecificEntityList_ReferencedEntity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionImpl
		 * <em>Value Set Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinition()
		 * @generated
		 */
		EClass VALUE_SET_DEFINITION = eINSTANCE.getValueSetDefinition();

		/**
		 * The meta object literal for the '<em><b>Defined Value Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION__DEFINED_VALUE_SET = eINSTANCE.getValueSetDefinition_DefinedValueSet();

		/**
		 * The meta object literal for the '<em><b>Version Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION__VERSION_TAG = eINSTANCE.getValueSetDefinition_VersionTag();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION__ENTRY = eINSTANCE.getValueSetDefinition_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionDirectoryImpl
		 * <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionDirectoryImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinitionDirectory()
		 * @generated
		 */
		EClass VALUE_SET_DEFINITION_DIRECTORY = eINSTANCE.getValueSetDefinitionDirectory();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_DIRECTORY__ENTRY = eINSTANCE.getValueSetDefinitionDirectory_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionDirectoryEntryImpl
		 * <em>Directory Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionDirectoryEntryImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinitionDirectoryEntry()
		 * @generated
		 */
		EClass VALUE_SET_DEFINITION_DIRECTORY_ENTRY = eINSTANCE.getValueSetDefinitionDirectoryEntry();

		/**
		 * The meta object literal for the '<em><b>Defined Value Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_DIRECTORY_ENTRY__DEFINED_VALUE_SET = eINSTANCE.getValueSetDefinitionDirectoryEntry_DefinedValueSet();

		/**
		 * The meta object literal for the '<em><b>Version Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_DIRECTORY_ENTRY__VERSION_TAG = eINSTANCE.getValueSetDefinitionDirectoryEntry_VersionTag();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionEntryImpl <em>Entry</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionEntryImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinitionEntry()
		 * @generated
		 */
		EClass VALUE_SET_DEFINITION_ENTRY = eINSTANCE.getValueSetDefinitionEntry();

		/**
		 * The meta object literal for the '<em><b>Associated Entities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES = eINSTANCE.getValueSetDefinitionEntry_AssociatedEntities();

		/**
		 * The meta object literal for the '<em><b>Complete Code System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM = eINSTANCE.getValueSetDefinitionEntry_CompleteCodeSystem();

		/**
		 * The meta object literal for the '<em><b>Complete Value Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET = eINSTANCE.getValueSetDefinitionEntry_CompleteValueSet();

		/**
		 * The meta object literal for the '<em><b>External Value Set Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION = eINSTANCE.getValueSetDefinitionEntry_ExternalValueSetDefinition();

		/**
		 * The meta object literal for the '<em><b>Property Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY = eINSTANCE.getValueSetDefinitionEntry_PropertyQuery();

		/**
		 * The meta object literal for the '<em><b>Entity List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST = eINSTANCE.getValueSetDefinitionEntry_EntityList();

		/**
		 * The meta object literal for the '<em><b>Entry Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALUE_SET_DEFINITION_ENTRY__ENTRY_ORDER = eINSTANCE.getValueSetDefinitionEntry_EntryOrder();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALUE_SET_DEFINITION_ENTRY__OPERATOR = eINSTANCE.getValueSetDefinitionEntry_Operator();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionListImpl <em>List</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionListImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinitionList()
		 * @generated
		 */
		EClass VALUE_SET_DEFINITION_LIST = eINSTANCE.getValueSetDefinitionList();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_LIST__ENTRY = eINSTANCE.getValueSetDefinitionList_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionListEntryImpl
		 * <em>List Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionListEntryImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinitionListEntry()
		 * @generated
		 */
		EClass VALUE_SET_DEFINITION_LIST_ENTRY = eINSTANCE.getValueSetDefinitionListEntry();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_LIST_ENTRY__ENTRY = eINSTANCE.getValueSetDefinitionListEntry_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionMsgImpl <em>Msg</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionMsgImpl
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getValueSetDefinitionMsg()
		 * @generated
		 */
		EClass VALUE_SET_DEFINITION_MSG = eINSTANCE.getValueSetDefinitionMsg();

		/**
		 * The meta object literal for the '<em><b>Value Set Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_MSG__VALUE_SET_DEFINITION = eINSTANCE.getValueSetDefinitionMsg_ValueSetDefinition();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll <em>Leaf Or All</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getLeafOrAll()
		 * @generated
		 */
		EEnum LEAF_OR_ALL = eINSTANCE.getLeafOrAll();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.SetOperator <em>Set Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.SetOperator
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getSetOperator()
		 * @generated
		 */
		EEnum SET_OPERATOR = eINSTANCE.getSetOperator();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure <em>Transitive Closure</em>}'
		 * enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getTransitiveClosure()
		 * @generated
		 */
		EEnum TRANSITIVE_CLOSURE = eINSTANCE.getTransitiveClosure();

		/**
		 * The meta object literal for the '<em>Leaf Or All Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getLeafOrAllObject()
		 * @generated
		 */
		EDataType LEAF_OR_ALL_OBJECT = eINSTANCE.getLeafOrAllObject();

		/**
		 * The meta object literal for the '<em>Set Operator Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.SetOperator
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getSetOperatorObject()
		 * @generated
		 */
		EDataType SET_OPERATOR_OBJECT = eINSTANCE.getSetOperatorObject();

		/**
		 * The meta object literal for the '<em>Transitive Closure Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure
		 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl#getTransitiveClosureObject()
		 * @generated
		 */
		EDataType TRANSITIVE_CLOSURE_OBJECT = eINSTANCE.getTransitiveClosureObject();

	}

} // ValueSetDefinitionPackage
