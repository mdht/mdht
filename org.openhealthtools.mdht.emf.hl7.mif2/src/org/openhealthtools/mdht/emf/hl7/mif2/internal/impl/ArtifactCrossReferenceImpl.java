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

import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactCrossReference;
import org.openhealthtools.mdht.emf.hl7.mif2.ElementDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageOrArtifactRef;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Cross Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ArtifactCrossReferenceImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ArtifactCrossReferenceImpl#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ArtifactCrossReferenceImpl#getDependentOnElement <em>Dependent On Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ArtifactCrossReferenceImpl#getContainedElements <em>Contained Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactCrossReferenceImpl extends PackageArtifactImpl implements ArtifactCrossReference {
	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDerivation> derivedFrom;

	/**
	 * The cached value of the '{@link #getImportedPackage() <em>Imported Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> importedPackage;

	/**
	 * The cached value of the '{@link #getDependentOnElement() <em>Dependent On Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentOnElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageOrArtifactRef> dependentOnElement;

	/**
	 * The cached value of the '{@link #getContainedElements() <em>Contained Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactCrossReference> containedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactCrossReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ARTIFACT_CROSS_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDerivation> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<ElementDerivation>(
				ElementDerivation.class, this, Mif2Package.ARTIFACT_CROSS_REFERENCE__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getImportedPackage() {
		if (importedPackage == null) {
			importedPackage = new EObjectContainmentEList<PackageRef>(
				PackageRef.class, this, Mif2Package.ARTIFACT_CROSS_REFERENCE__IMPORTED_PACKAGE);
		}
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageOrArtifactRef> getDependentOnElement() {
		if (dependentOnElement == null) {
			dependentOnElement = new EObjectContainmentEList<PackageOrArtifactRef>(
				PackageOrArtifactRef.class, this, Mif2Package.ARTIFACT_CROSS_REFERENCE__DEPENDENT_ON_ELEMENT);
		}
		return dependentOnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactCrossReference> getContainedElements() {
		if (containedElements == null) {
			containedElements = new EObjectContainmentEList<ArtifactCrossReference>(
				ArtifactCrossReference.class, this, Mif2Package.ARTIFACT_CROSS_REFERENCE__CONTAINED_ELEMENTS);
		}
		return containedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__DERIVED_FROM:
				return ((InternalEList<?>) getDerivedFrom()).basicRemove(otherEnd, msgs);
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__IMPORTED_PACKAGE:
				return ((InternalEList<?>) getImportedPackage()).basicRemove(otherEnd, msgs);
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__DEPENDENT_ON_ELEMENT:
				return ((InternalEList<?>) getDependentOnElement()).basicRemove(otherEnd, msgs);
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__CONTAINED_ELEMENTS:
				return ((InternalEList<?>) getContainedElements()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__DERIVED_FROM:
				return getDerivedFrom();
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__IMPORTED_PACKAGE:
				return getImportedPackage();
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__DEPENDENT_ON_ELEMENT:
				return getDependentOnElement();
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__CONTAINED_ELEMENTS:
				return getContainedElements();
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
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends ElementDerivation>) newValue);
				return;
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__IMPORTED_PACKAGE:
				getImportedPackage().clear();
				getImportedPackage().addAll((Collection<? extends PackageRef>) newValue);
				return;
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__DEPENDENT_ON_ELEMENT:
				getDependentOnElement().clear();
				getDependentOnElement().addAll((Collection<? extends PackageOrArtifactRef>) newValue);
				return;
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				getContainedElements().addAll((Collection<? extends ArtifactCrossReference>) newValue);
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
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__IMPORTED_PACKAGE:
				getImportedPackage().clear();
				return;
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__DEPENDENT_ON_ELEMENT:
				getDependentOnElement().clear();
				return;
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__CONTAINED_ELEMENTS:
				getContainedElements().clear();
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
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__IMPORTED_PACKAGE:
				return importedPackage != null && !importedPackage.isEmpty();
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__DEPENDENT_ON_ELEMENT:
				return dependentOnElement != null && !dependentOnElement.isEmpty();
			case Mif2Package.ARTIFACT_CROSS_REFERENCE__CONTAINED_ELEMENTS:
				return containedElements != null && !containedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ArtifactCrossReferenceImpl
