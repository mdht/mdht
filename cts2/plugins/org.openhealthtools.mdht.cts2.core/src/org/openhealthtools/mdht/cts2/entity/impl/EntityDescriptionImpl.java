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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.entity.AnnotationPropertyDescription;
import org.openhealthtools.mdht.cts2.entity.AnonymousEntityDescription;
import org.openhealthtools.mdht.cts2.entity.AnonymousIndividualDescription;
import org.openhealthtools.mdht.cts2.entity.ClassDescription;
import org.openhealthtools.mdht.cts2.entity.DataPropertyDescription;
import org.openhealthtools.mdht.cts2.entity.DataTypeDescription;
import org.openhealthtools.mdht.cts2.entity.EntityDescription;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;
import org.openhealthtools.mdht.cts2.entity.NamedEntityDescription;
import org.openhealthtools.mdht.cts2.entity.NamedIndividualDescription;
import org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription;
import org.openhealthtools.mdht.cts2.entity.PredicateDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl#getNamedEntity <em>Named Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl#getAnonymousEntity <em>Anonymous Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl#getClassDescription <em>Class Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl#getDataTypeDescription <em>Data Type Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl#getPredicateDescription <em>Predicate Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl#getObjectPropertyDescription <em>Object Property Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl#getDataPropertyDescription <em>Data Property Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl#getAnnotationPropertyDescription <em>Annotation Property Description
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl#getNamedIndividual <em>Named Individual</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionImpl#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EntityDescriptionImpl extends EObjectImpl implements EntityDescription {
	/**
	 * The cached value of the '{@link #getNamedEntity() <em>Named Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNamedEntity()
	 * @generated
	 * @ordered
	 */
	protected NamedEntityDescription namedEntity;

	/**
	 * The cached value of the '{@link #getAnonymousEntity() <em>Anonymous Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAnonymousEntity()
	 * @generated
	 * @ordered
	 */
	protected AnonymousEntityDescription anonymousEntity;

	/**
	 * The cached value of the '{@link #getClassDescription() <em>Class Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getClassDescription()
	 * @generated
	 * @ordered
	 */
	protected ClassDescription classDescription;

	/**
	 * The cached value of the '{@link #getDataTypeDescription() <em>Data Type Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDataTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected DataTypeDescription dataTypeDescription;

	/**
	 * The cached value of the '{@link #getPredicateDescription() <em>Predicate Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPredicateDescription()
	 * @generated
	 * @ordered
	 */
	protected PredicateDescription predicateDescription;

	/**
	 * The cached value of the '{@link #getObjectPropertyDescription() <em>Object Property Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getObjectPropertyDescription()
	 * @generated
	 * @ordered
	 */
	protected ObjectPropertyDescription objectPropertyDescription;

	/**
	 * The cached value of the '{@link #getDataPropertyDescription() <em>Data Property Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDataPropertyDescription()
	 * @generated
	 * @ordered
	 */
	protected DataPropertyDescription dataPropertyDescription;

	/**
	 * The cached value of the '{@link #getAnnotationPropertyDescription() <em>Annotation Property Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAnnotationPropertyDescription()
	 * @generated
	 * @ordered
	 */
	protected AnnotationPropertyDescription annotationPropertyDescription;

	/**
	 * The cached value of the '{@link #getNamedIndividual() <em>Named Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNamedIndividual()
	 * @generated
	 * @ordered
	 */
	protected NamedIndividualDescription namedIndividual;

	/**
	 * The cached value of the '{@link #getAnonymousIndividual() <em>Anonymous Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAnonymousIndividual()
	 * @generated
	 * @ordered
	 */
	protected AnonymousIndividualDescription anonymousIndividual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EntityDescriptionImpl() {
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
		return EntityPackage.Literals.ENTITY_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NamedEntityDescription getNamedEntity() {
		return namedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetNamedEntity(NamedEntityDescription newNamedEntity, NotificationChain msgs) {
		NamedEntityDescription oldNamedEntity = namedEntity;
		namedEntity = newNamedEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__NAMED_ENTITY, oldNamedEntity, newNamedEntity);
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
	public void setNamedEntity(NamedEntityDescription newNamedEntity) {
		if (newNamedEntity != namedEntity) {
			NotificationChain msgs = null;
			if (namedEntity != null) {
				msgs = ((InternalEObject) namedEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__NAMED_ENTITY, null, msgs);
			}
			if (newNamedEntity != null) {
				msgs = ((InternalEObject) newNamedEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__NAMED_ENTITY, null, msgs);
			}
			msgs = basicSetNamedEntity(newNamedEntity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__NAMED_ENTITY, newNamedEntity, newNamedEntity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnonymousEntityDescription getAnonymousEntity() {
		return anonymousEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAnonymousEntity(AnonymousEntityDescription newAnonymousEntity,
			NotificationChain msgs) {
		AnonymousEntityDescription oldAnonymousEntity = anonymousEntity;
		anonymousEntity = newAnonymousEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY, oldAnonymousEntity,
				newAnonymousEntity);
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
	public void setAnonymousEntity(AnonymousEntityDescription newAnonymousEntity) {
		if (newAnonymousEntity != anonymousEntity) {
			NotificationChain msgs = null;
			if (anonymousEntity != null) {
				msgs = ((InternalEObject) anonymousEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY, null, msgs);
			}
			if (newAnonymousEntity != null) {
				msgs = ((InternalEObject) newAnonymousEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY, null, msgs);
			}
			msgs = basicSetAnonymousEntity(newAnonymousEntity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY, newAnonymousEntity,
				newAnonymousEntity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassDescription getClassDescription() {
		return classDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetClassDescription(ClassDescription newClassDescription, NotificationChain msgs) {
		ClassDescription oldClassDescription = classDescription;
		classDescription = newClassDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__CLASS_DESCRIPTION, oldClassDescription,
				newClassDescription);
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
	public void setClassDescription(ClassDescription newClassDescription) {
		if (newClassDescription != classDescription) {
			NotificationChain msgs = null;
			if (classDescription != null) {
				msgs = ((InternalEObject) classDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__CLASS_DESCRIPTION, null, msgs);
			}
			if (newClassDescription != null) {
				msgs = ((InternalEObject) newClassDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__CLASS_DESCRIPTION, null, msgs);
			}
			msgs = basicSetClassDescription(newClassDescription, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__CLASS_DESCRIPTION, newClassDescription,
				newClassDescription));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataTypeDescription getDataTypeDescription() {
		return dataTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDataTypeDescription(DataTypeDescription newDataTypeDescription,
			NotificationChain msgs) {
		DataTypeDescription oldDataTypeDescription = dataTypeDescription;
		dataTypeDescription = newDataTypeDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION,
				oldDataTypeDescription, newDataTypeDescription);
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
	public void setDataTypeDescription(DataTypeDescription newDataTypeDescription) {
		if (newDataTypeDescription != dataTypeDescription) {
			NotificationChain msgs = null;
			if (dataTypeDescription != null) {
				msgs = ((InternalEObject) dataTypeDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION, null, msgs);
			}
			if (newDataTypeDescription != null) {
				msgs = ((InternalEObject) newDataTypeDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION, null, msgs);
			}
			msgs = basicSetDataTypeDescription(newDataTypeDescription, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION,
				newDataTypeDescription, newDataTypeDescription));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PredicateDescription getPredicateDescription() {
		return predicateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPredicateDescription(PredicateDescription newPredicateDescription,
			NotificationChain msgs) {
		PredicateDescription oldPredicateDescription = predicateDescription;
		predicateDescription = newPredicateDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION,
				oldPredicateDescription, newPredicateDescription);
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
	public void setPredicateDescription(PredicateDescription newPredicateDescription) {
		if (newPredicateDescription != predicateDescription) {
			NotificationChain msgs = null;
			if (predicateDescription != null) {
				msgs = ((InternalEObject) predicateDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION, null, msgs);
			}
			if (newPredicateDescription != null) {
				msgs = ((InternalEObject) newPredicateDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION, null, msgs);
			}
			msgs = basicSetPredicateDescription(newPredicateDescription, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION,
				newPredicateDescription, newPredicateDescription));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObjectPropertyDescription getObjectPropertyDescription() {
		return objectPropertyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetObjectPropertyDescription(ObjectPropertyDescription newObjectPropertyDescription,
			NotificationChain msgs) {
		ObjectPropertyDescription oldObjectPropertyDescription = objectPropertyDescription;
		objectPropertyDescription = newObjectPropertyDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION,
				oldObjectPropertyDescription, newObjectPropertyDescription);
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
	public void setObjectPropertyDescription(ObjectPropertyDescription newObjectPropertyDescription) {
		if (newObjectPropertyDescription != objectPropertyDescription) {
			NotificationChain msgs = null;
			if (objectPropertyDescription != null) {
				msgs = ((InternalEObject) objectPropertyDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION, null, msgs);
			}
			if (newObjectPropertyDescription != null) {
				msgs = ((InternalEObject) newObjectPropertyDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION, null, msgs);
			}
			msgs = basicSetObjectPropertyDescription(newObjectPropertyDescription, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION,
				newObjectPropertyDescription, newObjectPropertyDescription));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataPropertyDescription getDataPropertyDescription() {
		return dataPropertyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDataPropertyDescription(DataPropertyDescription newDataPropertyDescription,
			NotificationChain msgs) {
		DataPropertyDescription oldDataPropertyDescription = dataPropertyDescription;
		dataPropertyDescription = newDataPropertyDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION,
				oldDataPropertyDescription, newDataPropertyDescription);
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
	public void setDataPropertyDescription(DataPropertyDescription newDataPropertyDescription) {
		if (newDataPropertyDescription != dataPropertyDescription) {
			NotificationChain msgs = null;
			if (dataPropertyDescription != null) {
				msgs = ((InternalEObject) dataPropertyDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION, null, msgs);
			}
			if (newDataPropertyDescription != null) {
				msgs = ((InternalEObject) newDataPropertyDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION, null, msgs);
			}
			msgs = basicSetDataPropertyDescription(newDataPropertyDescription, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION,
				newDataPropertyDescription, newDataPropertyDescription));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnnotationPropertyDescription getAnnotationPropertyDescription() {
		return annotationPropertyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAnnotationPropertyDescription(
			AnnotationPropertyDescription newAnnotationPropertyDescription, NotificationChain msgs) {
		AnnotationPropertyDescription oldAnnotationPropertyDescription = annotationPropertyDescription;
		annotationPropertyDescription = newAnnotationPropertyDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION,
				oldAnnotationPropertyDescription, newAnnotationPropertyDescription);
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
	public void setAnnotationPropertyDescription(AnnotationPropertyDescription newAnnotationPropertyDescription) {
		if (newAnnotationPropertyDescription != annotationPropertyDescription) {
			NotificationChain msgs = null;
			if (annotationPropertyDescription != null) {
				msgs = ((InternalEObject) annotationPropertyDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION, null, msgs);
			}
			if (newAnnotationPropertyDescription != null) {
				msgs = ((InternalEObject) newAnnotationPropertyDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION, null, msgs);
			}
			msgs = basicSetAnnotationPropertyDescription(newAnnotationPropertyDescription, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION,
				newAnnotationPropertyDescription, newAnnotationPropertyDescription));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NamedIndividualDescription getNamedIndividual() {
		return namedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetNamedIndividual(NamedIndividualDescription newNamedIndividual,
			NotificationChain msgs) {
		NamedIndividualDescription oldNamedIndividual = namedIndividual;
		namedIndividual = newNamedIndividual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__NAMED_INDIVIDUAL, oldNamedIndividual,
				newNamedIndividual);
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
	public void setNamedIndividual(NamedIndividualDescription newNamedIndividual) {
		if (newNamedIndividual != namedIndividual) {
			NotificationChain msgs = null;
			if (namedIndividual != null) {
				msgs = ((InternalEObject) namedIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__NAMED_INDIVIDUAL, null, msgs);
			}
			if (newNamedIndividual != null) {
				msgs = ((InternalEObject) newNamedIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__NAMED_INDIVIDUAL, null, msgs);
			}
			msgs = basicSetNamedIndividual(newNamedIndividual, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__NAMED_INDIVIDUAL, newNamedIndividual,
				newNamedIndividual));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnonymousIndividualDescription getAnonymousIndividual() {
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAnonymousIndividual(AnonymousIndividualDescription newAnonymousIndividual,
			NotificationChain msgs) {
		AnonymousIndividualDescription oldAnonymousIndividual = anonymousIndividual;
		anonymousIndividual = newAnonymousIndividual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL, oldAnonymousIndividual,
				newAnonymousIndividual);
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
	public void setAnonymousIndividual(AnonymousIndividualDescription newAnonymousIndividual) {
		if (newAnonymousIndividual != anonymousIndividual) {
			NotificationChain msgs = null;
			if (anonymousIndividual != null) {
				msgs = ((InternalEObject) anonymousIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL, null, msgs);
			}
			if (newAnonymousIndividual != null) {
				msgs = ((InternalEObject) newAnonymousIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL, null, msgs);
			}
			msgs = basicSetAnonymousIndividual(newAnonymousIndividual, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL, newAnonymousIndividual,
				newAnonymousIndividual));
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
			case EntityPackage.ENTITY_DESCRIPTION__NAMED_ENTITY:
				return basicSetNamedEntity(null, msgs);
			case EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY:
				return basicSetAnonymousEntity(null, msgs);
			case EntityPackage.ENTITY_DESCRIPTION__CLASS_DESCRIPTION:
				return basicSetClassDescription(null, msgs);
			case EntityPackage.ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION:
				return basicSetDataTypeDescription(null, msgs);
			case EntityPackage.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION:
				return basicSetPredicateDescription(null, msgs);
			case EntityPackage.ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION:
				return basicSetObjectPropertyDescription(null, msgs);
			case EntityPackage.ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION:
				return basicSetDataPropertyDescription(null, msgs);
			case EntityPackage.ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION:
				return basicSetAnnotationPropertyDescription(null, msgs);
			case EntityPackage.ENTITY_DESCRIPTION__NAMED_INDIVIDUAL:
				return basicSetNamedIndividual(null, msgs);
			case EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL:
				return basicSetAnonymousIndividual(null, msgs);
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
			case EntityPackage.ENTITY_DESCRIPTION__NAMED_ENTITY:
				return getNamedEntity();
			case EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY:
				return getAnonymousEntity();
			case EntityPackage.ENTITY_DESCRIPTION__CLASS_DESCRIPTION:
				return getClassDescription();
			case EntityPackage.ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION:
				return getDataTypeDescription();
			case EntityPackage.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION:
				return getPredicateDescription();
			case EntityPackage.ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION:
				return getObjectPropertyDescription();
			case EntityPackage.ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION:
				return getDataPropertyDescription();
			case EntityPackage.ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION:
				return getAnnotationPropertyDescription();
			case EntityPackage.ENTITY_DESCRIPTION__NAMED_INDIVIDUAL:
				return getNamedIndividual();
			case EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL:
				return getAnonymousIndividual();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityPackage.ENTITY_DESCRIPTION__NAMED_ENTITY:
				setNamedEntity((NamedEntityDescription) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY:
				setAnonymousEntity((AnonymousEntityDescription) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__CLASS_DESCRIPTION:
				setClassDescription((ClassDescription) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION:
				setDataTypeDescription((DataTypeDescription) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION:
				setPredicateDescription((PredicateDescription) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION:
				setObjectPropertyDescription((ObjectPropertyDescription) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION:
				setDataPropertyDescription((DataPropertyDescription) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION:
				setAnnotationPropertyDescription((AnnotationPropertyDescription) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__NAMED_INDIVIDUAL:
				setNamedIndividual((NamedIndividualDescription) newValue);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL:
				setAnonymousIndividual((AnonymousIndividualDescription) newValue);
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
			case EntityPackage.ENTITY_DESCRIPTION__NAMED_ENTITY:
				setNamedEntity((NamedEntityDescription) null);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY:
				setAnonymousEntity((AnonymousEntityDescription) null);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__CLASS_DESCRIPTION:
				setClassDescription((ClassDescription) null);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION:
				setDataTypeDescription((DataTypeDescription) null);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION:
				setPredicateDescription((PredicateDescription) null);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION:
				setObjectPropertyDescription((ObjectPropertyDescription) null);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION:
				setDataPropertyDescription((DataPropertyDescription) null);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION:
				setAnnotationPropertyDescription((AnnotationPropertyDescription) null);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__NAMED_INDIVIDUAL:
				setNamedIndividual((NamedIndividualDescription) null);
				return;
			case EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL:
				setAnonymousIndividual((AnonymousIndividualDescription) null);
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
			case EntityPackage.ENTITY_DESCRIPTION__NAMED_ENTITY:
				return namedEntity != null;
			case EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY:
				return anonymousEntity != null;
			case EntityPackage.ENTITY_DESCRIPTION__CLASS_DESCRIPTION:
				return classDescription != null;
			case EntityPackage.ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION:
				return dataTypeDescription != null;
			case EntityPackage.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION:
				return predicateDescription != null;
			case EntityPackage.ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION:
				return objectPropertyDescription != null;
			case EntityPackage.ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION:
				return dataPropertyDescription != null;
			case EntityPackage.ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION:
				return annotationPropertyDescription != null;
			case EntityPackage.ENTITY_DESCRIPTION__NAMED_INDIVIDUAL:
				return namedIndividual != null;
			case EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL:
				return anonymousIndividual != null;
		}
		return super.eIsSet(featureID);
	}

} // EntityDescriptionImpl
