/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;
import org.openhealthtools.mdht.cts2.entity.PredicateDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.PredicateDescriptionImpl#getForwardName <em>Forward Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.PredicateDescriptionImpl#getReverseName <em>Reverse Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PredicateDescriptionImpl extends NamedEntityDescriptionImpl implements PredicateDescription {
	/**
	 * The default value of the '{@link #getForwardName() <em>Forward Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getForwardName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORWARD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForwardName() <em>Forward Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getForwardName()
	 * @generated
	 * @ordered
	 */
	protected String forwardName = FORWARD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReverseName() <em>Reverse Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReverseName()
	 * @generated
	 * @ordered
	 */
	protected static final String REVERSE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReverseName() <em>Reverse Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReverseName()
	 * @generated
	 * @ordered
	 */
	protected String reverseName = REVERSE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PredicateDescriptionImpl() {
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
		return EntityPackage.Literals.PREDICATE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getForwardName() {
		return forwardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setForwardName(String newForwardName) {
		String oldForwardName = forwardName;
		forwardName = newForwardName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.PREDICATE_DESCRIPTION__FORWARD_NAME, oldForwardName, forwardName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getReverseName() {
		return reverseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReverseName(String newReverseName) {
		String oldReverseName = reverseName;
		reverseName = newReverseName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.PREDICATE_DESCRIPTION__REVERSE_NAME, oldReverseName, reverseName));
		}
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
			case EntityPackage.PREDICATE_DESCRIPTION__FORWARD_NAME:
				return getForwardName();
			case EntityPackage.PREDICATE_DESCRIPTION__REVERSE_NAME:
				return getReverseName();
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
			case EntityPackage.PREDICATE_DESCRIPTION__FORWARD_NAME:
				setForwardName((String) newValue);
				return;
			case EntityPackage.PREDICATE_DESCRIPTION__REVERSE_NAME:
				setReverseName((String) newValue);
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
			case EntityPackage.PREDICATE_DESCRIPTION__FORWARD_NAME:
				setForwardName(FORWARD_NAME_EDEFAULT);
				return;
			case EntityPackage.PREDICATE_DESCRIPTION__REVERSE_NAME:
				setReverseName(REVERSE_NAME_EDEFAULT);
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
			case EntityPackage.PREDICATE_DESCRIPTION__FORWARD_NAME:
				return FORWARD_NAME_EDEFAULT == null
						? forwardName != null
						: !FORWARD_NAME_EDEFAULT.equals(forwardName);
			case EntityPackage.PREDICATE_DESCRIPTION__REVERSE_NAME:
				return REVERSE_NAME_EDEFAULT == null
						? reverseName != null
						: !REVERSE_NAME_EDEFAULT.equals(reverseName);
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
		result.append(" (forwardName: ");
		result.append(forwardName);
		result.append(", reverseName: ");
		result.append(reverseName);
		result.append(')');
		return result.toString();
	}

} // PredicateDescriptionImpl
