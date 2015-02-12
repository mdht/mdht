/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.association;

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
 * @see org.openhealthtools.mdht.cts2.association.AssociationFactory
 * @model kind="package"
 * @generated
 */
public interface AssociationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "association";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/CTS2/1.0/Association";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "association";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	AssociationPackage eINSTANCE = org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationImpl
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__STATUS = CorePackage.CHANGEABLE__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CHANGE_DESCRIPTION = CorePackage.CHANGEABLE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ENTRY_STATE = CorePackage.CHANGEABLE__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SUBJECT = CorePackage.CHANGEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PREDICATE = CorePackage.CHANGEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = CorePackage.CHANGEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Association Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATION_QUALIFIER = CorePackage.CHANGEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asserted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSERTED_BY = CorePackage.CHANGEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Asserted In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSERTED_IN = CorePackage.CHANGEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Derivation Reasoning Algorithm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DERIVATION_REASONING_ALGORITHM = CorePackage.CHANGEABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_STATEMENTS = CorePackage.CHANGEABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Association ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATION_ID = CorePackage.CHANGEABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DERIVATION = CorePackage.CHANGEABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Local ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LOCAL_ID = CorePackage.CHANGEABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = CorePackage.CHANGEABLE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationDirectoryImpl <em>Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationDirectoryImpl
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationDirectory()
	 * @generated
	 */
	int ASSOCIATION_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationDirectoryEntryImpl <em>Directory Entry</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationDirectoryEntryImpl
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationDirectoryEntry()
	 * @generated
	 */
	int ASSOCIATION_DIRECTORY_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY_ENTRY__HREF = CorePackage.DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY_ENTRY__MATCH_STRENGTH = CorePackage.DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY_ENTRY__RESOURCE_NAME = CorePackage.DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY_ENTRY__SUBJECT = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY_ENTRY__PREDICATE = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY_ENTRY__TARGET = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asserted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Directory Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_DIRECTORY_ENTRY_FEATURE_COUNT = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationGraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationGraphImpl
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationGraph()
	 * @generated
	 */
	int ASSOCIATION_GRAPH = 3;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GRAPH__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GRAPH__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GRAPH__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GRAPH__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GRAPH__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GRAPH__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GRAPH__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Focus Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GRAPH__FOCUS_ENTITY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GRAPH__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expansion Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GRAPH__EXPANSION_DEPTH = CorePackage.DIRECTORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expansion Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GRAPH__EXPANSION_DIRECTION = CorePackage.DIRECTORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GRAPH__GRAPH_FOCUS = CorePackage.DIRECTORY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_GRAPH_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationListImpl
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationList()
	 * @generated
	 */
	int ASSOCIATION_LIST = 4;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationListEntryImpl <em>List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationListEntryImpl
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationListEntry()
	 * @generated
	 */
	int ASSOCIATION_LIST_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__STATUS = ASSOCIATION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__CHANGE_DESCRIPTION = ASSOCIATION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__ENTRY_STATE = ASSOCIATION__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__SUBJECT = ASSOCIATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__PREDICATE = ASSOCIATION__PREDICATE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__TARGET = ASSOCIATION__TARGET;

	/**
	 * The feature id for the '<em><b>Association Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__ASSOCIATION_QUALIFIER = ASSOCIATION__ASSOCIATION_QUALIFIER;

	/**
	 * The feature id for the '<em><b>Asserted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__ASSERTED_BY = ASSOCIATION__ASSERTED_BY;

	/**
	 * The feature id for the '<em><b>Asserted In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__ASSERTED_IN = ASSOCIATION__ASSERTED_IN;

	/**
	 * The feature id for the '<em><b>Derivation Reasoning Algorithm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__DERIVATION_REASONING_ALGORITHM = ASSOCIATION__DERIVATION_REASONING_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__SOURCE_STATEMENTS = ASSOCIATION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Association ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__ASSOCIATION_ID = ASSOCIATION__ASSOCIATION_ID;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__DERIVATION = ASSOCIATION__DERIVATION;

	/**
	 * The feature id for the '<em><b>Local ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__LOCAL_ID = ASSOCIATION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__HREF = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__MATCH_STRENGTH = ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY__RESOURCE_NAME = ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_ENTRY_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationMsgImpl <em>Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationMsgImpl
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationMsg()
	 * @generated
	 */
	int ASSOCIATION_MSG = 6;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSG__HEADING = CorePackage.MESSAGE__HEADING;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSG__ASSOCIATION = CorePackage.MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSG_FEATURE_COUNT = CorePackage.MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationRenderingImpl <em>Rendering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationRenderingImpl
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationRendering()
	 * @generated
	 */
	int ASSOCIATION_RENDERING = 7;

	/**
	 * The feature id for the '<em><b>Language And Syntax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RENDERING__LANGUAGE_AND_SYNTAX = 0;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RENDERING__REPRESENTATION = 1;

	/**
	 * The number of structural features of the '<em>Rendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RENDERING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.association.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.impl.DocumentRootImpl
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

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
	 * The feature id for the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION = 3;

	/**
	 * The feature id for the '<em><b>Association Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION_DIRECTORY = 4;

	/**
	 * The feature id for the '<em><b>Association Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION_GRAPH = 5;

	/**
	 * The feature id for the '<em><b>Association List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION_LIST = 6;

	/**
	 * The feature id for the '<em><b>Association Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION_MSG = 7;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.association.impl.GraphNodeImpl <em>Graph Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.impl.GraphNodeImpl
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getGraphNode()
	 * @generated
	 */
	int GRAPH_NODE = 9;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__HREF = ASSOCIATION_DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__MATCH_STRENGTH = ASSOCIATION_DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__RESOURCE_NAME = ASSOCIATION_DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__SUBJECT = ASSOCIATION_DIRECTORY_ENTRY__SUBJECT;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__PREDICATE = ASSOCIATION_DIRECTORY_ENTRY__PREDICATE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__TARGET = ASSOCIATION_DIRECTORY_ENTRY__TARGET;

	/**
	 * The feature id for the '<em><b>Asserted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__ASSERTED_BY = ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY;

	/**
	 * The feature id for the '<em><b>Node Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__NODE_ENTITY = ASSOCIATION_DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__DIRECTION = ASSOCIATION_DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next Node Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__NEXT_NODE_NUMBER = ASSOCIATION_DIRECTORY_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__NODE_NUMBER = ASSOCIATION_DIRECTORY_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Graph Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE_FEATURE_COUNT = ASSOCIATION_DIRECTORY_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.association.AssociationDerivation <em>Derivation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.AssociationDerivation
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationDerivation()
	 * @generated
	 */
	int ASSOCIATION_DERIVATION = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.association.GraphDirection <em>Graph Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.GraphDirection
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getGraphDirection()
	 * @generated
	 */
	int GRAPH_DIRECTION = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.association.GraphFocus <em>Graph Focus</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.GraphFocus
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getGraphFocus()
	 * @generated
	 */
	int GRAPH_FOCUS = 12;

	/**
	 * The meta object id for the '<em>Derivation Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.AssociationDerivation
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationDerivationObject()
	 * @generated
	 */
	int ASSOCIATION_DERIVATION_OBJECT = 13;

	/**
	 * The meta object id for the '<em>Graph Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.GraphDirection
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getGraphDirectionObject()
	 * @generated
	 */
	int GRAPH_DIRECTION_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Graph Focus Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.association.GraphFocus
	 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getGraphFocusObject()
	 * @generated
	 */
	int GRAPH_FOCUS_OBJECT = 15;

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.association.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.Association#getSubject
	 * <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.Association#getSubject()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.Association#getPredicate
	 * <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.Association#getPredicate()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Predicate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.association.Association#getTarget
	 * <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.Association#getTarget()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Target();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.association.Association#getAssociationQualifier <em>Association Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Association Qualifier</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.Association#getAssociationQualifier()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AssociationQualifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.Association#getAssertedBy
	 * <em>Asserted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Asserted By</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.Association#getAssertedBy()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AssertedBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.Association#getAssertedIn
	 * <em>Asserted In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Asserted In</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.Association#getAssertedIn()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AssertedIn();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.association.Association#getDerivationReasoningAlgorithm <em>Derivation Reasoning Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Derivation Reasoning Algorithm</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.Association#getDerivationReasoningAlgorithm()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_DerivationReasoningAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.association.Association#getSourceStatements
	 * <em>Source Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source Statements</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.Association#getSourceStatements()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_SourceStatements();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.association.Association#getAssociationID
	 * <em>Association ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Association ID</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.Association#getAssociationID()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_AssociationID();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.association.Association#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Derivation</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.Association#getDerivation()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Derivation();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.association.Association#getLocalID <em>Local ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Local ID</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.Association#getLocalID()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_LocalID();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.association.AssociationDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationDirectory
	 * @generated
	 */
	EClass getAssociationDirectory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.association.AssociationDirectory#getEntry
	 * <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationDirectory#getEntry()
	 * @see #getAssociationDirectory()
	 * @generated
	 */
	EReference getAssociationDirectory_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry <em>Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Directory Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry
	 * @generated
	 */
	EClass getAssociationDirectoryEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getSubject
	 * <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getSubject()
	 * @see #getAssociationDirectoryEntry()
	 * @generated
	 */
	EReference getAssociationDirectoryEntry_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getPredicate
	 * <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getPredicate()
	 * @see #getAssociationDirectoryEntry()
	 * @generated
	 */
	EReference getAssociationDirectoryEntry_Predicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getTarget
	 * <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getTarget()
	 * @see #getAssociationDirectoryEntry()
	 * @generated
	 */
	EReference getAssociationDirectoryEntry_Target();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getAssertedBy <em>Asserted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Asserted By</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getAssertedBy()
	 * @see #getAssociationDirectoryEntry()
	 * @generated
	 */
	EReference getAssociationDirectoryEntry_AssertedBy();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationGraph
	 * @generated
	 */
	EClass getAssociationGraph();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getFocusEntity
	 * <em>Focus Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Focus Entity</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationGraph#getFocusEntity()
	 * @see #getAssociationGraph()
	 * @generated
	 */
	EReference getAssociationGraph_FocusEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getEntry
	 * <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationGraph#getEntry()
	 * @see #getAssociationGraph()
	 * @generated
	 */
	EReference getAssociationGraph_Entry();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getExpansionDepth
	 * <em>Expansion Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Expansion Depth</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationGraph#getExpansionDepth()
	 * @see #getAssociationGraph()
	 * @generated
	 */
	EAttribute getAssociationGraph_ExpansionDepth();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getExpansionDirection
	 * <em>Expansion Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Expansion Direction</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationGraph#getExpansionDirection()
	 * @see #getAssociationGraph()
	 * @generated
	 */
	EAttribute getAssociationGraph_ExpansionDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getGraphFocus
	 * <em>Graph Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Graph Focus</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationGraph#getGraphFocus()
	 * @see #getAssociationGraph()
	 * @generated
	 */
	EAttribute getAssociationGraph_GraphFocus();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.association.AssociationList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationList
	 * @generated
	 */
	EClass getAssociationList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.association.AssociationList#getEntry
	 * <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationList#getEntry()
	 * @see #getAssociationList()
	 * @generated
	 */
	EReference getAssociationList_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.association.AssociationListEntry <em>List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>List Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationListEntry
	 * @generated
	 */
	EClass getAssociationListEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.association.AssociationListEntry#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationListEntry#getHref()
	 * @see #getAssociationListEntry()
	 * @generated
	 */
	EAttribute getAssociationListEntry_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.association.AssociationListEntry#getMatchStrength
	 * <em>Match Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Match Strength</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationListEntry#getMatchStrength()
	 * @see #getAssociationListEntry()
	 * @generated
	 */
	EAttribute getAssociationListEntry_MatchStrength();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.association.AssociationListEntry#getResourceName
	 * <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationListEntry#getResourceName()
	 * @see #getAssociationListEntry()
	 * @generated
	 */
	EAttribute getAssociationListEntry_ResourceName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.association.AssociationMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationMsg
	 * @generated
	 */
	EClass getAssociationMsg();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.AssociationMsg#getAssociation
	 * <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Association</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationMsg#getAssociation()
	 * @see #getAssociationMsg()
	 * @generated
	 */
	EReference getAssociationMsg_Association();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.association.AssociationRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rendering</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationRendering
	 * @generated
	 */
	EClass getAssociationRendering();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.association.AssociationRendering#getLanguageAndSyntax <em>Language And Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Language And Syntax</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationRendering#getLanguageAndSyntax()
	 * @see #getAssociationRendering()
	 * @generated
	 */
	EReference getAssociationRendering_LanguageAndSyntax();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.AssociationRendering#getRepresentation
	 * <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Representation</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationRendering#getRepresentation()
	 * @see #getAssociationRendering()
	 * @generated
	 */
	EReference getAssociationRendering_Representation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getXSISchemaLocation
	 * <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociation
	 * <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Association</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Association();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationDirectory
	 * <em>Association Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Association Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationDirectory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssociationDirectory();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationGraph
	 * <em>Association Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Association Graph</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationGraph()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssociationGraph();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationList
	 * <em>Association List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Association List</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssociationList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationMsg
	 * <em>Association Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Association Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationMsg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssociationMsg();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.association.GraphNode <em>Graph Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Graph Node</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.GraphNode
	 * @generated
	 */
	EClass getGraphNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.association.GraphNode#getNodeEntity
	 * <em>Node Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Node Entity</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.GraphNode#getNodeEntity()
	 * @see #getGraphNode()
	 * @generated
	 */
	EReference getGraphNode_NodeEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.association.GraphNode#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.GraphNode#getDirection()
	 * @see #getGraphNode()
	 * @generated
	 */
	EAttribute getGraphNode_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.association.GraphNode#getNextNodeNumber
	 * <em>Next Node Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Next Node Number</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.GraphNode#getNextNodeNumber()
	 * @see #getGraphNode()
	 * @generated
	 */
	EAttribute getGraphNode_NextNodeNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.association.GraphNode#getNodeNumber <em>Node Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Node Number</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.GraphNode#getNodeNumber()
	 * @see #getGraphNode()
	 * @generated
	 */
	EAttribute getGraphNode_NodeNumber();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.association.AssociationDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Derivation</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationDerivation
	 * @generated
	 */
	EEnum getAssociationDerivation();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.association.GraphDirection <em>Graph Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Graph Direction</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.GraphDirection
	 * @generated
	 */
	EEnum getGraphDirection();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.association.GraphFocus <em>Graph Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Graph Focus</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.GraphFocus
	 * @generated
	 */
	EEnum getGraphFocus();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.association.AssociationDerivation <em>Derivation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Derivation Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationDerivation
	 * @model instanceClass="org.openhealthtools.mdht.cts2.association.AssociationDerivation"
	 *        extendedMetaData="name='AssociationDerivation:Object' baseType='AssociationDerivation'"
	 * @generated
	 */
	EDataType getAssociationDerivationObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.association.GraphDirection <em>Graph Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Graph Direction Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.GraphDirection
	 * @model instanceClass="org.openhealthtools.mdht.cts2.association.GraphDirection"
	 *        extendedMetaData="name='GraphDirection:Object' baseType='GraphDirection'"
	 * @generated
	 */
	EDataType getGraphDirectionObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.association.GraphFocus <em>Graph Focus Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Graph Focus Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.association.GraphFocus
	 * @model instanceClass="org.openhealthtools.mdht.cts2.association.GraphFocus"
	 *        extendedMetaData="name='GraphFocus:Object' baseType='GraphFocus'"
	 * @generated
	 */
	EDataType getGraphFocusObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssociationFactory getAssociationFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationImpl
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION__SUBJECT = eINSTANCE.getAssociation_Subject();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION__PREDICATE = eINSTANCE.getAssociation_Predicate();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

		/**
		 * The meta object literal for the '<em><b>Association Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION__ASSOCIATION_QUALIFIER = eINSTANCE.getAssociation_AssociationQualifier();

		/**
		 * The meta object literal for the '<em><b>Asserted By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION__ASSERTED_BY = eINSTANCE.getAssociation_AssertedBy();

		/**
		 * The meta object literal for the '<em><b>Asserted In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION__ASSERTED_IN = eINSTANCE.getAssociation_AssertedIn();

		/**
		 * The meta object literal for the '<em><b>Derivation Reasoning Algorithm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION__DERIVATION_REASONING_ALGORITHM = eINSTANCE.getAssociation_DerivationReasoningAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Source Statements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION__SOURCE_STATEMENTS = eINSTANCE.getAssociation_SourceStatements();

		/**
		 * The meta object literal for the '<em><b>Association ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION__ASSOCIATION_ID = eINSTANCE.getAssociation_AssociationID();

		/**
		 * The meta object literal for the '<em><b>Derivation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION__DERIVATION = eINSTANCE.getAssociation_Derivation();

		/**
		 * The meta object literal for the '<em><b>Local ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION__LOCAL_ID = eINSTANCE.getAssociation_LocalID();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationDirectoryImpl <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationDirectoryImpl
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationDirectory()
		 * @generated
		 */
		EClass ASSOCIATION_DIRECTORY = eINSTANCE.getAssociationDirectory();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_DIRECTORY__ENTRY = eINSTANCE.getAssociationDirectory_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationDirectoryEntryImpl
		 * <em>Directory Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationDirectoryEntryImpl
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationDirectoryEntry()
		 * @generated
		 */
		EClass ASSOCIATION_DIRECTORY_ENTRY = eINSTANCE.getAssociationDirectoryEntry();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_DIRECTORY_ENTRY__SUBJECT = eINSTANCE.getAssociationDirectoryEntry_Subject();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_DIRECTORY_ENTRY__PREDICATE = eINSTANCE.getAssociationDirectoryEntry_Predicate();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_DIRECTORY_ENTRY__TARGET = eINSTANCE.getAssociationDirectoryEntry_Target();

		/**
		 * The meta object literal for the '<em><b>Asserted By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY = eINSTANCE.getAssociationDirectoryEntry_AssertedBy();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationGraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationGraphImpl
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationGraph()
		 * @generated
		 */
		EClass ASSOCIATION_GRAPH = eINSTANCE.getAssociationGraph();

		/**
		 * The meta object literal for the '<em><b>Focus Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_GRAPH__FOCUS_ENTITY = eINSTANCE.getAssociationGraph_FocusEntity();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_GRAPH__ENTRY = eINSTANCE.getAssociationGraph_Entry();

		/**
		 * The meta object literal for the '<em><b>Expansion Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION_GRAPH__EXPANSION_DEPTH = eINSTANCE.getAssociationGraph_ExpansionDepth();

		/**
		 * The meta object literal for the '<em><b>Expansion Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION_GRAPH__EXPANSION_DIRECTION = eINSTANCE.getAssociationGraph_ExpansionDirection();

		/**
		 * The meta object literal for the '<em><b>Graph Focus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION_GRAPH__GRAPH_FOCUS = eINSTANCE.getAssociationGraph_GraphFocus();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationListImpl
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationList()
		 * @generated
		 */
		EClass ASSOCIATION_LIST = eINSTANCE.getAssociationList();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_LIST__ENTRY = eINSTANCE.getAssociationList_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationListEntryImpl <em>List Entry</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationListEntryImpl
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationListEntry()
		 * @generated
		 */
		EClass ASSOCIATION_LIST_ENTRY = eINSTANCE.getAssociationListEntry();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION_LIST_ENTRY__HREF = eINSTANCE.getAssociationListEntry_Href();

		/**
		 * The meta object literal for the '<em><b>Match Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION_LIST_ENTRY__MATCH_STRENGTH = eINSTANCE.getAssociationListEntry_MatchStrength();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSOCIATION_LIST_ENTRY__RESOURCE_NAME = eINSTANCE.getAssociationListEntry_ResourceName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationMsgImpl <em>Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationMsgImpl
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationMsg()
		 * @generated
		 */
		EClass ASSOCIATION_MSG = eINSTANCE.getAssociationMsg();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_MSG__ASSOCIATION = eINSTANCE.getAssociationMsg_Association();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.association.impl.AssociationRenderingImpl <em>Rendering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationRenderingImpl
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationRendering()
		 * @generated
		 */
		EClass ASSOCIATION_RENDERING = eINSTANCE.getAssociationRendering();

		/**
		 * The meta object literal for the '<em><b>Language And Syntax</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_RENDERING__LANGUAGE_AND_SYNTAX = eINSTANCE.getAssociationRendering_LanguageAndSyntax();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_RENDERING__REPRESENTATION = eINSTANCE.getAssociationRendering_Representation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.association.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.impl.DocumentRootImpl
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Association</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSOCIATION = eINSTANCE.getDocumentRoot_Association();

		/**
		 * The meta object literal for the '<em><b>Association Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSOCIATION_DIRECTORY = eINSTANCE.getDocumentRoot_AssociationDirectory();

		/**
		 * The meta object literal for the '<em><b>Association Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSOCIATION_GRAPH = eINSTANCE.getDocumentRoot_AssociationGraph();

		/**
		 * The meta object literal for the '<em><b>Association List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSOCIATION_LIST = eINSTANCE.getDocumentRoot_AssociationList();

		/**
		 * The meta object literal for the '<em><b>Association Msg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSOCIATION_MSG = eINSTANCE.getDocumentRoot_AssociationMsg();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.association.impl.GraphNodeImpl <em>Graph Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.impl.GraphNodeImpl
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getGraphNode()
		 * @generated
		 */
		EClass GRAPH_NODE = eINSTANCE.getGraphNode();

		/**
		 * The meta object literal for the '<em><b>Node Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPH_NODE__NODE_ENTITY = eINSTANCE.getGraphNode_NodeEntity();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_NODE__DIRECTION = eINSTANCE.getGraphNode_Direction();

		/**
		 * The meta object literal for the '<em><b>Next Node Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_NODE__NEXT_NODE_NUMBER = eINSTANCE.getGraphNode_NextNodeNumber();

		/**
		 * The meta object literal for the '<em><b>Node Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_NODE__NODE_NUMBER = eINSTANCE.getGraphNode_NodeNumber();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.association.AssociationDerivation <em>Derivation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.AssociationDerivation
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationDerivation()
		 * @generated
		 */
		EEnum ASSOCIATION_DERIVATION = eINSTANCE.getAssociationDerivation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.association.GraphDirection <em>Graph Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.GraphDirection
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getGraphDirection()
		 * @generated
		 */
		EEnum GRAPH_DIRECTION = eINSTANCE.getGraphDirection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.association.GraphFocus <em>Graph Focus</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.GraphFocus
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getGraphFocus()
		 * @generated
		 */
		EEnum GRAPH_FOCUS = eINSTANCE.getGraphFocus();

		/**
		 * The meta object literal for the '<em>Derivation Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.AssociationDerivation
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getAssociationDerivationObject()
		 * @generated
		 */
		EDataType ASSOCIATION_DERIVATION_OBJECT = eINSTANCE.getAssociationDerivationObject();

		/**
		 * The meta object literal for the '<em>Graph Direction Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.GraphDirection
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getGraphDirectionObject()
		 * @generated
		 */
		EDataType GRAPH_DIRECTION_OBJECT = eINSTANCE.getGraphDirectionObject();

		/**
		 * The meta object literal for the '<em>Graph Focus Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.association.GraphFocus
		 * @see org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl#getGraphFocusObject()
		 * @generated
		 */
		EDataType GRAPH_FOCUS_OBJECT = eINSTANCE.getGraphFocusObject();

	}

} // AssociationPackage
