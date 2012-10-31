/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity;

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
 * @see org.openhealthtools.mdht.cts2.entity.EntityFactory
 * @model kind="package"
 * @generated
 */
public interface EntityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "entity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/CTS2/1.0/Entity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "entity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	EntityPackage eINSTANCE = org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl <em>Description Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityDescriptionBase()
	 * @generated
	 */
	int ENTITY_DESCRIPTION_BASE = 9;

	/**
	 * The feature id for the '<em><b>Entity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__ENTITY_ID = 0;

	/**
	 * The feature id for the '<em><b>Alternate Entity ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID = 1;

	/**
	 * The feature id for the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__DESIGNATION = 3;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__EXAMPLE = 5;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__NOTE = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__SOURCE_STATEMENTS = 8;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__SUBJECT_OF = 9;

	/**
	 * The feature id for the '<em><b>Predicate Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__PREDICATE_OF = 10;

	/**
	 * The feature id for the '<em><b>Target Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__TARGET_OF = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__PARENT = 12;

	/**
	 * The feature id for the '<em><b>Ancestors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__ANCESTORS = 13;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__CHILDREN = 14;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__DESCENDANTS = 15;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__ENTITY_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__INSTANCES = 17;

	/**
	 * The feature id for the '<em><b>Equivalent Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY = 18;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE__ABOUT = 19;

	/**
	 * The number of structural features of the '<em>Description Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_BASE_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.NamedEntityDescriptionImpl <em>Named Entity Description</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.NamedEntityDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getNamedEntityDescription()
	 * @generated
	 */
	int NAMED_ENTITY_DESCRIPTION = 16;

	/**
	 * The feature id for the '<em><b>Entity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__ENTITY_ID = ENTITY_DESCRIPTION_BASE__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Alternate Entity ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__ALTERNATE_ENTITY_ID = ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION = ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__DESIGNATION = ENTITY_DESCRIPTION_BASE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__DEFINITION = ENTITY_DESCRIPTION_BASE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__EXAMPLE = ENTITY_DESCRIPTION_BASE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__NOTE = ENTITY_DESCRIPTION_BASE__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__PROPERTY = ENTITY_DESCRIPTION_BASE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__SOURCE_STATEMENTS = ENTITY_DESCRIPTION_BASE__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__SUBJECT_OF = ENTITY_DESCRIPTION_BASE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Predicate Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__PREDICATE_OF = ENTITY_DESCRIPTION_BASE__PREDICATE_OF;

	/**
	 * The feature id for the '<em><b>Target Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__TARGET_OF = ENTITY_DESCRIPTION_BASE__TARGET_OF;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__PARENT = ENTITY_DESCRIPTION_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Ancestors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__ANCESTORS = ENTITY_DESCRIPTION_BASE__ANCESTORS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__CHILDREN = ENTITY_DESCRIPTION_BASE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__DESCENDANTS = ENTITY_DESCRIPTION_BASE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__ENTITY_TYPE = ENTITY_DESCRIPTION_BASE__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__INSTANCES = ENTITY_DESCRIPTION_BASE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Equivalent Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__EQUIVALENT_ENTITY = ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__ABOUT = ENTITY_DESCRIPTION_BASE__ABOUT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__STATUS = ENTITY_DESCRIPTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION = ENTITY_DESCRIPTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION__ENTRY_STATE = ENTITY_DESCRIPTION_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Named Entity Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_DESCRIPTION_FEATURE_COUNT = ENTITY_DESCRIPTION_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.PredicateDescriptionImpl <em>Predicate Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.PredicateDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getPredicateDescription()
	 * @generated
	 */
	int PREDICATE_DESCRIPTION = 19;

	/**
	 * The feature id for the '<em><b>Entity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__ENTITY_ID = NAMED_ENTITY_DESCRIPTION__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Alternate Entity ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__ALTERNATE_ENTITY_ID = NAMED_ENTITY_DESCRIPTION__ALTERNATE_ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION = NAMED_ENTITY_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__DESIGNATION = NAMED_ENTITY_DESCRIPTION__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__DEFINITION = NAMED_ENTITY_DESCRIPTION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__EXAMPLE = NAMED_ENTITY_DESCRIPTION__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__NOTE = NAMED_ENTITY_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__PROPERTY = NAMED_ENTITY_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__SOURCE_STATEMENTS = NAMED_ENTITY_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__SUBJECT_OF = NAMED_ENTITY_DESCRIPTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Predicate Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__PREDICATE_OF = NAMED_ENTITY_DESCRIPTION__PREDICATE_OF;

	/**
	 * The feature id for the '<em><b>Target Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__TARGET_OF = NAMED_ENTITY_DESCRIPTION__TARGET_OF;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__PARENT = NAMED_ENTITY_DESCRIPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Ancestors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__ANCESTORS = NAMED_ENTITY_DESCRIPTION__ANCESTORS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__CHILDREN = NAMED_ENTITY_DESCRIPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__DESCENDANTS = NAMED_ENTITY_DESCRIPTION__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__ENTITY_TYPE = NAMED_ENTITY_DESCRIPTION__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__INSTANCES = NAMED_ENTITY_DESCRIPTION__INSTANCES;

	/**
	 * The feature id for the '<em><b>Equivalent Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__EQUIVALENT_ENTITY = NAMED_ENTITY_DESCRIPTION__EQUIVALENT_ENTITY;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__ABOUT = NAMED_ENTITY_DESCRIPTION__ABOUT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__STATUS = NAMED_ENTITY_DESCRIPTION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__CHANGE_DESCRIPTION = NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__ENTRY_STATE = NAMED_ENTITY_DESCRIPTION__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Forward Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__FORWARD_NAME = NAMED_ENTITY_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reverse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION__REVERSE_NAME = NAMED_ENTITY_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DESCRIPTION_FEATURE_COUNT = NAMED_ENTITY_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.AnnotationPropertyDescriptionImpl
	 * <em>Annotation Property Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.AnnotationPropertyDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getAnnotationPropertyDescription()
	 * @generated
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Entity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__ENTITY_ID = PREDICATE_DESCRIPTION__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Alternate Entity ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__ALTERNATE_ENTITY_ID = PREDICATE_DESCRIPTION__ALTERNATE_ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION = PREDICATE_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__DESIGNATION = PREDICATE_DESCRIPTION__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__DEFINITION = PREDICATE_DESCRIPTION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__EXAMPLE = PREDICATE_DESCRIPTION__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__NOTE = PREDICATE_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__PROPERTY = PREDICATE_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__SOURCE_STATEMENTS = PREDICATE_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__SUBJECT_OF = PREDICATE_DESCRIPTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Predicate Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__PREDICATE_OF = PREDICATE_DESCRIPTION__PREDICATE_OF;

	/**
	 * The feature id for the '<em><b>Target Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__TARGET_OF = PREDICATE_DESCRIPTION__TARGET_OF;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__PARENT = PREDICATE_DESCRIPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Ancestors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__ANCESTORS = PREDICATE_DESCRIPTION__ANCESTORS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__CHILDREN = PREDICATE_DESCRIPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__DESCENDANTS = PREDICATE_DESCRIPTION__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__ENTITY_TYPE = PREDICATE_DESCRIPTION__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__INSTANCES = PREDICATE_DESCRIPTION__INSTANCES;

	/**
	 * The feature id for the '<em><b>Equivalent Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__EQUIVALENT_ENTITY = PREDICATE_DESCRIPTION__EQUIVALENT_ENTITY;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__ABOUT = PREDICATE_DESCRIPTION__ABOUT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__STATUS = PREDICATE_DESCRIPTION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__CHANGE_DESCRIPTION = PREDICATE_DESCRIPTION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__ENTRY_STATE = PREDICATE_DESCRIPTION__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Forward Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__FORWARD_NAME = PREDICATE_DESCRIPTION__FORWARD_NAME;

	/**
	 * The feature id for the '<em><b>Reverse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION__REVERSE_NAME = PREDICATE_DESCRIPTION__REVERSE_NAME;

	/**
	 * The number of structural features of the '<em>Annotation Property Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DESCRIPTION_FEATURE_COUNT = PREDICATE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.AnonymousEntityDescriptionImpl
	 * <em>Anonymous Entity Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.AnonymousEntityDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getAnonymousEntityDescription()
	 * @generated
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Entity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__ENTITY_ID = ENTITY_DESCRIPTION_BASE__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Alternate Entity ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__ALTERNATE_ENTITY_ID = ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION = ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__DESIGNATION = ENTITY_DESCRIPTION_BASE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__DEFINITION = ENTITY_DESCRIPTION_BASE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__EXAMPLE = ENTITY_DESCRIPTION_BASE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__NOTE = ENTITY_DESCRIPTION_BASE__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__PROPERTY = ENTITY_DESCRIPTION_BASE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__SOURCE_STATEMENTS = ENTITY_DESCRIPTION_BASE__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__SUBJECT_OF = ENTITY_DESCRIPTION_BASE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Predicate Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__PREDICATE_OF = ENTITY_DESCRIPTION_BASE__PREDICATE_OF;

	/**
	 * The feature id for the '<em><b>Target Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__TARGET_OF = ENTITY_DESCRIPTION_BASE__TARGET_OF;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__PARENT = ENTITY_DESCRIPTION_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Ancestors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__ANCESTORS = ENTITY_DESCRIPTION_BASE__ANCESTORS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__CHILDREN = ENTITY_DESCRIPTION_BASE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__DESCENDANTS = ENTITY_DESCRIPTION_BASE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__ENTITY_TYPE = ENTITY_DESCRIPTION_BASE__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__INSTANCES = ENTITY_DESCRIPTION_BASE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Equivalent Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__EQUIVALENT_ENTITY = ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION__ABOUT = ENTITY_DESCRIPTION_BASE__ABOUT;

	/**
	 * The number of structural features of the '<em>Anonymous Entity Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_ENTITY_DESCRIPTION_FEATURE_COUNT = ENTITY_DESCRIPTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.AnonymousIndividualDescriptionImpl
	 * <em>Anonymous Individual Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.AnonymousIndividualDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getAnonymousIndividualDescription()
	 * @generated
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Entity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__ENTITY_ID = NAMED_ENTITY_DESCRIPTION__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Alternate Entity ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__ALTERNATE_ENTITY_ID = NAMED_ENTITY_DESCRIPTION__ALTERNATE_ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION = NAMED_ENTITY_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__DESIGNATION = NAMED_ENTITY_DESCRIPTION__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__DEFINITION = NAMED_ENTITY_DESCRIPTION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__EXAMPLE = NAMED_ENTITY_DESCRIPTION__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__NOTE = NAMED_ENTITY_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__PROPERTY = NAMED_ENTITY_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__SOURCE_STATEMENTS = NAMED_ENTITY_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__SUBJECT_OF = NAMED_ENTITY_DESCRIPTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Predicate Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__PREDICATE_OF = NAMED_ENTITY_DESCRIPTION__PREDICATE_OF;

	/**
	 * The feature id for the '<em><b>Target Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__TARGET_OF = NAMED_ENTITY_DESCRIPTION__TARGET_OF;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__PARENT = NAMED_ENTITY_DESCRIPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Ancestors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__ANCESTORS = NAMED_ENTITY_DESCRIPTION__ANCESTORS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__CHILDREN = NAMED_ENTITY_DESCRIPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__DESCENDANTS = NAMED_ENTITY_DESCRIPTION__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__ENTITY_TYPE = NAMED_ENTITY_DESCRIPTION__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__INSTANCES = NAMED_ENTITY_DESCRIPTION__INSTANCES;

	/**
	 * The feature id for the '<em><b>Equivalent Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__EQUIVALENT_ENTITY = NAMED_ENTITY_DESCRIPTION__EQUIVALENT_ENTITY;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__ABOUT = NAMED_ENTITY_DESCRIPTION__ABOUT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__STATUS = NAMED_ENTITY_DESCRIPTION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__CHANGE_DESCRIPTION = NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION__ENTRY_STATE = NAMED_ENTITY_DESCRIPTION__ENTRY_STATE;

	/**
	 * The number of structural features of the '<em>Anonymous Individual Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_DESCRIPTION_FEATURE_COUNT = NAMED_ENTITY_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.ClassDescriptionImpl <em>Class Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.ClassDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getClassDescription()
	 * @generated
	 */
	int CLASS_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Entity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__ENTITY_ID = NAMED_ENTITY_DESCRIPTION__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Alternate Entity ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__ALTERNATE_ENTITY_ID = NAMED_ENTITY_DESCRIPTION__ALTERNATE_ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION = NAMED_ENTITY_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__DESIGNATION = NAMED_ENTITY_DESCRIPTION__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__DEFINITION = NAMED_ENTITY_DESCRIPTION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__EXAMPLE = NAMED_ENTITY_DESCRIPTION__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__NOTE = NAMED_ENTITY_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__PROPERTY = NAMED_ENTITY_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__SOURCE_STATEMENTS = NAMED_ENTITY_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__SUBJECT_OF = NAMED_ENTITY_DESCRIPTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Predicate Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__PREDICATE_OF = NAMED_ENTITY_DESCRIPTION__PREDICATE_OF;

	/**
	 * The feature id for the '<em><b>Target Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__TARGET_OF = NAMED_ENTITY_DESCRIPTION__TARGET_OF;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__PARENT = NAMED_ENTITY_DESCRIPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Ancestors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__ANCESTORS = NAMED_ENTITY_DESCRIPTION__ANCESTORS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__CHILDREN = NAMED_ENTITY_DESCRIPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__DESCENDANTS = NAMED_ENTITY_DESCRIPTION__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__ENTITY_TYPE = NAMED_ENTITY_DESCRIPTION__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__INSTANCES = NAMED_ENTITY_DESCRIPTION__INSTANCES;

	/**
	 * The feature id for the '<em><b>Equivalent Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__EQUIVALENT_ENTITY = NAMED_ENTITY_DESCRIPTION__EQUIVALENT_ENTITY;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__ABOUT = NAMED_ENTITY_DESCRIPTION__ABOUT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__STATUS = NAMED_ENTITY_DESCRIPTION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__CHANGE_DESCRIPTION = NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__ENTRY_STATE = NAMED_ENTITY_DESCRIPTION__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Description State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__DESCRIPTION_STATE = NAMED_ENTITY_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION__DESCRIPTION_TYPE = NAMED_ENTITY_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DESCRIPTION_FEATURE_COUNT = NAMED_ENTITY_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.DataPropertyDescriptionImpl <em>Data Property Description</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.DataPropertyDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getDataPropertyDescription()
	 * @generated
	 */
	int DATA_PROPERTY_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Entity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__ENTITY_ID = PREDICATE_DESCRIPTION__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Alternate Entity ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__ALTERNATE_ENTITY_ID = PREDICATE_DESCRIPTION__ALTERNATE_ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION = PREDICATE_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__DESIGNATION = PREDICATE_DESCRIPTION__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__DEFINITION = PREDICATE_DESCRIPTION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__EXAMPLE = PREDICATE_DESCRIPTION__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__NOTE = PREDICATE_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__PROPERTY = PREDICATE_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__SOURCE_STATEMENTS = PREDICATE_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__SUBJECT_OF = PREDICATE_DESCRIPTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Predicate Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__PREDICATE_OF = PREDICATE_DESCRIPTION__PREDICATE_OF;

	/**
	 * The feature id for the '<em><b>Target Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__TARGET_OF = PREDICATE_DESCRIPTION__TARGET_OF;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__PARENT = PREDICATE_DESCRIPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Ancestors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__ANCESTORS = PREDICATE_DESCRIPTION__ANCESTORS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__CHILDREN = PREDICATE_DESCRIPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__DESCENDANTS = PREDICATE_DESCRIPTION__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__ENTITY_TYPE = PREDICATE_DESCRIPTION__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__INSTANCES = PREDICATE_DESCRIPTION__INSTANCES;

	/**
	 * The feature id for the '<em><b>Equivalent Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__EQUIVALENT_ENTITY = PREDICATE_DESCRIPTION__EQUIVALENT_ENTITY;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__ABOUT = PREDICATE_DESCRIPTION__ABOUT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__STATUS = PREDICATE_DESCRIPTION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__CHANGE_DESCRIPTION = PREDICATE_DESCRIPTION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__ENTRY_STATE = PREDICATE_DESCRIPTION__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Forward Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__FORWARD_NAME = PREDICATE_DESCRIPTION__FORWARD_NAME;

	/**
	 * The feature id for the '<em><b>Reverse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION__REVERSE_NAME = PREDICATE_DESCRIPTION__REVERSE_NAME;

	/**
	 * The number of structural features of the '<em>Data Property Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DESCRIPTION_FEATURE_COUNT = PREDICATE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.DataTypeDescriptionImpl <em>Data Type Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.DataTypeDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getDataTypeDescription()
	 * @generated
	 */
	int DATA_TYPE_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Entity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__ENTITY_ID = ANONYMOUS_ENTITY_DESCRIPTION__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Alternate Entity ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__ALTERNATE_ENTITY_ID = ANONYMOUS_ENTITY_DESCRIPTION__ALTERNATE_ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION = ANONYMOUS_ENTITY_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__DESIGNATION = ANONYMOUS_ENTITY_DESCRIPTION__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__DEFINITION = ANONYMOUS_ENTITY_DESCRIPTION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__EXAMPLE = ANONYMOUS_ENTITY_DESCRIPTION__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__NOTE = ANONYMOUS_ENTITY_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__PROPERTY = ANONYMOUS_ENTITY_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__SOURCE_STATEMENTS = ANONYMOUS_ENTITY_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__SUBJECT_OF = ANONYMOUS_ENTITY_DESCRIPTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Predicate Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__PREDICATE_OF = ANONYMOUS_ENTITY_DESCRIPTION__PREDICATE_OF;

	/**
	 * The feature id for the '<em><b>Target Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__TARGET_OF = ANONYMOUS_ENTITY_DESCRIPTION__TARGET_OF;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__PARENT = ANONYMOUS_ENTITY_DESCRIPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Ancestors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__ANCESTORS = ANONYMOUS_ENTITY_DESCRIPTION__ANCESTORS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__CHILDREN = ANONYMOUS_ENTITY_DESCRIPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__DESCENDANTS = ANONYMOUS_ENTITY_DESCRIPTION__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__ENTITY_TYPE = ANONYMOUS_ENTITY_DESCRIPTION__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__INSTANCES = ANONYMOUS_ENTITY_DESCRIPTION__INSTANCES;

	/**
	 * The feature id for the '<em><b>Equivalent Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__EQUIVALENT_ENTITY = ANONYMOUS_ENTITY_DESCRIPTION__EQUIVALENT_ENTITY;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION__ABOUT = ANONYMOUS_ENTITY_DESCRIPTION__ABOUT;

	/**
	 * The number of structural features of the '<em>Data Type Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DESCRIPTION_FEATURE_COUNT = ANONYMOUS_ENTITY_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.DesignationImpl <em>Designation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.DesignationImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getDesignation()
	 * @generated
	 */
	int DESIGNATION = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__VALUE = CorePackage.ENTRY_DESCRIPTION__VALUE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__FORMAT = CorePackage.ENTRY_DESCRIPTION__FORMAT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__LANGUAGE = CorePackage.ENTRY_DESCRIPTION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__SCHEMA = CorePackage.ENTRY_DESCRIPTION__SCHEMA;

	/**
	 * The feature id for the '<em><b>Usage Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__USAGE_CONTEXT = CorePackage.ENTRY_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Designation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__DESIGNATION_TYPE = CorePackage.ENTRY_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Case Significance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__CASE_SIGNIFICANCE = CorePackage.ENTRY_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Degree Of Fidelity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__DEGREE_OF_FIDELITY = CorePackage.ENTRY_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asserted In Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__ASSERTED_IN_CODE_SYSTEM_VERSION = CorePackage.ENTRY_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Corresponding Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__CORRESPONDING_STATEMENT = CorePackage.ENTRY_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Designation Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__DESIGNATION_ROLE = CorePackage.ENTRY_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>External Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__EXTERNAL_IDENTIFIER = CorePackage.ENTRY_DESCRIPTION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Designation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DESIGNATION_FEATURE_COUNT = CorePackage.ENTRY_DESCRIPTION_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.DocumentRootImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 7;

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
	 * The feature id for the '<em><b>Entity Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Entity Description Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY_DESCRIPTION_MSG = 4;

	/**
	 * The feature id for the '<em><b>Entity Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY_DIRECTORY = 5;

	/**
	 * The feature id for the '<em><b>Entity List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY_LIST = 6;

	/**
	 * The feature id for the '<em><b>Entity Reference Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY_REFERENCE_MSG = 7;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityDescription()
	 * @generated
	 */
	int ENTITY_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Named Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION__NAMED_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Anonymous Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION__ANONYMOUS_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Class Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION__CLASS_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Data Type Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Predicate Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Object Property Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Data Property Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Annotation Property Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Named Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION__NAMED_INDIVIDUAL = 8;

	/**
	 * The feature id for the '<em><b>Anonymous Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL = 9;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionMsgImpl <em>Description Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionMsgImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityDescriptionMsg()
	 * @generated
	 */
	int ENTITY_DESCRIPTION_MSG = 10;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_MSG__HEADING = CorePackage.MESSAGE__HEADING;

	/**
	 * The feature id for the '<em><b>Entity Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_MSG__ENTITY_DESCRIPTION = CorePackage.MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_MSG_FEATURE_COUNT = CorePackage.MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDirectoryImpl <em>Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityDirectoryImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityDirectory()
	 * @generated
	 */
	int ENTITY_DIRECTORY = 11;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDirectoryEntryImpl <em>Directory Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityDirectoryEntryImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityDirectoryEntry()
	 * @generated
	 */
	int ENTITY_DIRECTORY_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY_ENTRY__NAME = CorePackage.ENTITY_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Known Entity Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY_ENTRY__KNOWN_ENTITY_DESCRIPTION = CorePackage.ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY_ENTRY__ABOUT = CorePackage.ENTITY_REFERENCE__ABOUT;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY_ENTRY__HREF = CorePackage.ENTITY_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY_ENTRY__MATCH_STRENGTH = CorePackage.ENTITY_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY_ENTRY__RESOURCE_NAME = CorePackage.ENTITY_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Directory Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_DIRECTORY_ENTRY_FEATURE_COUNT = CorePackage.ENTITY_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityListImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityList()
	 * @generated
	 */
	int ENTITY_LIST = 13;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST__HEADING = CorePackage.DIRECTORY__HEADING;

	/**
	 * The feature id for the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST__DIRECTORY_FILTER = CorePackage.DIRECTORY__DIRECTORY_FILTER;

	/**
	 * The feature id for the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST__SORT_CRITERIA = CorePackage.DIRECTORY__SORT_CRITERIA;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST__COMPLETE = CorePackage.DIRECTORY__COMPLETE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST__NEXT = CorePackage.DIRECTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST__NUM_ENTRIES = CorePackage.DIRECTORY__NUM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST__PREV = CorePackage.DIRECTORY__PREV;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST__ENTRY = CorePackage.DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST_FEATURE_COUNT = CorePackage.DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityListEntryImpl <em>List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityListEntryImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityListEntry()
	 * @generated
	 */
	int ENTITY_LIST_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST_ENTRY__HREF = CorePackage.DIRECTORY_ENTRY__HREF;

	/**
	 * The feature id for the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST_ENTRY__MATCH_STRENGTH = CorePackage.DIRECTORY_ENTRY__MATCH_STRENGTH;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST_ENTRY__RESOURCE_NAME = CorePackage.DIRECTORY_ENTRY__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST_ENTRY__ENTRY = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST_ENTRY_FEATURE_COUNT = CorePackage.DIRECTORY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityReferenceMsgImpl <em>Reference Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityReferenceMsgImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityReferenceMsg()
	 * @generated
	 */
	int ENTITY_REFERENCE_MSG = 15;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_MSG__HEADING = CorePackage.MESSAGE__HEADING;

	/**
	 * The feature id for the '<em><b>Entity Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_MSG__ENTITY_REFERENCE = CorePackage.MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_MSG_FEATURE_COUNT = CorePackage.MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.NamedIndividualDescriptionImpl
	 * <em>Named Individual Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.NamedIndividualDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getNamedIndividualDescription()
	 * @generated
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION = 17;

	/**
	 * The feature id for the '<em><b>Entity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__ENTITY_ID = NAMED_ENTITY_DESCRIPTION__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Alternate Entity ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__ALTERNATE_ENTITY_ID = NAMED_ENTITY_DESCRIPTION__ALTERNATE_ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION = NAMED_ENTITY_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__DESIGNATION = NAMED_ENTITY_DESCRIPTION__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__DEFINITION = NAMED_ENTITY_DESCRIPTION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__EXAMPLE = NAMED_ENTITY_DESCRIPTION__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__NOTE = NAMED_ENTITY_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__PROPERTY = NAMED_ENTITY_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__SOURCE_STATEMENTS = NAMED_ENTITY_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__SUBJECT_OF = NAMED_ENTITY_DESCRIPTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Predicate Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__PREDICATE_OF = NAMED_ENTITY_DESCRIPTION__PREDICATE_OF;

	/**
	 * The feature id for the '<em><b>Target Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__TARGET_OF = NAMED_ENTITY_DESCRIPTION__TARGET_OF;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__PARENT = NAMED_ENTITY_DESCRIPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Ancestors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__ANCESTORS = NAMED_ENTITY_DESCRIPTION__ANCESTORS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__CHILDREN = NAMED_ENTITY_DESCRIPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__DESCENDANTS = NAMED_ENTITY_DESCRIPTION__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__ENTITY_TYPE = NAMED_ENTITY_DESCRIPTION__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__INSTANCES = NAMED_ENTITY_DESCRIPTION__INSTANCES;

	/**
	 * The feature id for the '<em><b>Equivalent Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__EQUIVALENT_ENTITY = NAMED_ENTITY_DESCRIPTION__EQUIVALENT_ENTITY;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__ABOUT = NAMED_ENTITY_DESCRIPTION__ABOUT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__STATUS = NAMED_ENTITY_DESCRIPTION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__CHANGE_DESCRIPTION = NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION__ENTRY_STATE = NAMED_ENTITY_DESCRIPTION__ENTRY_STATE;

	/**
	 * The number of structural features of the '<em>Named Individual Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_DESCRIPTION_FEATURE_COUNT = NAMED_ENTITY_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.impl.ObjectPropertyDescriptionImpl
	 * <em>Object Property Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.impl.ObjectPropertyDescriptionImpl
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getObjectPropertyDescription()
	 * @generated
	 */
	int OBJECT_PROPERTY_DESCRIPTION = 18;

	/**
	 * The feature id for the '<em><b>Entity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__ENTITY_ID = PREDICATE_DESCRIPTION__ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Alternate Entity ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__ALTERNATE_ENTITY_ID = PREDICATE_DESCRIPTION__ALTERNATE_ENTITY_ID;

	/**
	 * The feature id for the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION = PREDICATE_DESCRIPTION__DESCRIBING_CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__DESIGNATION = PREDICATE_DESCRIPTION__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__DEFINITION = PREDICATE_DESCRIPTION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__EXAMPLE = PREDICATE_DESCRIPTION__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__NOTE = PREDICATE_DESCRIPTION__NOTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__PROPERTY = PREDICATE_DESCRIPTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__SOURCE_STATEMENTS = PREDICATE_DESCRIPTION__SOURCE_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__SUBJECT_OF = PREDICATE_DESCRIPTION__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Predicate Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__PREDICATE_OF = PREDICATE_DESCRIPTION__PREDICATE_OF;

	/**
	 * The feature id for the '<em><b>Target Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__TARGET_OF = PREDICATE_DESCRIPTION__TARGET_OF;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__PARENT = PREDICATE_DESCRIPTION__PARENT;

	/**
	 * The feature id for the '<em><b>Ancestors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__ANCESTORS = PREDICATE_DESCRIPTION__ANCESTORS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__CHILDREN = PREDICATE_DESCRIPTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__DESCENDANTS = PREDICATE_DESCRIPTION__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__ENTITY_TYPE = PREDICATE_DESCRIPTION__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__INSTANCES = PREDICATE_DESCRIPTION__INSTANCES;

	/**
	 * The feature id for the '<em><b>Equivalent Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__EQUIVALENT_ENTITY = PREDICATE_DESCRIPTION__EQUIVALENT_ENTITY;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__ABOUT = PREDICATE_DESCRIPTION__ABOUT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__STATUS = PREDICATE_DESCRIPTION__STATUS;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__CHANGE_DESCRIPTION = PREDICATE_DESCRIPTION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entry State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__ENTRY_STATE = PREDICATE_DESCRIPTION__ENTRY_STATE;

	/**
	 * The feature id for the '<em><b>Forward Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__FORWARD_NAME = PREDICATE_DESCRIPTION__FORWARD_NAME;

	/**
	 * The feature id for the '<em><b>Reverse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__REVERSE_NAME = PREDICATE_DESCRIPTION__REVERSE_NAME;

	/**
	 * The feature id for the '<em><b>Directed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__DIRECTED = PREDICATE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION__TRANSITIVITY = PREDICATE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Property Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DESCRIPTION_FEATURE_COUNT = PREDICATE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.ClassDescriptionState <em>Class Description State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionState
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getClassDescriptionState()
	 * @generated
	 */
	int CLASS_DESCRIPTION_STATE = 20;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.ClassDescriptionType <em>Class Description Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionType
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getClassDescriptionType()
	 * @generated
	 */
	int CLASS_DESCRIPTION_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.DesignationRole <em>Designation Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.DesignationRole
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getDesignationRole()
	 * @generated
	 */
	int DESIGNATION_ROLE = 22;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality <em>Object Property Directionality</em>}'
	 * enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getObjectPropertyDirectionality()
	 * @generated
	 */
	int OBJECT_PROPERTY_DIRECTIONALITY = 23;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.cts2.entity.Transitivity <em>Transitivity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.Transitivity
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getTransitivity()
	 * @generated
	 */
	int TRANSITIVITY = 24;

	/**
	 * The meta object id for the '<em>Class Description State Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionState
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getClassDescriptionStateObject()
	 * @generated
	 */
	int CLASS_DESCRIPTION_STATE_OBJECT = 25;

	/**
	 * The meta object id for the '<em>Class Description Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionType
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getClassDescriptionTypeObject()
	 * @generated
	 */
	int CLASS_DESCRIPTION_TYPE_OBJECT = 26;

	/**
	 * The meta object id for the '<em>Designation Role Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.DesignationRole
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getDesignationRoleObject()
	 * @generated
	 */
	int DESIGNATION_ROLE_OBJECT = 27;

	/**
	 * The meta object id for the '<em>Object Property Directionality Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getObjectPropertyDirectionalityObject()
	 * @generated
	 */
	int OBJECT_PROPERTY_DIRECTIONALITY_OBJECT = 28;

	/**
	 * The meta object id for the '<em>Transitivity Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.cts2.entity.Transitivity
	 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getTransitivityObject()
	 * @generated
	 */
	int TRANSITIVITY_OBJECT = 29;

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.AnnotationPropertyDescription
	 * <em>Annotation Property Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Annotation Property Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.AnnotationPropertyDescription
	 * @generated
	 */
	EClass getAnnotationPropertyDescription();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.AnonymousEntityDescription
	 * <em>Anonymous Entity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Anonymous Entity Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.AnonymousEntityDescription
	 * @generated
	 */
	EClass getAnonymousEntityDescription();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.AnonymousIndividualDescription
	 * <em>Anonymous Individual Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Anonymous Individual Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.AnonymousIndividualDescription
	 * @generated
	 */
	EClass getAnonymousIndividualDescription();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.ClassDescription <em>Class Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Class Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescription
	 * @generated
	 */
	EClass getClassDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.ClassDescription#getDescriptionState
	 * <em>Description State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Description State</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescription#getDescriptionState()
	 * @see #getClassDescription()
	 * @generated
	 */
	EAttribute getClassDescription_DescriptionState();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.ClassDescription#getDescriptionType
	 * <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Description Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescription#getDescriptionType()
	 * @see #getClassDescription()
	 * @generated
	 */
	EAttribute getClassDescription_DescriptionType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.DataPropertyDescription <em>Data Property Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Property Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.DataPropertyDescription
	 * @generated
	 */
	EClass getDataPropertyDescription();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.DataTypeDescription <em>Data Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Type Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.DataTypeDescription
	 * @generated
	 */
	EClass getDataTypeDescription();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.Designation <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Designation</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.Designation
	 * @generated
	 */
	EClass getDesignation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.entity.Designation#getUsageContext
	 * <em>Usage Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Usage Context</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.Designation#getUsageContext()
	 * @see #getDesignation()
	 * @generated
	 */
	EReference getDesignation_UsageContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.Designation#getDesignationType
	 * <em>Designation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Designation Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.Designation#getDesignationType()
	 * @see #getDesignation()
	 * @generated
	 */
	EReference getDesignation_DesignationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.Designation#getCaseSignificance
	 * <em>Case Significance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Case Significance</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.Designation#getCaseSignificance()
	 * @see #getDesignation()
	 * @generated
	 */
	EReference getDesignation_CaseSignificance();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.Designation#getDegreeOfFidelity
	 * <em>Degree Of Fidelity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Degree Of Fidelity</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.Designation#getDegreeOfFidelity()
	 * @see #getDesignation()
	 * @generated
	 */
	EReference getDesignation_DegreeOfFidelity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.Designation#getAssertedInCodeSystemVersion
	 * <em>Asserted In Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Asserted In Code System Version</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.Designation#getAssertedInCodeSystemVersion()
	 * @see #getDesignation()
	 * @generated
	 */
	EAttribute getDesignation_AssertedInCodeSystemVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.Designation#getCorrespondingStatement
	 * <em>Corresponding Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Corresponding Statement</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.Designation#getCorrespondingStatement()
	 * @see #getDesignation()
	 * @generated
	 */
	EAttribute getDesignation_CorrespondingStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.Designation#getDesignationRole
	 * <em>Designation Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Designation Role</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.Designation#getDesignationRole()
	 * @see #getDesignation()
	 * @generated
	 */
	EAttribute getDesignation_DesignationRole();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.Designation#getExternalIdentifier
	 * <em>External Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>External Identifier</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.Designation#getExternalIdentifier()
	 * @see #getDesignation()
	 * @generated
	 */
	EAttribute getDesignation_ExternalIdentifier();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getXSISchemaLocation
	 * <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityDescription
	 * <em>Entity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entity Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EntityDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityDescriptionMsg
	 * <em>Entity Description Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entity Description Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityDescriptionMsg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EntityDescriptionMsg();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityDirectory
	 * <em>Entity Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entity Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityDirectory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EntityDirectory();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityList
	 * <em>Entity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entity List</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EntityList();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityReferenceMsg
	 * <em>Entity Reference Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entity Reference Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityReferenceMsg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EntityReferenceMsg();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescription
	 * @generated
	 */
	EClass getEntityDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getNamedEntity
	 * <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Named Entity</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescription#getNamedEntity()
	 * @see #getEntityDescription()
	 * @generated
	 */
	EReference getEntityDescription_NamedEntity();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getAnonymousEntity
	 * <em>Anonymous Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Anonymous Entity</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescription#getAnonymousEntity()
	 * @see #getEntityDescription()
	 * @generated
	 */
	EReference getEntityDescription_AnonymousEntity();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getClassDescription
	 * <em>Class Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Class Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescription#getClassDescription()
	 * @see #getEntityDescription()
	 * @generated
	 */
	EReference getEntityDescription_ClassDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getDataTypeDescription
	 * <em>Data Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Data Type Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescription#getDataTypeDescription()
	 * @see #getEntityDescription()
	 * @generated
	 */
	EReference getEntityDescription_DataTypeDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getPredicateDescription
	 * <em>Predicate Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Predicate Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescription#getPredicateDescription()
	 * @see #getEntityDescription()
	 * @generated
	 */
	EReference getEntityDescription_PredicateDescription();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getObjectPropertyDescription <em>Object Property Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Object Property Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescription#getObjectPropertyDescription()
	 * @see #getEntityDescription()
	 * @generated
	 */
	EReference getEntityDescription_ObjectPropertyDescription();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getDataPropertyDescription <em>Data Property Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Data Property Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescription#getDataPropertyDescription()
	 * @see #getEntityDescription()
	 * @generated
	 */
	EReference getEntityDescription_DataPropertyDescription();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getAnnotationPropertyDescription <em>Annotation Property Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Annotation Property Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescription#getAnnotationPropertyDescription()
	 * @see #getEntityDescription()
	 * @generated
	 */
	EReference getEntityDescription_AnnotationPropertyDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getNamedIndividual
	 * <em>Named Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Named Individual</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescription#getNamedIndividual()
	 * @see #getEntityDescription()
	 * @generated
	 */
	EReference getEntityDescription_NamedIndividual();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getAnonymousIndividual
	 * <em>Anonymous Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Anonymous Individual</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescription#getAnonymousIndividual()
	 * @see #getEntityDescription()
	 * @generated
	 */
	EReference getEntityDescription_AnonymousIndividual();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase <em>Description Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Description Base</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase
	 * @generated
	 */
	EClass getEntityDescriptionBase();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getEntityID
	 * <em>Entity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entity ID</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getEntityID()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EReference getEntityDescriptionBase_EntityID();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getAlternateEntityID <em>Alternate Entity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Alternate Entity ID</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getAlternateEntityID()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EReference getEntityDescriptionBase_AlternateEntityID();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDescribingCodeSystemVersion <em>Describing Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Describing Code System Version</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDescribingCodeSystemVersion()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EReference getEntityDescriptionBase_DescribingCodeSystemVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDesignation
	 * <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Designation</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDesignation()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EReference getEntityDescriptionBase_Designation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDefinition
	 * <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Definition</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDefinition()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EReference getEntityDescriptionBase_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getExample
	 * <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Example</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getExample()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EReference getEntityDescriptionBase_Example();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getNote
	 * <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getNote()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EReference getEntityDescriptionBase_Note();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getProperty
	 * <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getProperty()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EReference getEntityDescriptionBase_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getSourceStatements
	 * <em>Source Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source Statements</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getSourceStatements()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EAttribute getEntityDescriptionBase_SourceStatements();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getSubjectOf <em>Subject Of</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Subject Of</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getSubjectOf()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EAttribute getEntityDescriptionBase_SubjectOf();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getPredicateOf
	 * <em>Predicate Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Predicate Of</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getPredicateOf()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EAttribute getEntityDescriptionBase_PredicateOf();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getTargetOf <em>Target Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Target Of</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getTargetOf()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EAttribute getEntityDescriptionBase_TargetOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getParent
	 * <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Parent</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getParent()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EReference getEntityDescriptionBase_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getAncestors <em>Ancestors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ancestors</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getAncestors()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EAttribute getEntityDescriptionBase_Ancestors();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Children</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getChildren()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EAttribute getEntityDescriptionBase_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDescendants
	 * <em>Descendants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Descendants</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDescendants()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EAttribute getEntityDescriptionBase_Descendants();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getEntityType
	 * <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entity Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getEntityType()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EReference getEntityDescriptionBase_EntityType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Instances</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getInstances()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EAttribute getEntityDescriptionBase_Instances();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getEquivalentEntity <em>Equivalent Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Equivalent Entity</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getEquivalentEntity()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EReference getEntityDescriptionBase_EquivalentEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getAbout()
	 * @see #getEntityDescriptionBase()
	 * @generated
	 */
	EAttribute getEntityDescriptionBase_About();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg <em>Description Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Description Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg
	 * @generated
	 */
	EClass getEntityDescriptionMsg();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg#getEntityDescription
	 * <em>Entity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entity Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg#getEntityDescription()
	 * @see #getEntityDescriptionMsg()
	 * @generated
	 */
	EReference getEntityDescriptionMsg_EntityDescription();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.EntityDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDirectory
	 * @generated
	 */
	EClass getEntityDirectory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.entity.EntityDirectory#getEntry
	 * <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDirectory#getEntry()
	 * @see #getEntityDirectory()
	 * @generated
	 */
	EReference getEntityDirectory_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.EntityDirectoryEntry <em>Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Directory Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDirectoryEntry
	 * @generated
	 */
	EClass getEntityDirectoryEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.EntityDirectoryEntry#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDirectoryEntry#getHref()
	 * @see #getEntityDirectoryEntry()
	 * @generated
	 */
	EAttribute getEntityDirectoryEntry_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.EntityDirectoryEntry#getMatchStrength
	 * <em>Match Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Match Strength</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDirectoryEntry#getMatchStrength()
	 * @see #getEntityDirectoryEntry()
	 * @generated
	 */
	EAttribute getEntityDirectoryEntry_MatchStrength();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.EntityDirectoryEntry#getResourceName
	 * <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityDirectoryEntry#getResourceName()
	 * @see #getEntityDirectoryEntry()
	 * @generated
	 */
	EAttribute getEntityDirectoryEntry_ResourceName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.EntityList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityList
	 * @generated
	 */
	EClass getEntityList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.cts2.entity.EntityList#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityList#getEntry()
	 * @see #getEntityList()
	 * @generated
	 */
	EReference getEntityList_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.EntityListEntry <em>List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>List Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityListEntry
	 * @generated
	 */
	EClass getEntityListEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.EntityListEntry#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityListEntry#getEntry()
	 * @see #getEntityListEntry()
	 * @generated
	 */
	EReference getEntityListEntry_Entry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.EntityReferenceMsg <em>Reference Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Reference Msg</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityReferenceMsg
	 * @generated
	 */
	EClass getEntityReferenceMsg();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.EntityReferenceMsg#getEntityReference
	 * <em>Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Entity Reference</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityReferenceMsg#getEntityReference()
	 * @see #getEntityReferenceMsg()
	 * @generated
	 */
	EReference getEntityReferenceMsg_EntityReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.NamedEntityDescription <em>Named Entity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Entity Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.NamedEntityDescription
	 * @generated
	 */
	EClass getNamedEntityDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.NamedEntityDescription#getStatus
	 * <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.NamedEntityDescription#getStatus()
	 * @see #getNamedEntityDescription()
	 * @generated
	 */
	EReference getNamedEntityDescription_Status();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.cts2.entity.NamedEntityDescription#getChangeDescription
	 * <em>Change Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Change Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.NamedEntityDescription#getChangeDescription()
	 * @see #getNamedEntityDescription()
	 * @generated
	 */
	EReference getNamedEntityDescription_ChangeDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.NamedEntityDescription#getEntryState
	 * <em>Entry State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Entry State</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.NamedEntityDescription#getEntryState()
	 * @see #getNamedEntityDescription()
	 * @generated
	 */
	EAttribute getNamedEntityDescription_EntryState();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.NamedIndividualDescription
	 * <em>Named Individual Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Individual Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.NamedIndividualDescription
	 * @generated
	 */
	EClass getNamedIndividualDescription();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription <em>Object Property Description</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Object Property Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription
	 * @generated
	 */
	EClass getObjectPropertyDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription#getDirected <em>Directed</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Directed</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription#getDirected()
	 * @see #getObjectPropertyDescription()
	 * @generated
	 */
	EAttribute getObjectPropertyDescription_Directed();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription#getTransitivity
	 * <em>Transitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Transitivity</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription#getTransitivity()
	 * @see #getObjectPropertyDescription()
	 * @generated
	 */
	EAttribute getObjectPropertyDescription_Transitivity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.cts2.entity.PredicateDescription <em>Predicate Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Predicate Description</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.PredicateDescription
	 * @generated
	 */
	EClass getPredicateDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.PredicateDescription#getForwardName
	 * <em>Forward Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Forward Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.PredicateDescription#getForwardName()
	 * @see #getPredicateDescription()
	 * @generated
	 */
	EAttribute getPredicateDescription_ForwardName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.cts2.entity.PredicateDescription#getReverseName
	 * <em>Reverse Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Reverse Name</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.PredicateDescription#getReverseName()
	 * @see #getPredicateDescription()
	 * @generated
	 */
	EAttribute getPredicateDescription_ReverseName();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.entity.ClassDescriptionState <em>Class Description State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Class Description State</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionState
	 * @generated
	 */
	EEnum getClassDescriptionState();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.entity.ClassDescriptionType <em>Class Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Class Description Type</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionType
	 * @generated
	 */
	EEnum getClassDescriptionType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.entity.DesignationRole <em>Designation Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Designation Role</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.DesignationRole
	 * @generated
	 */
	EEnum getDesignationRole();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality
	 * <em>Object Property Directionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Object Property Directionality</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality
	 * @generated
	 */
	EEnum getObjectPropertyDirectionality();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.cts2.entity.Transitivity <em>Transitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Transitivity</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.Transitivity
	 * @generated
	 */
	EEnum getTransitivity();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.entity.ClassDescriptionState
	 * <em>Class Description State Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Class Description State Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionState
	 * @model instanceClass="org.openhealthtools.mdht.cts2.entity.ClassDescriptionState"
	 *        extendedMetaData="name='ClassDescriptionState:Object' baseType='ClassDescriptionState'"
	 * @generated
	 */
	EDataType getClassDescriptionStateObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.entity.ClassDescriptionType <em>Class Description Type Object</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Class Description Type Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionType
	 * @model instanceClass="org.openhealthtools.mdht.cts2.entity.ClassDescriptionType"
	 *        extendedMetaData="name='ClassDescriptionType:Object' baseType='ClassDescriptionType'"
	 * @generated
	 */
	EDataType getClassDescriptionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.entity.DesignationRole <em>Designation Role Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Designation Role Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.DesignationRole
	 * @model instanceClass="org.openhealthtools.mdht.cts2.entity.DesignationRole"
	 *        extendedMetaData="name='DesignationRole:Object' baseType='DesignationRole'"
	 * @generated
	 */
	EDataType getDesignationRoleObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality
	 * <em>Object Property Directionality Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Object Property Directionality Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality
	 * @model instanceClass="org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality"
	 *        extendedMetaData="name='ObjectPropertyDirectionality:Object' baseType='ObjectPropertyDirectionality'"
	 * @generated
	 */
	EDataType getObjectPropertyDirectionalityObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.cts2.entity.Transitivity <em>Transitivity Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Transitivity Object</em>'.
	 * @see org.openhealthtools.mdht.cts2.entity.Transitivity
	 * @model instanceClass="org.openhealthtools.mdht.cts2.entity.Transitivity"
	 *        extendedMetaData="name='Transitivity:Object' baseType='Transitivity'"
	 * @generated
	 */
	EDataType getTransitivityObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntityFactory getEntityFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.AnnotationPropertyDescriptionImpl
		 * <em>Annotation Property Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.AnnotationPropertyDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getAnnotationPropertyDescription()
		 * @generated
		 */
		EClass ANNOTATION_PROPERTY_DESCRIPTION = eINSTANCE.getAnnotationPropertyDescription();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.AnonymousEntityDescriptionImpl
		 * <em>Anonymous Entity Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.AnonymousEntityDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getAnonymousEntityDescription()
		 * @generated
		 */
		EClass ANONYMOUS_ENTITY_DESCRIPTION = eINSTANCE.getAnonymousEntityDescription();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.AnonymousIndividualDescriptionImpl
		 * <em>Anonymous Individual Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.AnonymousIndividualDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getAnonymousIndividualDescription()
		 * @generated
		 */
		EClass ANONYMOUS_INDIVIDUAL_DESCRIPTION = eINSTANCE.getAnonymousIndividualDescription();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.ClassDescriptionImpl <em>Class Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.ClassDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getClassDescription()
		 * @generated
		 */
		EClass CLASS_DESCRIPTION = eINSTANCE.getClassDescription();

		/**
		 * The meta object literal for the '<em><b>Description State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CLASS_DESCRIPTION__DESCRIPTION_STATE = eINSTANCE.getClassDescription_DescriptionState();

		/**
		 * The meta object literal for the '<em><b>Description Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CLASS_DESCRIPTION__DESCRIPTION_TYPE = eINSTANCE.getClassDescription_DescriptionType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.DataPropertyDescriptionImpl
		 * <em>Data Property Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.DataPropertyDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getDataPropertyDescription()
		 * @generated
		 */
		EClass DATA_PROPERTY_DESCRIPTION = eINSTANCE.getDataPropertyDescription();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.DataTypeDescriptionImpl <em>Data Type Description</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.DataTypeDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getDataTypeDescription()
		 * @generated
		 */
		EClass DATA_TYPE_DESCRIPTION = eINSTANCE.getDataTypeDescription();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.DesignationImpl <em>Designation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.DesignationImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getDesignation()
		 * @generated
		 */
		EClass DESIGNATION = eINSTANCE.getDesignation();

		/**
		 * The meta object literal for the '<em><b>Usage Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DESIGNATION__USAGE_CONTEXT = eINSTANCE.getDesignation_UsageContext();

		/**
		 * The meta object literal for the '<em><b>Designation Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DESIGNATION__DESIGNATION_TYPE = eINSTANCE.getDesignation_DesignationType();

		/**
		 * The meta object literal for the '<em><b>Case Significance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DESIGNATION__CASE_SIGNIFICANCE = eINSTANCE.getDesignation_CaseSignificance();

		/**
		 * The meta object literal for the '<em><b>Degree Of Fidelity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DESIGNATION__DEGREE_OF_FIDELITY = eINSTANCE.getDesignation_DegreeOfFidelity();

		/**
		 * The meta object literal for the '<em><b>Asserted In Code System Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DESIGNATION__ASSERTED_IN_CODE_SYSTEM_VERSION = eINSTANCE.getDesignation_AssertedInCodeSystemVersion();

		/**
		 * The meta object literal for the '<em><b>Corresponding Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DESIGNATION__CORRESPONDING_STATEMENT = eINSTANCE.getDesignation_CorrespondingStatement();

		/**
		 * The meta object literal for the '<em><b>Designation Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DESIGNATION__DESIGNATION_ROLE = eINSTANCE.getDesignation_DesignationRole();

		/**
		 * The meta object literal for the '<em><b>External Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DESIGNATION__EXTERNAL_IDENTIFIER = eINSTANCE.getDesignation_ExternalIdentifier();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.DocumentRootImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Entity Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTITY_DESCRIPTION = eINSTANCE.getDocumentRoot_EntityDescription();

		/**
		 * The meta object literal for the '<em><b>Entity Description Msg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTITY_DESCRIPTION_MSG = eINSTANCE.getDocumentRoot_EntityDescriptionMsg();

		/**
		 * The meta object literal for the '<em><b>Entity Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTITY_DIRECTORY = eINSTANCE.getDocumentRoot_EntityDirectory();

		/**
		 * The meta object literal for the '<em><b>Entity List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTITY_LIST = eINSTANCE.getDocumentRoot_EntityList();

		/**
		 * The meta object literal for the '<em><b>Entity Reference Msg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTITY_REFERENCE_MSG = eINSTANCE.getDocumentRoot_EntityReferenceMsg();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityDescription()
		 * @generated
		 */
		EClass ENTITY_DESCRIPTION = eINSTANCE.getEntityDescription();

		/**
		 * The meta object literal for the '<em><b>Named Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION__NAMED_ENTITY = eINSTANCE.getEntityDescription_NamedEntity();

		/**
		 * The meta object literal for the '<em><b>Anonymous Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION__ANONYMOUS_ENTITY = eINSTANCE.getEntityDescription_AnonymousEntity();

		/**
		 * The meta object literal for the '<em><b>Class Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION__CLASS_DESCRIPTION = eINSTANCE.getEntityDescription_ClassDescription();

		/**
		 * The meta object literal for the '<em><b>Data Type Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION = eINSTANCE.getEntityDescription_DataTypeDescription();

		/**
		 * The meta object literal for the '<em><b>Predicate Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION = eINSTANCE.getEntityDescription_PredicateDescription();

		/**
		 * The meta object literal for the '<em><b>Object Property Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION = eINSTANCE.getEntityDescription_ObjectPropertyDescription();

		/**
		 * The meta object literal for the '<em><b>Data Property Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION = eINSTANCE.getEntityDescription_DataPropertyDescription();

		/**
		 * The meta object literal for the '<em><b>Annotation Property Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION = eINSTANCE.getEntityDescription_AnnotationPropertyDescription();

		/**
		 * The meta object literal for the '<em><b>Named Individual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION__NAMED_INDIVIDUAL = eINSTANCE.getEntityDescription_NamedIndividual();

		/**
		 * The meta object literal for the '<em><b>Anonymous Individual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL = eINSTANCE.getEntityDescription_AnonymousIndividual();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl <em>Description Base</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityDescriptionBase()
		 * @generated
		 */
		EClass ENTITY_DESCRIPTION_BASE = eINSTANCE.getEntityDescriptionBase();

		/**
		 * The meta object literal for the '<em><b>Entity ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION_BASE__ENTITY_ID = eINSTANCE.getEntityDescriptionBase_EntityID();

		/**
		 * The meta object literal for the '<em><b>Alternate Entity ID</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID = eINSTANCE.getEntityDescriptionBase_AlternateEntityID();

		/**
		 * The meta object literal for the '<em><b>Describing Code System Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION = eINSTANCE.getEntityDescriptionBase_DescribingCodeSystemVersion();

		/**
		 * The meta object literal for the '<em><b>Designation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION_BASE__DESIGNATION = eINSTANCE.getEntityDescriptionBase_Designation();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION_BASE__DEFINITION = eINSTANCE.getEntityDescriptionBase_Definition();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION_BASE__EXAMPLE = eINSTANCE.getEntityDescriptionBase_Example();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION_BASE__NOTE = eINSTANCE.getEntityDescriptionBase_Note();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION_BASE__PROPERTY = eINSTANCE.getEntityDescriptionBase_Property();

		/**
		 * The meta object literal for the '<em><b>Source Statements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_DESCRIPTION_BASE__SOURCE_STATEMENTS = eINSTANCE.getEntityDescriptionBase_SourceStatements();

		/**
		 * The meta object literal for the '<em><b>Subject Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_DESCRIPTION_BASE__SUBJECT_OF = eINSTANCE.getEntityDescriptionBase_SubjectOf();

		/**
		 * The meta object literal for the '<em><b>Predicate Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_DESCRIPTION_BASE__PREDICATE_OF = eINSTANCE.getEntityDescriptionBase_PredicateOf();

		/**
		 * The meta object literal for the '<em><b>Target Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_DESCRIPTION_BASE__TARGET_OF = eINSTANCE.getEntityDescriptionBase_TargetOf();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION_BASE__PARENT = eINSTANCE.getEntityDescriptionBase_Parent();

		/**
		 * The meta object literal for the '<em><b>Ancestors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_DESCRIPTION_BASE__ANCESTORS = eINSTANCE.getEntityDescriptionBase_Ancestors();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_DESCRIPTION_BASE__CHILDREN = eINSTANCE.getEntityDescriptionBase_Children();

		/**
		 * The meta object literal for the '<em><b>Descendants</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_DESCRIPTION_BASE__DESCENDANTS = eINSTANCE.getEntityDescriptionBase_Descendants();

		/**
		 * The meta object literal for the '<em><b>Entity Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION_BASE__ENTITY_TYPE = eINSTANCE.getEntityDescriptionBase_EntityType();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_DESCRIPTION_BASE__INSTANCES = eINSTANCE.getEntityDescriptionBase_Instances();

		/**
		 * The meta object literal for the '<em><b>Equivalent Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY = eINSTANCE.getEntityDescriptionBase_EquivalentEntity();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_DESCRIPTION_BASE__ABOUT = eINSTANCE.getEntityDescriptionBase_About();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionMsgImpl <em>Description Msg</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionMsgImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityDescriptionMsg()
		 * @generated
		 */
		EClass ENTITY_DESCRIPTION_MSG = eINSTANCE.getEntityDescriptionMsg();

		/**
		 * The meta object literal for the '<em><b>Entity Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION_MSG__ENTITY_DESCRIPTION = eINSTANCE.getEntityDescriptionMsg_EntityDescription();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDirectoryImpl <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityDirectoryImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityDirectory()
		 * @generated
		 */
		EClass ENTITY_DIRECTORY = eINSTANCE.getEntityDirectory();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_DIRECTORY__ENTRY = eINSTANCE.getEntityDirectory_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDirectoryEntryImpl <em>Directory Entry</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityDirectoryEntryImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityDirectoryEntry()
		 * @generated
		 */
		EClass ENTITY_DIRECTORY_ENTRY = eINSTANCE.getEntityDirectoryEntry();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_DIRECTORY_ENTRY__HREF = eINSTANCE.getEntityDirectoryEntry_Href();

		/**
		 * The meta object literal for the '<em><b>Match Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_DIRECTORY_ENTRY__MATCH_STRENGTH = eINSTANCE.getEntityDirectoryEntry_MatchStrength();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_DIRECTORY_ENTRY__RESOURCE_NAME = eINSTANCE.getEntityDirectoryEntry_ResourceName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityListImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityList()
		 * @generated
		 */
		EClass ENTITY_LIST = eINSTANCE.getEntityList();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_LIST__ENTRY = eINSTANCE.getEntityList_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityListEntryImpl <em>List Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityListEntryImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityListEntry()
		 * @generated
		 */
		EClass ENTITY_LIST_ENTRY = eINSTANCE.getEntityListEntry();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_LIST_ENTRY__ENTRY = eINSTANCE.getEntityListEntry_Entry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.EntityReferenceMsgImpl <em>Reference Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityReferenceMsgImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getEntityReferenceMsg()
		 * @generated
		 */
		EClass ENTITY_REFERENCE_MSG = eINSTANCE.getEntityReferenceMsg();

		/**
		 * The meta object literal for the '<em><b>Entity Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_REFERENCE_MSG__ENTITY_REFERENCE = eINSTANCE.getEntityReferenceMsg_EntityReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.NamedEntityDescriptionImpl
		 * <em>Named Entity Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.NamedEntityDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getNamedEntityDescription()
		 * @generated
		 */
		EClass NAMED_ENTITY_DESCRIPTION = eINSTANCE.getNamedEntityDescription();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NAMED_ENTITY_DESCRIPTION__STATUS = eINSTANCE.getNamedEntityDescription_Status();

		/**
		 * The meta object literal for the '<em><b>Change Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION = eINSTANCE.getNamedEntityDescription_ChangeDescription();

		/**
		 * The meta object literal for the '<em><b>Entry State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NAMED_ENTITY_DESCRIPTION__ENTRY_STATE = eINSTANCE.getNamedEntityDescription_EntryState();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.NamedIndividualDescriptionImpl
		 * <em>Named Individual Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.NamedIndividualDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getNamedIndividualDescription()
		 * @generated
		 */
		EClass NAMED_INDIVIDUAL_DESCRIPTION = eINSTANCE.getNamedIndividualDescription();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.ObjectPropertyDescriptionImpl
		 * <em>Object Property Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.ObjectPropertyDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getObjectPropertyDescription()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_DESCRIPTION = eINSTANCE.getObjectPropertyDescription();

		/**
		 * The meta object literal for the '<em><b>Directed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY_DESCRIPTION__DIRECTED = eINSTANCE.getObjectPropertyDescription_Directed();

		/**
		 * The meta object literal for the '<em><b>Transitivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OBJECT_PROPERTY_DESCRIPTION__TRANSITIVITY = eINSTANCE.getObjectPropertyDescription_Transitivity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.impl.PredicateDescriptionImpl <em>Predicate Description</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.impl.PredicateDescriptionImpl
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getPredicateDescription()
		 * @generated
		 */
		EClass PREDICATE_DESCRIPTION = eINSTANCE.getPredicateDescription();

		/**
		 * The meta object literal for the '<em><b>Forward Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PREDICATE_DESCRIPTION__FORWARD_NAME = eINSTANCE.getPredicateDescription_ForwardName();

		/**
		 * The meta object literal for the '<em><b>Reverse Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PREDICATE_DESCRIPTION__REVERSE_NAME = eINSTANCE.getPredicateDescription_ReverseName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.ClassDescriptionState <em>Class Description State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionState
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getClassDescriptionState()
		 * @generated
		 */
		EEnum CLASS_DESCRIPTION_STATE = eINSTANCE.getClassDescriptionState();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.ClassDescriptionType <em>Class Description Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionType
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getClassDescriptionType()
		 * @generated
		 */
		EEnum CLASS_DESCRIPTION_TYPE = eINSTANCE.getClassDescriptionType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.DesignationRole <em>Designation Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.DesignationRole
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getDesignationRole()
		 * @generated
		 */
		EEnum DESIGNATION_ROLE = eINSTANCE.getDesignationRole();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality
		 * <em>Object Property Directionality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getObjectPropertyDirectionality()
		 * @generated
		 */
		EEnum OBJECT_PROPERTY_DIRECTIONALITY = eINSTANCE.getObjectPropertyDirectionality();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.cts2.entity.Transitivity <em>Transitivity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.Transitivity
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getTransitivity()
		 * @generated
		 */
		EEnum TRANSITIVITY = eINSTANCE.getTransitivity();

		/**
		 * The meta object literal for the '<em>Class Description State Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionState
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getClassDescriptionStateObject()
		 * @generated
		 */
		EDataType CLASS_DESCRIPTION_STATE_OBJECT = eINSTANCE.getClassDescriptionStateObject();

		/**
		 * The meta object literal for the '<em>Class Description Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionType
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getClassDescriptionTypeObject()
		 * @generated
		 */
		EDataType CLASS_DESCRIPTION_TYPE_OBJECT = eINSTANCE.getClassDescriptionTypeObject();

		/**
		 * The meta object literal for the '<em>Designation Role Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.DesignationRole
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getDesignationRoleObject()
		 * @generated
		 */
		EDataType DESIGNATION_ROLE_OBJECT = eINSTANCE.getDesignationRoleObject();

		/**
		 * The meta object literal for the '<em>Object Property Directionality Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getObjectPropertyDirectionalityObject()
		 * @generated
		 */
		EDataType OBJECT_PROPERTY_DIRECTIONALITY_OBJECT = eINSTANCE.getObjectPropertyDirectionalityObject();

		/**
		 * The meta object literal for the '<em>Transitivity Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.cts2.entity.Transitivity
		 * @see org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl#getTransitivityObject()
		 * @generated
		 */
		EDataType TRANSITIVITY_OBJECT = eINSTANCE.getTransitivityObject();

	}

} // EntityPackage
