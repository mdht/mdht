/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.operations.InfrastructureRootTypeIdOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.impl.IIImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Root Type Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.InfrastructureRootTypeIdImpl#getRedefinedRoot <em>Redefined Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.InfrastructureRootTypeIdImpl#getRedefinedExtension <em>Redefined Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureRootTypeIdImpl extends IIImpl implements InfrastructureRootTypeId {
	/**
	 * The default value of the '{@link #getRedefinedRoot() <em>Redefined Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_ROOT_EDEFAULT = "2.16.840.1.113883.1.3";

	/**
	 * The cached value of the '{@link #getRedefinedRoot() <em>Redefined Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedRoot()
	 * @generated
	 * @ordered
	 */
	protected String redefinedRoot = REDEFINED_ROOT_EDEFAULT;

	/**
	 * This is true if the Redefined Root attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean redefinedRootESet;

	/**
	 * The default value of the '{@link #getRedefinedExtension() <em>Redefined Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedExtension() <em>Redefined Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedExtension()
	 * @generated
	 * @ordered
	 */
	protected String redefinedExtension = REDEFINED_EXTENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureRootTypeIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.INFRASTRUCTURE_ROOT_TYPE_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedRoot() {
		return redefinedRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedRoot(String newRedefinedRoot) {
		String oldRedefinedRoot = redefinedRoot;
		redefinedRoot = newRedefinedRoot;
		boolean oldRedefinedRootESet = redefinedRootESet;
		redefinedRootESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_ROOT, oldRedefinedRoot, redefinedRoot, !oldRedefinedRootESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRedefinedRoot() {
		String oldRedefinedRoot = redefinedRoot;
		boolean oldRedefinedRootESet = redefinedRootESet;
		redefinedRoot = REDEFINED_ROOT_EDEFAULT;
		redefinedRootESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_ROOT, oldRedefinedRoot, REDEFINED_ROOT_EDEFAULT, oldRedefinedRootESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedRoot() {
		return redefinedRootESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedExtension() {
		return redefinedExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedExtension(String newRedefinedExtension) {
		String oldRedefinedExtension = redefinedExtension;
		redefinedExtension = newRedefinedExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_EXTENSION, oldRedefinedExtension, redefinedExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedExtension() {
		return REDEFINED_EXTENSION_EDEFAULT == null ? redefinedExtension != null : !REDEFINED_EXTENSION_EDEFAULT.equals(redefinedExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinedRoot(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfrastructureRootTypeIdOperations.validateRedefinedRoot(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinedExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfrastructureRootTypeIdOperations.validateRedefinedExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateII(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfrastructureRootTypeIdOperations.validateII(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_ROOT:
				return getRedefinedRoot();
			case CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_EXTENSION:
				return getRedefinedExtension();
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
			case CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_ROOT:
				setRedefinedRoot((String)newValue);
				return;
			case CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_EXTENSION:
				setRedefinedExtension((String)newValue);
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
			case CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_ROOT:
				unsetRedefinedRoot();
				return;
			case CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_EXTENSION:
				setRedefinedExtension(REDEFINED_EXTENSION_EDEFAULT);
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
			case CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_ROOT:
				return isSetRedefinedRoot();
			case CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_EXTENSION:
				return isSetRedefinedExtension();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (redefinedRoot: ");
		if (redefinedRootESet) result.append(redefinedRoot); else result.append("<unset>");
		result.append(", redefinedExtension: ");
		result.append(redefinedExtension);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoot() {
		return getRedefinedRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoot(String newRoot) {
		setRedefinedRoot(newRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoot() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtension() {
		return getRedefinedExtension();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtension(String newExtension) {
		setRedefinedExtension(newExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtension() {
  		return false;
	}

} //InfrastructureRootTypeIdImpl
