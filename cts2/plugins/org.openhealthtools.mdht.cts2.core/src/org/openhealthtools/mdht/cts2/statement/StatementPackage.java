/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.statement;

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
 * @see org.openhealthtools.mdht.cts2.statement.StatementFactory
 * @model kind="package"
 * @generated
 */
public interface StatementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "statement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/CTS2/1.0/Statement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "statement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	StatementPackage eINSTANCE = org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.statement.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.statement.impl.DocumentRootImpl
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Statement Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATEMENT_DIRECTORY = 4;

	/**
	 * The feature id for the '<em><b>Statement List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATEMENT_LIST = 5;

	/**
	 * The feature id for the '<em><b>Statement Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATEMENT_MSG = 6;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementImpl
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__STATUS = CorePackage.CHANGEABLE__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__CHANGE_DESCRIPTION = CorePackage.CHANGEABLE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ENTRY_STATE = CorePackage.CHANGEABLE__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Statement URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__STATEMENT_URI = CorePackage.CHANGEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__SUBJECT = CorePackage.CHANGEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__PREDICATE = CorePackage.CHANGEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__TARGET = CorePackage.CHANGEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Associated Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ASSOCIATED_ATTRIBUTE = CorePackage.CHANGEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__SOURCE = CorePackage.CHANGEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Asserted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ASSERTED_BY = CorePackage.CHANGEABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Asserted In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ASSERTED_IN = CorePackage.CHANGEABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__QUALIFIER = CorePackage.CHANGEABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = CorePackage.CHANGEABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementDirectoryImpl <em>Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementDirectoryImpl
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementDirectory()
	 * @generated
	 */
	int STATEMENT_DIRECTORY = 2;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementDirectoryEntryImpl <em>Directory Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementDirectoryEntryImpl
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementDirectoryEntry()
	 * @generated
	 */
	int STATEMENT_DIRECTORY_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__STATUS = STATEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__CHANGE_DESCRIPTION = STATEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__ENTRY_STATE = STATEMENT__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Statement URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__STATEMENT_URI = STATEMENT__STATEMENT_URI;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__SUBJECT = STATEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__PREDICATE = STATEMENT__PREDICATE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__TARGET = STATEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Associated Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__ASSOCIATED_ATTRIBUTE = STATEMENT__ASSOCIATED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__SOURCE = STATEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Asserted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__ASSERTED_BY = STATEMENT__ASSERTED_BY;

	/**
	 * The feature id for the '<em><b>Asserted In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__ASSERTED_IN = STATEMENT__ASSERTED_IN;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__QUALIFIER = STATEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__HREF = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__MATCH_STRENGTH = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY__RESOURCE_NAME = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Directory Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_DIRECTORY_ENTRY_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementListImpl
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementList()
	 * @generated
	 */
	int STATEMENT_LIST = 4;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementListEntryImpl <em>List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementListEntryImpl
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementListEntry()
	 * @generated
	 */
	int STATEMENT_LIST_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST_ENTRY__HREF = CorePackage.DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST_ENTRY__MATCH_STRENGTH = CorePackage.DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST_ENTRY__RESOURCE_NAME = CorePackage.DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST_ENTRY__ENTRY = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST_ENTRY_FEATURE_COUNT = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementMsgImpl <em>Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementMsgImpl
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementMsg()
	 * @generated
	 */
	int STATEMENT_MSG = 6;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_MSG__HEADING = CorePackage.MESSAGE__HEADING;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_MSG__STATEMENT = CorePackage.MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_MSG_FEATURE_COUNT = CorePackage.MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementQualifierImpl <em>Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementQualifierImpl
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementQualifier()
	 * @generated
	 */
	int STATEMENT_QUALIFIER = 7;

	/**
	 * The feature id for the '<em><b>Qualifier Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_QUALIFIER__QUALIFIER_PREDICATE = 0;

	/**
	 * The feature id for the '<em><b>Associated Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_QUALIFIER__ASSOCIATED_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_QUALIFIER__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_QUALIFIER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementSubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementSubjectImpl
	 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementSubject()
	 * @generated
	 */
	int STATEMENT_SUBJECT = 8;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_SUBJECT__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_SUBJECT__ENTITY = 1;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_SUBJECT_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getXSISchemaLocation
	 * <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatement
	 * <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Statement();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatementDirectory
	 * <em>Statement Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Statement Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatementDirectory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StatementDirectory();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatementList
	 * <em>Statement List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Statement List</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatementList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StatementList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatementMsg
	 * <em>Statement Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Statement Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatementMsg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StatementMsg();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.statement.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.statement.Statement#getStatementURI <em>Statement URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Statement URI</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.Statement#getStatementURI()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_StatementURI();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.Statement#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.Statement#getSubject()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.Statement#getPredicate
	 * <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.Statement#getPredicate()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Predicate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.statement.Statement#getTarget <em>Target</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.Statement#getTarget()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.Statement#getAssociatedAttribute
	 * <em>Associated Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Associated Attribute</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.Statement#getAssociatedAttribute()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_AssociatedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.statement.Statement#getSource <em>Source</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.Statement#getSource()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.Statement#getAssertedBy
	 * <em>Asserted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Asserted By</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.Statement#getAssertedBy()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_AssertedBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.Statement#getAssertedIn
	 * <em>Asserted In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Asserted In</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.Statement#getAssertedIn()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_AssertedIn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.statement.Statement#getQualifier
	 * <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Qualifier</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.Statement#getQualifier()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Qualifier();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.statement.StatementDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementDirectory
	 * @generated
	 */
	EClass getStatementDirectory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.statement.StatementDirectory#getEntry
	 * <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementDirectory#getEntry()
	 * @see #getStatementDirectory()
	 * @generated
	 */
	EReference getStatementDirectory_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.statement.StatementDirectoryEntry <em>Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Directory Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementDirectoryEntry
	 * @generated
	 */
	EClass getStatementDirectoryEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.statement.StatementDirectoryEntry#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementDirectoryEntry#getHref()
	 * @see #getStatementDirectoryEntry()
	 * @generated
	 */
	EAttribute getStatementDirectoryEntry_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.statement.StatementDirectoryEntry#getMatchStrength
	 * <em>Match Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Match Strength</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementDirectoryEntry#getMatchStrength()
	 * @see #getStatementDirectoryEntry()
	 * @generated
	 */
	EAttribute getStatementDirectoryEntry_MatchStrength();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.statement.StatementDirectoryEntry#getResourceName
	 * <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementDirectoryEntry#getResourceName()
	 * @see #getStatementDirectoryEntry()
	 * @generated
	 */
	EAttribute getStatementDirectoryEntry_ResourceName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.statement.StatementList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementList
	 * @generated
	 */
	EClass getStatementList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.statement.StatementList#getEntry
	 * <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementList#getEntry()
	 * @see #getStatementList()
	 * @generated
	 */
	EReference getStatementList_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.statement.StatementListEntry <em>List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>List Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementListEntry
	 * @generated
	 */
	EClass getStatementListEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.StatementListEntry#getEntry
	 * <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementListEntry#getEntry()
	 * @see #getStatementListEntry()
	 * @generated
	 */
	EReference getStatementListEntry_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.statement.StatementMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementMsg
	 * @generated
	 */
	EClass getStatementMsg();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.StatementMsg#getStatement
	 * <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementMsg#getStatement()
	 * @see #getStatementMsg()
	 * @generated
	 */
	EReference getStatementMsg_Statement();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.statement.StatementQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Qualifier</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementQualifier
	 * @generated
	 */
	EClass getStatementQualifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.StatementQualifier#getQualifierPredicate
	 * <em>Qualifier Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Qualifier Predicate</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementQualifier#getQualifierPredicate()
	 * @see #getStatementQualifier()
	 * @generated
	 */
	EReference getStatementQualifier_QualifierPredicate();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.statement.StatementQualifier#getAssociatedAttribute <em>Associated Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Associated Attribute</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementQualifier#getAssociatedAttribute()
	 * @see #getStatementQualifier()
	 * @generated
	 */
	EReference getStatementQualifier_AssociatedAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.StatementQualifier#getTarget
	 * <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementQualifier#getTarget()
	 * @see #getStatementQualifier()
	 * @generated
	 */
	EReference getStatementQualifier_Target();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.statement.StatementSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementSubject
	 * @generated
	 */
	EClass getStatementSubject();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.statement.StatementSubject#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementSubject#getResource()
	 * @see #getStatementSubject()
	 * @generated
	 */
	EAttribute getStatementSubject_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.statement.StatementSubject#getEntity
	 * <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementSubject#getEntity()
	 * @see #getStatementSubject()
	 * @generated
	 */
	EReference getStatementSubject_Entity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatementFactory getStatementFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.statement.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.statement.impl.DocumentRootImpl
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STATEMENT = eINSTANCE.getDocumentRoot_Statement();

		/**
		 * The meta object literal for the '<em><b>Statement Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STATEMENT_DIRECTORY = eINSTANCE.getDocumentRoot_StatementDirectory();

		/**
		 * The meta object literal for the '<em><b>Statement List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STATEMENT_LIST = eINSTANCE.getDocumentRoot_StatementList();

		/**
		 * The meta object literal for the '<em><b>Statement Msg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STATEMENT_MSG = eINSTANCE.getDocumentRoot_StatementMsg();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementImpl
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Statement URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STATEMENT__STATEMENT_URI = eINSTANCE.getStatement_StatementURI();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT__SUBJECT = eINSTANCE.getStatement_Subject();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT__PREDICATE = eINSTANCE.getStatement_Predicate();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT__TARGET = eINSTANCE.getStatement_Target();

		/**
		 * The meta object literal for the '<em><b>Associated Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT__ASSOCIATED_ATTRIBUTE = eINSTANCE.getStatement_AssociatedAttribute();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT__SOURCE = eINSTANCE.getStatement_Source();

		/**
		 * The meta object literal for the '<em><b>Asserted By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT__ASSERTED_BY = eINSTANCE.getStatement_AssertedBy();

		/**
		 * The meta object literal for the '<em><b>Asserted In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT__ASSERTED_IN = eINSTANCE.getStatement_AssertedIn();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT__QUALIFIER = eINSTANCE.getStatement_Qualifier();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementDirectoryImpl <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementDirectoryImpl
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementDirectory()
		 * @generated
		 */
		EClass STATEMENT_DIRECTORY = eINSTANCE.getStatementDirectory();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT_DIRECTORY__ENTRY = eINSTANCE.getStatementDirectory_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementDirectoryEntryImpl <em>Directory Entry</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementDirectoryEntryImpl
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementDirectoryEntry()
		 * @generated
		 */
		EClass STATEMENT_DIRECTORY_ENTRY = eINSTANCE.getStatementDirectoryEntry();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STATEMENT_DIRECTORY_ENTRY__HREF = eINSTANCE.getStatementDirectoryEntry_Href();

		/**
		 * The meta object literal for the '<em><b>Match Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STATEMENT_DIRECTORY_ENTRY__MATCH_STRENGTH = eINSTANCE.getStatementDirectoryEntry_MatchStrength();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STATEMENT_DIRECTORY_ENTRY__RESOURCE_NAME = eINSTANCE.getStatementDirectoryEntry_ResourceName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementListImpl
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementList()
		 * @generated
		 */
		EClass STATEMENT_LIST = eINSTANCE.getStatementList();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT_LIST__ENTRY = eINSTANCE.getStatementList_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementListEntryImpl <em>List Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementListEntryImpl
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementListEntry()
		 * @generated
		 */
		EClass STATEMENT_LIST_ENTRY = eINSTANCE.getStatementListEntry();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT_LIST_ENTRY__ENTRY = eINSTANCE.getStatementListEntry_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementMsgImpl <em>Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementMsgImpl
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementMsg()
		 * @generated
		 */
		EClass STATEMENT_MSG = eINSTANCE.getStatementMsg();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT_MSG__STATEMENT = eINSTANCE.getStatementMsg_Statement();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementQualifierImpl <em>Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementQualifierImpl
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementQualifier()
		 * @generated
		 */
		EClass STATEMENT_QUALIFIER = eINSTANCE.getStatementQualifier();

		/**
		 * The meta object literal for the '<em><b>Qualifier Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT_QUALIFIER__QUALIFIER_PREDICATE = eINSTANCE.getStatementQualifier_QualifierPredicate();

		/**
		 * The meta object literal for the '<em><b>Associated Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT_QUALIFIER__ASSOCIATED_ATTRIBUTE = eINSTANCE.getStatementQualifier_AssociatedAttribute();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT_QUALIFIER__TARGET = eINSTANCE.getStatementQualifier_Target();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.statement.impl.StatementSubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementSubjectImpl
		 * @see org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl#getStatementSubject()
		 * @generated
		 */
		EClass STATEMENT_SUBJECT = eINSTANCE.getStatementSubject();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STATEMENT_SUBJECT__RESOURCE = eINSTANCE.getStatementSubject_Resource();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT_SUBJECT__ENTITY = eINSTANCE.getStatementSubject_Entity();

	}

} // StatementPackage
