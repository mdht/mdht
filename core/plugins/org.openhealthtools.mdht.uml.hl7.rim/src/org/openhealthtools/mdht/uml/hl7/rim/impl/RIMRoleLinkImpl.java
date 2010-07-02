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
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;
import org.openhealthtools.mdht.uml.hl7.rim.RIMRole;
import org.openhealthtools.mdht.uml.hl7.rim.RIMRoleLink;
import org.openhealthtools.mdht.uml.hl7.rim.operations.RIMRoleLinkOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.impl.RIMRoleLinkImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RIMRoleLinkImpl extends RIMInfrastructureRootImpl implements RIMRoleLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIMRoleLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMPackage.Literals.RIM_ROLE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMRole getTarget() {
		RIMRole target = basicGetTarget();
		return target != null && target.eIsProxy() ? (RIMRole)eResolveProxy((InternalEObject)target) : target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMRole basicGetTarget() {
		// TODO: implement this method to return the 'Target' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(RIMRole newTarget) {
		// TODO: implement this method to set the 'Target' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMRole getSource() {
		RIMRole source = basicGetSource();
		return source != null && source.eIsProxy() ? (RIMRole)eResolveProxy((InternalEObject)source) : source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMRole basicGetSource() {
		// TODO: implement this method to return the 'Source' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(RIMRole newSource) {
		// TODO: implement this method to set the 'Source' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getTypeCode() {
		return RIMRoleLinkOperations.getTypeCode(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RIMPackage.RIM_ROLE_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case RIMPackage.RIM_ROLE_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case RIMPackage.RIM_ROLE_LINK__TARGET:
				setTarget((RIMRole)newValue);
				return;
			case RIMPackage.RIM_ROLE_LINK__SOURCE:
				setSource((RIMRole)newValue);
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
			case RIMPackage.RIM_ROLE_LINK__TARGET:
				setTarget((RIMRole)null);
				return;
			case RIMPackage.RIM_ROLE_LINK__SOURCE:
				setSource((RIMRole)null);
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
			case RIMPackage.RIM_ROLE_LINK__TARGET:
				return basicGetTarget() != null;
			case RIMPackage.RIM_ROLE_LINK__SOURCE:
				return basicGetSource() != null;
		}
		return super.eIsSet(featureID);
	}

} //RIMRoleLinkImpl
