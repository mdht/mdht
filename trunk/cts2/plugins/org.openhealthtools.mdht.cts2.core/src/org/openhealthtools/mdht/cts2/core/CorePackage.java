/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.openhealthtools.mdht.cts2.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/CTS2/1.0/Core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	CorePackage eINSTANCE = org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ChangeableImpl <em>Changeable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ChangeableImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeable()
	 * @generated
	 */
	int CHANGEABLE = 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGEABLE__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGEABLE__CHANGE_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGEABLE__ENTRY_STATE = 2;

	/**
	 * The number of structural features of the '<em>Changeable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGEABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl <em>Resource Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getResourceDescription()
	 * @generated
	 */
	int RESOURCE_DESCRIPTION = 58;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__STATUS = CHANGEABLE__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__CHANGE_DESCRIPTION = CHANGEABLE__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__ENTRY_STATE = CHANGEABLE__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__KEYWORD = CHANGEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__RESOURCE_TYPE = CHANGEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS = CHANGEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Additional Documentation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION = CHANGEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source And Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__SOURCE_AND_ROLE = CHANGEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__RIGHTS = CHANGEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__NOTE = CHANGEABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__PROPERTY = CHANGEABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Alternate ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__ALTERNATE_ID = CHANGEABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__SOURCE_STATEMENTS = CHANGEABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__ABOUT = CHANGEABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__FORMAL_NAME = CHANGEABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Resource Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION_FEATURE_COUNT = CHANGEABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.AbstractResourceDescriptionImpl
	 * <em>Abstract Resource Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.AbstractResourceDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAbstractResourceDescription()
	 * @generated
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__STATUS = RESOURCE_DESCRIPTION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__CHANGE_DESCRIPTION = RESOURCE_DESCRIPTION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__ENTRY_STATE = RESOURCE_DESCRIPTION__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__KEYWORD = RESOURCE_DESCRIPTION__KEYWORD;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__RESOURCE_TYPE = RESOURCE_DESCRIPTION__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS = RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS;

	/**
	 * The feature id for the '<em><b>Additional Documentation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION = RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Source And Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__SOURCE_AND_ROLE = RESOURCE_DESCRIPTION__SOURCE_AND_ROLE;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__RIGHTS = RESOURCE_DESCRIPTION__RIGHTS;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__NOTE = RESOURCE_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__PROPERTY = RESOURCE_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Alternate ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__ALTERNATE_ID = RESOURCE_DESCRIPTION__ALTERNATE_ID;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__SOURCE_STATEMENTS = RESOURCE_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__ABOUT = RESOURCE_DESCRIPTION__ABOUT;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__FORMAL_NAME = RESOURCE_DESCRIPTION__FORMAL_NAME;

	/**
	 * The feature id for the '<em><b>Release Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION = RESOURCE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Release Format</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT = RESOURCE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Resource Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION_FEATURE_COUNT = RESOURCE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.DirectoryEntryImpl <em>Directory Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.DirectoryEntryImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDirectoryEntry()
	 * @generated
	 */
	int DIRECTORY_ENTRY = 21;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ENTRY__HREF = 0;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ENTRY__MATCH_STRENGTH = 1;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ENTRY__RESOURCE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Directory Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionDirectoryEntryImpl
	 * <em>Resource Description Directory Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionDirectoryEntryImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getResourceDescriptionDirectoryEntry()
	 * @generated
	 */
	int RESOURCE_DESCRIPTION_DIRECTORY_ENTRY = 59;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__HREF = DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__MATCH_STRENGTH = DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_NAME = DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS = DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__ABOUT = DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME = DIRECTORY_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Description Directory Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT = DIRECTORY_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.AbstractResourceDescriptionDirectoryEntryImpl
	 * <em>Abstract Resource Description Directory Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.AbstractResourceDescriptionDirectoryEntryImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAbstractResourceDescriptionDirectoryEntry()
	 * @generated
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__HREF = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__MATCH_STRENGTH = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_NAME = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__ABOUT = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__ABOUT;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME;

	/**
	 * The number of structural features of the '<em>Abstract Resource Description Directory Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.EntityReferenceImpl <em>Entity Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.EntityReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntityReference()
	 * @generated
	 */
	int ENTITY_REFERENCE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Known Entity Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE__ABOUT = 2;

	/**
	 * The number of structural features of the '<em>Entity Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.AnonymousEntityReferenceImpl <em>Anonymous Entity Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.AnonymousEntityReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAnonymousEntityReference()
	 * @generated
	 */
	int ANONYMOUS_ENTITY_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_REFERENCE__NAME = ENTITY_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Known Entity Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION = ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_REFERENCE__ABOUT = ENTITY_REFERENCE__ABOUT;

	/**
	 * The number of structural features of the '<em>Anonymous Entity Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_REFERENCE_FEATURE_COUNT = ENTITY_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.AnonymousStatementImpl <em>Anonymous Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.AnonymousStatementImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAnonymousStatement()
	 * @generated
	 */
	int ANONYMOUS_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_STATEMENT__PREDICATE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_STATEMENT__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Statment Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_STATEMENT__STATMENT_QUALIFIER = 2;

	/**
	 * The number of structural features of the '<em>Anonymous Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_STATEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.NameAndMeaningReferenceImpl <em>Name And Meaning Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.NameAndMeaningReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNameAndMeaningReference()
	 * @generated
	 */
	int NAME_AND_MEANING_REFERENCE = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_AND_MEANING_REFERENCE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_AND_MEANING_REFERENCE__HREF = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_AND_MEANING_REFERENCE__URI = 2;

	/**
	 * The number of structural features of the '<em>Name And Meaning Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_AND_MEANING_REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.AssociationReferenceImpl <em>Association Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.AssociationReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAssociationReference()
	 * @generated
	 */
	int ASSOCIATION_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Association Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.BindingQualifierReferenceImpl <em>Binding Qualifier Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.BindingQualifierReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getBindingQualifierReference()
	 * @generated
	 */
	int BINDING_QUALIFIER_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_QUALIFIER_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_QUALIFIER_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_QUALIFIER_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Binding Qualifier Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_QUALIFIER_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.CaseSignificanceReferenceImpl <em>Case Significance Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.CaseSignificanceReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCaseSignificanceReference()
	 * @generated
	 */
	int CASE_SIGNIFICANCE_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CASE_SIGNIFICANCE_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CASE_SIGNIFICANCE_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CASE_SIGNIFICANCE_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Case Significance Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CASE_SIGNIFICANCE_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl <em>Change Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeDescription()
	 * @generated
	 */
	int CHANGE_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Prev Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__PREV_IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Change Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__CHANGE_NOTES = 1;

	/**
	 * The feature id for the '<em><b>Change Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__CHANGE_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Cloned Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__CLONED_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__CHANGE_DATE = 4;

	/**
	 * The feature id for the '<em><b>Change Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__CHANGE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Committed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__COMMITTED = 6;

	/**
	 * The feature id for the '<em><b>Containing Change Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__CONTAINING_CHANGE_SET = 7;

	/**
	 * The feature id for the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__EFFECTIVE_DATE = 8;

	/**
	 * The feature id for the '<em><b>Prev Change Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__PREV_CHANGE_SET = 9;

	/**
	 * The number of structural features of the '<em>Change Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.FinalizableImpl <em>Finalizable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.FinalizableImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFinalizable()
	 * @generated
	 */
	int FINALIZABLE = 30;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FINALIZABLE__STATE = 0;

	/**
	 * The number of structural features of the '<em>Finalizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FINALIZABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ChangeSetBaseImpl <em>Change Set Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ChangeSetBaseImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeSetBase()
	 * @generated
	 */
	int CHANGE_SET_BASE = 9;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_BASE__STATE = FINALIZABLE__STATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_BASE__CREATOR = FINALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_BASE__CHANGE_INSTRUCTIONS = FINALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_BASE__MEMBER = FINALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Change Set URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_BASE__CHANGE_SET_URI = FINALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Close Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_BASE__CLOSE_DATE = FINALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_BASE__CREATION_DATE = FINALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Entry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_BASE__ENTRY_COUNT = FINALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Official Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_BASE__OFFICIAL_EFFECTIVE_DATE = FINALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Change Set Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_BASE_FEATURE_COUNT = FINALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.CodeSystemCategoryReferenceImpl
	 * <em>Code System Category Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.CodeSystemCategoryReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemCategoryReference()
	 * @generated
	 */
	int CODE_SYSTEM_CATEGORY_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATEGORY_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATEGORY_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATEGORY_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Code System Category Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CATEGORY_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.CodeSystemReferenceImpl <em>Code System Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.CodeSystemReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemReference()
	 * @generated
	 */
	int CODE_SYSTEM_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Code System Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.CodeSystemVersionReferenceImpl
	 * <em>Code System Version Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.CodeSystemVersionReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemVersionReference()
	 * @generated
	 */
	int CODE_SYSTEM_VERSION_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_REFERENCE__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM = 1;

	/**
	 * The number of structural features of the '<em>Code System Version Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.OpaqueDataImpl <em>Opaque Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.OpaqueDataImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOpaqueData()
	 * @generated
	 */
	int OPAQUE_DATA = 52;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPAQUE_DATA__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPAQUE_DATA__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPAQUE_DATA__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPAQUE_DATA__SCHEMA = 3;

	/**
	 * The number of structural features of the '<em>Opaque Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPAQUE_DATA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.EntryDescriptionImpl <em>Entry Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.EntryDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntryDescription()
	 * @generated
	 */
	int ENTRY_DESCRIPTION = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DESCRIPTION__VALUE = OPAQUE_DATA__VALUE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DESCRIPTION__FORMAT = OPAQUE_DATA__FORMAT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DESCRIPTION__LANGUAGE = OPAQUE_DATA__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DESCRIPTION__SCHEMA = OPAQUE_DATA__SCHEMA;

	/**
	 * The number of structural features of the '<em>Entry Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DESCRIPTION_FEATURE_COUNT = OPAQUE_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.NoteImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTE__VALUE = ENTRY_DESCRIPTION__VALUE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTE__FORMAT = ENTRY_DESCRIPTION__FORMAT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTE__LANGUAGE = ENTRY_DESCRIPTION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTE__SCHEMA = ENTRY_DESCRIPTION__SCHEMA;

	/**
	 * The feature id for the '<em><b>Asserted In Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTE__ASSERTED_IN_CODE_SYSTEM_VERSION = ENTRY_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Corresponding Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTE__CORRESPONDING_STATEMENT = ENTRY_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTE__EXTERNAL_IDENTIFIER = ENTRY_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = ENTRY_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.CommentImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__VALUE = NOTE__VALUE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__FORMAT = NOTE__FORMAT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__LANGUAGE = NOTE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__SCHEMA = NOTE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Asserted In Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__ASSERTED_IN_CODE_SYSTEM_VERSION = NOTE__ASSERTED_IN_CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Corresponding Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__CORRESPONDING_STATEMENT = NOTE__CORRESPONDING_STATEMENT;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__EXTERNAL_IDENTIFIER = NOTE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__TYPE = NOTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = NOTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ConceptDomainReferenceImpl <em>Concept Domain Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ConceptDomainReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getConceptDomainReference()
	 * @generated
	 */
	int CONCEPT_DOMAIN_REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Concept Domain Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ContextReferenceImpl <em>Context Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ContextReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getContextReference()
	 * @generated
	 */
	int CONTEXT_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Context Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.DefinitionImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__VALUE = NOTE__VALUE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__FORMAT = NOTE__FORMAT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__LANGUAGE = NOTE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__SCHEMA = NOTE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Asserted In Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ASSERTED_IN_CODE_SYSTEM_VERSION = NOTE__ASSERTED_IN_CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Corresponding Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__CORRESPONDING_STATEMENT = NOTE__CORRESPONDING_STATEMENT;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__EXTERNAL_IDENTIFIER = NOTE__EXTERNAL_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Usage Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__USAGE_CONTEXT = NOTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__DEFINITION_ROLE = NOTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = NOTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.DescriptionInCodeSystemImpl <em>Description In Code System</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.DescriptionInCodeSystemImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDescriptionInCodeSystem()
	 * @generated
	 */
	int DESCRIPTION_IN_CODE_SYSTEM = 17;

	/**
	 * The feature id for the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_IN_CODE_SYSTEM__DESCRIBING_CODE_SYSTEM_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_IN_CODE_SYSTEM__DESIGNATION = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_IN_CODE_SYSTEM__HREF = 2;

	/**
	 * The number of structural features of the '<em>Description In Code System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_IN_CODE_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.DesignationFidelityReferenceImpl
	 * <em>Designation Fidelity Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.DesignationFidelityReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDesignationFidelityReference()
	 * @generated
	 */
	int DESIGNATION_FIDELITY_REFERENCE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION_FIDELITY_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION_FIDELITY_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION_FIDELITY_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Designation Fidelity Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION_FIDELITY_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.DesignationTypeReferenceImpl <em>Designation Type Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.DesignationTypeReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDesignationTypeReference()
	 * @generated
	 */
	int DESIGNATION_TYPE_REFERENCE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION_TYPE_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION_TYPE_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION_TYPE_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Designation Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION_TYPE_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.MessageImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 38;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__HEADING = 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.DirectoryImpl <em>Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.DirectoryImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDirectory()
	 * @generated
	 */
	int DIRECTORY = 20;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__HEADING = MESSAGE__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__DIRECTORY_FILTER = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__SORT_CRITERIA = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__COMPLETE = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__NEXT = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__NUM_ENTRIES = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__PREV = MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.EntityExpressionImpl <em>Entity Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.EntityExpressionImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntityExpression()
	 * @generated
	 */
	int ENTITY_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Ontology Language And Syntax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXPRESSION__ONTOLOGY_LANGUAGE_AND_SYNTAX = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXPRESSION__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Entity Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.EntityReferenceListImpl <em>Entity Reference List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.EntityReferenceListImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntityReferenceList()
	 * @generated
	 */
	int ENTITY_REFERENCE_LIST = 24;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_LIST__ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Entity Reference List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.URIAndEntityNameImpl <em>URI And Entity Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.URIAndEntityNameImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getURIAndEntityName()
	 * @generated
	 */
	int URI_AND_ENTITY_NAME = 73;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URI_AND_ENTITY_NAME__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URI_AND_ENTITY_NAME__NAME = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URI_AND_ENTITY_NAME__HREF = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URI_AND_ENTITY_NAME__URI = 3;

	/**
	 * The number of structural features of the '<em>URI And Entity Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URI_AND_ENTITY_NAME_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.EntitySynopsisImpl <em>Entity Synopsis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.EntitySynopsisImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntitySynopsis()
	 * @generated
	 */
	int ENTITY_SYNOPSIS = 25;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNOPSIS__NAMESPACE = URI_AND_ENTITY_NAME__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNOPSIS__NAME = URI_AND_ENTITY_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNOPSIS__HREF = URI_AND_ENTITY_NAME__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNOPSIS__URI = URI_AND_ENTITY_NAME__URI;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNOPSIS__DESIGNATION = URI_AND_ENTITY_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Synopsis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNOPSIS_FEATURE_COUNT = URI_AND_ENTITY_NAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ExampleImpl <em>Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ExampleImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getExample()
	 * @generated
	 */
	int EXAMPLE = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__VALUE = NOTE__VALUE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__FORMAT = NOTE__FORMAT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__LANGUAGE = NOTE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__SCHEMA = NOTE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Asserted In Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__ASSERTED_IN_CODE_SYSTEM_VERSION = NOTE__ASSERTED_IN_CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Corresponding Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__CORRESPONDING_STATEMENT = NOTE__CORRESPONDING_STATEMENT;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__EXTERNAL_IDENTIFIER = NOTE__EXTERNAL_IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_FEATURE_COUNT = NOTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.FilterImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 28;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER__COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.PropertyReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getPropertyReference()
	 * @generated
	 */
	int PROPERTY_REFERENCE = 56;

	/**
	 * The feature id for the '<em><b>Reference Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE__REFERENCE_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE__REFERENCE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Property Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.FilterComponentImpl <em>Filter Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.FilterComponentImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFilterComponent()
	 * @generated
	 */
	int FILTER_COMPONENT = 29;

	/**
	 * The feature id for the '<em><b>Reference Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_COMPONENT__REFERENCE_TARGET = PROPERTY_REFERENCE__REFERENCE_TARGET;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_COMPONENT__REFERENCE_TYPE = PROPERTY_REFERENCE__REFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>Match Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_COMPONENT__MATCH_ALGORITHM = PROPERTY_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Match Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_COMPONENT__MATCH_VALUE = PROPERTY_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filter Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_COMPONENT_FEATURE_COUNT = PROPERTY_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.FormalityLevelReferenceImpl <em>Formality Level Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.FormalityLevelReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFormalityLevelReference()
	 * @generated
	 */
	int FORMALITY_LEVEL_REFERENCE = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMALITY_LEVEL_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMALITY_LEVEL_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMALITY_LEVEL_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Formality Level Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMALITY_LEVEL_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.FormatReferenceImpl <em>Format Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.FormatReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFormatReference()
	 * @generated
	 */
	int FORMAT_REFERENCE = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAT_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAT_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAT_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Format Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAT_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.LanguageReferenceImpl <em>Language Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.LanguageReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getLanguageReference()
	 * @generated
	 */
	int LANGUAGE_REFERENCE = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Language Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.MapCorrelationReferenceImpl <em>Map Correlation Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.MapCorrelationReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapCorrelationReference()
	 * @generated
	 */
	int MAP_CORRELATION_REFERENCE = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAP_CORRELATION_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAP_CORRELATION_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAP_CORRELATION_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Map Correlation Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAP_CORRELATION_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.MapReferenceImpl <em>Map Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.MapReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapReference()
	 * @generated
	 */
	int MAP_REFERENCE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAP_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAP_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAP_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Map Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAP_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.MapVersionReferenceImpl <em>Map Version Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.MapVersionReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapVersionReference()
	 * @generated
	 */
	int MAP_VERSION_REFERENCE = 36;

	/**
	 * The feature id for the '<em><b>Map Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAP_VERSION_REFERENCE__MAP_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAP_VERSION_REFERENCE__MAP = 1;

	/**
	 * The number of structural features of the '<em>Map Version Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAP_VERSION_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.MatchAlgorithmReferenceImpl <em>Match Algorithm Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.MatchAlgorithmReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMatchAlgorithmReference()
	 * @generated
	 */
	int MATCH_ALGORITHM_REFERENCE = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MATCH_ALGORITHM_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MATCH_ALGORITHM_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MATCH_ALGORITHM_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Match Algorithm Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MATCH_ALGORITHM_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ModelAttributeReferenceImpl <em>Model Attribute Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ModelAttributeReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getModelAttributeReference()
	 * @generated
	 */
	int MODEL_ATTRIBUTE_REFERENCE = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_ATTRIBUTE_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_ATTRIBUTE_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_ATTRIBUTE_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Model Attribute Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_ATTRIBUTE_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.NamedEntityReferenceImpl <em>Named Entity Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.NamedEntityReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNamedEntityReference()
	 * @generated
	 */
	int NAMED_ENTITY_REFERENCE = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_REFERENCE__NAME = ENTITY_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Known Entity Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION = ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_REFERENCE__ABOUT = ENTITY_REFERENCE__ABOUT;

	/**
	 * The number of structural features of the '<em>Named Entity Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_REFERENCE_FEATURE_COUNT = ENTITY_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.NamespaceReferenceImpl <em>Namespace Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.NamespaceReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNamespaceReference()
	 * @generated
	 */
	int NAMESPACE_REFERENCE = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Namespace Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyDomainReferenceImpl <em>Ontology Domain Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyDomainReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyDomainReference()
	 * @generated
	 */
	int ONTOLOGY_DOMAIN_REFERENCE = 44;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_DOMAIN_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_DOMAIN_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_DOMAIN_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Ontology Domain Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_DOMAIN_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyEngineeringMethodologyReferenceImpl
	 * <em>Ontology Engineering Methodology Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyEngineeringMethodologyReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyEngineeringMethodologyReference()
	 * @generated
	 */
	int ONTOLOGY_ENGINEERING_METHODOLOGY_REFERENCE = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_ENGINEERING_METHODOLOGY_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_ENGINEERING_METHODOLOGY_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_ENGINEERING_METHODOLOGY_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Ontology Engineering Methodology Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_ENGINEERING_METHODOLOGY_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyEngineeringToolReferenceImpl
	 * <em>Ontology Engineering Tool Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyEngineeringToolReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyEngineeringToolReference()
	 * @generated
	 */
	int ONTOLOGY_ENGINEERING_TOOL_REFERENCE = 46;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_ENGINEERING_TOOL_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_ENGINEERING_TOOL_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_ENGINEERING_TOOL_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Ontology Engineering Tool Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_ENGINEERING_TOOL_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyLanguageAndSyntaxImpl <em>Ontology Language And Syntax</em>}
	 * ' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyLanguageAndSyntaxImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyLanguageAndSyntax()
	 * @generated
	 */
	int ONTOLOGY_LANGUAGE_AND_SYNTAX = 47;

	/**
	 * The feature id for the '<em><b>Ontology Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Ontology Syntax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_SYNTAX = 1;

	/**
	 * The number of structural features of the '<em>Ontology Language And Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LANGUAGE_AND_SYNTAX_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyLanguageReferenceImpl <em>Ontology Language Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyLanguageReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyLanguageReference()
	 * @generated
	 */
	int ONTOLOGY_LANGUAGE_REFERENCE = 48;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LANGUAGE_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LANGUAGE_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LANGUAGE_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Ontology Language Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LANGUAGE_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologySyntaxReferenceImpl <em>Ontology Syntax Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.OntologySyntaxReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologySyntaxReference()
	 * @generated
	 */
	int ONTOLOGY_SYNTAX_REFERENCE = 49;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_SYNTAX_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_SYNTAX_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_SYNTAX_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Ontology Syntax Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_SYNTAX_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyTaskReferenceImpl <em>Ontology Task Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyTaskReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyTaskReference()
	 * @generated
	 */
	int ONTOLOGY_TASK_REFERENCE = 50;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_TASK_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_TASK_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_TASK_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Ontology Task Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_TASK_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyTypeReferenceImpl <em>Ontology Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyTypeReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyTypeReference()
	 * @generated
	 */
	int ONTOLOGY_TYPE_REFERENCE = 51;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_TYPE_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_TYPE_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_TYPE_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Ontology Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_TYPE_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ParameterImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 53;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VAL = 0;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ARG = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.PredicateReferenceImpl <em>Predicate Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.PredicateReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getPredicateReference()
	 * @generated
	 */
	int PREDICATE_REFERENCE = 54;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_REFERENCE__NAMESPACE = URI_AND_ENTITY_NAME__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_REFERENCE__NAME = URI_AND_ENTITY_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_REFERENCE__HREF = URI_AND_ENTITY_NAME__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_REFERENCE__URI = URI_AND_ENTITY_NAME__URI;

	/**
	 * The number of structural features of the '<em>Predicate Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_REFERENCE_FEATURE_COUNT = URI_AND_ENTITY_NAME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.PropertyImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 55;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PREDICATE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Property Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY_QUALIFIER = 2;

	/**
	 * The feature id for the '<em><b>Corresponding Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CORRESPONDING_STATEMENT = 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ReasoningAlgorithmReferenceImpl
	 * <em>Reasoning Algorithm Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ReasoningAlgorithmReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getReasoningAlgorithmReference()
	 * @generated
	 */
	int REASONING_ALGORITHM_REFERENCE = 57;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REASONING_ALGORITHM_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REASONING_ALGORITHM_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REASONING_ALGORITHM_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Reasoning Algorithm Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REASONING_ALGORITHM_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionImpl
	 * <em>Resource Version Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getResourceVersionDescription()
	 * @generated
	 */
	int RESOURCE_VERSION_DESCRIPTION = 60;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__STATUS = RESOURCE_DESCRIPTION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__CHANGE_DESCRIPTION = RESOURCE_DESCRIPTION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__ENTRY_STATE = RESOURCE_DESCRIPTION__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__KEYWORD = RESOURCE_DESCRIPTION__KEYWORD;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__RESOURCE_TYPE = RESOURCE_DESCRIPTION__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__RESOURCE_SYNOPSIS = RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS;

	/**
	 * The feature id for the '<em><b>Additional Documentation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__ADDITIONAL_DOCUMENTATION = RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Source And Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_ROLE = RESOURCE_DESCRIPTION__SOURCE_AND_ROLE;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__RIGHTS = RESOURCE_DESCRIPTION__RIGHTS;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__NOTE = RESOURCE_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__PROPERTY = RESOURCE_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Alternate ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__ALTERNATE_ID = RESOURCE_DESCRIPTION__ALTERNATE_ID;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__SOURCE_STATEMENTS = RESOURCE_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__ABOUT = RESOURCE_DESCRIPTION__ABOUT;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__FORMAL_NAME = RESOURCE_DESCRIPTION__FORMAL_NAME;

	/**
	 * The feature id for the '<em><b>Source And Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION = RESOURCE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__PREDECESSOR = RESOURCE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Official Resource Version Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RESOURCE_VERSION_ID = RESOURCE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Official Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RELEASE_DATE = RESOURCE_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Official Activation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__OFFICIAL_ACTIVATION_DATE = RESOURCE_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Document URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__DOCUMENT_URI = RESOURCE_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION__STATE = RESOURCE_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Resource Version Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION_FEATURE_COUNT = RESOURCE_DESCRIPTION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionDirectoryEntryImpl
	 * <em>Resource Version Description Directory Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionDirectoryEntryImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getResourceVersionDescriptionDirectoryEntry()
	 * @generated
	 */
	int RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY = 61;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__HREF = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__MATCH_STRENGTH = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_NAME = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__ABOUT = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__ABOUT;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME;

	/**
	 * The feature id for the '<em><b>Official Resource Version Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RESOURCE_VERSION_ID = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Official Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RELEASE_DATE = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Document URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__DOCUMENT_URI = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Version Description Directory Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT = RESOURCE_DESCRIPTION_DIRECTORY_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.RESTResourceImpl <em>REST Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.RESTResourceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getRESTResource()
	 * @generated
	 */
	int REST_RESOURCE = 62;

	/**
	 * The feature id for the '<em><b>Resource Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REST_RESOURCE__RESOURCE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REST_RESOURCE__RESOURCE_URI = 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REST_RESOURCE__PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Access Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REST_RESOURCE__ACCESS_DATE = 3;

	/**
	 * The number of structural features of the '<em>REST Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REST_RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.RoleReferenceImpl <em>Role Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.RoleReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getRoleReference()
	 * @generated
	 */
	int ROLE_REFERENCE = 63;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Role Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ScopedEntityNameImpl <em>Scoped Entity Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ScopedEntityNameImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getScopedEntityName()
	 * @generated
	 */
	int SCOPED_ENTITY_NAME = 64;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCOPED_ENTITY_NAME__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCOPED_ENTITY_NAME__NAME = 1;

	/**
	 * The number of structural features of the '<em>Scoped Entity Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCOPED_ENTITY_NAME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.SortCriteriaImpl <em>Sort Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.SortCriteriaImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSortCriteria()
	 * @generated
	 */
	int SORT_CRITERIA = 65;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SORT_CRITERIA__ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Sort Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SORT_CRITERIA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.SortCriterionImpl <em>Sort Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.SortCriterionImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSortCriterion()
	 * @generated
	 */
	int SORT_CRITERION = 66;

	/**
	 * The feature id for the '<em><b>Sort Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SORT_CRITERION__SORT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Entry Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SORT_CRITERION__ENTRY_ORDER = 1;

	/**
	 * The feature id for the '<em><b>Sort Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SORT_CRITERION__SORT_DIRECTION = 2;

	/**
	 * The number of structural features of the '<em>Sort Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SORT_CRITERION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.SourceAndNotationImpl <em>Source And Notation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.SourceAndNotationImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSourceAndNotation()
	 * @generated
	 */
	int SOURCE_AND_NOTATION = 67;

	/**
	 * The feature id for the '<em><b>Source And Notation Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_AND_NOTATION__SOURCE_AND_NOTATION_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Source Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_AND_NOTATION__SOURCE_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_AND_NOTATION__SOURCE_LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Source Document Syntax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_AND_NOTATION__SOURCE_DOCUMENT_SYNTAX = 3;

	/**
	 * The number of structural features of the '<em>Source And Notation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_AND_NOTATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.SourceAndRoleReferenceImpl <em>Source And Role Reference</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.SourceAndRoleReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSourceAndRoleReference()
	 * @generated
	 */
	int SOURCE_AND_ROLE_REFERENCE = 68;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_AND_ROLE_REFERENCE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_AND_ROLE_REFERENCE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_AND_ROLE_REFERENCE__ROLE = 2;

	/**
	 * The feature id for the '<em><b>Bibliographic Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_AND_ROLE_REFERENCE__BIBLIOGRAPHIC_LINK = 3;

	/**
	 * The number of structural features of the '<em>Source And Role Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_AND_ROLE_REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.SourceReferenceImpl <em>Source Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.SourceReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSourceReference()
	 * @generated
	 */
	int SOURCE_REFERENCE = 69;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Source Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.StatementTargetImpl <em>Statement Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.StatementTargetImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getStatementTarget()
	 * @generated
	 */
	int STATEMENT_TARGET = 70;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TARGET__ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TARGET__LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TARGET__RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Bnode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TARGET__BNODE = 3;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TARGET__EXTERNAL_IDENTIFIER = 4;

	/**
	 * The number of structural features of the '<em>Statement Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TARGET_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.StatusReferenceImpl <em>Status Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.StatusReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getStatusReference()
	 * @generated
	 */
	int STATUS_REFERENCE = 71;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATUS_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATUS_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATUS_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Status Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATUS_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.TsAnyTypeImpl <em>Ts Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.TsAnyTypeImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getTsAnyType()
	 * @generated
	 */
	int TS_ANY_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TS_ANY_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TS_ANY_TYPE__ANY = 1;

	/**
	 * The number of structural features of the '<em>Ts Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TS_ANY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.DocumentRootImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 74;

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
	 * The feature id for the '<em><b>Entity Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ValueSetDefinitionReferenceImpl
	 * <em>Value Set Definition Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ValueSetDefinitionReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getValueSetDefinitionReference()
	 * @generated
	 */
	int VALUE_SET_DEFINITION_REFERENCE = 75;

	/**
	 * The feature id for the '<em><b>Value Set Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_REFERENCE__VALUE_SET_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_REFERENCE__VALUE_SET = 1;

	/**
	 * The number of structural features of the '<em>Value Set Definition Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.ValueSetReferenceImpl <em>Value Set Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.ValueSetReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getValueSetReference()
	 * @generated
	 */
	int VALUE_SET_REFERENCE = 76;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Value Set Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.impl.VersionTagReferenceImpl <em>Version Tag Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.VersionTagReferenceImpl
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getVersionTagReference()
	 * @generated
	 */
	int VERSION_TAG_REFERENCE = 77;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSION_TAG_REFERENCE__VALUE = NAME_AND_MEANING_REFERENCE__VALUE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSION_TAG_REFERENCE__HREF = NAME_AND_MEANING_REFERENCE__HREF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSION_TAG_REFERENCE__URI = NAME_AND_MEANING_REFERENCE__URI;

	/**
	 * The number of structural features of the '<em>Version Tag Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSION_TAG_REFERENCE_FEATURE_COUNT = NAME_AND_MEANING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.AssociationDirection <em>Association Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.AssociationDirection
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAssociationDirection()
	 * @generated
	 */
	int ASSOCIATION_DIRECTION = 78;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.ChangeCommitted <em>Change Committed</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.ChangeCommitted
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeCommitted()
	 * @generated
	 */
	int CHANGE_COMMITTED = 79;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.ChangeType <em>Change Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.ChangeType
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeType()
	 * @generated
	 */
	int CHANGE_TYPE = 80;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.CompleteDirectory <em>Complete Directory</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.CompleteDirectory
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCompleteDirectory()
	 * @generated
	 */
	int COMPLETE_DIRECTORY = 81;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.CTS2ResourceType <em>CTS2 Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.CTS2ResourceType
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCTS2ResourceType()
	 * @generated
	 */
	int CTS2_RESOURCE_TYPE = 82;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.DefinitionRole <em>Definition Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.DefinitionRole
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDefinitionRole()
	 * @generated
	 */
	int DEFINITION_ROLE = 83;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.EntryState <em>Entry State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.EntryState
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntryState()
	 * @generated
	 */
	int ENTRY_STATE = 84;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.FinalizableState <em>Finalizable State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.FinalizableState
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFinalizableState()
	 * @generated
	 */
	int FINALIZABLE_STATE = 85;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.NoteType <em>Note Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.NoteType
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNoteType()
	 * @generated
	 */
	int NOTE_TYPE = 86;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.SetOperator <em>Set Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.SetOperator
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSetOperator()
	 * @generated
	 */
	int SET_OPERATOR = 87;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.SortDirection <em>Sort Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.SortDirection
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSortDirection()
	 * @generated
	 */
	int SORT_DIRECTION = 88;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.core.TargetReferenceType <em>Target Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.TargetReferenceType
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getTargetReferenceType()
	 * @generated
	 */
	int TARGET_REFERENCE_TYPE = 89;

	/**
	 * The meta object id for the '<em>Amount Of Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.math.BigInteger
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAmountOfTime()
	 * @generated
	 */
	int AMOUNT_OF_TIME = 90;

	/**
	 * The meta object id for the '<em>Association Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.AssociationDirection
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAssociationDirectionObject()
	 * @generated
	 */
	int ASSOCIATION_DIRECTION_OBJECT = 91;

	/**
	 * The meta object id for the '<em>Association Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAssociationDirectoryURI()
	 * @generated
	 */
	int ASSOCIATION_DIRECTORY_URI = 92;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 93;

	/**
	 * The meta object id for the '<em>Boolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.Boolean
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getBooleanObject()
	 * @generated
	 */
	int BOOLEAN_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Change Committed Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.ChangeCommitted
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeCommittedObject()
	 * @generated
	 */
	int CHANGE_COMMITTED_OBJECT = 95;

	/**
	 * The meta object id for the '<em>Change Set Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeSetDirectoryURI()
	 * @generated
	 */
	int CHANGE_SET_DIRECTORY_URI = 96;

	/**
	 * The meta object id for the '<em>Change Set URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeSetURI()
	 * @generated
	 */
	int CHANGE_SET_URI = 97;

	/**
	 * The meta object id for the '<em>Change Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.ChangeType
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeTypeObject()
	 * @generated
	 */
	int CHANGE_TYPE_OBJECT = 98;

	/**
	 * The meta object id for the '<em>Code System Catalog Entry Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemCatalogEntryDirectoryURI()
	 * @generated
	 */
	int CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY_URI = 99;

	/**
	 * The meta object id for the '<em>Code System Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemName()
	 * @generated
	 */
	int CODE_SYSTEM_NAME = 100;

	/**
	 * The meta object id for the '<em>Code System Version Catalog Entry Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemVersionCatalogEntryDirectoryURI()
	 * @generated
	 */
	int CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY_URI = 101;

	/**
	 * The meta object id for the '<em>Code System Version Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemVersionName()
	 * @generated
	 */
	int CODE_SYSTEM_VERSION_NAME = 102;

	/**
	 * The meta object id for the '<em>Complete Directory Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.CompleteDirectory
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCompleteDirectoryObject()
	 * @generated
	 */
	int COMPLETE_DIRECTORY_OBJECT = 103;

	/**
	 * The meta object id for the '<em>Concept Domain Binding Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getConceptDomainBindingDirectoryURI()
	 * @generated
	 */
	int CONCEPT_DOMAIN_BINDING_DIRECTORY_URI = 104;

	/**
	 * The meta object id for the '<em>Concept Domain Catalog Entry Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getConceptDomainCatalogEntryDirectoryURI()
	 * @generated
	 */
	int CONCEPT_DOMAIN_CATALOG_ENTRY_DIRECTORY_URI = 105;

	/**
	 * The meta object id for the '<em>Concept Domain Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getConceptDomainName()
	 * @generated
	 */
	int CONCEPT_DOMAIN_NAME = 106;

	/**
	 * The meta object id for the '<em>CTS2 Resource Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.CTS2ResourceType
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCTS2ResourceTypeObject()
	 * @generated
	 */
	int CTS2_RESOURCE_TYPE_OBJECT = 107;

	/**
	 * The meta object id for the '<em>Date And Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDateAndTime()
	 * @generated
	 */
	int DATE_AND_TIME = 108;

	/**
	 * The meta object id for the '<em>Definition Role Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.DefinitionRole
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDefinitionRoleObject()
	 * @generated
	 */
	int DEFINITION_ROLE_OBJECT = 109;

	/**
	 * The meta object id for the '<em>Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDirectoryURI()
	 * @generated
	 */
	int DIRECTORY_URI = 110;

	/**
	 * The meta object id for the '<em>Document URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDocumentURI()
	 * @generated
	 */
	int DOCUMENT_URI = 111;

	/**
	 * The meta object id for the '<em>Entity Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntityDirectoryURI()
	 * @generated
	 */
	int ENTITY_DIRECTORY_URI = 112;

	/**
	 * The meta object id for the '<em>Entry State Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.EntryState
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntryStateObject()
	 * @generated
	 */
	int ENTRY_STATE_OBJECT = 113;

	/**
	 * The meta object id for the '<em>Enumeration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 114;

	/**
	 * The meta object id for the '<em>External URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getExternalURI()
	 * @generated
	 */
	int EXTERNAL_URI = 115;

	/**
	 * The meta object id for the '<em>Finalizable State Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.FinalizableState
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFinalizableStateObject()
	 * @generated
	 */
	int FINALIZABLE_STATE_OBJECT = 116;

	/**
	 * The meta object id for the '<em>Local Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getLocalIdentifier()
	 * @generated
	 */
	int LOCAL_IDENTIFIER = 117;

	/**
	 * The meta object id for the '<em>Local URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getLocalURI()
	 * @generated
	 */
	int LOCAL_URI = 118;

	/**
	 * The meta object id for the '<em>Map Catalog Entry Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapCatalogEntryDirectoryURI()
	 * @generated
	 */
	int MAP_CATALOG_ENTRY_DIRECTORY_URI = 119;

	/**
	 * The meta object id for the '<em>Map Entry Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapEntryDirectoryURI()
	 * @generated
	 */
	int MAP_ENTRY_DIRECTORY_URI = 120;

	/**
	 * The meta object id for the '<em>Map Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapName()
	 * @generated
	 */
	int MAP_NAME = 121;

	/**
	 * The meta object id for the '<em>Map Version Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapVersionDirectoryURI()
	 * @generated
	 */
	int MAP_VERSION_DIRECTORY_URI = 122;

	/**
	 * The meta object id for the '<em>Map Version Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapVersionName()
	 * @generated
	 */
	int MAP_VERSION_NAME = 123;

	/**
	 * The meta object id for the '<em>Match Strength</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMatchStrength()
	 * @generated
	 */
	int MATCH_STRENGTH = 124;

	/**
	 * The meta object id for the '<em>Match Strength Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.Double
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMatchStrengthObject()
	 * @generated
	 */
	int MATCH_STRENGTH_OBJECT = 125;

	/**
	 * The meta object id for the '<em>Namespace Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNamespaceIdentifier()
	 * @generated
	 */
	int NAMESPACE_IDENTIFIER = 126;

	/**
	 * The meta object id for the '<em>Natural Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.math.BigInteger
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNaturalNumber()
	 * @generated
	 */
	int NATURAL_NUMBER = 127;

	/**
	 * The meta object id for the '<em>Note Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.NoteType
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNoteTypeObject()
	 * @generated
	 */
	int NOTE_TYPE_OBJECT = 128;

	/**
	 * The meta object id for the '<em>Persistent URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getPersistentURI()
	 * @generated
	 */
	int PERSISTENT_URI = 129;

	/**
	 * The meta object id for the '<em>Rendering URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getRenderingURI()
	 * @generated
	 */
	int RENDERING_URI = 130;

	/**
	 * The meta object id for the '<em>Resolved Value Set Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getResolvedValueSetDirectoryURI()
	 * @generated
	 */
	int RESOLVED_VALUE_SET_DIRECTORY_URI = 131;

	/**
	 * The meta object id for the '<em>Service URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getServiceURI()
	 * @generated
	 */
	int SERVICE_URI = 132;

	/**
	 * The meta object id for the '<em>Set Operator Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.SetOperator
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSetOperatorObject()
	 * @generated
	 */
	int SET_OPERATOR_OBJECT = 133;

	/**
	 * The meta object id for the '<em>Sort Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.SortDirection
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSortDirectionObject()
	 * @generated
	 */
	int SORT_DIRECTION_OBJECT = 134;

	/**
	 * The meta object id for the '<em>Statement Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getStatementDirectoryURI()
	 * @generated
	 */
	int STATEMENT_DIRECTORY_URI = 135;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getString()
	 * @generated
	 */
	int STRING = 136;

	/**
	 * The meta object id for the '<em>Target Reference Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.core.TargetReferenceType
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getTargetReferenceTypeObject()
	 * @generated
	 */
	int TARGET_REFERENCE_TYPE_OBJECT = 137;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getURI()
	 * @generated
	 */
	int URI = 138;

	/**
	 * The meta object id for the '<em>Value Set Catalog Entry Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getValueSetCatalogEntryDirectoryURI()
	 * @generated
	 */
	int VALUE_SET_CATALOG_ENTRY_DIRECTORY_URI = 139;

	/**
	 * The meta object id for the '<em>Value Set Definition Directory URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getValueSetDefinitionDirectoryURI()
	 * @generated
	 */
	int VALUE_SET_DEFINITION_DIRECTORY_URI = 140;

	/**
	 * The meta object id for the '<em>Value Set Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getValueSetName()
	 * @generated
	 */
	int VALUE_SET_NAME = 141;

	/**
	 * The meta object id for the '<em>Version Tag Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getVersionTagName()
	 * @generated
	 */
	int VERSION_TAG_NAME = 142;

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.AbstractResourceDescription
	 * <em>Abstract Resource Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Abstract Resource Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.AbstractResourceDescription
	 * @generated
	 */
	EClass getAbstractResourceDescription();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.core.AbstractResourceDescription#getReleaseDocumentation <em>Release Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Release Documentation</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.AbstractResourceDescription#getReleaseDocumentation()
	 * @see #getAbstractResourceDescription()
	 * @generated
	 */
	EReference getAbstractResourceDescription_ReleaseDocumentation();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.core.AbstractResourceDescription#getReleaseFormat <em>Release Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Release Format</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.AbstractResourceDescription#getReleaseFormat()
	 * @see #getAbstractResourceDescription()
	 * @generated
	 */
	EReference getAbstractResourceDescription_ReleaseFormat();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.AbstractResourceDescriptionDirectoryEntry
	 * <em>Abstract Resource Description Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Abstract Resource Description Directory Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.AbstractResourceDescriptionDirectoryEntry
	 * @generated
	 */
	EClass getAbstractResourceDescriptionDirectoryEntry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.AnonymousEntityReference <em>Anonymous Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Anonymous Entity Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.AnonymousEntityReference
	 * @generated
	 */
	EClass getAnonymousEntityReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.AnonymousStatement <em>Anonymous Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Anonymous Statement</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.AnonymousStatement
	 * @generated
	 */
	EClass getAnonymousStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.AnonymousStatement#getPredicate
	 * <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.AnonymousStatement#getPredicate()
	 * @see #getAnonymousStatement()
	 * @generated
	 */
	EReference getAnonymousStatement_Predicate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.AnonymousStatement#getTarget
	 * <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.AnonymousStatement#getTarget()
	 * @see #getAnonymousStatement()
	 * @generated
	 */
	EReference getAnonymousStatement_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.AnonymousStatement#getStatmentQualifier
	 * <em>Statment Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Statment Qualifier</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.AnonymousStatement#getStatmentQualifier()
	 * @see #getAnonymousStatement()
	 * @generated
	 */
	EReference getAnonymousStatement_StatmentQualifier();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.AssociationReference <em>Association Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Association Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.AssociationReference
	 * @generated
	 */
	EClass getAssociationReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.BindingQualifierReference <em>Binding Qualifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Binding Qualifier Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.BindingQualifierReference
	 * @generated
	 */
	EClass getBindingQualifierReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.CaseSignificanceReference <em>Case Significance Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Case Significance Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.CaseSignificanceReference
	 * @generated
	 */
	EClass getCaseSignificanceReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.Changeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Changeable</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Changeable
	 * @generated
	 */
	EClass getChangeable();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.Changeable#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Changeable#getStatus()
	 * @see #getChangeable()
	 * @generated
	 */
	EReference getChangeable_Status();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.Changeable#getChangeDescription
	 * <em>Change Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Change Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Changeable#getChangeDescription()
	 * @see #getChangeable()
	 * @generated
	 */
	EReference getChangeable_ChangeDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Changeable#getEntryState <em>Entry State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Entry State</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Changeable#getEntryState()
	 * @see #getChangeable()
	 * @generated
	 */
	EAttribute getChangeable_EntryState();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription <em>Change Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Change Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeDescription
	 * @generated
	 */
	EClass getChangeDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getPrevImage
	 * <em>Prev Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Prev Image</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeDescription#getPrevImage()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EReference getChangeDescription_PrevImage();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeNotes
	 * <em>Change Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Change Notes</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeNotes()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EReference getChangeDescription_ChangeNotes();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeSource
	 * <em>Change Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Change Source</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeSource()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EReference getChangeDescription_ChangeSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getClonedResource
	 * <em>Cloned Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Cloned Resource</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeDescription#getClonedResource()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EReference getChangeDescription_ClonedResource();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeDate <em>Change Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Change Date</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeDate()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EAttribute getChangeDescription_ChangeDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeType <em>Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Change Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeType()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EAttribute getChangeDescription_ChangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getCommitted <em>Committed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Committed</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeDescription#getCommitted()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EAttribute getChangeDescription_Committed();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getContainingChangeSet
	 * <em>Containing Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Containing Change Set</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeDescription#getContainingChangeSet()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EAttribute getChangeDescription_ContainingChangeSet();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getEffectiveDate
	 * <em>Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Effective Date</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeDescription#getEffectiveDate()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EAttribute getChangeDescription_EffectiveDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getPrevChangeSet
	 * <em>Prev Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Prev Change Set</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeDescription#getPrevChangeSet()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EAttribute getChangeDescription_PrevChangeSet();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase <em>Change Set Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Change Set Base</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeSetBase
	 * @generated
	 */
	EClass getChangeSetBase();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeSetBase#getCreator()
	 * @see #getChangeSetBase()
	 * @generated
	 */
	EReference getChangeSetBase_Creator();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getChangeInstructions
	 * <em>Change Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Change Instructions</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeSetBase#getChangeInstructions()
	 * @see #getChangeSetBase()
	 * @generated
	 */
	EReference getChangeSetBase_ChangeInstructions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getMember <em>Member</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeSetBase#getMember()
	 * @see #getChangeSetBase()
	 * @generated
	 */
	EReference getChangeSetBase_Member();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getChangeSetURI <em>Change Set URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Change Set URI</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeSetBase#getChangeSetURI()
	 * @see #getChangeSetBase()
	 * @generated
	 */
	EAttribute getChangeSetBase_ChangeSetURI();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getCloseDate <em>Close Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Close Date</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeSetBase#getCloseDate()
	 * @see #getChangeSetBase()
	 * @generated
	 */
	EAttribute getChangeSetBase_CloseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeSetBase#getCreationDate()
	 * @see #getChangeSetBase()
	 * @generated
	 */
	EAttribute getChangeSetBase_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getEntryCount <em>Entry Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Entry Count</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeSetBase#getEntryCount()
	 * @see #getChangeSetBase()
	 * @generated
	 */
	EAttribute getChangeSetBase_EntryCount();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getOfficialEffectiveDate
	 * <em>Official Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Official Effective Date</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeSetBase#getOfficialEffectiveDate()
	 * @see #getChangeSetBase()
	 * @generated
	 */
	EAttribute getChangeSetBase_OfficialEffectiveDate();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.CodeSystemCategoryReference
	 * <em>Code System Category Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Code System Category Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.CodeSystemCategoryReference
	 * @generated
	 */
	EClass getCodeSystemCategoryReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.CodeSystemReference <em>Code System Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Code System Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.CodeSystemReference
	 * @generated
	 */
	EClass getCodeSystemReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference <em>Code System Version Reference</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Code System Version Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference
	 * @generated
	 */
	EClass getCodeSystemVersionReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference#getVersion
	 * <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference#getVersion()
	 * @see #getCodeSystemVersionReference()
	 * @generated
	 */
	EReference getCodeSystemVersionReference_Version();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference#getCodeSystem
	 * <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Code System</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference#getCodeSystem()
	 * @see #getCodeSystemVersionReference()
	 * @generated
	 */
	EReference getCodeSystemVersionReference_CodeSystem();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Comment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Comment#getType()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Type();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.ConceptDomainReference <em>Concept Domain Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Concept Domain Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ConceptDomainReference
	 * @generated
	 */
	EClass getConceptDomainReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.ContextReference <em>Context Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Context Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ContextReference
	 * @generated
	 */
	EClass getContextReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.Definition#getUsageContext
	 * <em>Usage Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Usage Context</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Definition#getUsageContext()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_UsageContext();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Definition#getDefinitionRole <em>Definition Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Definition Role</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Definition#getDefinitionRole()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_DefinitionRole();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem <em>Description In Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Description In Code System</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem
	 * @generated
	 */
	EClass getDescriptionInCodeSystem();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem#getDescribingCodeSystemVersion <em>Describing Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Describing Code System Version</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem#getDescribingCodeSystemVersion()
	 * @see #getDescriptionInCodeSystem()
	 * @generated
	 */
	EReference getDescriptionInCodeSystem_DescribingCodeSystemVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem#getDesignation
	 * <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Designation</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem#getDesignation()
	 * @see #getDescriptionInCodeSystem()
	 * @generated
	 */
	EAttribute getDescriptionInCodeSystem_Designation();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem#getHref()
	 * @see #getDescriptionInCodeSystem()
	 * @generated
	 */
	EAttribute getDescriptionInCodeSystem_Href();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.DesignationFidelityReference
	 * <em>Designation Fidelity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Designation Fidelity Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DesignationFidelityReference
	 * @generated
	 */
	EClass getDesignationFidelityReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.DesignationTypeReference <em>Designation Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Designation Type Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DesignationTypeReference
	 * @generated
	 */
	EClass getDesignationTypeReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Directory
	 * @generated
	 */
	EClass getDirectory();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.Directory#getDirectoryFilter
	 * <em>Directory Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Directory Filter</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Directory#getDirectoryFilter()
	 * @see #getDirectory()
	 * @generated
	 */
	EReference getDirectory_DirectoryFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.Directory#getSortCriteria
	 * <em>Sort Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Sort Criteria</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Directory#getSortCriteria()
	 * @see #getDirectory()
	 * @generated
	 */
	EReference getDirectory_SortCriteria();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Directory#getComplete <em>Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Complete</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Directory#getComplete()
	 * @see #getDirectory()
	 * @generated
	 */
	EAttribute getDirectory_Complete();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Directory#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Next</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Directory#getNext()
	 * @see #getDirectory()
	 * @generated
	 */
	EAttribute getDirectory_Next();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Directory#getNumEntries <em>Num Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Num Entries</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Directory#getNumEntries()
	 * @see #getDirectory()
	 * @generated
	 */
	EAttribute getDirectory_NumEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Directory#getPrev <em>Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Prev</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Directory#getPrev()
	 * @see #getDirectory()
	 * @generated
	 */
	EAttribute getDirectory_Prev();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.DirectoryEntry <em>Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Directory Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DirectoryEntry
	 * @generated
	 */
	EClass getDirectoryEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.DirectoryEntry#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DirectoryEntry#getHref()
	 * @see #getDirectoryEntry()
	 * @generated
	 */
	EAttribute getDirectoryEntry_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.DirectoryEntry#getMatchStrength <em>Match Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Match Strength</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DirectoryEntry#getMatchStrength()
	 * @see #getDirectoryEntry()
	 * @generated
	 */
	EAttribute getDirectoryEntry_MatchStrength();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.DirectoryEntry#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DirectoryEntry#getResourceName()
	 * @see #getDirectoryEntry()
	 * @generated
	 */
	EAttribute getDirectoryEntry_ResourceName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.EntityExpression <em>Entity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Entity Expression</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntityExpression
	 * @generated
	 */
	EClass getEntityExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.EntityExpression#getOntologyLanguageAndSyntax
	 * <em>Ontology Language And Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Ontology Language And Syntax</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntityExpression#getOntologyLanguageAndSyntax()
	 * @see #getEntityExpression()
	 * @generated
	 */
	EReference getEntityExpression_OntologyLanguageAndSyntax();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.EntityExpression#getExpression
	 * <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntityExpression#getExpression()
	 * @see #getEntityExpression()
	 * @generated
	 */
	EReference getEntityExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.EntityReference <em>Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Entity Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntityReference
	 * @generated
	 */
	EClass getEntityReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.EntityReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntityReference#getName()
	 * @see #getEntityReference()
	 * @generated
	 */
	EReference getEntityReference_Name();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.core.EntityReference#getKnownEntityDescription <em>Known Entity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Known Entity Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntityReference#getKnownEntityDescription()
	 * @see #getEntityReference()
	 * @generated
	 */
	EReference getEntityReference_KnownEntityDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.EntityReference#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntityReference#getAbout()
	 * @see #getEntityReference()
	 * @generated
	 */
	EAttribute getEntityReference_About();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.EntityReferenceList <em>Entity Reference List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Entity Reference List</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntityReferenceList
	 * @generated
	 */
	EClass getEntityReferenceList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.EntityReferenceList#getEntry
	 * <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntityReferenceList#getEntry()
	 * @see #getEntityReferenceList()
	 * @generated
	 */
	EReference getEntityReferenceList_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.EntitySynopsis <em>Entity Synopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Entity Synopsis</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntitySynopsis
	 * @generated
	 */
	EClass getEntitySynopsis();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.EntitySynopsis#getDesignation <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Designation</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntitySynopsis#getDesignation()
	 * @see #getEntitySynopsis()
	 * @generated
	 */
	EAttribute getEntitySynopsis_Designation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.EntryDescription <em>Entry Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Entry Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntryDescription
	 * @generated
	 */
	EClass getEntryDescription();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Example</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Example
	 * @generated
	 */
	EClass getExample();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.Filter#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Filter#getComponent()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Component();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.FilterComponent <em>Filter Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Filter Component</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.FilterComponent
	 * @generated
	 */
	EClass getFilterComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.FilterComponent#getMatchAlgorithm
	 * <em>Match Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Match Algorithm</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.FilterComponent#getMatchAlgorithm()
	 * @see #getFilterComponent()
	 * @generated
	 */
	EReference getFilterComponent_MatchAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.FilterComponent#getMatchValue <em>Match Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Match Value</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.FilterComponent#getMatchValue()
	 * @see #getFilterComponent()
	 * @generated
	 */
	EAttribute getFilterComponent_MatchValue();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.Finalizable <em>Finalizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Finalizable</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Finalizable
	 * @generated
	 */
	EClass getFinalizable();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Finalizable#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Finalizable#getState()
	 * @see #getFinalizable()
	 * @generated
	 */
	EAttribute getFinalizable_State();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.FormalityLevelReference <em>Formality Level Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Formality Level Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.FormalityLevelReference
	 * @generated
	 */
	EClass getFormalityLevelReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.FormatReference <em>Format Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Format Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.FormatReference
	 * @generated
	 */
	EClass getFormatReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.LanguageReference <em>Language Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Language Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.LanguageReference
	 * @generated
	 */
	EClass getLanguageReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.MapCorrelationReference <em>Map Correlation Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Map Correlation Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.MapCorrelationReference
	 * @generated
	 */
	EClass getMapCorrelationReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.MapReference <em>Map Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Map Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.MapReference
	 * @generated
	 */
	EClass getMapReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.MapVersionReference <em>Map Version Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Map Version Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.MapVersionReference
	 * @generated
	 */
	EClass getMapVersionReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.MapVersionReference#getMapVersion
	 * <em>Map Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Map Version</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.MapVersionReference#getMapVersion()
	 * @see #getMapVersionReference()
	 * @generated
	 */
	EReference getMapVersionReference_MapVersion();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.MapVersionReference#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.MapVersionReference#getMap()
	 * @see #getMapVersionReference()
	 * @generated
	 */
	EReference getMapVersionReference_Map();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.MatchAlgorithmReference <em>Match Algorithm Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Match Algorithm Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.MatchAlgorithmReference
	 * @generated
	 */
	EClass getMatchAlgorithmReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.Message#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Heading</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Message#getHeading()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Heading();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.ModelAttributeReference <em>Model Attribute Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Model Attribute Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ModelAttributeReference
	 * @generated
	 */
	EClass getModelAttributeReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.NameAndMeaningReference <em>Name And Meaning Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Name And Meaning Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.NameAndMeaningReference
	 * @generated
	 */
	EClass getNameAndMeaningReference();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.NameAndMeaningReference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.NameAndMeaningReference#getValue()
	 * @see #getNameAndMeaningReference()
	 * @generated
	 */
	EAttribute getNameAndMeaningReference_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.NameAndMeaningReference#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.NameAndMeaningReference#getHref()
	 * @see #getNameAndMeaningReference()
	 * @generated
	 */
	EAttribute getNameAndMeaningReference_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.NameAndMeaningReference#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.NameAndMeaningReference#getUri()
	 * @see #getNameAndMeaningReference()
	 * @generated
	 */
	EAttribute getNameAndMeaningReference_Uri();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.NamedEntityReference <em>Named Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Entity Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.NamedEntityReference
	 * @generated
	 */
	EClass getNamedEntityReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.NamespaceReference <em>Namespace Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Namespace Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.NamespaceReference
	 * @generated
	 */
	EClass getNamespaceReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Note#getAssertedInCodeSystemVersion
	 * <em>Asserted In Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Asserted In Code System Version</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Note#getAssertedInCodeSystemVersion()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_AssertedInCodeSystemVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Note#getCorrespondingStatement
	 * <em>Corresponding Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Corresponding Statement</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Note#getCorrespondingStatement()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_CorrespondingStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Note#getExternalIdentifier <em>External Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>External Identifier</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Note#getExternalIdentifier()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_ExternalIdentifier();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.OntologyDomainReference <em>Ontology Domain Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ontology Domain Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyDomainReference
	 * @generated
	 */
	EClass getOntologyDomainReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.OntologyEngineeringMethodologyReference
	 * <em>Ontology Engineering Methodology Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ontology Engineering Methodology Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyEngineeringMethodologyReference
	 * @generated
	 */
	EClass getOntologyEngineeringMethodologyReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.OntologyEngineeringToolReference
	 * <em>Ontology Engineering Tool Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ontology Engineering Tool Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyEngineeringToolReference
	 * @generated
	 */
	EClass getOntologyEngineeringToolReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax <em>Ontology Language And Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ontology Language And Syntax</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax
	 * @generated
	 */
	EClass getOntologyLanguageAndSyntax();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax#getOntologyLanguage
	 * <em>Ontology Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Ontology Language</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax#getOntologyLanguage()
	 * @see #getOntologyLanguageAndSyntax()
	 * @generated
	 */
	EReference getOntologyLanguageAndSyntax_OntologyLanguage();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax#getOntologySyntax
	 * <em>Ontology Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Ontology Syntax</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax#getOntologySyntax()
	 * @see #getOntologyLanguageAndSyntax()
	 * @generated
	 */
	EReference getOntologyLanguageAndSyntax_OntologySyntax();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.OntologyLanguageReference <em>Ontology Language Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ontology Language Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyLanguageReference
	 * @generated
	 */
	EClass getOntologyLanguageReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.OntologySyntaxReference <em>Ontology Syntax Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ontology Syntax Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OntologySyntaxReference
	 * @generated
	 */
	EClass getOntologySyntaxReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.OntologyTaskReference <em>Ontology Task Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ontology Task Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyTaskReference
	 * @generated
	 */
	EClass getOntologyTaskReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.OntologyTypeReference <em>Ontology Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ontology Type Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyTypeReference
	 * @generated
	 */
	EClass getOntologyTypeReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.OpaqueData <em>Opaque Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Opaque Data</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OpaqueData
	 * @generated
	 */
	EClass getOpaqueData();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.OpaqueData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OpaqueData#getValue()
	 * @see #getOpaqueData()
	 * @generated
	 */
	EReference getOpaqueData_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.OpaqueData#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Format</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OpaqueData#getFormat()
	 * @see #getOpaqueData()
	 * @generated
	 */
	EReference getOpaqueData_Format();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.OpaqueData#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OpaqueData#getLanguage()
	 * @see #getOpaqueData()
	 * @generated
	 */
	EReference getOpaqueData_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.OpaqueData#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.OpaqueData#getSchema()
	 * @see #getOpaqueData()
	 * @generated
	 */
	EAttribute getOpaqueData_Schema();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Parameter#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Parameter#getVal()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Val();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Parameter#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Arg</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Parameter#getArg()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Arg();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.PredicateReference <em>Predicate Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Predicate Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.PredicateReference
	 * @generated
	 */
	EClass getPredicateReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.Property#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Property#getPredicate()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Predicate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.Property#getPropertyQualifier
	 * <em>Property Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Property Qualifier</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Property#getPropertyQualifier()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_PropertyQualifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.Property#getCorrespondingStatement
	 * <em>Corresponding Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Corresponding Statement</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.Property#getCorrespondingStatement()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_CorrespondingStatement();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.PropertyReference <em>Property Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Property Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.PropertyReference
	 * @generated
	 */
	EClass getPropertyReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.PropertyReference#getReferenceTarget
	 * <em>Reference Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Reference Target</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.PropertyReference#getReferenceTarget()
	 * @see #getPropertyReference()
	 * @generated
	 */
	EReference getPropertyReference_ReferenceTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.PropertyReference#getReferenceType
	 * <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Reference Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.PropertyReference#getReferenceType()
	 * @see #getPropertyReference()
	 * @generated
	 */
	EAttribute getPropertyReference_ReferenceType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.ReasoningAlgorithmReference
	 * <em>Reasoning Algorithm Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Reasoning Algorithm Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ReasoningAlgorithmReference
	 * @generated
	 */
	EClass getReasoningAlgorithmReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription <em>Resource Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resource Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription
	 * @generated
	 */
	EClass getResourceDescription();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription#getKeyword()
	 * @see #getResourceDescription()
	 * @generated
	 */
	EAttribute getResourceDescription_Keyword();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getResourceType
	 * <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Resource Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription#getResourceType()
	 * @see #getResourceDescription()
	 * @generated
	 */
	EReference getResourceDescription_ResourceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getResourceSynopsis
	 * <em>Resource Synopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Resource Synopsis</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription#getResourceSynopsis()
	 * @see #getResourceDescription()
	 * @generated
	 */
	EReference getResourceDescription_ResourceSynopsis();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getAdditionalDocumentation
	 * <em>Additional Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Additional Documentation</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription#getAdditionalDocumentation()
	 * @see #getResourceDescription()
	 * @generated
	 */
	EAttribute getResourceDescription_AdditionalDocumentation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getSourceAndRole
	 * <em>Source And Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Source And Role</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription#getSourceAndRole()
	 * @see #getResourceDescription()
	 * @generated
	 */
	EReference getResourceDescription_SourceAndRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getRights <em>Rights</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Rights</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription#getRights()
	 * @see #getResourceDescription()
	 * @generated
	 */
	EReference getResourceDescription_Rights();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getNote
	 * <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription#getNote()
	 * @see #getResourceDescription()
	 * @generated
	 */
	EReference getResourceDescription_Note();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getProperty
	 * <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription#getProperty()
	 * @see #getResourceDescription()
	 * @generated
	 */
	EReference getResourceDescription_Property();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getAlternateID
	 * <em>Alternate ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Alternate ID</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription#getAlternateID()
	 * @see #getResourceDescription()
	 * @generated
	 */
	EAttribute getResourceDescription_AlternateID();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getSourceStatements
	 * <em>Source Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source Statements</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription#getSourceStatements()
	 * @see #getResourceDescription()
	 * @generated
	 */
	EAttribute getResourceDescription_SourceStatements();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription#getAbout()
	 * @see #getResourceDescription()
	 * @generated
	 */
	EAttribute getResourceDescription_About();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getFormalName <em>Formal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Formal Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription#getFormalName()
	 * @see #getResourceDescription()
	 * @generated
	 */
	EAttribute getResourceDescription_FormalName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry
	 * <em>Resource Description Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resource Description Directory Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry
	 * @generated
	 */
	EClass getResourceDescriptionDirectoryEntry();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry#getResourceSynopsis <em>Resource Synopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Resource Synopsis</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry#getResourceSynopsis()
	 * @see #getResourceDescriptionDirectoryEntry()
	 * @generated
	 */
	EReference getResourceDescriptionDirectoryEntry_ResourceSynopsis();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry#getAbout <em>About</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry#getAbout()
	 * @see #getResourceDescriptionDirectoryEntry()
	 * @generated
	 */
	EAttribute getResourceDescriptionDirectoryEntry_About();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry#getFormalName
	 * <em>Formal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Formal Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry#getFormalName()
	 * @see #getResourceDescriptionDirectoryEntry()
	 * @generated
	 */
	EAttribute getResourceDescriptionDirectoryEntry_FormalName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription <em>Resource Version Description</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resource Version Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescription
	 * @generated
	 */
	EClass getResourceVersionDescription();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getSourceAndNotation <em>Source And Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Source And Notation</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getSourceAndNotation()
	 * @see #getResourceVersionDescription()
	 * @generated
	 */
	EReference getResourceVersionDescription_SourceAndNotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getPredecessor
	 * <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Predecessor</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getPredecessor()
	 * @see #getResourceVersionDescription()
	 * @generated
	 */
	EReference getResourceVersionDescription_Predecessor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getOfficialResourceVersionId
	 * <em>Official Resource Version Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Official Resource Version Id</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getOfficialResourceVersionId()
	 * @see #getResourceVersionDescription()
	 * @generated
	 */
	EAttribute getResourceVersionDescription_OfficialResourceVersionId();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getOfficialReleaseDate
	 * <em>Official Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Official Release Date</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getOfficialReleaseDate()
	 * @see #getResourceVersionDescription()
	 * @generated
	 */
	EAttribute getResourceVersionDescription_OfficialReleaseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getOfficialActivationDate
	 * <em>Official Activation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Official Activation Date</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getOfficialActivationDate()
	 * @see #getResourceVersionDescription()
	 * @generated
	 */
	EAttribute getResourceVersionDescription_OfficialActivationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getDocumentURI
	 * <em>Document URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Document URI</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getDocumentURI()
	 * @see #getResourceVersionDescription()
	 * @generated
	 */
	EAttribute getResourceVersionDescription_DocumentURI();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getState()
	 * @see #getResourceVersionDescription()
	 * @generated
	 */
	EAttribute getResourceVersionDescription_State();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry
	 * <em>Resource Version Description Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resource Version Description Directory Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry
	 * @generated
	 */
	EClass getResourceVersionDescriptionDirectoryEntry();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry#getOfficialResourceVersionId
	 * <em>Official Resource Version Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Official Resource Version Id</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry#getOfficialResourceVersionId()
	 * @see #getResourceVersionDescriptionDirectoryEntry()
	 * @generated
	 */
	EAttribute getResourceVersionDescriptionDirectoryEntry_OfficialResourceVersionId();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry#getOfficialReleaseDate <em>Official Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Official Release Date</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry#getOfficialReleaseDate()
	 * @see #getResourceVersionDescriptionDirectoryEntry()
	 * @generated
	 */
	EAttribute getResourceVersionDescriptionDirectoryEntry_OfficialReleaseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry#getDocumentURI
	 * <em>Document URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Document URI</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry#getDocumentURI()
	 * @see #getResourceVersionDescriptionDirectoryEntry()
	 * @generated
	 */
	EAttribute getResourceVersionDescriptionDirectoryEntry_DocumentURI();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.RESTResource <em>REST Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>REST Resource</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.RESTResource
	 * @generated
	 */
	EClass getRESTResource();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.RESTResource#getResourceRoot <em>Resource Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resource Root</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.RESTResource#getResourceRoot()
	 * @see #getRESTResource()
	 * @generated
	 */
	EAttribute getRESTResource_ResourceRoot();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.RESTResource#getResourceURI <em>Resource URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resource URI</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.RESTResource#getResourceURI()
	 * @see #getRESTResource()
	 * @generated
	 */
	EAttribute getRESTResource_ResourceURI();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.RESTResource#getParameter
	 * <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.RESTResource#getParameter()
	 * @see #getRESTResource()
	 * @generated
	 */
	EReference getRESTResource_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.RESTResource#getAccessDate <em>Access Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Access Date</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.RESTResource#getAccessDate()
	 * @see #getRESTResource()
	 * @generated
	 */
	EAttribute getRESTResource_AccessDate();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.RoleReference <em>Role Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Role Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.RoleReference
	 * @generated
	 */
	EClass getRoleReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.ScopedEntityName <em>Scoped Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Scoped Entity Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ScopedEntityName
	 * @generated
	 */
	EClass getScopedEntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ScopedEntityName#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ScopedEntityName#getNamespace()
	 * @see #getScopedEntityName()
	 * @generated
	 */
	EAttribute getScopedEntityName_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.ScopedEntityName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ScopedEntityName#getName()
	 * @see #getScopedEntityName()
	 * @generated
	 */
	EAttribute getScopedEntityName_Name();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.SortCriteria <em>Sort Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Sort Criteria</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SortCriteria
	 * @generated
	 */
	EClass getSortCriteria();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.SortCriteria#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SortCriteria#getEntry()
	 * @see #getSortCriteria()
	 * @generated
	 */
	EReference getSortCriteria_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.SortCriterion <em>Sort Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Sort Criterion</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SortCriterion
	 * @generated
	 */
	EClass getSortCriterion();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.SortCriterion#getSortElement
	 * <em>Sort Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Sort Element</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SortCriterion#getSortElement()
	 * @see #getSortCriterion()
	 * @generated
	 */
	EReference getSortCriterion_SortElement();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.SortCriterion#getEntryOrder <em>Entry Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Entry Order</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SortCriterion#getEntryOrder()
	 * @see #getSortCriterion()
	 * @generated
	 */
	EAttribute getSortCriterion_EntryOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.SortCriterion#getSortDirection <em>Sort Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Sort Direction</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SortCriterion#getSortDirection()
	 * @see #getSortCriterion()
	 * @generated
	 */
	EAttribute getSortCriterion_SortDirection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation <em>Source And Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Source And Notation</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SourceAndNotation
	 * @generated
	 */
	EClass getSourceAndNotation();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceAndNotationDescription
	 * <em>Source And Notation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source And Notation Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceAndNotationDescription()
	 * @see #getSourceAndNotation()
	 * @generated
	 */
	EAttribute getSourceAndNotation_SourceAndNotationDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceDocument
	 * <em>Source Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source Document</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceDocument()
	 * @see #getSourceAndNotation()
	 * @generated
	 */
	EAttribute getSourceAndNotation_SourceDocument();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceLanguage
	 * <em>Source Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Source Language</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceLanguage()
	 * @see #getSourceAndNotation()
	 * @generated
	 */
	EReference getSourceAndNotation_SourceLanguage();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceDocumentSyntax
	 * <em>Source Document Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Source Document Syntax</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceDocumentSyntax()
	 * @see #getSourceAndNotation()
	 * @generated
	 */
	EReference getSourceAndNotation_SourceDocumentSyntax();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference <em>Source And Role Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Source And Role Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SourceAndRoleReference
	 * @generated
	 */
	EClass getSourceAndRoleReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getMixed()
	 * @see #getSourceAndRoleReference()
	 * @generated
	 */
	EAttribute getSourceAndRoleReference_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getSource
	 * <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getSource()
	 * @see #getSourceAndRoleReference()
	 * @generated
	 */
	EReference getSourceAndRoleReference_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getRole <em>Role</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getRole()
	 * @see #getSourceAndRoleReference()
	 * @generated
	 */
	EReference getSourceAndRoleReference_Role();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getBibliographicLink
	 * <em>Bibliographic Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Bibliographic Link</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getBibliographicLink()
	 * @see #getSourceAndRoleReference()
	 * @generated
	 */
	EReference getSourceAndRoleReference_BibliographicLink();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.SourceReference <em>Source Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Source Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SourceReference
	 * @generated
	 */
	EClass getSourceReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.StatementTarget <em>Statement Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Statement Target</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.StatementTarget
	 * @generated
	 */
	EClass getStatementTarget();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.StatementTarget#getEntity()
	 * @see #getStatementTarget()
	 * @generated
	 */
	EReference getStatementTarget_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.StatementTarget#getLiteral()
	 * @see #getStatementTarget()
	 * @generated
	 */
	EReference getStatementTarget_Literal();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.StatementTarget#getResource()
	 * @see #getStatementTarget()
	 * @generated
	 */
	EAttribute getStatementTarget_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getBnode <em>Bnode</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Bnode</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.StatementTarget#getBnode()
	 * @see #getStatementTarget()
	 * @generated
	 */
	EReference getStatementTarget_Bnode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getExternalIdentifier
	 * <em>External Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>External Identifier</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.StatementTarget#getExternalIdentifier()
	 * @see #getStatementTarget()
	 * @generated
	 */
	EAttribute getStatementTarget_ExternalIdentifier();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.StatusReference <em>Status Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Status Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.StatusReference
	 * @generated
	 */
	EClass getStatusReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.TsAnyType <em>Ts Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ts Any Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.TsAnyType
	 * @generated
	 */
	EClass getTsAnyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.core.TsAnyType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.TsAnyType#getMixed()
	 * @see #getTsAnyType()
	 * @generated
	 */
	EAttribute getTsAnyType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.core.TsAnyType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.TsAnyType#getAny()
	 * @see #getTsAnyType()
	 * @generated
	 */
	EAttribute getTsAnyType_Any();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName <em>URI And Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>URI And Entity Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.URIAndEntityName
	 * @generated
	 */
	EClass getURIAndEntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.URIAndEntityName#getNamespace()
	 * @see #getURIAndEntityName()
	 * @generated
	 */
	EAttribute getURIAndEntityName_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.URIAndEntityName#getName()
	 * @see #getURIAndEntityName()
	 * @generated
	 */
	EAttribute getURIAndEntityName_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.URIAndEntityName#getHref()
	 * @see #getURIAndEntityName()
	 * @generated
	 */
	EAttribute getURIAndEntityName_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.URIAndEntityName#getUri()
	 * @see #getURIAndEntityName()
	 * @generated
	 */
	EAttribute getURIAndEntityName_Uri();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.core.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.core.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.core.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.DocumentRoot#getEntityExpression
	 * <em>Entity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entity Expression</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DocumentRoot#getEntityExpression()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EntityExpression();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference
	 * <em>Value Set Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Value Set Definition Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference
	 * @generated
	 */
	EClass getValueSetDefinitionReference();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference#getValueSetDefinition <em>Value Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set Definition</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference#getValueSetDefinition()
	 * @see #getValueSetDefinitionReference()
	 * @generated
	 */
	EReference getValueSetDefinitionReference_ValueSetDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference#getValueSet
	 * <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value Set</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference#getValueSet()
	 * @see #getValueSetDefinitionReference()
	 * @generated
	 */
	EReference getValueSetDefinitionReference_ValueSet();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.ValueSetReference <em>Value Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Value Set Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ValueSetReference
	 * @generated
	 */
	EClass getValueSetReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.core.VersionTagReference <em>Version Tag Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Version Tag Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.VersionTagReference
	 * @generated
	 */
	EClass getVersionTagReference();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.core.AssociationDirection <em>Association Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Association Direction</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.AssociationDirection
	 * @generated
	 */
	EEnum getAssociationDirection();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.core.ChangeCommitted <em>Change Committed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Change Committed</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeCommitted
	 * @generated
	 */
	EEnum getChangeCommitted();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.core.ChangeType <em>Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Change Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeType
	 * @generated
	 */
	EEnum getChangeType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.core.CompleteDirectory <em>Complete Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Complete Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.CompleteDirectory
	 * @generated
	 */
	EEnum getCompleteDirectory();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.core.CTS2ResourceType <em>CTS2 Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>CTS2 Resource Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.CTS2ResourceType
	 * @generated
	 */
	EEnum getCTS2ResourceType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.core.DefinitionRole <em>Definition Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Definition Role</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DefinitionRole
	 * @generated
	 */
	EEnum getDefinitionRole();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.core.EntryState <em>Entry State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Entry State</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntryState
	 * @generated
	 */
	EEnum getEntryState();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.core.FinalizableState <em>Finalizable State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Finalizable State</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.FinalizableState
	 * @generated
	 */
	EEnum getFinalizableState();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.core.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Note Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.NoteType
	 * @generated
	 */
	EEnum getNoteType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.core.SetOperator <em>Set Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Set Operator</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SetOperator
	 * @generated
	 */
	EEnum getSetOperator();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.core.SortDirection <em>Sort Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Sort Direction</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SortDirection
	 * @generated
	 */
	EEnum getSortDirection();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.core.TargetReferenceType <em>Target Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Target Reference Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.TargetReferenceType
	 * @generated
	 */
	EEnum getTargetReferenceType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Amount Of Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Amount Of Time</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='AmountOfTime' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger'"
	 * @generated
	 */
	EDataType getAmountOfTime();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.core.AssociationDirection <em>Association Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Association Direction Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.AssociationDirection
	 * @model instanceClass="org.openhealthtools.mdht.cts2.core.AssociationDirection"
	 *        extendedMetaData="name='AssociationDirection:Object' baseType='AssociationDirection'"
	 * @generated
	 */
	EDataType getAssociationDirectionObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Association Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Association Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='AssociationDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getAssociationDirectoryURI();

	/**
	 * Returns the meta object for data type '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='Boolean' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean'"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Boolean Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='Boolean:Object' baseType='Boolean'"
	 * @generated
	 */
	EDataType getBooleanObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.core.ChangeCommitted <em>Change Committed Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Change Committed Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeCommitted
	 * @model instanceClass="org.openhealthtools.mdht.cts2.core.ChangeCommitted"
	 *        extendedMetaData="name='ChangeCommitted:Object' baseType='ChangeCommitted'"
	 * @generated
	 */
	EDataType getChangeCommittedObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Change Set Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Change Set Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ChangeSetDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getChangeSetDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Change Set URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Change Set URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ChangeSetURI' baseType='PersistentURI'"
	 * @generated
	 */
	EDataType getChangeSetURI();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.core.ChangeType <em>Change Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Change Type Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeType
	 * @model instanceClass="org.openhealthtools.mdht.cts2.core.ChangeType"
	 *        extendedMetaData="name='ChangeType:Object' baseType='ChangeType'"
	 * @generated
	 */
	EDataType getChangeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Code System Catalog Entry Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Code System Catalog Entry Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CodeSystemCatalogEntryDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getCodeSystemCatalogEntryDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Code System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Code System Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CodeSystemName' baseType='LocalIdentifier'"
	 * @generated
	 */
	EDataType getCodeSystemName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Code System Version Catalog Entry Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Code System Version Catalog Entry Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CodeSystemVersionCatalogEntryDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getCodeSystemVersionCatalogEntryDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Code System Version Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Code System Version Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CodeSystemVersionName' baseType='LocalIdentifier'"
	 * @generated
	 */
	EDataType getCodeSystemVersionName();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.core.CompleteDirectory <em>Complete Directory Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Complete Directory Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.CompleteDirectory
	 * @model instanceClass="org.openhealthtools.mdht.cts2.core.CompleteDirectory"
	 *        extendedMetaData="name='CompleteDirectory:Object' baseType='CompleteDirectory'"
	 * @generated
	 */
	EDataType getCompleteDirectoryObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Concept Domain Binding Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Concept Domain Binding Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ConceptDomainBindingDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getConceptDomainBindingDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Concept Domain Catalog Entry Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Concept Domain Catalog Entry Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ConceptDomainCatalogEntryDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getConceptDomainCatalogEntryDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Concept Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Concept Domain Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ConceptDomainName' baseType='LocalIdentifier'"
	 * @generated
	 */
	EDataType getConceptDomainName();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.core.CTS2ResourceType <em>CTS2 Resource Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>CTS2 Resource Type Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.CTS2ResourceType
	 * @model instanceClass="org.openhealthtools.mdht.cts2.core.CTS2ResourceType"
	 *        extendedMetaData="name='CTS2ResourceType:Object' baseType='CTS2ResourceType'"
	 * @generated
	 */
	EDataType getCTS2ResourceTypeObject();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date And Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Date And Time</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='DateAndTime' baseType='http://www.eclipse.org/emf/2003/XMLType#dateTime'"
	 * @generated
	 */
	EDataType getDateAndTime();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.core.DefinitionRole <em>Definition Role Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Definition Role Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.DefinitionRole
	 * @model instanceClass="org.openhealthtools.mdht.cts2.core.DefinitionRole"
	 *        extendedMetaData="name='DefinitionRole:Object' baseType='DefinitionRole'"
	 * @generated
	 */
	EDataType getDefinitionRoleObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DirectoryURI' baseType='LocalURI'"
	 * @generated
	 */
	EDataType getDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Document URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Document URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DocumentURI' baseType='PersistentURI'"
	 * @generated
	 */
	EDataType getDocumentURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Entity Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Entity Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='EntityDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getEntityDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.core.EntryState <em>Entry State Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Entry State Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.EntryState
	 * @model instanceClass="org.openhealthtools.mdht.cts2.core.EntryState"
	 *        extendedMetaData="name='EntryState:Object' baseType='EntryState'"
	 * @generated
	 */
	EDataType getEntryStateObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Enumeration</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Enumeration' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getEnumeration();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>External URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>External URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ExternalURI' baseType='PersistentURI'"
	 * @generated
	 */
	EDataType getExternalURI();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.core.FinalizableState <em>Finalizable State Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Finalizable State Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.FinalizableState
	 * @model instanceClass="org.openhealthtools.mdht.cts2.core.FinalizableState"
	 *        extendedMetaData="name='FinalizableState:Object' baseType='FinalizableState'"
	 * @generated
	 */
	EDataType getFinalizableStateObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Local Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Local Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LocalIdentifier' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1'"
	 * @generated
	 */
	EDataType getLocalIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Local URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Local URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LocalURI' baseType='URI'"
	 * @generated
	 */
	EDataType getLocalURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Map Catalog Entry Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Map Catalog Entry Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MapCatalogEntryDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getMapCatalogEntryDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Map Entry Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Map Entry Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MapEntryDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getMapEntryDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Map Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Map Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MapName' baseType='LocalIdentifier'"
	 * @generated
	 */
	EDataType getMapName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Map Version Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Map Version Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MapVersionDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getMapVersionDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Map Version Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Map Version Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MapVersionName' baseType='LocalIdentifier'"
	 * @generated
	 */
	EDataType getMapVersionName();

	/**
	 * Returns the meta object for data type '<em>Match Strength</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Match Strength</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='MatchStrength' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minExclusive='0.0' maxInclusive='1.0'"
	 * @generated
	 */
	EDataType getMatchStrength();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Match Strength Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Match Strength Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='MatchStrength:Object' baseType='MatchStrength'"
	 * @generated
	 */
	EDataType getMatchStrengthObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Namespace Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Namespace Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NamespaceIdentifier' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName' minLength='1'"
	 * @generated
	 */
	EDataType getNamespaceIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Natural Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Natural Number</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='NaturalNumber' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getNaturalNumber();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.core.NoteType <em>Note Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Note Type Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.NoteType
	 * @model instanceClass="org.openhealthtools.mdht.cts2.core.NoteType"
	 *        extendedMetaData="name='NoteType:Object' baseType='NoteType'"
	 * @generated
	 */
	EDataType getNoteTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Persistent URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Persistent URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PersistentURI' baseType='URI'"
	 * @generated
	 */
	EDataType getPersistentURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Rendering URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Rendering URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='RenderingURI' baseType='LocalURI'"
	 * @generated
	 */
	EDataType getRenderingURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Resolved Value Set Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Resolved Value Set Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ResolvedValueSetDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getResolvedValueSetDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Service URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Service URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ServiceURI' baseType='LocalURI'"
	 * @generated
	 */
	EDataType getServiceURI();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.core.SetOperator <em>Set Operator Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Set Operator Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SetOperator
	 * @model instanceClass="org.openhealthtools.mdht.cts2.core.SetOperator"
	 *        extendedMetaData="name='SetOperator:Object' baseType='SetOperator'"
	 * @generated
	 */
	EDataType getSetOperatorObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.core.SortDirection <em>Sort Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Sort Direction Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.SortDirection
	 * @model instanceClass="org.openhealthtools.mdht.cts2.core.SortDirection"
	 *        extendedMetaData="name='SortDirection:Object' baseType='SortDirection'"
	 * @generated
	 */
	EDataType getSortDirectionObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Statement Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Statement Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='StatementDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getStatementDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='String' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.core.TargetReferenceType <em>Target Reference Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Target Reference Type Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.core.TargetReferenceType
	 * @model instanceClass="org.openhealthtools.mdht.cts2.core.TargetReferenceType"
	 *        extendedMetaData="name='TargetReferenceType:Object' baseType='TargetReferenceType'"
	 * @generated
	 */
	EDataType getTargetReferenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='URI' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Value Set Catalog Entry Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Value Set Catalog Entry Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ValueSetCatalogEntryDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getValueSetCatalogEntryDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Value Set Definition Directory URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Value Set Definition Directory URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ValueSetDefinitionDirectoryURI' baseType='DirectoryURI'"
	 * @generated
	 */
	EDataType getValueSetDefinitionDirectoryURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Value Set Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Value Set Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ValueSetName' baseType='LocalIdentifier'"
	 * @generated
	 */
	EDataType getValueSetName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Tag Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Version Tag Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='VersionTagName' baseType='LocalIdentifier'"
	 * @generated
	 */
	EDataType getVersionTagName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.AbstractResourceDescriptionImpl
		 * <em>Abstract Resource Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.AbstractResourceDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAbstractResourceDescription()
		 * @generated
		 */
		EClass ABSTRACT_RESOURCE_DESCRIPTION = eINSTANCE.getAbstractResourceDescription();

		/**
		 * The meta object literal for the '<em><b>Release Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION = eINSTANCE.getAbstractResourceDescription_ReleaseDocumentation();

		/**
		 * The meta object literal for the '<em><b>Release Format</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT = eINSTANCE.getAbstractResourceDescription_ReleaseFormat();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.AbstractResourceDescriptionDirectoryEntryImpl
		 * <em>Abstract Resource Description Directory Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.AbstractResourceDescriptionDirectoryEntryImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAbstractResourceDescriptionDirectoryEntry()
		 * @generated
		 */
		EClass ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY = eINSTANCE.getAbstractResourceDescriptionDirectoryEntry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.AnonymousEntityReferenceImpl
		 * <em>Anonymous Entity Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.AnonymousEntityReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAnonymousEntityReference()
		 * @generated
		 */
		EClass ANONYMOUS_ENTITY_REFERENCE = eINSTANCE.getAnonymousEntityReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.AnonymousStatementImpl <em>Anonymous Statement</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.AnonymousStatementImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAnonymousStatement()
		 * @generated
		 */
		EClass ANONYMOUS_STATEMENT = eINSTANCE.getAnonymousStatement();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ANONYMOUS_STATEMENT__PREDICATE = eINSTANCE.getAnonymousStatement_Predicate();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ANONYMOUS_STATEMENT__TARGET = eINSTANCE.getAnonymousStatement_Target();

		/**
		 * The meta object literal for the '<em><b>Statment Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ANONYMOUS_STATEMENT__STATMENT_QUALIFIER = eINSTANCE.getAnonymousStatement_StatmentQualifier();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.AssociationReferenceImpl <em>Association Reference</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.AssociationReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAssociationReference()
		 * @generated
		 */
		EClass ASSOCIATION_REFERENCE = eINSTANCE.getAssociationReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.BindingQualifierReferenceImpl
		 * <em>Binding Qualifier Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.BindingQualifierReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getBindingQualifierReference()
		 * @generated
		 */
		EClass BINDING_QUALIFIER_REFERENCE = eINSTANCE.getBindingQualifierReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.CaseSignificanceReferenceImpl
		 * <em>Case Significance Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.CaseSignificanceReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCaseSignificanceReference()
		 * @generated
		 */
		EClass CASE_SIGNIFICANCE_REFERENCE = eINSTANCE.getCaseSignificanceReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ChangeableImpl <em>Changeable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ChangeableImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeable()
		 * @generated
		 */
		EClass CHANGEABLE = eINSTANCE.getChangeable();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CHANGEABLE__STATUS = eINSTANCE.getChangeable_Status();

		/**
		 * The meta object literal for the '<em><b>Change Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CHANGEABLE__CHANGE_DESCRIPTION = eINSTANCE.getChangeable_ChangeDescription();

		/**
		 * The meta object literal for the '<em><b>Entry State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHANGEABLE__ENTRY_STATE = eINSTANCE.getChangeable_EntryState();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl <em>Change Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeDescription()
		 * @generated
		 */
		EClass CHANGE_DESCRIPTION = eINSTANCE.getChangeDescription();

		/**
		 * The meta object literal for the '<em><b>Prev Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CHANGE_DESCRIPTION__PREV_IMAGE = eINSTANCE.getChangeDescription_PrevImage();

		/**
		 * The meta object literal for the '<em><b>Change Notes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CHANGE_DESCRIPTION__CHANGE_NOTES = eINSTANCE.getChangeDescription_ChangeNotes();

		/**
		 * The meta object literal for the '<em><b>Change Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CHANGE_DESCRIPTION__CHANGE_SOURCE = eINSTANCE.getChangeDescription_ChangeSource();

		/**
		 * The meta object literal for the '<em><b>Cloned Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CHANGE_DESCRIPTION__CLONED_RESOURCE = eINSTANCE.getChangeDescription_ClonedResource();

		/**
		 * The meta object literal for the '<em><b>Change Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHANGE_DESCRIPTION__CHANGE_DATE = eINSTANCE.getChangeDescription_ChangeDate();

		/**
		 * The meta object literal for the '<em><b>Change Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHANGE_DESCRIPTION__CHANGE_TYPE = eINSTANCE.getChangeDescription_ChangeType();

		/**
		 * The meta object literal for the '<em><b>Committed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHANGE_DESCRIPTION__COMMITTED = eINSTANCE.getChangeDescription_Committed();

		/**
		 * The meta object literal for the '<em><b>Containing Change Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHANGE_DESCRIPTION__CONTAINING_CHANGE_SET = eINSTANCE.getChangeDescription_ContainingChangeSet();

		/**
		 * The meta object literal for the '<em><b>Effective Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHANGE_DESCRIPTION__EFFECTIVE_DATE = eINSTANCE.getChangeDescription_EffectiveDate();

		/**
		 * The meta object literal for the '<em><b>Prev Change Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHANGE_DESCRIPTION__PREV_CHANGE_SET = eINSTANCE.getChangeDescription_PrevChangeSet();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ChangeSetBaseImpl <em>Change Set Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ChangeSetBaseImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeSetBase()
		 * @generated
		 */
		EClass CHANGE_SET_BASE = eINSTANCE.getChangeSetBase();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CHANGE_SET_BASE__CREATOR = eINSTANCE.getChangeSetBase_Creator();

		/**
		 * The meta object literal for the '<em><b>Change Instructions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CHANGE_SET_BASE__CHANGE_INSTRUCTIONS = eINSTANCE.getChangeSetBase_ChangeInstructions();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CHANGE_SET_BASE__MEMBER = eINSTANCE.getChangeSetBase_Member();

		/**
		 * The meta object literal for the '<em><b>Change Set URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHANGE_SET_BASE__CHANGE_SET_URI = eINSTANCE.getChangeSetBase_ChangeSetURI();

		/**
		 * The meta object literal for the '<em><b>Close Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHANGE_SET_BASE__CLOSE_DATE = eINSTANCE.getChangeSetBase_CloseDate();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHANGE_SET_BASE__CREATION_DATE = eINSTANCE.getChangeSetBase_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Entry Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHANGE_SET_BASE__ENTRY_COUNT = eINSTANCE.getChangeSetBase_EntryCount();

		/**
		 * The meta object literal for the '<em><b>Official Effective Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHANGE_SET_BASE__OFFICIAL_EFFECTIVE_DATE = eINSTANCE.getChangeSetBase_OfficialEffectiveDate();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.CodeSystemCategoryReferenceImpl
		 * <em>Code System Category Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.CodeSystemCategoryReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemCategoryReference()
		 * @generated
		 */
		EClass CODE_SYSTEM_CATEGORY_REFERENCE = eINSTANCE.getCodeSystemCategoryReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.CodeSystemReferenceImpl <em>Code System Reference</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.CodeSystemReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemReference()
		 * @generated
		 */
		EClass CODE_SYSTEM_REFERENCE = eINSTANCE.getCodeSystemReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.CodeSystemVersionReferenceImpl
		 * <em>Code System Version Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.CodeSystemVersionReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemVersionReference()
		 * @generated
		 */
		EClass CODE_SYSTEM_VERSION_REFERENCE = eINSTANCE.getCodeSystemVersionReference();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION_REFERENCE__VERSION = eINSTANCE.getCodeSystemVersionReference_Version();

		/**
		 * The meta object literal for the '<em><b>Code System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM = eINSTANCE.getCodeSystemVersionReference_CodeSystem();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.CommentImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute COMMENT__TYPE = eINSTANCE.getComment_Type();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ConceptDomainReferenceImpl
		 * <em>Concept Domain Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ConceptDomainReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getConceptDomainReference()
		 * @generated
		 */
		EClass CONCEPT_DOMAIN_REFERENCE = eINSTANCE.getConceptDomainReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ContextReferenceImpl <em>Context Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ContextReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getContextReference()
		 * @generated
		 */
		EClass CONTEXT_REFERENCE = eINSTANCE.getContextReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.DefinitionImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Usage Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DEFINITION__USAGE_CONTEXT = eINSTANCE.getDefinition_UsageContext();

		/**
		 * The meta object literal for the '<em><b>Definition Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DEFINITION__DEFINITION_ROLE = eINSTANCE.getDefinition_DefinitionRole();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.DescriptionInCodeSystemImpl
		 * <em>Description In Code System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.DescriptionInCodeSystemImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDescriptionInCodeSystem()
		 * @generated
		 */
		EClass DESCRIPTION_IN_CODE_SYSTEM = eINSTANCE.getDescriptionInCodeSystem();

		/**
		 * The meta object literal for the '<em><b>Describing Code System Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DESCRIPTION_IN_CODE_SYSTEM__DESCRIBING_CODE_SYSTEM_VERSION = eINSTANCE.getDescriptionInCodeSystem_DescribingCodeSystemVersion();

		/**
		 * The meta object literal for the '<em><b>Designation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DESCRIPTION_IN_CODE_SYSTEM__DESIGNATION = eINSTANCE.getDescriptionInCodeSystem_Designation();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DESCRIPTION_IN_CODE_SYSTEM__HREF = eINSTANCE.getDescriptionInCodeSystem_Href();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.DesignationFidelityReferenceImpl
		 * <em>Designation Fidelity Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.DesignationFidelityReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDesignationFidelityReference()
		 * @generated
		 */
		EClass DESIGNATION_FIDELITY_REFERENCE = eINSTANCE.getDesignationFidelityReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.DesignationTypeReferenceImpl
		 * <em>Designation Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.DesignationTypeReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDesignationTypeReference()
		 * @generated
		 */
		EClass DESIGNATION_TYPE_REFERENCE = eINSTANCE.getDesignationTypeReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.DirectoryImpl <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.DirectoryImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDirectory()
		 * @generated
		 */
		EClass DIRECTORY = eINSTANCE.getDirectory();

		/**
		 * The meta object literal for the '<em><b>Directory Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIRECTORY__DIRECTORY_FILTER = eINSTANCE.getDirectory_DirectoryFilter();

		/**
		 * The meta object literal for the '<em><b>Sort Criteria</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIRECTORY__SORT_CRITERIA = eINSTANCE.getDirectory_SortCriteria();

		/**
		 * The meta object literal for the '<em><b>Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIRECTORY__COMPLETE = eINSTANCE.getDirectory_Complete();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIRECTORY__NEXT = eINSTANCE.getDirectory_Next();

		/**
		 * The meta object literal for the '<em><b>Num Entries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIRECTORY__NUM_ENTRIES = eINSTANCE.getDirectory_NumEntries();

		/**
		 * The meta object literal for the '<em><b>Prev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIRECTORY__PREV = eINSTANCE.getDirectory_Prev();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.DirectoryEntryImpl <em>Directory Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.DirectoryEntryImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDirectoryEntry()
		 * @generated
		 */
		EClass DIRECTORY_ENTRY = eINSTANCE.getDirectoryEntry();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIRECTORY_ENTRY__HREF = eINSTANCE.getDirectoryEntry_Href();

		/**
		 * The meta object literal for the '<em><b>Match Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIRECTORY_ENTRY__MATCH_STRENGTH = eINSTANCE.getDirectoryEntry_MatchStrength();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIRECTORY_ENTRY__RESOURCE_NAME = eINSTANCE.getDirectoryEntry_ResourceName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.EntityExpressionImpl <em>Entity Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.EntityExpressionImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntityExpression()
		 * @generated
		 */
		EClass ENTITY_EXPRESSION = eINSTANCE.getEntityExpression();

		/**
		 * The meta object literal for the '<em><b>Ontology Language And Syntax</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_EXPRESSION__ONTOLOGY_LANGUAGE_AND_SYNTAX = eINSTANCE.getEntityExpression_OntologyLanguageAndSyntax();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_EXPRESSION__EXPRESSION = eINSTANCE.getEntityExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.EntityReferenceImpl <em>Entity Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.EntityReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntityReference()
		 * @generated
		 */
		EClass ENTITY_REFERENCE = eINSTANCE.getEntityReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_REFERENCE__NAME = eINSTANCE.getEntityReference_Name();

		/**
		 * The meta object literal for the '<em><b>Known Entity Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION = eINSTANCE.getEntityReference_KnownEntityDescription();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_REFERENCE__ABOUT = eINSTANCE.getEntityReference_About();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.EntityReferenceListImpl <em>Entity Reference List</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.EntityReferenceListImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntityReferenceList()
		 * @generated
		 */
		EClass ENTITY_REFERENCE_LIST = eINSTANCE.getEntityReferenceList();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_REFERENCE_LIST__ENTRY = eINSTANCE.getEntityReferenceList_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.EntitySynopsisImpl <em>Entity Synopsis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.EntitySynopsisImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntitySynopsis()
		 * @generated
		 */
		EClass ENTITY_SYNOPSIS = eINSTANCE.getEntitySynopsis();

		/**
		 * The meta object literal for the '<em><b>Designation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_SYNOPSIS__DESIGNATION = eINSTANCE.getEntitySynopsis_Designation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.EntryDescriptionImpl <em>Entry Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.EntryDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntryDescription()
		 * @generated
		 */
		EClass ENTRY_DESCRIPTION = eINSTANCE.getEntryDescription();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ExampleImpl <em>Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ExampleImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getExample()
		 * @generated
		 */
		EClass EXAMPLE = eINSTANCE.getExample();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.FilterImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FILTER__COMPONENT = eINSTANCE.getFilter_Component();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.FilterComponentImpl <em>Filter Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.FilterComponentImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFilterComponent()
		 * @generated
		 */
		EClass FILTER_COMPONENT = eINSTANCE.getFilterComponent();

		/**
		 * The meta object literal for the '<em><b>Match Algorithm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FILTER_COMPONENT__MATCH_ALGORITHM = eINSTANCE.getFilterComponent_MatchAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Match Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FILTER_COMPONENT__MATCH_VALUE = eINSTANCE.getFilterComponent_MatchValue();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.FinalizableImpl <em>Finalizable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.FinalizableImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFinalizable()
		 * @generated
		 */
		EClass FINALIZABLE = eINSTANCE.getFinalizable();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FINALIZABLE__STATE = eINSTANCE.getFinalizable_State();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.FormalityLevelReferenceImpl
		 * <em>Formality Level Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.FormalityLevelReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFormalityLevelReference()
		 * @generated
		 */
		EClass FORMALITY_LEVEL_REFERENCE = eINSTANCE.getFormalityLevelReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.FormatReferenceImpl <em>Format Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.FormatReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFormatReference()
		 * @generated
		 */
		EClass FORMAT_REFERENCE = eINSTANCE.getFormatReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.LanguageReferenceImpl <em>Language Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.LanguageReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getLanguageReference()
		 * @generated
		 */
		EClass LANGUAGE_REFERENCE = eINSTANCE.getLanguageReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.MapCorrelationReferenceImpl
		 * <em>Map Correlation Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.MapCorrelationReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapCorrelationReference()
		 * @generated
		 */
		EClass MAP_CORRELATION_REFERENCE = eINSTANCE.getMapCorrelationReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.MapReferenceImpl <em>Map Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.MapReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapReference()
		 * @generated
		 */
		EClass MAP_REFERENCE = eINSTANCE.getMapReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.MapVersionReferenceImpl <em>Map Version Reference</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.MapVersionReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapVersionReference()
		 * @generated
		 */
		EClass MAP_VERSION_REFERENCE = eINSTANCE.getMapVersionReference();

		/**
		 * The meta object literal for the '<em><b>Map Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MAP_VERSION_REFERENCE__MAP_VERSION = eINSTANCE.getMapVersionReference_MapVersion();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MAP_VERSION_REFERENCE__MAP = eINSTANCE.getMapVersionReference_Map();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.MatchAlgorithmReferenceImpl
		 * <em>Match Algorithm Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.MatchAlgorithmReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMatchAlgorithmReference()
		 * @generated
		 */
		EClass MATCH_ALGORITHM_REFERENCE = eINSTANCE.getMatchAlgorithmReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.MessageImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MESSAGE__HEADING = eINSTANCE.getMessage_Heading();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ModelAttributeReferenceImpl
		 * <em>Model Attribute Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ModelAttributeReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getModelAttributeReference()
		 * @generated
		 */
		EClass MODEL_ATTRIBUTE_REFERENCE = eINSTANCE.getModelAttributeReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.NameAndMeaningReferenceImpl
		 * <em>Name And Meaning Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.NameAndMeaningReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNameAndMeaningReference()
		 * @generated
		 */
		EClass NAME_AND_MEANING_REFERENCE = eINSTANCE.getNameAndMeaningReference();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NAME_AND_MEANING_REFERENCE__VALUE = eINSTANCE.getNameAndMeaningReference_Value();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NAME_AND_MEANING_REFERENCE__HREF = eINSTANCE.getNameAndMeaningReference_Href();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NAME_AND_MEANING_REFERENCE__URI = eINSTANCE.getNameAndMeaningReference_Uri();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.NamedEntityReferenceImpl <em>Named Entity Reference</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.NamedEntityReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNamedEntityReference()
		 * @generated
		 */
		EClass NAMED_ENTITY_REFERENCE = eINSTANCE.getNamedEntityReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.NamespaceReferenceImpl <em>Namespace Reference</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.NamespaceReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNamespaceReference()
		 * @generated
		 */
		EClass NAMESPACE_REFERENCE = eINSTANCE.getNamespaceReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.NoteImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Asserted In Code System Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NOTE__ASSERTED_IN_CODE_SYSTEM_VERSION = eINSTANCE.getNote_AssertedInCodeSystemVersion();

		/**
		 * The meta object literal for the '<em><b>Corresponding Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NOTE__CORRESPONDING_STATEMENT = eINSTANCE.getNote_CorrespondingStatement();

		/**
		 * The meta object literal for the '<em><b>External Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NOTE__EXTERNAL_IDENTIFIER = eINSTANCE.getNote_ExternalIdentifier();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyDomainReferenceImpl
		 * <em>Ontology Domain Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyDomainReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyDomainReference()
		 * @generated
		 */
		EClass ONTOLOGY_DOMAIN_REFERENCE = eINSTANCE.getOntologyDomainReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyEngineeringMethodologyReferenceImpl
		 * <em>Ontology Engineering Methodology Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyEngineeringMethodologyReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyEngineeringMethodologyReference()
		 * @generated
		 */
		EClass ONTOLOGY_ENGINEERING_METHODOLOGY_REFERENCE = eINSTANCE.getOntologyEngineeringMethodologyReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyEngineeringToolReferenceImpl
		 * <em>Ontology Engineering Tool Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyEngineeringToolReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyEngineeringToolReference()
		 * @generated
		 */
		EClass ONTOLOGY_ENGINEERING_TOOL_REFERENCE = eINSTANCE.getOntologyEngineeringToolReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyLanguageAndSyntaxImpl
		 * <em>Ontology Language And Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyLanguageAndSyntaxImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyLanguageAndSyntax()
		 * @generated
		 */
		EClass ONTOLOGY_LANGUAGE_AND_SYNTAX = eINSTANCE.getOntologyLanguageAndSyntax();

		/**
		 * The meta object literal for the '<em><b>Ontology Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_LANGUAGE = eINSTANCE.getOntologyLanguageAndSyntax_OntologyLanguage();

		/**
		 * The meta object literal for the '<em><b>Ontology Syntax</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_SYNTAX = eINSTANCE.getOntologyLanguageAndSyntax_OntologySyntax();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyLanguageReferenceImpl
		 * <em>Ontology Language Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyLanguageReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyLanguageReference()
		 * @generated
		 */
		EClass ONTOLOGY_LANGUAGE_REFERENCE = eINSTANCE.getOntologyLanguageReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologySyntaxReferenceImpl
		 * <em>Ontology Syntax Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.OntologySyntaxReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologySyntaxReference()
		 * @generated
		 */
		EClass ONTOLOGY_SYNTAX_REFERENCE = eINSTANCE.getOntologySyntaxReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyTaskReferenceImpl <em>Ontology Task Reference</em>}
		 * ' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyTaskReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyTaskReference()
		 * @generated
		 */
		EClass ONTOLOGY_TASK_REFERENCE = eINSTANCE.getOntologyTaskReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.OntologyTypeReferenceImpl <em>Ontology Type Reference</em>}
		 * ' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.OntologyTypeReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOntologyTypeReference()
		 * @generated
		 */
		EClass ONTOLOGY_TYPE_REFERENCE = eINSTANCE.getOntologyTypeReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.OpaqueDataImpl <em>Opaque Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.OpaqueDataImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getOpaqueData()
		 * @generated
		 */
		EClass OPAQUE_DATA = eINSTANCE.getOpaqueData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPAQUE_DATA__VALUE = eINSTANCE.getOpaqueData_Value();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPAQUE_DATA__FORMAT = eINSTANCE.getOpaqueData_Format();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPAQUE_DATA__LANGUAGE = eINSTANCE.getOpaqueData_Language();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OPAQUE_DATA__SCHEMA = eINSTANCE.getOpaqueData_Schema();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ParameterImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER__VAL = eINSTANCE.getParameter_Val();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER__ARG = eINSTANCE.getParameter_Arg();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.PredicateReferenceImpl <em>Predicate Reference</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.PredicateReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getPredicateReference()
		 * @generated
		 */
		EClass PREDICATE_REFERENCE = eINSTANCE.getPredicateReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.PropertyImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPERTY__PREDICATE = eINSTANCE.getProperty_Predicate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Property Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPERTY__PROPERTY_QUALIFIER = eINSTANCE.getProperty_PropertyQualifier();

		/**
		 * The meta object literal for the '<em><b>Corresponding Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PROPERTY__CORRESPONDING_STATEMENT = eINSTANCE.getProperty_CorrespondingStatement();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.PropertyReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getPropertyReference()
		 * @generated
		 */
		EClass PROPERTY_REFERENCE = eINSTANCE.getPropertyReference();

		/**
		 * The meta object literal for the '<em><b>Reference Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPERTY_REFERENCE__REFERENCE_TARGET = eINSTANCE.getPropertyReference_ReferenceTarget();

		/**
		 * The meta object literal for the '<em><b>Reference Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PROPERTY_REFERENCE__REFERENCE_TYPE = eINSTANCE.getPropertyReference_ReferenceType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ReasoningAlgorithmReferenceImpl
		 * <em>Reasoning Algorithm Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ReasoningAlgorithmReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getReasoningAlgorithmReference()
		 * @generated
		 */
		EClass REASONING_ALGORITHM_REFERENCE = eINSTANCE.getReasoningAlgorithmReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl <em>Resource Description</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getResourceDescription()
		 * @generated
		 */
		EClass RESOURCE_DESCRIPTION = eINSTANCE.getResourceDescription();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTION__KEYWORD = eINSTANCE.getResourceDescription_Keyword();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE_DESCRIPTION__RESOURCE_TYPE = eINSTANCE.getResourceDescription_ResourceType();

		/**
		 * The meta object literal for the '<em><b>Resource Synopsis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS = eINSTANCE.getResourceDescription_ResourceSynopsis();

		/**
		 * The meta object literal for the '<em><b>Additional Documentation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION = eINSTANCE.getResourceDescription_AdditionalDocumentation();

		/**
		 * The meta object literal for the '<em><b>Source And Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE_DESCRIPTION__SOURCE_AND_ROLE = eINSTANCE.getResourceDescription_SourceAndRole();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE_DESCRIPTION__RIGHTS = eINSTANCE.getResourceDescription_Rights();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE_DESCRIPTION__NOTE = eINSTANCE.getResourceDescription_Note();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE_DESCRIPTION__PROPERTY = eINSTANCE.getResourceDescription_Property();

		/**
		 * The meta object literal for the '<em><b>Alternate ID</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTION__ALTERNATE_ID = eINSTANCE.getResourceDescription_AlternateID();

		/**
		 * The meta object literal for the '<em><b>Source Statements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTION__SOURCE_STATEMENTS = eINSTANCE.getResourceDescription_SourceStatements();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTION__ABOUT = eINSTANCE.getResourceDescription_About();

		/**
		 * The meta object literal for the '<em><b>Formal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTION__FORMAL_NAME = eINSTANCE.getResourceDescription_FormalName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionDirectoryEntryImpl
		 * <em>Resource Description Directory Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionDirectoryEntryImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getResourceDescriptionDirectoryEntry()
		 * @generated
		 */
		EClass RESOURCE_DESCRIPTION_DIRECTORY_ENTRY = eINSTANCE.getResourceDescriptionDirectoryEntry();

		/**
		 * The meta object literal for the '<em><b>Resource Synopsis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS = eINSTANCE.getResourceDescriptionDirectoryEntry_ResourceSynopsis();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__ABOUT = eINSTANCE.getResourceDescriptionDirectoryEntry_About();

		/**
		 * The meta object literal for the '<em><b>Formal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME = eINSTANCE.getResourceDescriptionDirectoryEntry_FormalName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionImpl
		 * <em>Resource Version Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getResourceVersionDescription()
		 * @generated
		 */
		EClass RESOURCE_VERSION_DESCRIPTION = eINSTANCE.getResourceVersionDescription();

		/**
		 * The meta object literal for the '<em><b>Source And Notation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION = eINSTANCE.getResourceVersionDescription_SourceAndNotation();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE_VERSION_DESCRIPTION__PREDECESSOR = eINSTANCE.getResourceVersionDescription_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Official Resource Version Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RESOURCE_VERSION_ID = eINSTANCE.getResourceVersionDescription_OfficialResourceVersionId();

		/**
		 * The meta object literal for the '<em><b>Official Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RELEASE_DATE = eINSTANCE.getResourceVersionDescription_OfficialReleaseDate();

		/**
		 * The meta object literal for the '<em><b>Official Activation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_VERSION_DESCRIPTION__OFFICIAL_ACTIVATION_DATE = eINSTANCE.getResourceVersionDescription_OfficialActivationDate();

		/**
		 * The meta object literal for the '<em><b>Document URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_VERSION_DESCRIPTION__DOCUMENT_URI = eINSTANCE.getResourceVersionDescription_DocumentURI();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_VERSION_DESCRIPTION__STATE = eINSTANCE.getResourceVersionDescription_State();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionDirectoryEntryImpl
		 * <em>Resource Version Description Directory Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionDirectoryEntryImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getResourceVersionDescriptionDirectoryEntry()
		 * @generated
		 */
		EClass RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY = eINSTANCE.getResourceVersionDescriptionDirectoryEntry();

		/**
		 * The meta object literal for the '<em><b>Official Resource Version Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RESOURCE_VERSION_ID = eINSTANCE.getResourceVersionDescriptionDirectoryEntry_OfficialResourceVersionId();

		/**
		 * The meta object literal for the '<em><b>Official Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RELEASE_DATE = eINSTANCE.getResourceVersionDescriptionDirectoryEntry_OfficialReleaseDate();

		/**
		 * The meta object literal for the '<em><b>Document URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__DOCUMENT_URI = eINSTANCE.getResourceVersionDescriptionDirectoryEntry_DocumentURI();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.RESTResourceImpl <em>REST Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.RESTResourceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getRESTResource()
		 * @generated
		 */
		EClass REST_RESOURCE = eINSTANCE.getRESTResource();

		/**
		 * The meta object literal for the '<em><b>Resource Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REST_RESOURCE__RESOURCE_ROOT = eINSTANCE.getRESTResource_ResourceRoot();

		/**
		 * The meta object literal for the '<em><b>Resource URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REST_RESOURCE__RESOURCE_URI = eINSTANCE.getRESTResource_ResourceURI();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REST_RESOURCE__PARAMETER = eINSTANCE.getRESTResource_Parameter();

		/**
		 * The meta object literal for the '<em><b>Access Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REST_RESOURCE__ACCESS_DATE = eINSTANCE.getRESTResource_AccessDate();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.RoleReferenceImpl <em>Role Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.RoleReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getRoleReference()
		 * @generated
		 */
		EClass ROLE_REFERENCE = eINSTANCE.getRoleReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ScopedEntityNameImpl <em>Scoped Entity Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ScopedEntityNameImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getScopedEntityName()
		 * @generated
		 */
		EClass SCOPED_ENTITY_NAME = eINSTANCE.getScopedEntityName();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SCOPED_ENTITY_NAME__NAMESPACE = eINSTANCE.getScopedEntityName_Namespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SCOPED_ENTITY_NAME__NAME = eINSTANCE.getScopedEntityName_Name();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.SortCriteriaImpl <em>Sort Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.SortCriteriaImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSortCriteria()
		 * @generated
		 */
		EClass SORT_CRITERIA = eINSTANCE.getSortCriteria();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SORT_CRITERIA__ENTRY = eINSTANCE.getSortCriteria_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.SortCriterionImpl <em>Sort Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.SortCriterionImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSortCriterion()
		 * @generated
		 */
		EClass SORT_CRITERION = eINSTANCE.getSortCriterion();

		/**
		 * The meta object literal for the '<em><b>Sort Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SORT_CRITERION__SORT_ELEMENT = eINSTANCE.getSortCriterion_SortElement();

		/**
		 * The meta object literal for the '<em><b>Entry Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SORT_CRITERION__ENTRY_ORDER = eINSTANCE.getSortCriterion_EntryOrder();

		/**
		 * The meta object literal for the '<em><b>Sort Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SORT_CRITERION__SORT_DIRECTION = eINSTANCE.getSortCriterion_SortDirection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.SourceAndNotationImpl <em>Source And Notation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.SourceAndNotationImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSourceAndNotation()
		 * @generated
		 */
		EClass SOURCE_AND_NOTATION = eINSTANCE.getSourceAndNotation();

		/**
		 * The meta object literal for the '<em><b>Source And Notation Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SOURCE_AND_NOTATION__SOURCE_AND_NOTATION_DESCRIPTION = eINSTANCE.getSourceAndNotation_SourceAndNotationDescription();

		/**
		 * The meta object literal for the '<em><b>Source Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SOURCE_AND_NOTATION__SOURCE_DOCUMENT = eINSTANCE.getSourceAndNotation_SourceDocument();

		/**
		 * The meta object literal for the '<em><b>Source Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SOURCE_AND_NOTATION__SOURCE_LANGUAGE = eINSTANCE.getSourceAndNotation_SourceLanguage();

		/**
		 * The meta object literal for the '<em><b>Source Document Syntax</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SOURCE_AND_NOTATION__SOURCE_DOCUMENT_SYNTAX = eINSTANCE.getSourceAndNotation_SourceDocumentSyntax();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.SourceAndRoleReferenceImpl
		 * <em>Source And Role Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.SourceAndRoleReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSourceAndRoleReference()
		 * @generated
		 */
		EClass SOURCE_AND_ROLE_REFERENCE = eINSTANCE.getSourceAndRoleReference();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SOURCE_AND_ROLE_REFERENCE__MIXED = eINSTANCE.getSourceAndRoleReference_Mixed();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SOURCE_AND_ROLE_REFERENCE__SOURCE = eINSTANCE.getSourceAndRoleReference_Source();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SOURCE_AND_ROLE_REFERENCE__ROLE = eINSTANCE.getSourceAndRoleReference_Role();

		/**
		 * The meta object literal for the '<em><b>Bibliographic Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SOURCE_AND_ROLE_REFERENCE__BIBLIOGRAPHIC_LINK = eINSTANCE.getSourceAndRoleReference_BibliographicLink();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.SourceReferenceImpl <em>Source Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.SourceReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSourceReference()
		 * @generated
		 */
		EClass SOURCE_REFERENCE = eINSTANCE.getSourceReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.StatementTargetImpl <em>Statement Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.StatementTargetImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getStatementTarget()
		 * @generated
		 */
		EClass STATEMENT_TARGET = eINSTANCE.getStatementTarget();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT_TARGET__ENTITY = eINSTANCE.getStatementTarget_Entity();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT_TARGET__LITERAL = eINSTANCE.getStatementTarget_Literal();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STATEMENT_TARGET__RESOURCE = eINSTANCE.getStatementTarget_Resource();

		/**
		 * The meta object literal for the '<em><b>Bnode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STATEMENT_TARGET__BNODE = eINSTANCE.getStatementTarget_Bnode();

		/**
		 * The meta object literal for the '<em><b>External Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STATEMENT_TARGET__EXTERNAL_IDENTIFIER = eINSTANCE.getStatementTarget_ExternalIdentifier();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.StatusReferenceImpl <em>Status Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.StatusReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getStatusReference()
		 * @generated
		 */
		EClass STATUS_REFERENCE = eINSTANCE.getStatusReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.TsAnyTypeImpl <em>Ts Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.TsAnyTypeImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getTsAnyType()
		 * @generated
		 */
		EClass TS_ANY_TYPE = eINSTANCE.getTsAnyType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TS_ANY_TYPE__MIXED = eINSTANCE.getTsAnyType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TS_ANY_TYPE__ANY = eINSTANCE.getTsAnyType_Any();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.URIAndEntityNameImpl <em>URI And Entity Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.URIAndEntityNameImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getURIAndEntityName()
		 * @generated
		 */
		EClass URI_AND_ENTITY_NAME = eINSTANCE.getURIAndEntityName();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute URI_AND_ENTITY_NAME__NAMESPACE = eINSTANCE.getURIAndEntityName_Namespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute URI_AND_ENTITY_NAME__NAME = eINSTANCE.getURIAndEntityName_Name();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute URI_AND_ENTITY_NAME__HREF = eINSTANCE.getURIAndEntityName_Href();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute URI_AND_ENTITY_NAME__URI = eINSTANCE.getURIAndEntityName_Uri();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.DocumentRootImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Entity Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTITY_EXPRESSION = eINSTANCE.getDocumentRoot_EntityExpression();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ValueSetDefinitionReferenceImpl
		 * <em>Value Set Definition Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ValueSetDefinitionReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getValueSetDefinitionReference()
		 * @generated
		 */
		EClass VALUE_SET_DEFINITION_REFERENCE = eINSTANCE.getValueSetDefinitionReference();

		/**
		 * The meta object literal for the '<em><b>Value Set Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_REFERENCE__VALUE_SET_DEFINITION = eINSTANCE.getValueSetDefinitionReference_ValueSetDefinition();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_REFERENCE__VALUE_SET = eINSTANCE.getValueSetDefinitionReference_ValueSet();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.ValueSetReferenceImpl <em>Value Set Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.ValueSetReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getValueSetReference()
		 * @generated
		 */
		EClass VALUE_SET_REFERENCE = eINSTANCE.getValueSetReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.impl.VersionTagReferenceImpl <em>Version Tag Reference</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.VersionTagReferenceImpl
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getVersionTagReference()
		 * @generated
		 */
		EClass VERSION_TAG_REFERENCE = eINSTANCE.getVersionTagReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.AssociationDirection <em>Association Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.AssociationDirection
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAssociationDirection()
		 * @generated
		 */
		EEnum ASSOCIATION_DIRECTION = eINSTANCE.getAssociationDirection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.ChangeCommitted <em>Change Committed</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.ChangeCommitted
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeCommitted()
		 * @generated
		 */
		EEnum CHANGE_COMMITTED = eINSTANCE.getChangeCommitted();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.ChangeType <em>Change Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.ChangeType
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeType()
		 * @generated
		 */
		EEnum CHANGE_TYPE = eINSTANCE.getChangeType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.CompleteDirectory <em>Complete Directory</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.CompleteDirectory
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCompleteDirectory()
		 * @generated
		 */
		EEnum COMPLETE_DIRECTORY = eINSTANCE.getCompleteDirectory();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.CTS2ResourceType <em>CTS2 Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.CTS2ResourceType
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCTS2ResourceType()
		 * @generated
		 */
		EEnum CTS2_RESOURCE_TYPE = eINSTANCE.getCTS2ResourceType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.DefinitionRole <em>Definition Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.DefinitionRole
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDefinitionRole()
		 * @generated
		 */
		EEnum DEFINITION_ROLE = eINSTANCE.getDefinitionRole();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.EntryState <em>Entry State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.EntryState
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntryState()
		 * @generated
		 */
		EEnum ENTRY_STATE = eINSTANCE.getEntryState();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.FinalizableState <em>Finalizable State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.FinalizableState
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFinalizableState()
		 * @generated
		 */
		EEnum FINALIZABLE_STATE = eINSTANCE.getFinalizableState();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.NoteType <em>Note Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.NoteType
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNoteType()
		 * @generated
		 */
		EEnum NOTE_TYPE = eINSTANCE.getNoteType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.SetOperator <em>Set Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.SetOperator
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSetOperator()
		 * @generated
		 */
		EEnum SET_OPERATOR = eINSTANCE.getSetOperator();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.SortDirection <em>Sort Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.SortDirection
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSortDirection()
		 * @generated
		 */
		EEnum SORT_DIRECTION = eINSTANCE.getSortDirection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.core.TargetReferenceType <em>Target Reference Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.TargetReferenceType
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getTargetReferenceType()
		 * @generated
		 */
		EEnum TARGET_REFERENCE_TYPE = eINSTANCE.getTargetReferenceType();

		/**
		 * The meta object literal for the '<em>Amount Of Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.math.BigInteger
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAmountOfTime()
		 * @generated
		 */
		EDataType AMOUNT_OF_TIME = eINSTANCE.getAmountOfTime();

		/**
		 * The meta object literal for the '<em>Association Direction Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.AssociationDirection
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAssociationDirectionObject()
		 * @generated
		 */
		EDataType ASSOCIATION_DIRECTION_OBJECT = eINSTANCE.getAssociationDirectionObject();

		/**
		 * The meta object literal for the '<em>Association Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getAssociationDirectoryURI()
		 * @generated
		 */
		EDataType ASSOCIATION_DIRECTORY_URI = eINSTANCE.getAssociationDirectoryURI();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Boolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.Boolean
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getBooleanObject()
		 * @generated
		 */
		EDataType BOOLEAN_OBJECT = eINSTANCE.getBooleanObject();

		/**
		 * The meta object literal for the '<em>Change Committed Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.ChangeCommitted
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeCommittedObject()
		 * @generated
		 */
		EDataType CHANGE_COMMITTED_OBJECT = eINSTANCE.getChangeCommittedObject();

		/**
		 * The meta object literal for the '<em>Change Set Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeSetDirectoryURI()
		 * @generated
		 */
		EDataType CHANGE_SET_DIRECTORY_URI = eINSTANCE.getChangeSetDirectoryURI();

		/**
		 * The meta object literal for the '<em>Change Set URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeSetURI()
		 * @generated
		 */
		EDataType CHANGE_SET_URI = eINSTANCE.getChangeSetURI();

		/**
		 * The meta object literal for the '<em>Change Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.ChangeType
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getChangeTypeObject()
		 * @generated
		 */
		EDataType CHANGE_TYPE_OBJECT = eINSTANCE.getChangeTypeObject();

		/**
		 * The meta object literal for the '<em>Code System Catalog Entry Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemCatalogEntryDirectoryURI()
		 * @generated
		 */
		EDataType CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY_URI = eINSTANCE.getCodeSystemCatalogEntryDirectoryURI();

		/**
		 * The meta object literal for the '<em>Code System Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemName()
		 * @generated
		 */
		EDataType CODE_SYSTEM_NAME = eINSTANCE.getCodeSystemName();

		/**
		 * The meta object literal for the '<em>Code System Version Catalog Entry Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemVersionCatalogEntryDirectoryURI()
		 * @generated
		 */
		EDataType CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY_URI = eINSTANCE.getCodeSystemVersionCatalogEntryDirectoryURI();

		/**
		 * The meta object literal for the '<em>Code System Version Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCodeSystemVersionName()
		 * @generated
		 */
		EDataType CODE_SYSTEM_VERSION_NAME = eINSTANCE.getCodeSystemVersionName();

		/**
		 * The meta object literal for the '<em>Complete Directory Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.CompleteDirectory
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCompleteDirectoryObject()
		 * @generated
		 */
		EDataType COMPLETE_DIRECTORY_OBJECT = eINSTANCE.getCompleteDirectoryObject();

		/**
		 * The meta object literal for the '<em>Concept Domain Binding Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getConceptDomainBindingDirectoryURI()
		 * @generated
		 */
		EDataType CONCEPT_DOMAIN_BINDING_DIRECTORY_URI = eINSTANCE.getConceptDomainBindingDirectoryURI();

		/**
		 * The meta object literal for the '<em>Concept Domain Catalog Entry Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getConceptDomainCatalogEntryDirectoryURI()
		 * @generated
		 */
		EDataType CONCEPT_DOMAIN_CATALOG_ENTRY_DIRECTORY_URI = eINSTANCE.getConceptDomainCatalogEntryDirectoryURI();

		/**
		 * The meta object literal for the '<em>Concept Domain Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getConceptDomainName()
		 * @generated
		 */
		EDataType CONCEPT_DOMAIN_NAME = eINSTANCE.getConceptDomainName();

		/**
		 * The meta object literal for the '<em>CTS2 Resource Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.CTS2ResourceType
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getCTS2ResourceTypeObject()
		 * @generated
		 */
		EDataType CTS2_RESOURCE_TYPE_OBJECT = eINSTANCE.getCTS2ResourceTypeObject();

		/**
		 * The meta object literal for the '<em>Date And Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDateAndTime()
		 * @generated
		 */
		EDataType DATE_AND_TIME = eINSTANCE.getDateAndTime();

		/**
		 * The meta object literal for the '<em>Definition Role Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.DefinitionRole
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDefinitionRoleObject()
		 * @generated
		 */
		EDataType DEFINITION_ROLE_OBJECT = eINSTANCE.getDefinitionRoleObject();

		/**
		 * The meta object literal for the '<em>Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDirectoryURI()
		 * @generated
		 */
		EDataType DIRECTORY_URI = eINSTANCE.getDirectoryURI();

		/**
		 * The meta object literal for the '<em>Document URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getDocumentURI()
		 * @generated
		 */
		EDataType DOCUMENT_URI = eINSTANCE.getDocumentURI();

		/**
		 * The meta object literal for the '<em>Entity Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntityDirectoryURI()
		 * @generated
		 */
		EDataType ENTITY_DIRECTORY_URI = eINSTANCE.getEntityDirectoryURI();

		/**
		 * The meta object literal for the '<em>Entry State Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.EntryState
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEntryStateObject()
		 * @generated
		 */
		EDataType ENTRY_STATE_OBJECT = eINSTANCE.getEntryStateObject();

		/**
		 * The meta object literal for the '<em>Enumeration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getEnumeration()
		 * @generated
		 */
		EDataType ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em>External URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getExternalURI()
		 * @generated
		 */
		EDataType EXTERNAL_URI = eINSTANCE.getExternalURI();

		/**
		 * The meta object literal for the '<em>Finalizable State Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.FinalizableState
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getFinalizableStateObject()
		 * @generated
		 */
		EDataType FINALIZABLE_STATE_OBJECT = eINSTANCE.getFinalizableStateObject();

		/**
		 * The meta object literal for the '<em>Local Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getLocalIdentifier()
		 * @generated
		 */
		EDataType LOCAL_IDENTIFIER = eINSTANCE.getLocalIdentifier();

		/**
		 * The meta object literal for the '<em>Local URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getLocalURI()
		 * @generated
		 */
		EDataType LOCAL_URI = eINSTANCE.getLocalURI();

		/**
		 * The meta object literal for the '<em>Map Catalog Entry Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapCatalogEntryDirectoryURI()
		 * @generated
		 */
		EDataType MAP_CATALOG_ENTRY_DIRECTORY_URI = eINSTANCE.getMapCatalogEntryDirectoryURI();

		/**
		 * The meta object literal for the '<em>Map Entry Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapEntryDirectoryURI()
		 * @generated
		 */
		EDataType MAP_ENTRY_DIRECTORY_URI = eINSTANCE.getMapEntryDirectoryURI();

		/**
		 * The meta object literal for the '<em>Map Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapName()
		 * @generated
		 */
		EDataType MAP_NAME = eINSTANCE.getMapName();

		/**
		 * The meta object literal for the '<em>Map Version Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapVersionDirectoryURI()
		 * @generated
		 */
		EDataType MAP_VERSION_DIRECTORY_URI = eINSTANCE.getMapVersionDirectoryURI();

		/**
		 * The meta object literal for the '<em>Map Version Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMapVersionName()
		 * @generated
		 */
		EDataType MAP_VERSION_NAME = eINSTANCE.getMapVersionName();

		/**
		 * The meta object literal for the '<em>Match Strength</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMatchStrength()
		 * @generated
		 */
		EDataType MATCH_STRENGTH = eINSTANCE.getMatchStrength();

		/**
		 * The meta object literal for the '<em>Match Strength Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.Double
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getMatchStrengthObject()
		 * @generated
		 */
		EDataType MATCH_STRENGTH_OBJECT = eINSTANCE.getMatchStrengthObject();

		/**
		 * The meta object literal for the '<em>Namespace Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNamespaceIdentifier()
		 * @generated
		 */
		EDataType NAMESPACE_IDENTIFIER = eINSTANCE.getNamespaceIdentifier();

		/**
		 * The meta object literal for the '<em>Natural Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.math.BigInteger
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNaturalNumber()
		 * @generated
		 */
		EDataType NATURAL_NUMBER = eINSTANCE.getNaturalNumber();

		/**
		 * The meta object literal for the '<em>Note Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.NoteType
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getNoteTypeObject()
		 * @generated
		 */
		EDataType NOTE_TYPE_OBJECT = eINSTANCE.getNoteTypeObject();

		/**
		 * The meta object literal for the '<em>Persistent URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getPersistentURI()
		 * @generated
		 */
		EDataType PERSISTENT_URI = eINSTANCE.getPersistentURI();

		/**
		 * The meta object literal for the '<em>Rendering URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getRenderingURI()
		 * @generated
		 */
		EDataType RENDERING_URI = eINSTANCE.getRenderingURI();

		/**
		 * The meta object literal for the '<em>Resolved Value Set Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getResolvedValueSetDirectoryURI()
		 * @generated
		 */
		EDataType RESOLVED_VALUE_SET_DIRECTORY_URI = eINSTANCE.getResolvedValueSetDirectoryURI();

		/**
		 * The meta object literal for the '<em>Service URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getServiceURI()
		 * @generated
		 */
		EDataType SERVICE_URI = eINSTANCE.getServiceURI();

		/**
		 * The meta object literal for the '<em>Set Operator Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.SetOperator
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSetOperatorObject()
		 * @generated
		 */
		EDataType SET_OPERATOR_OBJECT = eINSTANCE.getSetOperatorObject();

		/**
		 * The meta object literal for the '<em>Sort Direction Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.SortDirection
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getSortDirectionObject()
		 * @generated
		 */
		EDataType SORT_DIRECTION_OBJECT = eINSTANCE.getSortDirectionObject();

		/**
		 * The meta object literal for the '<em>Statement Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getStatementDirectoryURI()
		 * @generated
		 */
		EDataType STATEMENT_DIRECTORY_URI = eINSTANCE.getStatementDirectoryURI();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Target Reference Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.core.TargetReferenceType
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getTargetReferenceTypeObject()
		 * @generated
		 */
		EDataType TARGET_REFERENCE_TYPE_OBJECT = eINSTANCE.getTargetReferenceTypeObject();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Value Set Catalog Entry Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getValueSetCatalogEntryDirectoryURI()
		 * @generated
		 */
		EDataType VALUE_SET_CATALOG_ENTRY_DIRECTORY_URI = eINSTANCE.getValueSetCatalogEntryDirectoryURI();

		/**
		 * The meta object literal for the '<em>Value Set Definition Directory URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getValueSetDefinitionDirectoryURI()
		 * @generated
		 */
		EDataType VALUE_SET_DEFINITION_DIRECTORY_URI = eINSTANCE.getValueSetDefinitionDirectoryURI();

		/**
		 * The meta object literal for the '<em>Value Set Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getValueSetName()
		 * @generated
		 */
		EDataType VALUE_SET_NAME = eINSTANCE.getValueSetName();

		/**
		 * The meta object literal for the '<em>Version Tag Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl#getVersionTagName()
		 * @generated
		 */
		EDataType VERSION_TAG_NAME = eINSTANCE.getVersionTagName();

	}

} // CorePackage
