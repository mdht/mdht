/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.ClassBindingArgumentBase;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Binding Argument Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassBindingArgumentBaseImpl#getTemplateParameterName <em>Template Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassBindingArgumentBaseImpl extends EObjectImpl implements ClassBindingArgumentBase {
	/**
	 * The default value of the '{@link #getTemplateParameterName() <em>Template Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateParameterName() <em>Template Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameterName()
	 * @generated
	 * @ordered
	 */
	protected String templateParameterName = TEMPLATE_PARAMETER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassBindingArgumentBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CLASS_BINDING_ARGUMENT_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateParameterName() {
		return templateParameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameterName(String newTemplateParameterName) {
		String oldTemplateParameterName = templateParameterName;
		templateParameterName = newTemplateParameterName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASS_BINDING_ARGUMENT_BASE__TEMPLATE_PARAMETER_NAME,
				oldTemplateParameterName, templateParameterName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.CLASS_BINDING_ARGUMENT_BASE__TEMPLATE_PARAMETER_NAME:
				return getTemplateParameterName();
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
			case Mif2Package.CLASS_BINDING_ARGUMENT_BASE__TEMPLATE_PARAMETER_NAME:
				setTemplateParameterName((String) newValue);
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
			case Mif2Package.CLASS_BINDING_ARGUMENT_BASE__TEMPLATE_PARAMETER_NAME:
				setTemplateParameterName(TEMPLATE_PARAMETER_NAME_EDEFAULT);
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
			case Mif2Package.CLASS_BINDING_ARGUMENT_BASE__TEMPLATE_PARAMETER_NAME:
				return TEMPLATE_PARAMETER_NAME_EDEFAULT == null
						? templateParameterName != null
						: !TEMPLATE_PARAMETER_NAME_EDEFAULT.equals(templateParameterName);
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (templateParameterName: ");
		result.append(templateParameterName);
		result.append(')');
		return result.toString();
	}

} // ClassBindingArgumentBaseImpl
