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
package org.openhealthtools.mdht.cts2.codesystemversion.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryList;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;
import org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.DocumentRootImpl#getCodeSystemVersionCatalogEntry <em>Code System Version Catalog
 * Entry</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.DocumentRootImpl#getCodeSystemVersionCatalogEntryDirectory <em>Code System Version
 * Catalog Entry Directory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.DocumentRootImpl#getCodeSystemVersionCatalogEntryList <em>Code System Version
 * Catalog Entry List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.DocumentRootImpl#getCodeSystemVersionCatalogEntryMsg <em>Code System Version
 * Catalog Entry Msg</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DocumentRootImpl() {
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
		return CodeSystemVersionPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CodeSystemVersionPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String, String>(
				EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this,
				CodeSystemVersionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String, String>(
				EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this,
				CodeSystemVersionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionCatalogEntry getCodeSystemVersionCatalogEntry() {
		return (CodeSystemVersionCatalogEntry) getMixed().get(
			CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemVersionCatalogEntry(
			CodeSystemVersionCatalogEntry newCodeSystemVersionCatalogEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY,
			newCodeSystemVersionCatalogEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystemVersionCatalogEntry(CodeSystemVersionCatalogEntry newCodeSystemVersionCatalogEntry) {
		((FeatureMap.Internal) getMixed()).set(
			CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY,
			newCodeSystemVersionCatalogEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionCatalogEntryDirectory getCodeSystemVersionCatalogEntryDirectory() {
		return (CodeSystemVersionCatalogEntryDirectory) getMixed().get(
			CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemVersionCatalogEntryDirectory(
			CodeSystemVersionCatalogEntryDirectory newCodeSystemVersionCatalogEntryDirectory, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY,
			newCodeSystemVersionCatalogEntryDirectory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystemVersionCatalogEntryDirectory(
			CodeSystemVersionCatalogEntryDirectory newCodeSystemVersionCatalogEntryDirectory) {
		((FeatureMap.Internal) getMixed()).set(
			CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY,
			newCodeSystemVersionCatalogEntryDirectory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionCatalogEntryList getCodeSystemVersionCatalogEntryList() {
		return (CodeSystemVersionCatalogEntryList) getMixed().get(
			CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemVersionCatalogEntryList(
			CodeSystemVersionCatalogEntryList newCodeSystemVersionCatalogEntryList, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST,
			newCodeSystemVersionCatalogEntryList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystemVersionCatalogEntryList(
			CodeSystemVersionCatalogEntryList newCodeSystemVersionCatalogEntryList) {
		((FeatureMap.Internal) getMixed()).set(
			CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST,
			newCodeSystemVersionCatalogEntryList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionCatalogEntryMsg getCodeSystemVersionCatalogEntryMsg() {
		return (CodeSystemVersionCatalogEntryMsg) getMixed().get(
			CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemVersionCatalogEntryMsg(
			CodeSystemVersionCatalogEntryMsg newCodeSystemVersionCatalogEntryMsg, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG,
			newCodeSystemVersionCatalogEntryMsg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystemVersionCatalogEntryMsg(CodeSystemVersionCatalogEntryMsg newCodeSystemVersionCatalogEntryMsg) {
		((FeatureMap.Internal) getMixed()).set(
			CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG,
			newCodeSystemVersionCatalogEntryMsg);
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
			case CodeSystemVersionPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
			case CodeSystemVersionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>) getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CodeSystemVersionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>) getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY:
				return basicSetCodeSystemVersionCatalogEntry(null, msgs);
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY:
				return basicSetCodeSystemVersionCatalogEntryDirectory(null, msgs);
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST:
				return basicSetCodeSystemVersionCatalogEntryList(null, msgs);
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG:
				return basicSetCodeSystemVersionCatalogEntryMsg(null, msgs);
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
			case CodeSystemVersionPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) {
					return getMixed();
				}
				return ((FeatureMap.Internal) getMixed()).getWrapper();
			case CodeSystemVersionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) {
					return getXMLNSPrefixMap();
				} else {
					return getXMLNSPrefixMap().map();
				}
			case CodeSystemVersionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) {
					return getXSISchemaLocation();
				} else {
					return getXSISchemaLocation().map();
				}
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY:
				return getCodeSystemVersionCatalogEntry();
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY:
				return getCodeSystemVersionCatalogEntryDirectory();
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST:
				return getCodeSystemVersionCatalogEntryList();
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG:
				return getCodeSystemVersionCatalogEntryMsg();
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
			case CodeSystemVersionPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
				return;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting) getXMLNSPrefixMap()).set(newValue);
				return;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting) getXSISchemaLocation()).set(newValue);
				return;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY:
				setCodeSystemVersionCatalogEntry((CodeSystemVersionCatalogEntry) newValue);
				return;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY:
				setCodeSystemVersionCatalogEntryDirectory((CodeSystemVersionCatalogEntryDirectory) newValue);
				return;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST:
				setCodeSystemVersionCatalogEntryList((CodeSystemVersionCatalogEntryList) newValue);
				return;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG:
				setCodeSystemVersionCatalogEntryMsg((CodeSystemVersionCatalogEntryMsg) newValue);
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
			case CodeSystemVersionPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY:
				setCodeSystemVersionCatalogEntry((CodeSystemVersionCatalogEntry) null);
				return;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY:
				setCodeSystemVersionCatalogEntryDirectory((CodeSystemVersionCatalogEntryDirectory) null);
				return;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST:
				setCodeSystemVersionCatalogEntryList((CodeSystemVersionCatalogEntryList) null);
				return;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG:
				setCodeSystemVersionCatalogEntryMsg((CodeSystemVersionCatalogEntryMsg) null);
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
			case CodeSystemVersionPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CodeSystemVersionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CodeSystemVersionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY:
				return getCodeSystemVersionCatalogEntry() != null;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY:
				return getCodeSystemVersionCatalogEntryDirectory() != null;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST:
				return getCodeSystemVersionCatalogEntryList() != null;
			case CodeSystemVersionPackage.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG:
				return getCodeSystemVersionCatalogEntryMsg() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} // DocumentRootImpl
