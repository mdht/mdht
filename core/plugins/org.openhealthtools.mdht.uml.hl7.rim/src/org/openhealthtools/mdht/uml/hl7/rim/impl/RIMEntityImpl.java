/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.rim.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.hl7.rim.RIMEntity;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;
import org.openhealthtools.mdht.uml.hl7.rim.RIMRole;
import org.openhealthtools.mdht.uml.hl7.rim.operations.RIMEntityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMEntityImpl#getPlayedRoles <em>Played Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMEntityImpl#getScopedRoles <em>Scoped Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RIMEntityImpl extends RIMInfrastructureRootImpl implements RIMEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIMEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMPackage.Literals.RIM_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RIMRole> getPlayedRoles() {
		// TODO: implement this method to return the 'Played Role' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RIMRole> getScopedRoles() {
		// TODO: implement this method to return the 'Scoped Role' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getClassCode() {
		return RIMEntityOperations.getClassCode(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getDeterminerCode() {
		return RIMEntityOperations.getDeterminerCode(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RIMPackage.RIM_ENTITY__PLAYED_ROLE:
				return getPlayedRoles();
			case RIMPackage.RIM_ENTITY__SCOPED_ROLE:
				return getScopedRoles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RIMPackage.RIM_ENTITY__PLAYED_ROLE:
				getPlayedRoles().clear();
				getPlayedRoles().addAll((Collection<? extends RIMRole>)newValue);
				return;
			case RIMPackage.RIM_ENTITY__SCOPED_ROLE:
				getScopedRoles().clear();
				getScopedRoles().addAll((Collection<? extends RIMRole>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RIMPackage.RIM_ENTITY__PLAYED_ROLE:
				getPlayedRoles().clear();
				return;
			case RIMPackage.RIM_ENTITY__SCOPED_ROLE:
				getScopedRoles().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RIMPackage.RIM_ENTITY__PLAYED_ROLE:
				return !getPlayedRoles().isEmpty();
			case RIMPackage.RIM_ENTITY__SCOPED_ROLE:
				return !getScopedRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RIMEntityImpl
