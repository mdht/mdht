/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valueset;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetFactory
 * @model kind="package"
 * @generated
 */
public interface ValueSetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "valueset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/CTS2/1.0/ValueSet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "valueset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ValueSetPackage eINSTANCE = org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.DocumentRootImpl
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>Value Set Catalog Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Value Set Catalog Entry Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_DIRECTORY = 4;

	/**
	 * The feature id for the '<em><b>Value Set Catalog Entry List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_LIST = 5;

	/**
	 * The feature id for the '<em><b>Value Set Catalog Entry Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_MSG = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryImpl <em>Catalog Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryImpl
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getValueSetCatalogEntry()
	 * @generated
	 */
	int VALUE_SET_CATALOG_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__STATUS = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__CHANGE_DESCRIPTION = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__ENTRY_STATE = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__KEYWORD = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__KEYWORD;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__RESOURCE_TYPE = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__RESOURCE_SYNOPSIS = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS;

	/**
	 * The feature id for the '<em><b>Additional Documentation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__ADDITIONAL_DOCUMENTATION = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Source And Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__SOURCE_AND_ROLE = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__SOURCE_AND_ROLE;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__RIGHTS = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RIGHTS;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__NOTE = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__PROPERTY = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Alternate ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__ALTERNATE_ID = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__ALTERNATE_ID;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__SOURCE_STATEMENTS = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__ABOUT = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__ABOUT;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__FORMAL_NAME = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__FORMAL_NAME;

	/**
	 * The feature id for the '<em><b>Release Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__RELEASE_DOCUMENTATION = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Release Format</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__RELEASE_FORMAT = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__DEFINITIONS = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__CURRENT_DEFINITION = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY__VALUE_SET_NAME = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Catalog Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_FEATURE_COUNT = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryDirectoryImpl
	 * <em>Catalog Entry Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryDirectoryImpl
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getValueSetCatalogEntryDirectory()
	 * @generated
	 */
	int VALUE_SET_CATALOG_ENTRY_DIRECTORY = 2;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_DIRECTORY__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_DIRECTORY__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_DIRECTORY__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_DIRECTORY__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_DIRECTORY__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_DIRECTORY__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_DIRECTORY__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_DIRECTORY__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Entry Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_DIRECTORY_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryListImpl <em>Catalog Entry List</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryListImpl
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getValueSetCatalogEntryList()
	 * @generated
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST = 3;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Entry List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryListEntryImpl
	 * <em>Catalog Entry List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryListEntryImpl
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getValueSetCatalogEntryListEntry()
	 * @generated
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST_ENTRY__HREF = CorePackage.DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST_ENTRY__MATCH_STRENGTH = CorePackage.DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST_ENTRY__RESOURCE_NAME = CorePackage.DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST_ENTRY__ENTRY = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Entry List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_LIST_ENTRY_FEATURE_COUNT = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryMsgImpl <em>Catalog Entry Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryMsgImpl
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getValueSetCatalogEntryMsg()
	 * @generated
	 */
	int VALUE_SET_CATALOG_ENTRY_MSG = 5;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_MSG__HEADING = CorePackage.MESSAGE__HEADING;

	/**
	 * The feature id for the '<em><b>Value Set Catalog Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_MSG__VALUE_SET_CATALOG_ENTRY = CorePackage.MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Entry Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_MSG_FEATURE_COUNT = CorePackage.MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntrySummaryImpl <em>Catalog Entry Summary</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntrySummaryImpl
	 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getValueSetCatalogEntrySummary()
	 * @generated
	 */
	int VALUE_SET_CATALOG_ENTRY_SUMMARY = 6;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_SUMMARY__HREF = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_SUMMARY__MATCH_STRENGTH = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_SUMMARY__RESOURCE_NAME = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_SUMMARY__RESOURCE_SYNOPSIS = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_SUMMARY__ABOUT = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__ABOUT;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_SUMMARY__FORMAL_NAME = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME;

	/**
	 * The feature id for the '<em><b>Current Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_SUMMARY__CURRENT_DEFINITION = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_SUMMARY__VALUE_SET_NAME = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Catalog Entry Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CATALOG_ENTRY_SUMMARY_FEATURE_COUNT = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getXSISchemaLocation
	 * <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntry
	 * <em>Value Set Catalog Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set Catalog Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueSetCatalogEntry();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntryDirectory <em>Value Set Catalog Entry Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set Catalog Entry Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntryDirectory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueSetCatalogEntryDirectory();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntryList
	 * <em>Value Set Catalog Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set Catalog Entry List</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntryList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueSetCatalogEntryList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntryMsg
	 * <em>Value Set Catalog Entry Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set Catalog Entry Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntryMsg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueSetCatalogEntryMsg();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry <em>Catalog Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry
	 * @generated
	 */
	EClass getValueSetCatalogEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry#getDefinitions
	 * <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Definitions</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry#getDefinitions()
	 * @see #getValueSetCatalogEntry()
	 * @generated
	 */
	EAttribute getValueSetCatalogEntry_Definitions();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry#getCurrentDefinition
	 * <em>Current Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Current Definition</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry#getCurrentDefinition()
	 * @see #getValueSetCatalogEntry()
	 * @generated
	 */
	EReference getValueSetCatalogEntry_CurrentDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry#getValueSetName
	 * <em>Value Set Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value Set Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry#getValueSetName()
	 * @see #getValueSetCatalogEntry()
	 * @generated
	 */
	EAttribute getValueSetCatalogEntry_ValueSetName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryDirectory
	 * <em>Catalog Entry Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryDirectory
	 * @generated
	 */
	EClass getValueSetCatalogEntryDirectory();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryDirectory#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryDirectory#getEntry()
	 * @see #getValueSetCatalogEntryDirectory()
	 * @generated
	 */
	EReference getValueSetCatalogEntryDirectory_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryList <em>Catalog Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry List</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryList
	 * @generated
	 */
	EClass getValueSetCatalogEntryList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryList#getEntry
	 * <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryList#getEntry()
	 * @see #getValueSetCatalogEntryList()
	 * @generated
	 */
	EReference getValueSetCatalogEntryList_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryListEntry
	 * <em>Catalog Entry List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry List Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryListEntry
	 * @generated
	 */
	EClass getValueSetCatalogEntryListEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryListEntry#getEntry
	 * <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryListEntry#getEntry()
	 * @see #getValueSetCatalogEntryListEntry()
	 * @generated
	 */
	EReference getValueSetCatalogEntryListEntry_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryMsg <em>Catalog Entry Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryMsg
	 * @generated
	 */
	EClass getValueSetCatalogEntryMsg();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryMsg#getValueSetCatalogEntry <em>Value Set Catalog Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set Catalog Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryMsg#getValueSetCatalogEntry()
	 * @see #getValueSetCatalogEntryMsg()
	 * @generated
	 */
	EReference getValueSetCatalogEntryMsg_ValueSetCatalogEntry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary <em>Catalog Entry Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry Summary</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary
	 * @generated
	 */
	EClass getValueSetCatalogEntrySummary();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary#getCurrentDefinition <em>Current Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Current Definition</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary#getCurrentDefinition()
	 * @see #getValueSetCatalogEntrySummary()
	 * @generated
	 */
	EReference getValueSetCatalogEntrySummary_CurrentDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary#getValueSetName
	 * <em>Value Set Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value Set Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary#getValueSetName()
	 * @see #getValueSetCatalogEntrySummary()
	 * @generated
	 */
	EAttribute getValueSetCatalogEntrySummary_ValueSetName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValueSetFactory getValueSetFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.DocumentRootImpl
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Value Set Catalog Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY = eINSTANCE.getDocumentRoot_ValueSetCatalogEntry();

		/**
		 * The meta object literal for the '<em><b>Value Set Catalog Entry Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_DIRECTORY = eINSTANCE.getDocumentRoot_ValueSetCatalogEntryDirectory();

		/**
		 * The meta object literal for the '<em><b>Value Set Catalog Entry List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_LIST = eINSTANCE.getDocumentRoot_ValueSetCatalogEntryList();

		/**
		 * The meta object literal for the '<em><b>Value Set Catalog Entry Msg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_MSG = eINSTANCE.getDocumentRoot_ValueSetCatalogEntryMsg();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryImpl <em>Catalog Entry</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryImpl
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getValueSetCatalogEntry()
		 * @generated
		 */
		EClass VALUE_SET_CATALOG_ENTRY = eINSTANCE.getValueSetCatalogEntry();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALUE_SET_CATALOG_ENTRY__DEFINITIONS = eINSTANCE.getValueSetCatalogEntry_Definitions();

		/**
		 * The meta object literal for the '<em><b>Current Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_CATALOG_ENTRY__CURRENT_DEFINITION = eINSTANCE.getValueSetCatalogEntry_CurrentDefinition();

		/**
		 * The meta object literal for the '<em><b>Value Set Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALUE_SET_CATALOG_ENTRY__VALUE_SET_NAME = eINSTANCE.getValueSetCatalogEntry_ValueSetName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryDirectoryImpl
		 * <em>Catalog Entry Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryDirectoryImpl
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getValueSetCatalogEntryDirectory()
		 * @generated
		 */
		EClass VALUE_SET_CATALOG_ENTRY_DIRECTORY = eINSTANCE.getValueSetCatalogEntryDirectory();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_CATALOG_ENTRY_DIRECTORY__ENTRY = eINSTANCE.getValueSetCatalogEntryDirectory_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryListImpl
		 * <em>Catalog Entry List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryListImpl
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getValueSetCatalogEntryList()
		 * @generated
		 */
		EClass VALUE_SET_CATALOG_ENTRY_LIST = eINSTANCE.getValueSetCatalogEntryList();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_CATALOG_ENTRY_LIST__ENTRY = eINSTANCE.getValueSetCatalogEntryList_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryListEntryImpl
		 * <em>Catalog Entry List Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryListEntryImpl
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getValueSetCatalogEntryListEntry()
		 * @generated
		 */
		EClass VALUE_SET_CATALOG_ENTRY_LIST_ENTRY = eINSTANCE.getValueSetCatalogEntryListEntry();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_CATALOG_ENTRY_LIST_ENTRY__ENTRY = eINSTANCE.getValueSetCatalogEntryListEntry_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryMsgImpl <em>Catalog Entry Msg</em>}
		 * ' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryMsgImpl
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getValueSetCatalogEntryMsg()
		 * @generated
		 */
		EClass VALUE_SET_CATALOG_ENTRY_MSG = eINSTANCE.getValueSetCatalogEntryMsg();

		/**
		 * The meta object literal for the '<em><b>Value Set Catalog Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_CATALOG_ENTRY_MSG__VALUE_SET_CATALOG_ENTRY = eINSTANCE.getValueSetCatalogEntryMsg_ValueSetCatalogEntry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntrySummaryImpl
		 * <em>Catalog Entry Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntrySummaryImpl
		 * @see org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl#getValueSetCatalogEntrySummary()
		 * @generated
		 */
		EClass VALUE_SET_CATALOG_ENTRY_SUMMARY = eINSTANCE.getValueSetCatalogEntrySummary();

		/**
		 * The meta object literal for the '<em><b>Current Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_CATALOG_ENTRY_SUMMARY__CURRENT_DEFINITION = eINSTANCE.getValueSetCatalogEntrySummary_CurrentDefinition();

		/**
		 * The meta object literal for the '<em><b>Value Set Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALUE_SET_CATALOG_ENTRY_SUMMARY__VALUE_SET_NAME = eINSTANCE.getValueSetCatalogEntrySummary_ValueSetName();

	}

} // ValueSetPackage
