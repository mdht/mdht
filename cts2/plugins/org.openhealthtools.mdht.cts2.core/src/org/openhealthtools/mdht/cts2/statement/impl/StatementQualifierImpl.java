/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.statement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.ModelAttributeReference;
import org.openhealthtools.mdht.cts2.core.StatementTarget;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;
import org.openhealthtools.mdht.cts2.statement.StatementPackage;
import org.openhealthtools.mdht.cts2.statement.StatementQualifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.StatementQualifierImpl#getQualifierPredicate <em>Qualifier Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.StatementQualifierImpl#getAssociatedAttribute <em>Associated Attribute</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.StatementQualifierImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class StatementQualifierImpl extends EObjectImpl implements StatementQualifier {
	/**
	 * The cached value of the '{@link #getQualifierPredicate() <em>Qualifier Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getQualifierPredicate()
	 * @generated
	 * @ordered
	 */
	protected URIAndEntityName qualifierPredicate;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StatementQualifierImpl() {
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
		return StatementPackage.Literals.STATEMENT_QUALIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URIAndEntityName getQualifierPredicate() {
		return qualifierPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetQualifierPredicate(URIAndEntityName newQualifierPredicate, NotificationChain msgs) {
		URIAndEntityName oldQualifierPredicate = qualifierPredicate;
		qualifierPredicate = newQualifierPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT_QUALIFIER__QUALIFIER_PREDICATE,
				oldQualifierPredicate, newQualifierPredicate);
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
	public void setQualifierPredicate(URIAndEntityName newQualifierPredicate) {
		if (newQualifierPredicate != qualifierPredicate) {
			NotificationChain msgs = null;
			if (qualifierPredicate != null) {
				msgs = ((InternalEObject) qualifierPredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						StatementPackage.STATEMENT_QUALIFIER__QUALIFIER_PREDICATE, null, msgs);
			}
			if (newQualifierPredicate != null) {
				msgs = ((InternalEObject) newQualifierPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						StatementPackage.STATEMENT_QUALIFIER__QUALIFIER_PREDICATE, null, msgs);
			}
			msgs = basicSetQualifierPredicate(newQualifierPredicate, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT_QUALIFIER__QUALIFIER_PREDICATE,
				newQualifierPredicate, newQualifierPredicate));
		}
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
				this, Notification.SET, StatementPackage.STATEMENT_QUALIFIER__ASSOCIATED_ATTRIBUTE,
				oldAssociatedAttribute, newAssociatedAttribute);
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
						StatementPackage.STATEMENT_QUALIFIER__ASSOCIATED_ATTRIBUTE, null, msgs);
			}
			if (newAssociatedAttribute != null) {
				msgs = ((InternalEObject) newAssociatedAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						StatementPackage.STATEMENT_QUALIFIER__ASSOCIATED_ATTRIBUTE, null, msgs);
			}
			msgs = basicSetAssociatedAttribute(newAssociatedAttribute, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT_QUALIFIER__ASSOCIATED_ATTRIBUTE,
				newAssociatedAttribute, newAssociatedAttribute));
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
				this, Notification.SET, StatementPackage.STATEMENT_QUALIFIER__TARGET, oldTarget, newTarget);
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
						StatementPackage.STATEMENT_QUALIFIER__TARGET, null, msgs);
			}
			if (newTarget != null) {
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						StatementPackage.STATEMENT_QUALIFIER__TARGET, null, msgs);
			}
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, StatementPackage.STATEMENT_QUALIFIER__TARGET, newTarget, newTarget));
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
			case StatementPackage.STATEMENT_QUALIFIER__QUALIFIER_PREDICATE:
				return basicSetQualifierPredicate(null, msgs);
			case StatementPackage.STATEMENT_QUALIFIER__ASSOCIATED_ATTRIBUTE:
				return basicSetAssociatedAttribute(null, msgs);
			case StatementPackage.STATEMENT_QUALIFIER__TARGET:
				return basicSetTarget(null, msgs);
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
			case StatementPackage.STATEMENT_QUALIFIER__QUALIFIER_PREDICATE:
				return getQualifierPredicate();
			case StatementPackage.STATEMENT_QUALIFIER__ASSOCIATED_ATTRIBUTE:
				return getAssociatedAttribute();
			case StatementPackage.STATEMENT_QUALIFIER__TARGET:
				return getTarget();
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
			case StatementPackage.STATEMENT_QUALIFIER__QUALIFIER_PREDICATE:
				setQualifierPredicate((URIAndEntityName) newValue);
				return;
			case StatementPackage.STATEMENT_QUALIFIER__ASSOCIATED_ATTRIBUTE:
				setAssociatedAttribute((ModelAttributeReference) newValue);
				return;
			case StatementPackage.STATEMENT_QUALIFIER__TARGET:
				setTarget((StatementTarget) newValue);
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
			case StatementPackage.STATEMENT_QUALIFIER__QUALIFIER_PREDICATE:
				setQualifierPredicate((URIAndEntityName) null);
				return;
			case StatementPackage.STATEMENT_QUALIFIER__ASSOCIATED_ATTRIBUTE:
				setAssociatedAttribute((ModelAttributeReference) null);
				return;
			case StatementPackage.STATEMENT_QUALIFIER__TARGET:
				setTarget((StatementTarget) null);
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
			case StatementPackage.STATEMENT_QUALIFIER__QUALIFIER_PREDICATE:
				return qualifierPredicate != null;
			case StatementPackage.STATEMENT_QUALIFIER__ASSOCIATED_ATTRIBUTE:
				return associatedAttribute != null;
			case StatementPackage.STATEMENT_QUALIFIER__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} // StatementQualifierImpl
