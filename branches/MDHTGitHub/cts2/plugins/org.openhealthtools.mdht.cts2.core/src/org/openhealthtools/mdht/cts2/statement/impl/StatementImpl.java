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
package org.openhealthtools.mdht.cts2.statement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.ModelAttributeReference;
import org.openhealthtools.mdht.cts2.core.SourceAndRoleReference;
import org.openhealthtools.mdht.cts2.core.StatementTarget;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;
import org.openhealthtools.mdht.cts2.core.impl.ChangeableImpl;
import org.openhealthtools.mdht.cts2.statement.Statement;
import org.openhealthtools.mdht.cts2.statement.StatementPackage;
import org.openhealthtools.mdht.cts2.statement.StatementQualifier;
import org.openhealthtools.mdht.cts2.statement.StatementSubject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.StatementImpl#getStatementURI <em>Statement URI</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.StatementImpl#getSubject <em>Subject</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.StatementImpl#getPredicate <em>Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.StatementImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.StatementImpl#getAssociatedAttribute <em>Associated Attribute</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.StatementImpl#getSource <em>Source</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.StatementImpl#getAssertedBy <em>Asserted By</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.StatementImpl#getAssertedIn <em>Asserted In</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.StatementImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class StatementImpl extends ChangeableImpl implements Statement {
	/**
	 * The default value of the '{@link #getStatementURI() <em>Statement URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getStatementURI()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatementURI() <em>Statement URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getStatementURI()
	 * @generated
	 * @ordered
	 */
	protected String statementURI = STATEMENT_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected StatementSubject subject;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected URIAndEntityName predicate;

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
	 * The cached value of the '{@link #getAssociatedAttribute() <em>Associated Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssociatedAttribute()
	 * @generated
	 * @ordered
	 */
	protected ModelAttributeReference associatedAttribute;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceAndRoleReference> source;

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
	 * The cached value of the '{@link #getAssertedIn() <em>Asserted In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssertedIn()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersionReference assertedIn;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<StatementQualifier> qualifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StatementImpl() {
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
		return StatementPackage.Literals.STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getStatementURI() {
		return statementURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStatementURI(String newStatementURI) {
		String oldStatementURI = statementURI;
		statementURI = newStatementURI;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT__STATEMENT_URI, oldStatementURI, statementURI));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementSubject getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSubject(StatementSubject newSubject, NotificationChain msgs) {
		StatementSubject oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(StatementSubject newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null) {
				msgs = ((InternalEObject) subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						StatementPackage.STATEMENT__SUBJECT, null, msgs);
			}
			if (newSubject != null) {
				msgs = ((InternalEObject) newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						StatementPackage.STATEMENT__SUBJECT, null, msgs);
			}
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT__SUBJECT, newSubject, newSubject));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URIAndEntityName getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPredicate(URIAndEntityName newPredicate, NotificationChain msgs) {
		URIAndEntityName oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT__PREDICATE, oldPredicate, newPredicate);
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
	public void setPredicate(URIAndEntityName newPredicate) {
		if (newPredicate != predicate) {
			NotificationChain msgs = null;
			if (predicate != null) {
				msgs = ((InternalEObject) predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						StatementPackage.STATEMENT__PREDICATE, null, msgs);
			}
			if (newPredicate != null) {
				msgs = ((InternalEObject) newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						StatementPackage.STATEMENT__PREDICATE, null, msgs);
			}
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT__PREDICATE, newPredicate, newPredicate));
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
				StatementTarget.class, this, StatementPackage.STATEMENT__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModelAttributeReference getAssociatedAttribute() {
		return associatedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssociatedAttribute(ModelAttributeReference newAssociatedAttribute,
			NotificationChain msgs) {
		ModelAttributeReference oldAssociatedAttribute = associatedAttribute;
		associatedAttribute = newAssociatedAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT__ASSOCIATED_ATTRIBUTE, oldAssociatedAttribute,
				newAssociatedAttribute);
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
	public void setAssociatedAttribute(ModelAttributeReference newAssociatedAttribute) {
		if (newAssociatedAttribute != associatedAttribute) {
			NotificationChain msgs = null;
			if (associatedAttribute != null) {
				msgs = ((InternalEObject) associatedAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						StatementPackage.STATEMENT__ASSOCIATED_ATTRIBUTE, null, msgs);
			}
			if (newAssociatedAttribute != null) {
				msgs = ((InternalEObject) newAssociatedAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						StatementPackage.STATEMENT__ASSOCIATED_ATTRIBUTE, null, msgs);
			}
			msgs = basicSetAssociatedAttribute(newAssociatedAttribute, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT__ASSOCIATED_ATTRIBUTE, newAssociatedAttribute,
				newAssociatedAttribute));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<SourceAndRoleReference> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceAndRoleReference>(
				SourceAndRoleReference.class, this, StatementPackage.STATEMENT__SOURCE);
		}
		return source;
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
				this, Notification.SET, StatementPackage.STATEMENT__ASSERTED_BY, oldAssertedBy, newAssertedBy);
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
						StatementPackage.STATEMENT__ASSERTED_BY, null, msgs);
			}
			if (newAssertedBy != null) {
				msgs = ((InternalEObject) newAssertedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						StatementPackage.STATEMENT__ASSERTED_BY, null, msgs);
			}
			msgs = basicSetAssertedBy(newAssertedBy, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT__ASSERTED_BY, newAssertedBy, newAssertedBy));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionReference getAssertedIn() {
		return assertedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssertedIn(CodeSystemVersionReference newAssertedIn, NotificationChain msgs) {
		CodeSystemVersionReference oldAssertedIn = assertedIn;
		assertedIn = newAssertedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT__ASSERTED_IN, oldAssertedIn, newAssertedIn);
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
	public void setAssertedIn(CodeSystemVersionReference newAssertedIn) {
		if (newAssertedIn != assertedIn) {
			NotificationChain msgs = null;
			if (assertedIn != null) {
				msgs = ((InternalEObject) assertedIn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						StatementPackage.STATEMENT__ASSERTED_IN, null, msgs);
			}
			if (newAssertedIn != null) {
				msgs = ((InternalEObject) newAssertedIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						StatementPackage.STATEMENT__ASSERTED_IN, null, msgs);
			}
			msgs = basicSetAssertedIn(newAssertedIn, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT__ASSERTED_IN, newAssertedIn, newAssertedIn));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<StatementQualifier> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectContainmentEList<StatementQualifier>(
				StatementQualifier.class, this, StatementPackage.STATEMENT__QUALIFIER);
		}
		return qualifier;
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
			case StatementPackage.STATEMENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case StatementPackage.STATEMENT__PREDICATE:
				return basicSetPredicate(null, msgs);
			case StatementPackage.STATEMENT__TARGET:
				return ((InternalEList<?>) getTarget()).basicRemove(otherEnd, msgs);
			case StatementPackage.STATEMENT__ASSOCIATED_ATTRIBUTE:
				return basicSetAssociatedAttribute(null, msgs);
			case StatementPackage.STATEMENT__SOURCE:
				return ((InternalEList<?>) getSource()).basicRemove(otherEnd, msgs);
			case StatementPackage.STATEMENT__ASSERTED_BY:
				return basicSetAssertedBy(null, msgs);
			case StatementPackage.STATEMENT__ASSERTED_IN:
				return basicSetAssertedIn(null, msgs);
			case StatementPackage.STATEMENT__QUALIFIER:
				return ((InternalEList<?>) getQualifier()).basicRemove(otherEnd, msgs);
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
			case StatementPackage.STATEMENT__STATEMENT_URI:
				return getStatementURI();
			case StatementPackage.STATEMENT__SUBJECT:
				return getSubject();
			case StatementPackage.STATEMENT__PREDICATE:
				return getPredicate();
			case StatementPackage.STATEMENT__TARGET:
				return getTarget();
			case StatementPackage.STATEMENT__ASSOCIATED_ATTRIBUTE:
				return getAssociatedAttribute();
			case StatementPackage.STATEMENT__SOURCE:
				return getSource();
			case StatementPackage.STATEMENT__ASSERTED_BY:
				return getAssertedBy();
			case StatementPackage.STATEMENT__ASSERTED_IN:
				return getAssertedIn();
			case StatementPackage.STATEMENT__QUALIFIER:
				return getQualifier();
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
			case StatementPackage.STATEMENT__STATEMENT_URI:
				setStatementURI((String) newValue);
				return;
			case StatementPackage.STATEMENT__SUBJECT:
				setSubject((StatementSubject) newValue);
				return;
			case StatementPackage.STATEMENT__PREDICATE:
				setPredicate((URIAndEntityName) newValue);
				return;
			case StatementPackage.STATEMENT__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends StatementTarget>) newValue);
				return;
			case StatementPackage.STATEMENT__ASSOCIATED_ATTRIBUTE:
				setAssociatedAttribute((ModelAttributeReference) newValue);
				return;
			case StatementPackage.STATEMENT__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceAndRoleReference>) newValue);
				return;
			case StatementPackage.STATEMENT__ASSERTED_BY:
				setAssertedBy((CodeSystemVersionReference) newValue);
				return;
			case StatementPackage.STATEMENT__ASSERTED_IN:
				setAssertedIn((CodeSystemVersionReference) newValue);
				return;
			case StatementPackage.STATEMENT__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends StatementQualifier>) newValue);
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
			case StatementPackage.STATEMENT__STATEMENT_URI:
				setStatementURI(STATEMENT_URI_EDEFAULT);
				return;
			case StatementPackage.STATEMENT__SUBJECT:
				setSubject((StatementSubject) null);
				return;
			case StatementPackage.STATEMENT__PREDICATE:
				setPredicate((URIAndEntityName) null);
				return;
			case StatementPackage.STATEMENT__TARGET:
				getTarget().clear();
				return;
			case StatementPackage.STATEMENT__ASSOCIATED_ATTRIBUTE:
				setAssociatedAttribute((ModelAttributeReference) null);
				return;
			case StatementPackage.STATEMENT__SOURCE:
				getSource().clear();
				return;
			case StatementPackage.STATEMENT__ASSERTED_BY:
				setAssertedBy((CodeSystemVersionReference) null);
				return;
			case StatementPackage.STATEMENT__ASSERTED_IN:
				setAssertedIn((CodeSystemVersionReference) null);
				return;
			case StatementPackage.STATEMENT__QUALIFIER:
				getQualifier().clear();
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
			case StatementPackage.STATEMENT__STATEMENT_URI:
				return STATEMENT_URI_EDEFAULT == null
						? statementURI != null
						: !STATEMENT_URI_EDEFAULT.equals(statementURI);
			case StatementPackage.STATEMENT__SUBJECT:
				return subject != null;
			case StatementPackage.STATEMENT__PREDICATE:
				return predicate != null;
			case StatementPackage.STATEMENT__TARGET:
				return target != null && !target.isEmpty();
			case StatementPackage.STATEMENT__ASSOCIATED_ATTRIBUTE:
				return associatedAttribute != null;
			case StatementPackage.STATEMENT__SOURCE:
				return source != null && !source.isEmpty();
			case StatementPackage.STATEMENT__ASSERTED_BY:
				return assertedBy != null;
			case StatementPackage.STATEMENT__ASSERTED_IN:
				return assertedIn != null;
			case StatementPackage.STATEMENT__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
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
		result.append(" (statementURI: ");
		result.append(statementURI);
		result.append(')');
		return result.toString();
	}

} // StatementImpl
