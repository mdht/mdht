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

import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeImport;
import org.openhealthtools.mdht.emf.hl7.mif2.ImportDatatypeModelLibrary;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Datatype Model Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImportDatatypeModelLibraryImpl#getImportedDatatype <em>Imported Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportDatatypeModelLibraryImpl extends ArtifactDependencyImpl implements ImportDatatypeModelLibrary {
	/**
	 * The cached value of the '{@link #getImportedDatatype() <em>Imported Datatype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedDatatype()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeImport> importedDatatype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportDatatypeModelLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.IMPORT_DATATYPE_MODEL_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeImport> getImportedDatatype() {
		if (importedDatatype == null) {
			importedDatatype = new EObjectContainmentEList<DatatypeImport>(
				DatatypeImport.class, this, Mif2Package.IMPORT_DATATYPE_MODEL_LIBRARY__IMPORTED_DATATYPE);
		}
		return importedDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.IMPORT_DATATYPE_MODEL_LIBRARY__IMPORTED_DATATYPE:
				return ((InternalEList<?>) getImportedDatatype()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.IMPORT_DATATYPE_MODEL_LIBRARY__IMPORTED_DATATYPE:
				return getImportedDatatype();
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
			case Mif2Package.IMPORT_DATATYPE_MODEL_LIBRARY__IMPORTED_DATATYPE:
				getImportedDatatype().clear();
				getImportedDatatype().addAll((Collection<? extends DatatypeImport>) newValue);
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
			case Mif2Package.IMPORT_DATATYPE_MODEL_LIBRARY__IMPORTED_DATATYPE:
				getImportedDatatype().clear();
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
			case Mif2Package.IMPORT_DATATYPE_MODEL_LIBRARY__IMPORTED_DATATYPE:
				return importedDatatype != null && !importedDatatype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ImportDatatypeModelLibraryImpl
