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
package org.openhealthtools.mdht.cts2.core.impl;

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
import org.openhealthtools.mdht.cts2.core.AnonymousStatement;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.PredicateReference;
import org.openhealthtools.mdht.cts2.core.Property;
import org.openhealthtools.mdht.cts2.core.StatementTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.AnonymousStatementImpl#getPredicate <em>Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.AnonymousStatementImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.AnonymousStatementImpl#getStatmentQualifier <em>Statment Qualifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AnonymousStatementImpl extends EObjectImpl implements AnonymousStatement {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<StatementTarget> target;

	/**
	 * The cached value of the '{@link #getStatmentQualifier() <em>Statment Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getStatmentQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> statmentQualifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AnonymousStatementImpl() {
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
		return CorePackage.Literals.ANONYMOUS_STATEMENT;
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
				this, Notification.SET, CorePackage.ANONYMOUS_STATEMENT__PREDICATE, oldPredicate, newPredicate);
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
						CorePackage.ANONYMOUS_STATEMENT__PREDICATE, null, msgs);
			}
			if (newPredicate != null) {
				msgs = ((InternalEObject) newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.ANONYMOUS_STATEMENT__PREDICATE, null, msgs);
			}
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.ANONYMOUS_STATEMENT__PREDICATE, newPredicate, newPredicate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<StatementTarget> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<StatementTarget>(
				StatementTarget.class, this, CorePackage.ANONYMOUS_STATEMENT__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Property> getStatmentQualifier() {
		if (statmentQualifier == null) {
			statmentQualifier = new EObjectContainmentEList<Property>(
				Property.class, this, CorePackage.ANONYMOUS_STATEMENT__STATMENT_QUALIFIER);
		}
		return statmentQualifier;
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
			case CorePackage.ANONYMOUS_STATEMENT__PREDICATE:
				return basicSetPredicate(null, msgs);
			case CorePackage.ANONYMOUS_STATEMENT__TARGET:
				return ((InternalEList<?>) getTarget()).basicRemove(otherEnd, msgs);
			case CorePackage.ANONYMOUS_STATEMENT__STATMENT_QUALIFIER:
				return ((InternalEList<?>) getStatmentQualifier()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ANONYMOUS_STATEMENT__PREDICATE:
				return getPredicate();
			case CorePackage.ANONYMOUS_STATEMENT__TARGET:
				return getTarget();
			case CorePackage.ANONYMOUS_STATEMENT__STATMENT_QUALIFIER:
				return getStatmentQualifier();
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
			case CorePackage.ANONYMOUS_STATEMENT__PREDICATE:
				setPredicate((PredicateReference) newValue);
				return;
			case CorePackage.ANONYMOUS_STATEMENT__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends StatementTarget>) newValue);
				return;
			case CorePackage.ANONYMOUS_STATEMENT__STATMENT_QUALIFIER:
				getStatmentQualifier().clear();
				getStatmentQualifier().addAll((Collection<? extends Property>) newValue);
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
			case CorePackage.ANONYMOUS_STATEMENT__PREDICATE:
				setPredicate((PredicateReference) null);
				return;
			case CorePackage.ANONYMOUS_STATEMENT__TARGET:
				getTarget().clear();
				return;
			case CorePackage.ANONYMOUS_STATEMENT__STATMENT_QUALIFIER:
				getStatmentQualifier().clear();
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
			case CorePackage.ANONYMOUS_STATEMENT__PREDICATE:
				return predicate != null;
			case CorePackage.ANONYMOUS_STATEMENT__TARGET:
				return target != null && !target.isEmpty();
			case CorePackage.ANONYMOUS_STATEMENT__STATMENT_QUALIFIER:
				return statmentQualifier != null && !statmentQualifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // AnonymousStatementImpl
