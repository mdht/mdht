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
package org.openhealthtools.mdht.cts2.valueset.impl;

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
import org.openhealthtools.mdht.cts2.valueset.DocumentRoot;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryList;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.valueset.ValueSetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.impl.DocumentRootImpl#getValueSetCatalogEntry <em>Value Set Catalog Entry</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.impl.DocumentRootImpl#getValueSetCatalogEntryDirectory <em>Value Set Catalog Entry Directory
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.impl.DocumentRootImpl#getValueSetCatalogEntryList <em>Value Set Catalog Entry List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.impl.DocumentRootImpl#getValueSetCatalogEntryMsg <em>Value Set Catalog Entry Msg</em>}</li>
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
		return ValueSetPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ValueSetPackage.DOCUMENT_ROOT__MIXED);
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
				ValueSetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
				ValueSetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetCatalogEntry getValueSetCatalogEntry() {
		return (ValueSetCatalogEntry) getMixed().get(
			ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSetCatalogEntry(ValueSetCatalogEntry newValueSetCatalogEntry,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY, newValueSetCatalogEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSetCatalogEntry(ValueSetCatalogEntry newValueSetCatalogEntry) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY, newValueSetCatalogEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetCatalogEntryDirectory getValueSetCatalogEntryDirectory() {
		return (ValueSetCatalogEntryDirectory) getMixed().get(
			ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_DIRECTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSetCatalogEntryDirectory(
			ValueSetCatalogEntryDirectory newValueSetCatalogEntryDirectory, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_DIRECTORY,
			newValueSetCatalogEntryDirectory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSetCatalogEntryDirectory(ValueSetCatalogEntryDirectory newValueSetCatalogEntryDirectory) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_DIRECTORY, newValueSetCatalogEntryDirectory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetCatalogEntryList getValueSetCatalogEntryList() {
		return (ValueSetCatalogEntryList) getMixed().get(
			ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSetCatalogEntryList(ValueSetCatalogEntryList newValueSetCatalogEntryList,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_LIST, newValueSetCatalogEntryList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSetCatalogEntryList(ValueSetCatalogEntryList newValueSetCatalogEntryList) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_LIST, newValueSetCatalogEntryList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetCatalogEntryMsg getValueSetCatalogEntryMsg() {
		return (ValueSetCatalogEntryMsg) getMixed().get(
			ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSetCatalogEntryMsg(ValueSetCatalogEntryMsg newValueSetCatalogEntryMsg,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_MSG, newValueSetCatalogEntryMsg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSetCatalogEntryMsg(ValueSetCatalogEntryMsg newValueSetCatalogEntryMsg) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_MSG, newValueSetCatalogEntryMsg);
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
			case ValueSetPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
			case ValueSetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>) getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ValueSetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>) getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY:
				return basicSetValueSetCatalogEntry(null, msgs);
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_DIRECTORY:
				return basicSetValueSetCatalogEntryDirectory(null, msgs);
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_LIST:
				return basicSetValueSetCatalogEntryList(null, msgs);
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_MSG:
				return basicSetValueSetCatalogEntryMsg(null, msgs);
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
			case ValueSetPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) {
					return getMixed();
				}
				return ((FeatureMap.Internal) getMixed()).getWrapper();
			case ValueSetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) {
					return getXMLNSPrefixMap();
				} else {
					return getXMLNSPrefixMap().map();
				}
			case ValueSetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) {
					return getXSISchemaLocation();
				} else {
					return getXSISchemaLocation().map();
				}
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY:
				return getValueSetCatalogEntry();
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_DIRECTORY:
				return getValueSetCatalogEntryDirectory();
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_LIST:
				return getValueSetCatalogEntryList();
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_MSG:
				return getValueSetCatalogEntryMsg();
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
			case ValueSetPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
				return;
			case ValueSetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting) getXMLNSPrefixMap()).set(newValue);
				return;
			case ValueSetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting) getXSISchemaLocation()).set(newValue);
				return;
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY:
				setValueSetCatalogEntry((ValueSetCatalogEntry) newValue);
				return;
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_DIRECTORY:
				setValueSetCatalogEntryDirectory((ValueSetCatalogEntryDirectory) newValue);
				return;
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_LIST:
				setValueSetCatalogEntryList((ValueSetCatalogEntryList) newValue);
				return;
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_MSG:
				setValueSetCatalogEntryMsg((ValueSetCatalogEntryMsg) newValue);
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
			case ValueSetPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ValueSetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ValueSetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY:
				setValueSetCatalogEntry((ValueSetCatalogEntry) null);
				return;
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_DIRECTORY:
				setValueSetCatalogEntryDirectory((ValueSetCatalogEntryDirectory) null);
				return;
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_LIST:
				setValueSetCatalogEntryList((ValueSetCatalogEntryList) null);
				return;
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_MSG:
				setValueSetCatalogEntryMsg((ValueSetCatalogEntryMsg) null);
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
			case ValueSetPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ValueSetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ValueSetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY:
				return getValueSetCatalogEntry() != null;
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_DIRECTORY:
				return getValueSetCatalogEntryDirectory() != null;
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_LIST:
				return getValueSetCatalogEntryList() != null;
			case ValueSetPackage.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_MSG:
				return getValueSetCatalogEntryMsg() != null;
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
