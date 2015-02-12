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

import org.openhealthtools.mdht.emf.hl7.mif2.GlobalSerializedStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModelsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serialized Static Models Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedStaticModelsTypeImpl#getSerializedStaticModel <em>Serialized Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedStaticModelsTypeImpl#getSchemaVersion <em>Schema Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SerializedStaticModelsTypeImpl extends EObjectImpl implements SerializedStaticModelsType {
	/**
	 * The cached value of the '{@link #getSerializedStaticModel() <em>Serialized Static Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializedStaticModel()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalSerializedStaticModel> serializedStaticModel;

	/**
	 * The default value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_VERSION_EDEFAULT = "2.1.4";

	/**
	 * The cached value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected String schemaVersion = SCHEMA_VERSION_EDEFAULT;

	/**
	 * This is true if the Schema Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schemaVersionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializedStaticModelsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.SERIALIZED_STATIC_MODELS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalSerializedStaticModel> getSerializedStaticModel() {
		if (serializedStaticModel == null) {
			serializedStaticModel = new EObjectContainmentEList<GlobalSerializedStaticModel>(
				GlobalSerializedStaticModel.class, this,
				Mif2Package.SERIALIZED_STATIC_MODELS_TYPE__SERIALIZED_STATIC_MODEL);
		}
		return serializedStaticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaVersion() {
		return schemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaVersion(String newSchemaVersion) {
		String oldSchemaVersion = schemaVersion;
		schemaVersion = newSchemaVersion;
		boolean oldSchemaVersionESet = schemaVersionESet;
		schemaVersionESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_STATIC_MODELS_TYPE__SCHEMA_VERSION, oldSchemaVersion,
				schemaVersion, !oldSchemaVersionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSchemaVersion() {
		String oldSchemaVersion = schemaVersion;
		boolean oldSchemaVersionESet = schemaVersionESet;
		schemaVersion = SCHEMA_VERSION_EDEFAULT;
		schemaVersionESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.SERIALIZED_STATIC_MODELS_TYPE__SCHEMA_VERSION, oldSchemaVersion,
				SCHEMA_VERSION_EDEFAULT, oldSchemaVersionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSchemaVersion() {
		return schemaVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.SERIALIZED_STATIC_MODELS_TYPE__SERIALIZED_STATIC_MODEL:
				return ((InternalEList<?>) getSerializedStaticModel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.SERIALIZED_STATIC_MODELS_TYPE__SERIALIZED_STATIC_MODEL:
				return getSerializedStaticModel();
			case Mif2Package.SERIALIZED_STATIC_MODELS_TYPE__SCHEMA_VERSION:
				return getSchemaVersion();
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
			case Mif2Package.SERIALIZED_STATIC_MODELS_TYPE__SERIALIZED_STATIC_MODEL:
				getSerializedStaticModel().clear();
				getSerializedStaticModel().addAll((Collection<? extends GlobalSerializedStaticModel>) newValue);
				return;
			case Mif2Package.SERIALIZED_STATIC_MODELS_TYPE__SCHEMA_VERSION:
				setSchemaVersion((String) newValue);
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
			case Mif2Package.SERIALIZED_STATIC_MODELS_TYPE__SERIALIZED_STATIC_MODEL:
				getSerializedStaticModel().clear();
				return;
			case Mif2Package.SERIALIZED_STATIC_MODELS_TYPE__SCHEMA_VERSION:
				unsetSchemaVersion();
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
			case Mif2Package.SERIALIZED_STATIC_MODELS_TYPE__SERIALIZED_STATIC_MODEL:
				return serializedStaticModel != null && !serializedStaticModel.isEmpty();
			case Mif2Package.SERIALIZED_STATIC_MODELS_TYPE__SCHEMA_VERSION:
				return isSetSchemaVersion();
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
		result.append(" (schemaVersion: ");
		if (schemaVersionESet) {
			result.append(schemaVersion);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // SerializedStaticModelsTypeImpl
