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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactDependency;
import org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfacePackage;
import org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Model Interface Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelInterfacePackageImpl#getImportedVocabularyModelPackage <em>Imported Vocabulary Model Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelInterfacePackageImpl#getImportStaticModelInterfacePackage <em>Import Static Model Interface Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelInterfacePackageImpl#getCommonModelElementDefinition <em>Common Model Element Definition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelInterfacePackageImpl#getStubDefinition <em>Stub Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticModelInterfacePackageImpl extends PackageImpl implements StaticModelInterfacePackage {
	/**
	 * The cached value of the '{@link #getImportedVocabularyModelPackage() <em>Imported Vocabulary Model Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedVocabularyModelPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageRef importedVocabularyModelPackage;

	/**
	 * The cached value of the '{@link #getImportStaticModelInterfacePackage() <em>Import Static Model Interface Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportStaticModelInterfacePackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactDependency> importStaticModelInterfacePackage;

	/**
	 * The cached value of the '{@link #getCommonModelElementDefinition() <em>Common Model Element Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonModelElementDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<CommonModelElementDefinition> commonModelElementDefinition;

	/**
	 * The cached value of the '{@link #getStubDefinition() <em>Stub Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<StubDefinition> stubDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticModelInterfacePackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.STATIC_MODEL_INTERFACE_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getImportedVocabularyModelPackage() {
		return importedVocabularyModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedVocabularyModelPackage(PackageRef newImportedVocabularyModelPackage,
			NotificationChain msgs) {
		PackageRef oldImportedVocabularyModelPackage = importedVocabularyModelPackage;
		importedVocabularyModelPackage = newImportedVocabularyModelPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORTED_VOCABULARY_MODEL_PACKAGE,
				oldImportedVocabularyModelPackage, newImportedVocabularyModelPackage);
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
	 * @generated
	 */
	public void setImportedVocabularyModelPackage(PackageRef newImportedVocabularyModelPackage) {
		if (newImportedVocabularyModelPackage != importedVocabularyModelPackage) {
			NotificationChain msgs = null;
			if (importedVocabularyModelPackage != null) {
				msgs = ((InternalEObject) importedVocabularyModelPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORTED_VOCABULARY_MODEL_PACKAGE, null, msgs);
			}
			if (newImportedVocabularyModelPackage != null) {
				msgs = ((InternalEObject) newImportedVocabularyModelPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORTED_VOCABULARY_MODEL_PACKAGE, null, msgs);
			}
			msgs = basicSetImportedVocabularyModelPackage(newImportedVocabularyModelPackage, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORTED_VOCABULARY_MODEL_PACKAGE,
				newImportedVocabularyModelPackage, newImportedVocabularyModelPackage));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactDependency> getImportStaticModelInterfacePackage() {
		if (importStaticModelInterfacePackage == null) {
			importStaticModelInterfacePackage = new EObjectContainmentEList<ArtifactDependency>(
				ArtifactDependency.class, this,
				Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORT_STATIC_MODEL_INTERFACE_PACKAGE);
		}
		return importStaticModelInterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommonModelElementDefinition> getCommonModelElementDefinition() {
		if (commonModelElementDefinition == null) {
			commonModelElementDefinition = new EObjectContainmentEList<CommonModelElementDefinition>(
				CommonModelElementDefinition.class, this,
				Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__COMMON_MODEL_ELEMENT_DEFINITION);
		}
		return commonModelElementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StubDefinition> getStubDefinition() {
		if (stubDefinition == null) {
			stubDefinition = new EObjectContainmentEList<StubDefinition>(
				StubDefinition.class, this, Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__STUB_DEFINITION);
		}
		return stubDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				return basicSetImportedVocabularyModelPackage(null, msgs);
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORT_STATIC_MODEL_INTERFACE_PACKAGE:
				return ((InternalEList<?>) getImportStaticModelInterfacePackage()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__COMMON_MODEL_ELEMENT_DEFINITION:
				return ((InternalEList<?>) getCommonModelElementDefinition()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__STUB_DEFINITION:
				return ((InternalEList<?>) getStubDefinition()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				return getImportedVocabularyModelPackage();
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORT_STATIC_MODEL_INTERFACE_PACKAGE:
				return getImportStaticModelInterfacePackage();
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__COMMON_MODEL_ELEMENT_DEFINITION:
				return getCommonModelElementDefinition();
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__STUB_DEFINITION:
				return getStubDefinition();
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
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				setImportedVocabularyModelPackage((PackageRef) newValue);
				return;
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORT_STATIC_MODEL_INTERFACE_PACKAGE:
				getImportStaticModelInterfacePackage().clear();
				getImportStaticModelInterfacePackage().addAll((Collection<? extends ArtifactDependency>) newValue);
				return;
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__COMMON_MODEL_ELEMENT_DEFINITION:
				getCommonModelElementDefinition().clear();
				getCommonModelElementDefinition().addAll((Collection<? extends CommonModelElementDefinition>) newValue);
				return;
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__STUB_DEFINITION:
				getStubDefinition().clear();
				getStubDefinition().addAll((Collection<? extends StubDefinition>) newValue);
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
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				setImportedVocabularyModelPackage((PackageRef) null);
				return;
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORT_STATIC_MODEL_INTERFACE_PACKAGE:
				getImportStaticModelInterfacePackage().clear();
				return;
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__COMMON_MODEL_ELEMENT_DEFINITION:
				getCommonModelElementDefinition().clear();
				return;
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__STUB_DEFINITION:
				getStubDefinition().clear();
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
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				return importedVocabularyModelPackage != null;
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__IMPORT_STATIC_MODEL_INTERFACE_PACKAGE:
				return importStaticModelInterfacePackage != null && !importStaticModelInterfacePackage.isEmpty();
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__COMMON_MODEL_ELEMENT_DEFINITION:
				return commonModelElementDefinition != null && !commonModelElementDefinition.isEmpty();
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE__STUB_DEFINITION:
				return stubDefinition != null && !stubDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StaticModelInterfacePackageImpl
