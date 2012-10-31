/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystem;

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
 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemFactory
 * @model kind="package"
 * @generated
 */
public interface CodeSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "codesystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/CTS2/1.0/CodeSystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "codesystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	CodeSystemPackage eINSTANCE = org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryImpl <em>Catalog Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryImpl
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getCodeSystemCatalogEntry()
	 * @generated
	 */
	int CODE_SYSTEM_CATALOG_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__STATUS = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__CHANGE_DESCRIPTION = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__ENTRY_STATE = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__KEYWORD = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__KEYWORD;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__RESOURCE_TYPE = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__RESOURCE_SYNOPSIS = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS;

	/**
	 * The feature id for the '<em><b>Additional Documentation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__ADDITIONAL_DOCUMENTATION = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Source And Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__SOURCE_AND_ROLE = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__SOURCE_AND_ROLE;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__RIGHTS = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RIGHTS;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__NOTE = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__PROPERTY = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Alternate ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__ALTERNATE_ID = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__ALTERNATE_ID;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__SOURCE_STATEMENTS = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__ABOUT = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__ABOUT;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__FORMAL_NAME = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__FORMAL_NAME;

	/**
	 * The feature id for the '<em><b>Release Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__RELEASE_DOCUMENTATION = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Release Format</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__RELEASE_FORMAT = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT;

	/**
	 * The feature id for the '<em><b>Code System Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ontology Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ontology Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Designed For Ontology Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__DESIGNED_FOR_ONTOLOGY_TASK = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__VERSIONS = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Used Ontology Engineering Tool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__USED_ONTOLOGY_ENGINEERING_TOOL = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_NAME = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Catalog Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_FEATURE_COUNT = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryDirectoryImpl
	 * <em>Catalog Entry Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryDirectoryImpl
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getCodeSystemCatalogEntryDirectory()
	 * @generated
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Entry Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryListImpl <em>Catalog Entry List</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryListImpl
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getCodeSystemCatalogEntryList()
	 * @generated
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST = 2;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Entry List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryListEntryImpl
	 * <em>Catalog Entry List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryListEntryImpl
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getCodeSystemCatalogEntryListEntry()
	 * @generated
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST_ENTRY__HREF = CorePackage.DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST_ENTRY__MATCH_STRENGTH = CorePackage.DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST_ENTRY__RESOURCE_NAME = CorePackage.DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST_ENTRY__ENTRY = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Entry List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_LIST_ENTRY_FEATURE_COUNT = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryMsgImpl <em>Catalog Entry Msg</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryMsgImpl
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getCodeSystemCatalogEntryMsg()
	 * @generated
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_MSG = 4;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_MSG__HEADING = CorePackage.MESSAGE__HEADING;

	/**
	 * The feature id for the '<em><b>Code System Catalog Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_MSG__CODE_SYSTEM_CATALOG_ENTRY = CorePackage.MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Entry Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_MSG_FEATURE_COUNT = CorePackage.MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntrySummaryImpl
	 * <em>Catalog Entry Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntrySummaryImpl
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getCodeSystemCatalogEntrySummary()
	 * @generated
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_SUMMARY = 5;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__HREF = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__MATCH_STRENGTH = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__RESOURCE_NAME = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__RESOURCE_SYNOPSIS = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__ABOUT = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__ABOUT;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__FORMAL_NAME = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__VERSIONS = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CURRENT_VERSION = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_NAME = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Catalog Entry Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_SUMMARY_FEATURE_COUNT = CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.DocumentRootImpl
	 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

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
	 * The feature id for the '<em><b>Code System Catalog Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Code System Catalog Entry Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY = 4;

	/**
	 * The feature id for the '<em><b>Code System Catalog Entry List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_LIST = 5;

	/**
	 * The feature id for the '<em><b>Code System Catalog Entry Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_MSG = 6;

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry <em>Catalog Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry
	 * @generated
	 */
	EClass getCodeSystemCatalogEntry();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getCodeSystemCategory <em>Code System Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Category</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getCodeSystemCategory()
	 * @see #getCodeSystemCatalogEntry()
	 * @generated
	 */
	EReference getCodeSystemCatalogEntry_CodeSystemCategory();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getOntologyDomain <em>Ontology Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Ontology Domain</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getOntologyDomain()
	 * @see #getCodeSystemCatalogEntry()
	 * @generated
	 */
	EReference getCodeSystemCatalogEntry_OntologyDomain();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getOntologyType
	 * <em>Ontology Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Ontology Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getOntologyType()
	 * @see #getCodeSystemCatalogEntry()
	 * @generated
	 */
	EReference getCodeSystemCatalogEntry_OntologyType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getDesignedForOntologyTask <em>Designed For Ontology Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Designed For Ontology Task</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getDesignedForOntologyTask()
	 * @see #getCodeSystemCatalogEntry()
	 * @generated
	 */
	EReference getCodeSystemCatalogEntry_DesignedForOntologyTask();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getVersions
	 * <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Versions</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getVersions()
	 * @see #getCodeSystemCatalogEntry()
	 * @generated
	 */
	EAttribute getCodeSystemCatalogEntry_Versions();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getCurrentVersion <em>Current Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Current Version</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getCurrentVersion()
	 * @see #getCodeSystemCatalogEntry()
	 * @generated
	 */
	EReference getCodeSystemCatalogEntry_CurrentVersion();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getUsedOntologyEngineeringTool <em>Used Ontology Engineering Tool</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Used Ontology Engineering Tool</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getUsedOntologyEngineeringTool()
	 * @see #getCodeSystemCatalogEntry()
	 * @generated
	 */
	EReference getCodeSystemCatalogEntry_UsedOntologyEngineeringTool();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getCodeSystemName
	 * <em>Code System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Code System Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getCodeSystemName()
	 * @see #getCodeSystemCatalogEntry()
	 * @generated
	 */
	EAttribute getCodeSystemCatalogEntry_CodeSystemName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryDirectory
	 * <em>Catalog Entry Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryDirectory
	 * @generated
	 */
	EClass getCodeSystemCatalogEntryDirectory();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryDirectory#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryDirectory#getEntry()
	 * @see #getCodeSystemCatalogEntryDirectory()
	 * @generated
	 */
	EReference getCodeSystemCatalogEntryDirectory_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryList <em>Catalog Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry List</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryList
	 * @generated
	 */
	EClass getCodeSystemCatalogEntryList();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryList#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryList#getEntry()
	 * @see #getCodeSystemCatalogEntryList()
	 * @generated
	 */
	EReference getCodeSystemCatalogEntryList_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryListEntry
	 * <em>Catalog Entry List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry List Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryListEntry
	 * @generated
	 */
	EClass getCodeSystemCatalogEntryListEntry();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryListEntry#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryListEntry#getEntry()
	 * @see #getCodeSystemCatalogEntryListEntry()
	 * @generated
	 */
	EReference getCodeSystemCatalogEntryListEntry_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryMsg <em>Catalog Entry Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryMsg
	 * @generated
	 */
	EClass getCodeSystemCatalogEntryMsg();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryMsg#getCodeSystemCatalogEntry <em>Code System Catalog Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Catalog Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryMsg#getCodeSystemCatalogEntry()
	 * @see #getCodeSystemCatalogEntryMsg()
	 * @generated
	 */
	EReference getCodeSystemCatalogEntryMsg_CodeSystemCatalogEntry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary
	 * <em>Catalog Entry Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry Summary</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary
	 * @generated
	 */
	EClass getCodeSystemCatalogEntrySummary();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary#getVersions
	 * <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Versions</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary#getVersions()
	 * @see #getCodeSystemCatalogEntrySummary()
	 * @generated
	 */
	EAttribute getCodeSystemCatalogEntrySummary_Versions();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary#getCurrentVersion <em>Current Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Current Version</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary#getCurrentVersion()
	 * @see #getCodeSystemCatalogEntrySummary()
	 * @generated
	 */
	EReference getCodeSystemCatalogEntrySummary_CurrentVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary#getCodeSystemName
	 * <em>Code System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Code System Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary#getCodeSystemName()
	 * @see #getCodeSystemCatalogEntrySummary()
	 * @generated
	 */
	EAttribute getCodeSystemCatalogEntrySummary_CodeSystemName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getXSISchemaLocation
	 * <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntry
	 * <em>Code System Catalog Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Catalog Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CodeSystemCatalogEntry();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntryDirectory <em>Code System Catalog Entry Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Catalog Entry Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntryDirectory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CodeSystemCatalogEntryDirectory();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntryList <em>Code System Catalog Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Catalog Entry List</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntryList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CodeSystemCatalogEntryList();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntryMsg <em>Code System Catalog Entry Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Catalog Entry Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntryMsg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CodeSystemCatalogEntryMsg();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeSystemFactory getCodeSystemFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryImpl <em>Catalog Entry</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryImpl
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getCodeSystemCatalogEntry()
		 * @generated
		 */
		EClass CODE_SYSTEM_CATALOG_ENTRY = eINSTANCE.getCodeSystemCatalogEntry();

		/**
		 * The meta object literal for the '<em><b>Code System Category</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY = eINSTANCE.getCodeSystemCatalogEntry_CodeSystemCategory();

		/**
		 * The meta object literal for the '<em><b>Ontology Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN = eINSTANCE.getCodeSystemCatalogEntry_OntologyDomain();

		/**
		 * The meta object literal for the '<em><b>Ontology Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE = eINSTANCE.getCodeSystemCatalogEntry_OntologyType();

		/**
		 * The meta object literal for the '<em><b>Designed For Ontology Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_CATALOG_ENTRY__DESIGNED_FOR_ONTOLOGY_TASK = eINSTANCE.getCodeSystemCatalogEntry_DesignedForOntologyTask();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_SYSTEM_CATALOG_ENTRY__VERSIONS = eINSTANCE.getCodeSystemCatalogEntry_Versions();

		/**
		 * The meta object literal for the '<em><b>Current Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION = eINSTANCE.getCodeSystemCatalogEntry_CurrentVersion();

		/**
		 * The meta object literal for the '<em><b>Used Ontology Engineering Tool</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_CATALOG_ENTRY__USED_ONTOLOGY_ENGINEERING_TOOL = eINSTANCE.getCodeSystemCatalogEntry_UsedOntologyEngineeringTool();

		/**
		 * The meta object literal for the '<em><b>Code System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_NAME = eINSTANCE.getCodeSystemCatalogEntry_CodeSystemName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryDirectoryImpl
		 * <em>Catalog Entry Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryDirectoryImpl
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getCodeSystemCatalogEntryDirectory()
		 * @generated
		 */
		EClass CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY = eINSTANCE.getCodeSystemCatalogEntryDirectory();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY__ENTRY = eINSTANCE.getCodeSystemCatalogEntryDirectory_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryListImpl
		 * <em>Catalog Entry List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryListImpl
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getCodeSystemCatalogEntryList()
		 * @generated
		 */
		EClass CODE_SYSTEM_CATALOG_ENTRY_LIST = eINSTANCE.getCodeSystemCatalogEntryList();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_CATALOG_ENTRY_LIST__ENTRY = eINSTANCE.getCodeSystemCatalogEntryList_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryListEntryImpl
		 * <em>Catalog Entry List Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryListEntryImpl
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getCodeSystemCatalogEntryListEntry()
		 * @generated
		 */
		EClass CODE_SYSTEM_CATALOG_ENTRY_LIST_ENTRY = eINSTANCE.getCodeSystemCatalogEntryListEntry();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_CATALOG_ENTRY_LIST_ENTRY__ENTRY = eINSTANCE.getCodeSystemCatalogEntryListEntry_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryMsgImpl
		 * <em>Catalog Entry Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryMsgImpl
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getCodeSystemCatalogEntryMsg()
		 * @generated
		 */
		EClass CODE_SYSTEM_CATALOG_ENTRY_MSG = eINSTANCE.getCodeSystemCatalogEntryMsg();

		/**
		 * The meta object literal for the '<em><b>Code System Catalog Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_CATALOG_ENTRY_MSG__CODE_SYSTEM_CATALOG_ENTRY = eINSTANCE.getCodeSystemCatalogEntryMsg_CodeSystemCatalogEntry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntrySummaryImpl
		 * <em>Catalog Entry Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntrySummaryImpl
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getCodeSystemCatalogEntrySummary()
		 * @generated
		 */
		EClass CODE_SYSTEM_CATALOG_ENTRY_SUMMARY = eINSTANCE.getCodeSystemCatalogEntrySummary();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__VERSIONS = eINSTANCE.getCodeSystemCatalogEntrySummary_Versions();

		/**
		 * The meta object literal for the '<em><b>Current Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CURRENT_VERSION = eINSTANCE.getCodeSystemCatalogEntrySummary_CurrentVersion();

		/**
		 * The meta object literal for the '<em><b>Code System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_NAME = eINSTANCE.getCodeSystemCatalogEntrySummary_CodeSystemName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystem.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.DocumentRootImpl
		 * @see org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Code System Catalog Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY = eINSTANCE.getDocumentRoot_CodeSystemCatalogEntry();

		/**
		 * The meta object literal for the '<em><b>Code System Catalog Entry Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY = eINSTANCE.getDocumentRoot_CodeSystemCatalogEntryDirectory();

		/**
		 * The meta object literal for the '<em><b>Code System Catalog Entry List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_LIST = eINSTANCE.getDocumentRoot_CodeSystemCatalogEntryList();

		/**
		 * The meta object literal for the '<em><b>Code System Catalog Entry Msg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_MSG = eINSTANCE.getDocumentRoot_CodeSystemCatalogEntryMsg();

	}

} // CodeSystemPackage
