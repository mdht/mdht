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
package org.openhealthtools.mdht.cts2.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.ContextReference;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.Definition;
import org.openhealthtools.mdht.cts2.core.DefinitionRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.DefinitionImpl#getUsageContext <em>Usage Context</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.DefinitionImpl#getDefinitionRole <em>Definition Role</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DefinitionImpl extends NoteImpl implements Definition {
	/**
	 * The cached value of the '{@link #getUsageContext() <em>Usage Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUsageContext()
	 * @generated
	 * @ordered
	 */
	protected ContextReference usageContext;

	/**
	 * The default value of the '{@link #getDefinitionRole() <em>Definition Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefinitionRole()
	 * @generated
	 * @ordered
	 */
	protected static final DefinitionRole DEFINITION_ROLE_EDEFAULT = DefinitionRole.NORMATIVE;

	/**
	 * The cached value of the '{@link #getDefinitionRole() <em>Definition Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefinitionRole()
	 * @generated
	 * @ordered
	 */
	protected DefinitionRole definitionRole = DEFINITION_ROLE_EDEFAULT;

	/**
	 * This is true if the Definition Role attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean definitionRoleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DefinitionImpl() {
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
		return CorePackage.Literals.DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ContextReference getUsageContext() {
		return usageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetUsageContext(ContextReference newUsageContext, NotificationChain msgs) {
		ContextReference oldUsageContext = usageContext;
		usageContext = newUsageContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.DEFINITION__USAGE_CONTEXT, oldUsageContext, newUsageContext);
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
	public void setUsageContext(ContextReference newUsageContext) {
		if (newUsageContext != usageContext) {
			NotificationChain msgs = null;
			if (usageContext != null) {
				msgs = ((InternalEObject) usageContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.DEFINITION__USAGE_CONTEXT, null, msgs);
			}
			if (newUsageContext != null) {
				msgs = ((InternalEObject) newUsageContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.DEFINITION__USAGE_CONTEXT, null, msgs);
			}
			msgs = basicSetUsageContext(newUsageContext, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.DEFINITION__USAGE_CONTEXT, newUsageContext, newUsageContext));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DefinitionRole getDefinitionRole() {
		return definitionRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDefinitionRole(DefinitionRole newDefinitionRole) {
		DefinitionRole oldDefinitionRole = definitionRole;
		definitionRole = newDefinitionRole == null
				? DEFINITION_ROLE_EDEFAULT
				: newDefinitionRole;
		boolean oldDefinitionRoleESet = definitionRoleESet;
		definitionRoleESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.DEFINITION__DEFINITION_ROLE, oldDefinitionRole, definitionRole,
				!oldDefinitionRoleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetDefinitionRole() {
		DefinitionRole oldDefinitionRole = definitionRole;
		boolean oldDefinitionRoleESet = definitionRoleESet;
		definitionRole = DEFINITION_ROLE_EDEFAULT;
		definitionRoleESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CorePackage.DEFINITION__DEFINITION_ROLE, oldDefinitionRole,
				DEFINITION_ROLE_EDEFAULT, oldDefinitionRoleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetDefinitionRole() {
		return definitionRoleESet;
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
			case CorePackage.DEFINITION__USAGE_CONTEXT:
				return basicSetUsageContext(null, msgs);
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
			case CorePackage.DEFINITION__USAGE_CONTEXT:
				return getUsageContext();
			case CorePackage.DEFINITION__DEFINITION_ROLE:
				return getDefinitionRole();
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
			case CorePackage.DEFINITION__USAGE_CONTEXT:
				setUsageContext((ContextReference) newValue);
				return;
			case CorePackage.DEFINITION__DEFINITION_ROLE:
				setDefinitionRole((DefinitionRole) newValue);
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
			case CorePackage.DEFINITION__USAGE_CONTEXT:
				setUsageContext((ContextReference) null);
				return;
			case CorePackage.DEFINITION__DEFINITION_ROLE:
				unsetDefinitionRole();
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
			case CorePackage.DEFINITION__USAGE_CONTEXT:
				return usageContext != null;
			case CorePackage.DEFINITION__DEFINITION_ROLE:
				return isSetDefinitionRole();
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
		result.append(" (definitionRole: ");
		if (definitionRoleESet) {
			result.append(definitionRole);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // DefinitionImpl
