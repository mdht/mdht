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
package org.openhealthtools.mdht.cts2.association.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.PredicateReference;
import org.openhealthtools.mdht.cts2.core.StatementTarget;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;
import org.openhealthtools.mdht.cts2.core.impl.DirectoryEntryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directory Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationDirectoryEntryImpl#getSubject <em>Subject</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationDirectoryEntryImpl#getPredicate <em>Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationDirectoryEntryImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationDirectoryEntryImpl#getAssertedBy <em>Asserted By</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AssociationDirectoryEntryImpl extends DirectoryEntryImpl implements AssociationDirectoryEntry {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected URIAndEntityName subject;

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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected StatementTarget target;

	/**
	 * The cached value of the '{@link #getAssertedBy() <em>Asserted By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssertedBy()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersionReference assertedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssociationDirectoryEntryImpl() {
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
		return AssociationPackage.Literals.ASSOCIATION_DIRECTORY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URIAndEntityName getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSubject(URIAndEntityName newSubject, NotificationChain msgs) {
		URIAndEntityName oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(URIAndEntityName newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null) {
				msgs = ((InternalEObject) subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT, null, msgs);
			}
			if (newSubject != null) {
				msgs = ((InternalEObject) newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT, null, msgs);
			}
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT, newSubject, newSubject));
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
				this, Notification.SET, AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__PREDICATE, oldPredicate,
				newPredicate);
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
						AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__PREDICATE, null, msgs);
			}
			if (newPredicate != null) {
				msgs = ((InternalEObject) newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__PREDICATE, null, msgs);
			}
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__PREDICATE, newPredicate,
				newPredicate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementTarget getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTarget(StatementTarget newTarget, NotificationChain msgs) {
		StatementTarget oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__TARGET, oldTarget, newTarget);
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
	public void setTarget(StatementTarget newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null) {
				msgs = ((InternalEObject) target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__TARGET, null, msgs);
			}
			if (newTarget != null) {
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__TARGET, null, msgs);
			}
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__TARGET, newTarget, newTarget));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionReference getAssertedBy() {
		return assertedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssertedBy(CodeSystemVersionReference newAssertedBy, NotificationChain msgs) {
		CodeSystemVersionReference oldAssertedBy = assertedBy;
		assertedBy = newAssertedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY, oldAssertedBy,
				newAssertedBy);
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
	public void setAssertedBy(CodeSystemVersionReference newAssertedBy) {
		if (newAssertedBy != assertedBy) {
			NotificationChain msgs = null;
			if (assertedBy != null) {
				msgs = ((InternalEObject) assertedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY, null, msgs);
			}
			if (newAssertedBy != null) {
				msgs = ((InternalEObject) newAssertedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY, null, msgs);
			}
			msgs = basicSetAssertedBy(newAssertedBy, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY, newAssertedBy,
				newAssertedBy));
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
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT:
				return basicSetSubject(null, msgs);
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__PREDICATE:
				return basicSetPredicate(null, msgs);
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__TARGET:
				return basicSetTarget(null, msgs);
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY:
				return basicSetAssertedBy(null, msgs);
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
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT:
				return getSubject();
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__PREDICATE:
				return getPredicate();
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__TARGET:
				return getTarget();
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY:
				return getAssertedBy();
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
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT:
				setSubject((URIAndEntityName) newValue);
				return;
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__PREDICATE:
				setPredicate((PredicateReference) newValue);
				return;
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__TARGET:
				setTarget((StatementTarget) newValue);
				return;
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY:
				setAssertedBy((CodeSystemVersionReference) newValue);
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
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT:
				setSubject((URIAndEntityName) null);
				return;
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__PREDICATE:
				setPredicate((PredicateReference) null);
				return;
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__TARGET:
				setTarget((StatementTarget) null);
				return;
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY:
				setAssertedBy((CodeSystemVersionReference) null);
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
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT:
				return subject != null;
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__PREDICATE:
				return predicate != null;
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__TARGET:
				return target != null;
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY:
				return assertedBy != null;
		}
		return super.eIsSet(featureID);
	}

} // AssociationDirectoryEntryImpl
