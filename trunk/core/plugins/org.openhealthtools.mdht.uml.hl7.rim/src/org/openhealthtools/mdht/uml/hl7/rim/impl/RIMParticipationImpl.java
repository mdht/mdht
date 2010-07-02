/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.rim.impl;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.openhealthtools.mdht.uml.hl7.rim.RIMAct;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;
import org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation;
import org.openhealthtools.mdht.uml.hl7.rim.RIMRole;
import org.openhealthtools.mdht.uml.hl7.rim.operations.RIMParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMParticipationImpl#getAct <em>Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMParticipationImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RIMParticipationImpl extends RIMInfrastructureRootImpl implements RIMParticipation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIMParticipationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMPackage.Literals.RIM_PARTICIPATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMAct getAct() {
		RIMAct act = basicGetAct();
		return act != null && act.eIsProxy() ? (RIMAct)eResolveProxy((InternalEObject)act) : act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMAct basicGetAct() {
		// TODO: implement this method to return the 'Act' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAct(RIMAct newAct) {
		// TODO: implement this method to set the 'Act' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMRole getRole() {
		RIMRole role = basicGetRole();
		return role != null && role.eIsProxy() ? (RIMRole)eResolveProxy((InternalEObject)role) : role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMRole basicGetRole() {
		// TODO: implement this method to return the 'Role' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(RIMRole newRole) {
		// TODO: implement this method to set the 'Role' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getTypeCode() {
		return RIMParticipationOperations.getTypeCode(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RIMPackage.RIM_PARTICIPATION__ACT:
				if (resolve) return getAct();
				return basicGetAct();
			case RIMPackage.RIM_PARTICIPATION__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RIMPackage.RIM_PARTICIPATION__ACT:
				setAct((RIMAct)newValue);
				return;
			case RIMPackage.RIM_PARTICIPATION__ROLE:
				setRole((RIMRole)newValue);
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
			case RIMPackage.RIM_PARTICIPATION__ACT:
				setAct((RIMAct)null);
				return;
			case RIMPackage.RIM_PARTICIPATION__ROLE:
				setRole((RIMRole)null);
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
			case RIMPackage.RIM_PARTICIPATION__ACT:
				return basicGetAct() != null;
			case RIMPackage.RIM_PARTICIPATION__ROLE:
				return basicGetRole() != null;
		}
		return super.eIsSet(featureID);
	}

} //RIMParticipationImpl
