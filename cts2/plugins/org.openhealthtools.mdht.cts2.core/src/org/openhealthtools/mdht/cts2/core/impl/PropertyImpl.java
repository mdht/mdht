/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.PredicateReference;
import org.openhealthtools.mdht.cts2.core.Property;
import org.openhealthtools.mdht.cts2.core.StatementTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.PropertyImpl#getPredicate <em>Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.PropertyImpl#getValue <em>Value</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.PropertyImpl#getPropertyQualifier <em>Property Qualifier</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.PropertyImpl#getCorrespondingStatement <em>Corresponding Statement</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property {
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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<StatementTarget> value;

	/**
	 * The cached value of the '{@link #getPropertyQualifier() <em>Property Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPropertyQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> propertyQualifier;

	/**
	 * The default value of the '{@link #getCorrespondingStatement() <em>Corresponding Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCorrespondingStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRESPONDING_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrespondingStatement() <em>Corresponding Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCorrespondingStatement()
	 * @generated
	 * @ordered
	 */
	protected String correspondingStatement = CORRESPONDING_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PropertyImpl() {
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
		return CorePackage.Literals.PROPERTY;
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
				this, Notification.SET, CorePackage.PROPERTY__PREDICATE, oldPredicate, newPredicate);
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
						CorePackage.PROPERTY__PREDICATE, null, msgs);
			}
			if (newPredicate != null) {
				msgs = ((InternalEObject) newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.PROPERTY__PREDICATE, null, msgs);
			}
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.PROPERTY__PREDICATE, newPredicate, newPredicate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<StatementTarget> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<StatementTarget>(
				StatementTarget.class, this, CorePackage.PROPERTY__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Property> getPropertyQualifier() {
		if (propertyQualifier == null) {
			propertyQualifier = new EObjectContainmentEList<Property>(
				Property.class, this, CorePackage.PROPERTY__PROPERTY_QUALIFIER);
		}
		return propertyQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCorrespondingStatement() {
		return correspondingStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCorrespondingStatement(String newCorrespondingStatement) {
		String oldCorrespondingStatement = correspondingStatement;
		correspondingStatement = newCorrespondingStatement;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.PROPERTY__CORRESPONDING_STATEMENT, oldCorrespondingStatement,
				correspondingStatement));
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
			case CorePackage.PROPERTY__PREDICATE:
				return basicSetPredicate(null, msgs);
			case CorePackage.PROPERTY__VALUE:
				return ((InternalEList<?>) getValue()).basicRemove(otherEnd, msgs);
			case CorePackage.PROPERTY__PROPERTY_QUALIFIER:
				return ((InternalEList<?>) getPropertyQualifier()).basicRemove(otherEnd, msgs);
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
			case CorePackage.PROPERTY__PREDICATE:
				return getPredicate();
			case CorePackage.PROPERTY__VALUE:
				return getValue();
			case CorePackage.PROPERTY__PROPERTY_QUALIFIER:
				return getPropertyQualifier();
			case CorePackage.PROPERTY__CORRESPONDING_STATEMENT:
				return getCorrespondingStatement();
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
			case CorePackage.PROPERTY__PREDICATE:
				setPredicate((PredicateReference) newValue);
				return;
			case CorePackage.PROPERTY__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends StatementTarget>) newValue);
				return;
			case CorePackage.PROPERTY__PROPERTY_QUALIFIER:
				getPropertyQualifier().clear();
				getPropertyQualifier().addAll((Collection<? extends Property>) newValue);
				return;
			case CorePackage.PROPERTY__CORRESPONDING_STATEMENT:
				setCorrespondingStatement((String) newValue);
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
			case CorePackage.PROPERTY__PREDICATE:
				setPredicate((PredicateReference) null);
				return;
			case CorePackage.PROPERTY__VALUE:
				getValue().clear();
				return;
			case CorePackage.PROPERTY__PROPERTY_QUALIFIER:
				getPropertyQualifier().clear();
				return;
			case CorePackage.PROPERTY__CORRESPONDING_STATEMENT:
				setCorrespondingStatement(CORRESPONDING_STATEMENT_EDEFAULT);
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
			case CorePackage.PROPERTY__PREDICATE:
				return predicate != null;
			case CorePackage.PROPERTY__VALUE:
				return value != null && !value.isEmpty();
			case CorePackage.PROPERTY__PROPERTY_QUALIFIER:
				return propertyQualifier != null && !propertyQualifier.isEmpty();
			case CorePackage.PROPERTY__CORRESPONDING_STATEMENT:
				return CORRESPONDING_STATEMENT_EDEFAULT == null
						? correspondingStatement != null
						: !CORRESPONDING_STATEMENT_EDEFAULT.equals(correspondingStatement);
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
		result.append(" (correspondingStatement: ");
		result.append(correspondingStatement);
		result.append(')');
		return result.toString();
	}

} // PropertyImpl
