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
package org.openhealthtools.mdht.cts2.entity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.Comment;
import org.openhealthtools.mdht.cts2.core.Definition;
import org.openhealthtools.mdht.cts2.core.Example;
import org.openhealthtools.mdht.cts2.core.Property;
import org.openhealthtools.mdht.cts2.core.ScopedEntityName;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;
import org.openhealthtools.mdht.cts2.entity.Designation;
import org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getEntityID <em>Entity ID</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getAlternateEntityID <em>Alternate Entity ID</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getDescribingCodeSystemVersion <em>Describing Code System Version
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getDesignation <em>Designation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getDefinition <em>Definition</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getExample <em>Example</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getNote <em>Note</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getProperty <em>Property</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getSourceStatements <em>Source Statements</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getSubjectOf <em>Subject Of</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getPredicateOf <em>Predicate Of</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getTargetOf <em>Target Of</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getParent <em>Parent</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getAncestors <em>Ancestors</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getChildren <em>Children</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getDescendants <em>Descendants</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getEntityType <em>Entity Type</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getInstances <em>Instances</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getEquivalentEntity <em>Equivalent Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionBaseImpl#getAbout <em>About</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class EntityDescriptionBaseImpl extends EObjectImpl implements EntityDescriptionBase {
	/**
	 * The cached value of the '{@link #getEntityID() <em>Entity ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntityID()
	 * @generated
	 * @ordered
	 */
	protected ScopedEntityName entityID;

	/**
	 * The cached value of the '{@link #getAlternateEntityID() <em>Alternate Entity ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAlternateEntityID()
	 * @generated
	 * @ordered
	 */
	protected EList<ScopedEntityName> alternateEntityID;

	/**
	 * The cached value of the '{@link #getDescribingCodeSystemVersion() <em>Describing Code System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDescribingCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersionReference describingCodeSystemVersion;

	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected EList<Designation> designation;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Definition> definition;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected EList<Example> example;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> note;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The default value of the '{@link #getSourceStatements() <em>Source Statements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceStatements()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_STATEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceStatements() <em>Source Statements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceStatements()
	 * @generated
	 * @ordered
	 */
	protected String sourceStatements = SOURCE_STATEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubjectOf() <em>Subject Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSubjectOf()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubjectOf() <em>Subject Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSubjectOf()
	 * @generated
	 * @ordered
	 */
	protected String subjectOf = SUBJECT_OF_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredicateOf() <em>Predicate Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPredicateOf()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDICATE_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPredicateOf() <em>Predicate Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPredicateOf()
	 * @generated
	 * @ordered
	 */
	protected String predicateOf = PREDICATE_OF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetOf() <em>Target Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTargetOf()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetOf() <em>Target Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTargetOf()
	 * @generated
	 * @ordered
	 */
	protected String targetOf = TARGET_OF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<URIAndEntityName> parent;

	/**
	 * The default value of the '{@link #getAncestors() <em>Ancestors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAncestors()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCESTORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAncestors() <em>Ancestors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAncestors()
	 * @generated
	 * @ordered
	 */
	protected String ancestors = ANCESTORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getChildren() <em>Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected static final String CHILDREN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected String children = CHILDREN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescendants() <em>Descendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDescendants()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCENDANTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescendants() <em>Descendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDescendants()
	 * @generated
	 * @ordered
	 */
	protected String descendants = DESCENDANTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected EList<URIAndEntityName> entityType;

	/**
	 * The default value of the '{@link #getInstances() <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected String instances = INSTANCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEquivalentEntity() <em>Equivalent Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEquivalentEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<URIAndEntityName> equivalentEntity;

	/**
	 * The default value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected static final String ABOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected String about = ABOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EntityDescriptionBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ENTITY_DESCRIPTION_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ScopedEntityName getEntityID() {
		return entityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEntityID(ScopedEntityName newEntityID, NotificationChain msgs) {
		ScopedEntityName oldEntityID = entityID;
		entityID = newEntityID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_ID, oldEntityID, newEntityID);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntityID(ScopedEntityName newEntityID) {
		if (newEntityID != entityID) {
			NotificationChain msgs = null;
			if (entityID != null) {
				msgs = ((InternalEObject) entityID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_ID, null, msgs);
			}
			if (newEntityID != null) {
				msgs = ((InternalEObject) newEntityID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_ID, null, msgs);
			}
			msgs = basicSetEntityID(newEntityID, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_ID, newEntityID, newEntityID));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ScopedEntityName> getAlternateEntityID() {
		if (alternateEntityID == null) {
			alternateEntityID = new EObjectContainmentEList<ScopedEntityName>(
				ScopedEntityName.class, this, EntityPackage.ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID);
		}
		return alternateEntityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionReference getDescribingCodeSystemVersion() {
		return describingCodeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDescribingCodeSystemVersion(
			CodeSystemVersionReference newDescribingCodeSystemVersion, NotificationChain msgs) {
		CodeSystemVersionReference oldDescribingCodeSystemVersion = describingCodeSystemVersion;
		describingCodeSystemVersion = newDescribingCodeSystemVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION,
				oldDescribingCodeSystemVersion, newDescribingCodeSystemVersion);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescribingCodeSystemVersion(CodeSystemVersionReference newDescribingCodeSystemVersion) {
		if (newDescribingCodeSystemVersion != describingCodeSystemVersion) {
			NotificationChain msgs = null;
			if (describingCodeSystemVersion != null) {
				msgs = ((InternalEObject) describingCodeSystemVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION, null, msgs);
			}
			if (newDescribingCodeSystemVersion != null) {
				msgs = ((InternalEObject) newDescribingCodeSystemVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION, null, msgs);
			}
			msgs = basicSetDescribingCodeSystemVersion(newDescribingCodeSystemVersion, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION,
				newDescribingCodeSystemVersion, newDescribingCodeSystemVersion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Designation> getDesignation() {
		if (designation == null) {
			designation = new EObjectContainmentEList<Designation>(
				Designation.class, this, EntityPackage.ENTITY_DESCRIPTION_BASE__DESIGNATION);
		}
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Definition> getDefinition() {
		if (definition == null) {
			definition = new EObjectContainmentEList<Definition>(
				Definition.class, this, EntityPackage.ENTITY_DESCRIPTION_BASE__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Example> getExample() {
		if (example == null) {
			example = new EObjectContainmentEList<Example>(
				Example.class, this, EntityPackage.ENTITY_DESCRIPTION_BASE__EXAMPLE);
		}
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Comment> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Comment>(
				Comment.class, this, EntityPackage.ENTITY_DESCRIPTION_BASE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(
				Property.class, this, EntityPackage.ENTITY_DESCRIPTION_BASE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSourceStatements() {
		return sourceStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceStatements(String newSourceStatements) {
		String oldSourceStatements = sourceStatements;
		sourceStatements = newSourceStatements;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_BASE__SOURCE_STATEMENTS, oldSourceStatements,
				sourceStatements));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSubjectOf() {
		return subjectOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSubjectOf(String newSubjectOf) {
		String oldSubjectOf = subjectOf;
		subjectOf = newSubjectOf;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_BASE__SUBJECT_OF, oldSubjectOf, subjectOf));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPredicateOf() {
		return predicateOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPredicateOf(String newPredicateOf) {
		String oldPredicateOf = predicateOf;
		predicateOf = newPredicateOf;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_BASE__PREDICATE_OF, oldPredicateOf,
				predicateOf));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTargetOf() {
		return targetOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTargetOf(String newTargetOf) {
		String oldTargetOf = targetOf;
		targetOf = newTargetOf;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_BASE__TARGET_OF, oldTargetOf, targetOf));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<URIAndEntityName> getParent() {
		if (parent == null) {
			parent = new EObjectContainmentEList<URIAndEntityName>(
				URIAndEntityName.class, this, EntityPackage.ENTITY_DESCRIPTION_BASE__PARENT);
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAncestors() {
		return ancestors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAncestors(String newAncestors) {
		String oldAncestors = ancestors;
		ancestors = newAncestors;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_BASE__ANCESTORS, oldAncestors, ancestors));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getChildren() {
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setChildren(String newChildren) {
		String oldChildren = children;
		children = newChildren;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_BASE__CHILDREN, oldChildren, children));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDescendants() {
		return descendants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescendants(String newDescendants) {
		String oldDescendants = descendants;
		descendants = newDescendants;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_BASE__DESCENDANTS, oldDescendants, descendants));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<URIAndEntityName> getEntityType() {
		if (entityType == null) {
			entityType = new EObjectContainmentEList<URIAndEntityName>(
				URIAndEntityName.class, this, EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_TYPE);
		}
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getInstances() {
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInstances(String newInstances) {
		String oldInstances = instances;
		instances = newInstances;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_BASE__INSTANCES, oldInstances, instances));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<URIAndEntityName> getEquivalentEntity() {
		if (equivalentEntity == null) {
			equivalentEntity = new EObjectContainmentEList<URIAndEntityName>(
				URIAndEntityName.class, this, EntityPackage.ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY);
		}
		return equivalentEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAbout() {
		return about;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAbout(String newAbout) {
		String oldAbout = about;
		about = newAbout;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_BASE__ABOUT, oldAbout, about));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_ID:
				return basicSetEntityID(null, msgs);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID:
				return ((InternalEList<?>) getAlternateEntityID()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION:
				return basicSetDescribingCodeSystemVersion(null, msgs);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESIGNATION:
				return ((InternalEList<?>) getDesignation()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DEFINITION:
				return ((InternalEList<?>) getDefinition()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__EXAMPLE:
				return ((InternalEList<?>) getExample()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__NOTE:
				return ((InternalEList<?>) getNote()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PROPERTY:
				return ((InternalEList<?>) getProperty()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PARENT:
				return ((InternalEList<?>) getParent()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_TYPE:
				return ((InternalEList<?>) getEntityType()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY:
				return ((InternalEList<?>) getEquivalentEntity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_ID:
				return getEntityID();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID:
				return getAlternateEntityID();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION:
				return getDescribingCodeSystemVersion();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESIGNATION:
				return getDesignation();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DEFINITION:
				return getDefinition();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__EXAMPLE:
				return getExample();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__NOTE:
				return getNote();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PROPERTY:
				return getProperty();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__SOURCE_STATEMENTS:
				return getSourceStatements();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__SUBJECT_OF:
				return getSubjectOf();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PREDICATE_OF:
				return getPredicateOf();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__TARGET_OF:
				return getTargetOf();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PARENT:
				return getParent();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ANCESTORS:
				return getAncestors();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__CHILDREN:
				return getChildren();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESCENDANTS:
				return getDescendants();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_TYPE:
				return getEntityType();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__INSTANCES:
				return getInstances();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY:
				return getEquivalentEntity();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ABOUT:
				return getAbout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_ID:
				setEntityID((ScopedEntityName) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID:
				getAlternateEntityID().clear();
				getAlternateEntityID().addAll((Collection<? extends ScopedEntityName>) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION:
				setDescribingCodeSystemVersion((CodeSystemVersionReference) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESIGNATION:
				getDesignation().clear();
				getDesignation().addAll((Collection<? extends Designation>) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends Definition>) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__EXAMPLE:
				getExample().clear();
				getExample().addAll((Collection<? extends Example>) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Comment>) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__SOURCE_STATEMENTS:
				setSourceStatements((String) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__SUBJECT_OF:
				setSubjectOf((String) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PREDICATE_OF:
				setPredicateOf((String) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__TARGET_OF:
				setTargetOf((String) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PARENT:
				getParent().clear();
				getParent().addAll((Collection<? extends URIAndEntityName>) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ANCESTORS:
				setAncestors((String) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__CHILDREN:
				setChildren((String) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESCENDANTS:
				setDescendants((String) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_TYPE:
				getEntityType().clear();
				getEntityType().addAll((Collection<? extends URIAndEntityName>) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__INSTANCES:
				setInstances((String) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY:
				getEquivalentEntity().clear();
				getEquivalentEntity().addAll((Collection<? extends URIAndEntityName>) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ABOUT:
				setAbout((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_ID:
				setEntityID((ScopedEntityName) null);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID:
				getAlternateEntityID().clear();
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION:
				setDescribingCodeSystemVersion((CodeSystemVersionReference) null);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESIGNATION:
				getDesignation().clear();
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DEFINITION:
				getDefinition().clear();
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__EXAMPLE:
				getExample().clear();
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__NOTE:
				getNote().clear();
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PROPERTY:
				getProperty().clear();
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__SOURCE_STATEMENTS:
				setSourceStatements(SOURCE_STATEMENTS_EDEFAULT);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__SUBJECT_OF:
				setSubjectOf(SUBJECT_OF_EDEFAULT);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PREDICATE_OF:
				setPredicateOf(PREDICATE_OF_EDEFAULT);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__TARGET_OF:
				setTargetOf(TARGET_OF_EDEFAULT);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PARENT:
				getParent().clear();
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ANCESTORS:
				setAncestors(ANCESTORS_EDEFAULT);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__CHILDREN:
				setChildren(CHILDREN_EDEFAULT);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESCENDANTS:
				setDescendants(DESCENDANTS_EDEFAULT);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_TYPE:
				getEntityType().clear();
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__INSTANCES:
				setInstances(INSTANCES_EDEFAULT);
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY:
				getEquivalentEntity().clear();
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ABOUT:
				setAbout(ABOUT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_ID:
				return entityID != null;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID:
				return alternateEntityID != null && !alternateEntityID.isEmpty();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION:
				return describingCodeSystemVersion != null;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESIGNATION:
				return designation != null && !designation.isEmpty();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DEFINITION:
				return definition != null && !definition.isEmpty();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__EXAMPLE:
				return example != null && !example.isEmpty();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__NOTE:
				return note != null && !note.isEmpty();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PROPERTY:
				return property != null && !property.isEmpty();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__SOURCE_STATEMENTS:
				return SOURCE_STATEMENTS_EDEFAULT == null
						? sourceStatements != null
						: !SOURCE_STATEMENTS_EDEFAULT.equals(sourceStatements);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__SUBJECT_OF:
				return SUBJECT_OF_EDEFAULT == null
						? subjectOf != null
						: !SUBJECT_OF_EDEFAULT.equals(subjectOf);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PREDICATE_OF:
				return PREDICATE_OF_EDEFAULT == null
						? predicateOf != null
						: !PREDICATE_OF_EDEFAULT.equals(predicateOf);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__TARGET_OF:
				return TARGET_OF_EDEFAULT == null
						? targetOf != null
						: !TARGET_OF_EDEFAULT.equals(targetOf);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PARENT:
				return parent != null && !parent.isEmpty();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ANCESTORS:
				return ANCESTORS_EDEFAULT == null
						? ancestors != null
						: !ANCESTORS_EDEFAULT.equals(ancestors);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__CHILDREN:
				return CHILDREN_EDEFAULT == null
						? children != null
						: !CHILDREN_EDEFAULT.equals(children);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESCENDANTS:
				return DESCENDANTS_EDEFAULT == null
						? descendants != null
						: !DESCENDANTS_EDEFAULT.equals(descendants);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_TYPE:
				return entityType != null && !entityType.isEmpty();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__INSTANCES:
				return INSTANCES_EDEFAULT == null
						? instances != null
						: !INSTANCES_EDEFAULT.equals(instances);
			case EntityPackage.ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY:
				return equivalentEntity != null && !equivalentEntity.isEmpty();
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ABOUT:
				return ABOUT_EDEFAULT == null
						? about != null
						: !ABOUT_EDEFAULT.equals(about);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sourceStatements: ");
		result.append(sourceStatements);
		result.append(", subjectOf: ");
		result.append(subjectOf);
		result.append(", predicateOf: ");
		result.append(predicateOf);
		result.append(", targetOf: ");
		result.append(targetOf);
		result.append(", ancestors: ");
		result.append(ancestors);
		result.append(", children: ");
		result.append(children);
		result.append(", descendants: ");
		result.append(descendants);
		result.append(", instances: ");
		result.append(instances);
		result.append(", about: ");
		result.append(about);
		result.append(')');
		return result.toString();
	}

} // EntityDescriptionBaseImpl
