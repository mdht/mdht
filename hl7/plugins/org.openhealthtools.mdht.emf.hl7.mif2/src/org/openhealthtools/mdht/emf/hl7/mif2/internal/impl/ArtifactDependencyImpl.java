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

import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactDependency;
import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ArtifactDependencyImpl#getSupplementArtifact <em>Supplement Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactDependencyImpl extends PackageRefImpl implements ArtifactDependency {
	/**
	 * The cached value of the '{@link #getSupplementArtifact() <em>Supplement Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactSupplement> supplementArtifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ARTIFACT_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactSupplement> getSupplementArtifact() {
		if (supplementArtifact == null) {
			supplementArtifact = new EObjectContainmentEList<ArtifactSupplement>(
				ArtifactSupplement.class, this, Mif2Package.ARTIFACT_DEPENDENCY__SUPPLEMENT_ARTIFACT);
		}
		return supplementArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.ARTIFACT_DEPENDENCY__SUPPLEMENT_ARTIFACT:
				return ((InternalEList<?>) getSupplementArtifact()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.ARTIFACT_DEPENDENCY__SUPPLEMENT_ARTIFACT:
				return getSupplementArtifact();
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
			case Mif2Package.ARTIFACT_DEPENDENCY__SUPPLEMENT_ARTIFACT:
				getSupplementArtifact().clear();
				getSupplementArtifact().addAll((Collection<? extends ArtifactSupplement>) newValue);
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
			case Mif2Package.ARTIFACT_DEPENDENCY__SUPPLEMENT_ARTIFACT:
				getSupplementArtifact().clear();
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
			case Mif2Package.ARTIFACT_DEPENDENCY__SUPPLEMENT_ARTIFACT:
				return supplementArtifact != null && !supplementArtifact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ArtifactDependencyImpl
