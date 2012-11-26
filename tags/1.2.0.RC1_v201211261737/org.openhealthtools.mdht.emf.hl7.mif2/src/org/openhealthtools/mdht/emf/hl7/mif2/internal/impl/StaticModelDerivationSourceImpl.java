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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivationSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Model Derivation Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelDerivationSourceImpl#getSourceStaticModel <em>Source Static Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticModelDerivationSourceImpl extends DerivationImpl implements StaticModelDerivationSource {
	/**
	 * The cached value of the '{@link #getSourceStaticModel() <em>Source Static Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceStaticModel()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> sourceStaticModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticModelDerivationSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.STATIC_MODEL_DERIVATION_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getSourceStaticModel() {
		if (sourceStaticModel == null) {
			sourceStaticModel = new EObjectContainmentEList<PackageRef>(
				PackageRef.class, this, Mif2Package.STATIC_MODEL_DERIVATION_SOURCE__SOURCE_STATIC_MODEL);
		}
		return sourceStaticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.STATIC_MODEL_DERIVATION_SOURCE__SOURCE_STATIC_MODEL:
				return ((InternalEList<?>) getSourceStaticModel()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.STATIC_MODEL_DERIVATION_SOURCE__SOURCE_STATIC_MODEL:
				return getSourceStaticModel();
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
			case Mif2Package.STATIC_MODEL_DERIVATION_SOURCE__SOURCE_STATIC_MODEL:
				getSourceStaticModel().clear();
				getSourceStaticModel().addAll((Collection<? extends PackageRef>) newValue);
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
			case Mif2Package.STATIC_MODEL_DERIVATION_SOURCE__SOURCE_STATIC_MODEL:
				getSourceStaticModel().clear();
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
			case Mif2Package.STATIC_MODEL_DERIVATION_SOURCE__SOURCE_STATIC_MODEL:
				return sourceStaticModel != null && !sourceStaticModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StaticModelDerivationSourceImpl
