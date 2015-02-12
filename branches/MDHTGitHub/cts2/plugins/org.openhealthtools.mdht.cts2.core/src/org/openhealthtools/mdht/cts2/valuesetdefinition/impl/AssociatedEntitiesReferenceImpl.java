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
package org.openhealthtools.mdht.cts2.valuesetdefinition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.AssociationDirection;
import org.openhealthtools.mdht.cts2.core.CodeSystemReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.PredicateReference;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;
import org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll;
import org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Associated Entities Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.AssociatedEntitiesReferenceImpl#getReferencedEntity <em>Referenced Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.AssociatedEntitiesReferenceImpl#getCodeSystem <em>Code System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.AssociatedEntitiesReferenceImpl#getCodeSystemVersion <em>Code System Version</em>}
 * </li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.AssociatedEntitiesReferenceImpl#getPredicate <em>Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.AssociatedEntitiesReferenceImpl#getDirection <em>Direction</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.AssociatedEntitiesReferenceImpl#getLeafOnly <em>Leaf Only</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.AssociatedEntitiesReferenceImpl#getTransitivity <em>Transitivity</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AssociatedEntitiesReferenceImpl extends EObjectImpl implements AssociatedEntitiesReference {
	/**
	 * The cached value of the '{@link #getReferencedEntity() <em>Referenced Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReferencedEntity()
	 * @generated
	 * @ordered
	 */
	protected URIAndEntityName referencedEntity;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemReference codeSystem;

	/**
	 * The cached value of the '{@link #getCodeSystemVersion() <em>Code System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersionReference codeSystemVersion;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected PredicateReference predicate;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final AssociationDirection DIRECTION_EDEFAULT = AssociationDirection.SOURCETOTARGET;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected AssociationDirection direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The default value of the '{@link #getLeafOnly() <em>Leaf Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLeafOnly()
	 * @generated
	 * @ordered
	 */
	protected static final LeafOrAll LEAF_ONLY_EDEFAULT = LeafOrAll.ALLINTERMEDIATENODES;

	/**
	 * The cached value of the '{@link #getLeafOnly() <em>Leaf Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLeafOnly()
	 * @generated
	 * @ordered
	 */
	protected LeafOrAll leafOnly = LEAF_ONLY_EDEFAULT;

	/**
	 * This is true if the Leaf Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean leafOnlyESet;

	/**
	 * The default value of the '{@link #getTransitivity() <em>Transitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTransitivity()
	 * @generated
	 * @ordered
	 */
	protected static final TransitiveClosure TRANSITIVITY_EDEFAULT = TransitiveClosure.DIRECTLYASSOCIATED;

	/**
	 * The cached value of the '{@link #getTransitivity() <em>Transitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTransitivity()
	 * @generated
	 * @ordered
	 */
	protected TransitiveClosure transitivity = TRANSITIVITY_EDEFAULT;

	/**
	 * This is true if the Transitivity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean transitivityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssociatedEntitiesReferenceImpl() {
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
		return ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URIAndEntityName getReferencedEntity() {
		return referencedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetReferencedEntity(URIAndEntityName newReferencedEntity, NotificationChain msgs) {
		URIAndEntityName oldReferencedEntity = referencedEntity;
		referencedEntity = newReferencedEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY,
				oldReferencedEntity, newReferencedEntity);
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
	public void setReferencedEntity(URIAndEntityName newReferencedEntity) {
		if (newReferencedEntity != referencedEntity) {
			NotificationChain msgs = null;
			if (referencedEntity != null) {
				msgs = ((InternalEObject) referencedEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY, null, msgs);
			}
			if (newReferencedEntity != null) {
				msgs = ((InternalEObject) newReferencedEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY, null, msgs);
			}
			msgs = basicSetReferencedEntity(newReferencedEntity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY,
				newReferencedEntity, newReferencedEntity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemReference getCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystem(CodeSystemReference newCodeSystem, NotificationChain msgs) {
		CodeSystemReference oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM,
				oldCodeSystem, newCodeSystem);
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
	public void setCodeSystem(CodeSystemReference newCodeSystem) {
		if (newCodeSystem != codeSystem) {
			NotificationChain msgs = null;
			if (codeSystem != null) {
				msgs = ((InternalEObject) codeSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM, null, msgs);
			}
			if (newCodeSystem != null) {
				msgs = ((InternalEObject) newCodeSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM, null, msgs);
			}
			msgs = basicSetCodeSystem(newCodeSystem, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM,
				newCodeSystem, newCodeSystem));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionReference getCodeSystemVersion() {
		return codeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemVersion(CodeSystemVersionReference newCodeSystemVersion,
			NotificationChain msgs) {
		CodeSystemVersionReference oldCodeSystemVersion = codeSystemVersion;
		codeSystemVersion = newCodeSystemVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION,
				oldCodeSystemVersion, newCodeSystemVersion);
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
	public void setCodeSystemVersion(CodeSystemVersionReference newCodeSystemVersion) {
		if (newCodeSystemVersion != codeSystemVersion) {
			NotificationChain msgs = null;
			if (codeSystemVersion != null) {
				msgs = ((InternalEObject) codeSystemVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION, null, msgs);
			}
			if (newCodeSystemVersion != null) {
				msgs = ((InternalEObject) newCodeSystemVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION, null, msgs);
			}
			msgs = basicSetCodeSystemVersion(newCodeSystemVersion, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION,
				newCodeSystemVersion, newCodeSystemVersion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PredicateReference getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPredicate(PredicateReference newPredicate, NotificationChain msgs) {
		PredicateReference oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__PREDICATE,
				oldPredicate, newPredicate);
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
	public void setPredicate(PredicateReference newPredicate) {
		if (newPredicate != predicate) {
			NotificationChain msgs = null;
			if (predicate != null) {
				msgs = ((InternalEObject) predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__PREDICATE, null, msgs);
			}
			if (newPredicate != null) {
				msgs = ((InternalEObject) newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__PREDICATE, null, msgs);
			}
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__PREDICATE,
				newPredicate, newPredicate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDirection(AssociationDirection newDirection) {
		AssociationDirection oldDirection = direction;
		direction = newDirection == null
				? DIRECTION_EDEFAULT
				: newDirection;
		boolean oldDirectionESet = directionESet;
		directionESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__DIRECTION,
				oldDirection, direction, !oldDirectionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetDirection() {
		AssociationDirection oldDirection = direction;
		boolean oldDirectionESet = directionESet;
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__DIRECTION,
				oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetDirection() {
		return directionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LeafOrAll getLeafOnly() {
		return leafOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLeafOnly(LeafOrAll newLeafOnly) {
		LeafOrAll oldLeafOnly = leafOnly;
		leafOnly = newLeafOnly == null
				? LEAF_ONLY_EDEFAULT
				: newLeafOnly;
		boolean oldLeafOnlyESet = leafOnlyESet;
		leafOnlyESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__LEAF_ONLY,
				oldLeafOnly, leafOnly, !oldLeafOnlyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetLeafOnly() {
		LeafOrAll oldLeafOnly = leafOnly;
		boolean oldLeafOnlyESet = leafOnlyESet;
		leafOnly = LEAF_ONLY_EDEFAULT;
		leafOnlyESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__LEAF_ONLY,
				oldLeafOnly, LEAF_ONLY_EDEFAULT, oldLeafOnlyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetLeafOnly() {
		return leafOnlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransitiveClosure getTransitivity() {
		return transitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTransitivity(TransitiveClosure newTransitivity) {
		TransitiveClosure oldTransitivity = transitivity;
		transitivity = newTransitivity == null
				? TRANSITIVITY_EDEFAULT
				: newTransitivity;
		boolean oldTransitivityESet = transitivityESet;
		transitivityESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__TRANSITIVITY,
				oldTransitivity, transitivity, !oldTransitivityESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetTransitivity() {
		TransitiveClosure oldTransitivity = transitivity;
		boolean oldTransitivityESet = transitivityESet;
		transitivity = TRANSITIVITY_EDEFAULT;
		transitivityESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__TRANSITIVITY,
				oldTransitivity, TRANSITIVITY_EDEFAULT, oldTransitivityESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetTransitivity() {
		return transitivityESet;
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
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY:
				return basicSetReferencedEntity(null, msgs);
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM:
				return basicSetCodeSystem(null, msgs);
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION:
				return basicSetCodeSystemVersion(null, msgs);
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__PREDICATE:
				return basicSetPredicate(null, msgs);
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
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY:
				return getReferencedEntity();
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM:
				return getCodeSystem();
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION:
				return getCodeSystemVersion();
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__PREDICATE:
				return getPredicate();
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__DIRECTION:
				return getDirection();
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__LEAF_ONLY:
				return getLeafOnly();
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__TRANSITIVITY:
				return getTransitivity();
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
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY:
				setReferencedEntity((URIAndEntityName) newValue);
				return;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM:
				setCodeSystem((CodeSystemReference) newValue);
				return;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION:
				setCodeSystemVersion((CodeSystemVersionReference) newValue);
				return;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__PREDICATE:
				setPredicate((PredicateReference) newValue);
				return;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__DIRECTION:
				setDirection((AssociationDirection) newValue);
				return;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__LEAF_ONLY:
				setLeafOnly((LeafOrAll) newValue);
				return;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__TRANSITIVITY:
				setTransitivity((TransitiveClosure) newValue);
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
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY:
				setReferencedEntity((URIAndEntityName) null);
				return;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM:
				setCodeSystem((CodeSystemReference) null);
				return;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION:
				setCodeSystemVersion((CodeSystemVersionReference) null);
				return;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__PREDICATE:
				setPredicate((PredicateReference) null);
				return;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__DIRECTION:
				unsetDirection();
				return;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__LEAF_ONLY:
				unsetLeafOnly();
				return;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__TRANSITIVITY:
				unsetTransitivity();
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
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY:
				return referencedEntity != null;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM:
				return codeSystem != null;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION:
				return codeSystemVersion != null;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__PREDICATE:
				return predicate != null;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__DIRECTION:
				return isSetDirection();
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__LEAF_ONLY:
				return isSetLeafOnly();
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__TRANSITIVITY:
				return isSetTransitivity();
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
		result.append(" (direction: ");
		if (directionESet) {
			result.append(direction);
		} else {
			result.append("<unset>");
		}
		result.append(", leafOnly: ");
		if (leafOnlyESet) {
			result.append(leafOnly);
		} else {
			result.append("<unset>");
		}
		result.append(", transitivity: ");
		if (transitivityESet) {
			result.append(transitivity);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // AssociatedEntitiesReferenceImpl
