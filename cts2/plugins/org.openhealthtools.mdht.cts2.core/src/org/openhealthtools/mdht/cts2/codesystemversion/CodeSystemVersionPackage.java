/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystemversion;

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
 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionFactory
 * @model kind="package"
 * @generated
 */
public interface CodeSystemVersionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "codesystemversion";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "codesystemversion";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	CodeSystemVersionPackage eINSTANCE = org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl
	 * <em>Catalog Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getCodeSystemVersionCatalogEntry()
	 * @generated
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__STATUS = CorePackage.RESOURCE_VERSION_DESCRIPTION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__CHANGE_DESCRIPTION = CorePackage.RESOURCE_VERSION_DESCRIPTION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__ENTRY_STATE = CorePackage.RESOURCE_VERSION_DESCRIPTION__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__KEYWORD = CorePackage.RESOURCE_VERSION_DESCRIPTION__KEYWORD;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__RESOURCE_TYPE = CorePackage.RESOURCE_VERSION_DESCRIPTION__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__RESOURCE_SYNOPSIS = CorePackage.RESOURCE_VERSION_DESCRIPTION__RESOURCE_SYNOPSIS;

	/**
	 * The feature id for the '<em><b>Additional Documentation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__ADDITIONAL_DOCUMENTATION = CorePackage.RESOURCE_VERSION_DESCRIPTION__ADDITIONAL_DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Source And Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__SOURCE_AND_ROLE = CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_ROLE;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__RIGHTS = CorePackage.RESOURCE_VERSION_DESCRIPTION__RIGHTS;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__NOTE = CorePackage.RESOURCE_VERSION_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__PROPERTY = CorePackage.RESOURCE_VERSION_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Alternate ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__ALTERNATE_ID = CorePackage.RESOURCE_VERSION_DESCRIPTION__ALTERNATE_ID;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__SOURCE_STATEMENTS = CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__ABOUT = CorePackage.RESOURCE_VERSION_DESCRIPTION__ABOUT;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__FORMAL_NAME = CorePackage.RESOURCE_VERSION_DESCRIPTION__FORMAL_NAME;

	/**
	 * The feature id for the '<em><b>Source And Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__SOURCE_AND_NOTATION = CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__PREDECESSOR = CorePackage.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Official Resource Version Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__OFFICIAL_RESOURCE_VERSION_ID = CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RESOURCE_VERSION_ID;

	/**
	 * The feature id for the '<em><b>Official Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__OFFICIAL_RELEASE_DATE = CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RELEASE_DATE;

	/**
	 * The feature id for the '<em><b>Official Activation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__OFFICIAL_ACTIVATION_DATE = CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_ACTIVATION_DATE;

	/**
	 * The feature id for the '<em><b>Document URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__DOCUMENT_URI = CorePackage.RESOURCE_VERSION_DESCRIPTION__DOCUMENT_URI;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__STATE = CorePackage.RESOURCE_VERSION_DESCRIPTION__STATE;

	/**
	 * The feature id for the '<em><b>Version Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__IMPORTS = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supported Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__SUPPORTED_LANGUAGE = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entity Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__ENTITY_DESCRIPTIONS = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__ASSOCIATIONS = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__CLASSES = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__ROLES = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Individuals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__INDIVIDUALS = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Code System Version Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY__CODE_SYSTEM_VERSION_NAME = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Catalog Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_FEATURE_COUNT = CorePackage.RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryDirectoryImpl
	 * <em>Catalog Entry Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryDirectoryImpl
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getCodeSystemVersionCatalogEntryDirectory()
	 * @generated
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Entry Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryListImpl
	 * <em>Catalog Entry List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryListImpl
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getCodeSystemVersionCatalogEntryList()
	 * @generated
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST = 2;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Entry List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryListEntryImpl
	 * <em>Catalog Entry List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryListEntryImpl
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getCodeSystemVersionCatalogEntryListEntry()
	 * @generated
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__HREF = CorePackage.DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__MATCH_STRENGTH = CorePackage.DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__RESOURCE_NAME = CorePackage.DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__ENTRY = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Entry List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY_FEATURE_COUNT = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryMsgImpl
	 * <em>Catalog Entry Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryMsgImpl
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getCodeSystemVersionCatalogEntryMsg()
	 * @generated
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG = 4;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG__HEADING = CorePackage.MESSAGE__HEADING;

	/**
	 * The feature id for the '<em><b>Code System Version Catalog Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG__CODE_SYSTEM_VERSION_CATALOG_ENTRY = CorePackage.MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Entry Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG_FEATURE_COUNT = CorePackage.MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntrySummaryImpl
	 * <em>Catalog Entry Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntrySummaryImpl
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getCodeSystemVersionCatalogEntrySummary()
	 * @generated
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY = 5;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__HREF = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__MATCH_STRENGTH = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__RESOURCE_NAME = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__RESOURCE_SYNOPSIS = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__ABOUT = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__ABOUT;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__FORMAL_NAME = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME;

	/**
	 * The feature id for the '<em><b>Official Resource Version Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__OFFICIAL_RESOURCE_VERSION_ID = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RESOURCE_VERSION_ID;

	/**
	 * The feature id for the '<em><b>Official Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__OFFICIAL_RELEASE_DATE = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RELEASE_DATE;

	/**
	 * The feature id for the '<em><b>Document URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__DOCUMENT_URI = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__DOCUMENT_URI;

	/**
	 * The feature id for the '<em><b>Version Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code System Version Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_TAG = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code System Version Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_NAME = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Catalog Entry Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY_FEATURE_COUNT = CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.DocumentRootImpl
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Code System Version Catalog Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Code System Version Catalog Entry Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY = 4;

	/**
	 * The feature id for the '<em><b>Code System Version Catalog Entry List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST = 5;

	/**
	 * The feature id for the '<em><b>Code System Version Catalog Entry Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG = 6;

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry <em>Catalog Entry</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry
	 * @generated
	 */
	EClass getCodeSystemVersionCatalogEntry();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getVersionOf <em>Version Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Version Of</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getVersionOf()
	 * @see #getCodeSystemVersionCatalogEntry()
	 * @generated
	 */
	EReference getCodeSystemVersionCatalogEntry_VersionOf();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getImports()
	 * @see #getCodeSystemVersionCatalogEntry()
	 * @generated
	 */
	EReference getCodeSystemVersionCatalogEntry_Imports();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getDefaultLanguage <em>Default Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Default Language</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getDefaultLanguage()
	 * @see #getCodeSystemVersionCatalogEntry()
	 * @generated
	 */
	EReference getCodeSystemVersionCatalogEntry_DefaultLanguage();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getSupportedLanguage <em>Supported Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Supported Language</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getSupportedLanguage()
	 * @see #getCodeSystemVersionCatalogEntry()
	 * @generated
	 */
	EReference getCodeSystemVersionCatalogEntry_SupportedLanguage();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getEntityDescriptions <em>Entity Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Entity Descriptions</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getEntityDescriptions()
	 * @see #getCodeSystemVersionCatalogEntry()
	 * @generated
	 */
	EAttribute getCodeSystemVersionCatalogEntry_EntityDescriptions();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Associations</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getAssociations()
	 * @see #getCodeSystemVersionCatalogEntry()
	 * @generated
	 */
	EAttribute getCodeSystemVersionCatalogEntry_Associations();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getClasses
	 * <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Classes</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getClasses()
	 * @see #getCodeSystemVersionCatalogEntry()
	 * @generated
	 */
	EAttribute getCodeSystemVersionCatalogEntry_Classes();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getRoles
	 * <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Roles</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getRoles()
	 * @see #getCodeSystemVersionCatalogEntry()
	 * @generated
	 */
	EAttribute getCodeSystemVersionCatalogEntry_Roles();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getIndividuals
	 * <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Individuals</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getIndividuals()
	 * @see #getCodeSystemVersionCatalogEntry()
	 * @generated
	 */
	EAttribute getCodeSystemVersionCatalogEntry_Individuals();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getCodeSystemVersionName
	 * <em>Code System Version Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Code System Version Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getCodeSystemVersionName()
	 * @see #getCodeSystemVersionCatalogEntry()
	 * @generated
	 */
	EAttribute getCodeSystemVersionCatalogEntry_CodeSystemVersionName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryDirectory
	 * <em>Catalog Entry Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryDirectory
	 * @generated
	 */
	EClass getCodeSystemVersionCatalogEntryDirectory();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryDirectory#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryDirectory#getEntry()
	 * @see #getCodeSystemVersionCatalogEntryDirectory()
	 * @generated
	 */
	EReference getCodeSystemVersionCatalogEntryDirectory_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryList
	 * <em>Catalog Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry List</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryList
	 * @generated
	 */
	EClass getCodeSystemVersionCatalogEntryList();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryList#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryList#getEntry()
	 * @see #getCodeSystemVersionCatalogEntryList()
	 * @generated
	 */
	EReference getCodeSystemVersionCatalogEntryList_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryListEntry
	 * <em>Catalog Entry List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry List Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryListEntry
	 * @generated
	 */
	EClass getCodeSystemVersionCatalogEntryListEntry();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryListEntry#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryListEntry#getEntry()
	 * @see #getCodeSystemVersionCatalogEntryListEntry()
	 * @generated
	 */
	EReference getCodeSystemVersionCatalogEntryListEntry_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg
	 * <em>Catalog Entry Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg
	 * @generated
	 */
	EClass getCodeSystemVersionCatalogEntryMsg();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg#getCodeSystemVersionCatalogEntry
	 * <em>Code System Version Catalog Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Version Catalog Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg#getCodeSystemVersionCatalogEntry()
	 * @see #getCodeSystemVersionCatalogEntryMsg()
	 * @generated
	 */
	EReference getCodeSystemVersionCatalogEntryMsg_CodeSystemVersionCatalogEntry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary
	 * <em>Catalog Entry Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catalog Entry Summary</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary
	 * @generated
	 */
	EClass getCodeSystemVersionCatalogEntrySummary();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary#getVersionOf <em>Version Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Version Of</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary#getVersionOf()
	 * @see #getCodeSystemVersionCatalogEntrySummary()
	 * @generated
	 */
	EReference getCodeSystemVersionCatalogEntrySummary_VersionOf();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary#getCodeSystemVersionTag
	 * <em>Code System Version Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Code System Version Tag</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary#getCodeSystemVersionTag()
	 * @see #getCodeSystemVersionCatalogEntrySummary()
	 * @generated
	 */
	EReference getCodeSystemVersionCatalogEntrySummary_CodeSystemVersionTag();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary#getCodeSystemVersionName
	 * <em>Code System Version Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Code System Version Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary#getCodeSystemVersionName()
	 * @see #getCodeSystemVersionCatalogEntrySummary()
	 * @generated
	 */
	EAttribute getCodeSystemVersionCatalogEntrySummary_CodeSystemVersionName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getXMLNSPrefixMap
	 * <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getXSISchemaLocation
	 * <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntry
	 * <em>Code System Version Catalog Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Version Catalog Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CodeSystemVersionCatalogEntry();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntryDirectory
	 * <em>Code System Version Catalog Entry Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Version Catalog Entry Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntryDirectory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CodeSystemVersionCatalogEntryDirectory();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntryList
	 * <em>Code System Version Catalog Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Version Catalog Entry List</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntryList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CodeSystemVersionCatalogEntryList();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntryMsg
	 * <em>Code System Version Catalog Entry Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System Version Catalog Entry Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntryMsg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CodeSystemVersionCatalogEntryMsg();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeSystemVersionFactory getCodeSystemVersionFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl
		 * <em>Catalog Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryImpl
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getCodeSystemVersionCatalogEntry()
		 * @generated
		 */
		EClass CODE_SYSTEM_VERSION_CATALOG_ENTRY = eINSTANCE.getCodeSystemVersionCatalogEntry();

		/**
		 * The meta object literal for the '<em><b>Version Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF = eINSTANCE.getCodeSystemVersionCatalogEntry_VersionOf();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION_CATALOG_ENTRY__IMPORTS = eINSTANCE.getCodeSystemVersionCatalogEntry_Imports();

		/**
		 * The meta object literal for the '<em><b>Default Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE = eINSTANCE.getCodeSystemVersionCatalogEntry_DefaultLanguage();

		/**
		 * The meta object literal for the '<em><b>Supported Language</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION_CATALOG_ENTRY__SUPPORTED_LANGUAGE = eINSTANCE.getCodeSystemVersionCatalogEntry_SupportedLanguage();

		/**
		 * The meta object literal for the '<em><b>Entity Descriptions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION_CATALOG_ENTRY__ENTITY_DESCRIPTIONS = eINSTANCE.getCodeSystemVersionCatalogEntry_EntityDescriptions();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION_CATALOG_ENTRY__ASSOCIATIONS = eINSTANCE.getCodeSystemVersionCatalogEntry_Associations();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION_CATALOG_ENTRY__CLASSES = eINSTANCE.getCodeSystemVersionCatalogEntry_Classes();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION_CATALOG_ENTRY__ROLES = eINSTANCE.getCodeSystemVersionCatalogEntry_Roles();

		/**
		 * The meta object literal for the '<em><b>Individuals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION_CATALOG_ENTRY__INDIVIDUALS = eINSTANCE.getCodeSystemVersionCatalogEntry_Individuals();

		/**
		 * The meta object literal for the '<em><b>Code System Version Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION_CATALOG_ENTRY__CODE_SYSTEM_VERSION_NAME = eINSTANCE.getCodeSystemVersionCatalogEntry_CodeSystemVersionName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryDirectoryImpl
		 * <em>Catalog Entry Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryDirectoryImpl
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getCodeSystemVersionCatalogEntryDirectory()
		 * @generated
		 */
		EClass CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY = eINSTANCE.getCodeSystemVersionCatalogEntryDirectory();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY__ENTRY = eINSTANCE.getCodeSystemVersionCatalogEntryDirectory_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryListImpl
		 * <em>Catalog Entry List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryListImpl
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getCodeSystemVersionCatalogEntryList()
		 * @generated
		 */
		EClass CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST = eINSTANCE.getCodeSystemVersionCatalogEntryList();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST__ENTRY = eINSTANCE.getCodeSystemVersionCatalogEntryList_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryListEntryImpl
		 * <em>Catalog Entry List Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryListEntryImpl
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getCodeSystemVersionCatalogEntryListEntry()
		 * @generated
		 */
		EClass CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY = eINSTANCE.getCodeSystemVersionCatalogEntryListEntry();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__ENTRY = eINSTANCE.getCodeSystemVersionCatalogEntryListEntry_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryMsgImpl
		 * <em>Catalog Entry Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryMsgImpl
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getCodeSystemVersionCatalogEntryMsg()
		 * @generated
		 */
		EClass CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG = eINSTANCE.getCodeSystemVersionCatalogEntryMsg();

		/**
		 * The meta object literal for the '<em><b>Code System Version Catalog Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG__CODE_SYSTEM_VERSION_CATALOG_ENTRY = eINSTANCE.getCodeSystemVersionCatalogEntryMsg_CodeSystemVersionCatalogEntry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntrySummaryImpl
		 * <em>Catalog Entry Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntrySummaryImpl
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getCodeSystemVersionCatalogEntrySummary()
		 * @generated
		 */
		EClass CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY = eINSTANCE.getCodeSystemVersionCatalogEntrySummary();

		/**
		 * The meta object literal for the '<em><b>Version Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF = eINSTANCE.getCodeSystemVersionCatalogEntrySummary_VersionOf();

		/**
		 * The meta object literal for the '<em><b>Code System Version Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_TAG = eINSTANCE.getCodeSystemVersionCatalogEntrySummary_CodeSystemVersionTag();

		/**
		 * The meta object literal for the '<em><b>Code System Version Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_NAME = eINSTANCE.getCodeSystemVersionCatalogEntrySummary_CodeSystemVersionName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.DocumentRootImpl <em>Document Root</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.DocumentRootImpl
		 * @see org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Code System Version Catalog Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY = eINSTANCE.getDocumentRoot_CodeSystemVersionCatalogEntry();

		/**
		 * The meta object literal for the '<em><b>Code System Version Catalog Entry Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY = eINSTANCE.getDocumentRoot_CodeSystemVersionCatalogEntryDirectory();

		/**
		 * The meta object literal for the '<em><b>Code System Version Catalog Entry List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST = eINSTANCE.getDocumentRoot_CodeSystemVersionCatalogEntryList();

		/**
		 * The meta object literal for the '<em><b>Code System Version Catalog Entry Msg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG = eINSTANCE.getDocumentRoot_CodeSystemVersionCatalogEntryMsg();

	}

} // CodeSystemVersionPackage
