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
package org.openhealthtools.mdht.cts2.valuesetdefinition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.impl.MessageImpl;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionMsgImpl#getValueSetDefinition <em>Value Set Definition</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ValueSetDefinitionMsgImpl extends MessageImpl implements ValueSetDefinitionMsg {
	/**
	 * The cached value of the '{@link #getValueSetDefinition() <em>Value Set Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSetDefinition()
	 * @generated
	 * @ordered
	 */
	protected ValueSetDefinition valueSetDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetDefinitionMsgImpl() {
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
		return ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_MSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinition getValueSetDefinition() {
		return valueSetDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSetDefinition(ValueSetDefinition newValueSetDefinition, NotificationChain msgs) {
		ValueSetDefinition oldValueSetDefinition = valueSetDefinition;
		valueSetDefinition = newValueSetDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_MSG__VALUE_SET_DEFINITION,
				oldValueSetDefinition, newValueSetDefinition);
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
	public void setValueSetDefinition(ValueSetDefinition newValueSetDefinition) {
		if (newValueSetDefinition != valueSetDefinition) {
			NotificationChain msgs = null;
			if (valueSetDefinition != null) {
				msgs = ((InternalEObject) valueSetDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_MSG__VALUE_SET_DEFINITION, null, msgs);
			}
			if (newValueSetDefinition != null) {
				msgs = ((InternalEObject) newValueSetDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_MSG__VALUE_SET_DEFINITION, null, msgs);
			}
			msgs = basicSetValueSetDefinition(newValueSetDefinition, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_MSG__VALUE_SET_DEFINITION,
				newValueSetDefinition, newValueSetDefinition));
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_MSG__VALUE_SET_DEFINITION:
				return basicSetValueSetDefinition(null, msgs);
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_MSG__VALUE_SET_DEFINITION:
				return getValueSetDefinition();
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_MSG__VALUE_SET_DEFINITION:
				setValueSetDefinition((ValueSetDefinition) newValue);
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_MSG__VALUE_SET_DEFINITION:
				setValueSetDefinition((ValueSetDefinition) null);
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_MSG__VALUE_SET_DEFINITION:
				return valueSetDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} // ValueSetDefinitionMsgImpl
