/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.EntitySynopsis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Synopsis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.EntitySynopsisImpl#getDesignation <em>Designation</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EntitySynopsisImpl extends URIAndEntityNameImpl implements EntitySynopsis {
	/**
	 * The default value of the '{@link #getDesignation() <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGNATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected String designation = DESIGNATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EntitySynopsisImpl() {
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
		return CorePackage.Literals.ENTITY_SYNOPSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDesignation(String newDesignation) {
		String oldDesignation = designation;
		designation = newDesignation;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.ENTITY_SYNOPSIS__DESIGNATION, oldDesignation, designation));
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
			case CorePackage.ENTITY_SYNOPSIS__DESIGNATION:
				return getDesignation();
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
			case CorePackage.ENTITY_SYNOPSIS__DESIGNATION:
				setDesignation((String) newValue);
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
			case CorePackage.ENTITY_SYNOPSIS__DESIGNATION:
				setDesignation(DESIGNATION_EDEFAULT);
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
			case CorePackage.ENTITY_SYNOPSIS__DESIGNATION:
				return DESIGNATION_EDEFAULT == null
						? designation != null
						: !DESIGNATION_EDEFAULT.equals(designation);
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
		result.append(" (designation: ");
		result.append(designation);
		result.append(')');
		return result.toString();
	}

} // EntitySynopsisImpl
