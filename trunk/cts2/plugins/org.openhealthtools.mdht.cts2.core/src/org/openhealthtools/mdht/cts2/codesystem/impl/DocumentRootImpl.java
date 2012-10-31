/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystem.impl;

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
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryList;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage;
import org.openhealthtools.mdht.cts2.codesystem.DocumentRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.DocumentRootImpl#getCodeSystemCatalogEntry <em>Code System Catalog Entry</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.DocumentRootImpl#getCodeSystemCatalogEntryDirectory <em>Code System Catalog Entry
 * Directory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.DocumentRootImpl#getCodeSystemCatalogEntryList <em>Code System Catalog Entry List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.DocumentRootImpl#getCodeSystemCatalogEntryMsg <em>Code System Catalog Entry Msg</em>}</li>
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
		return CodeSystemPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CodeSystemPackage.DOCUMENT_ROOT__MIXED);
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
				CodeSystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
				CodeSystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemCatalogEntry getCodeSystemCatalogEntry() {
		return (CodeSystemCatalogEntry) getMixed().get(
			CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemCatalogEntry(CodeSystemCatalogEntry newCodeSystemCatalogEntry,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY, newCodeSystemCatalogEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystemCatalogEntry(CodeSystemCatalogEntry newCodeSystemCatalogEntry) {
		((FeatureMap.Internal) getMixed()).set(
			CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY, newCodeSystemCatalogEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemCatalogEntryDirectory getCodeSystemCatalogEntryDirectory() {
		return (CodeSystemCatalogEntryDirectory) getMixed().get(
			CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemCatalogEntryDirectory(
			CodeSystemCatalogEntryDirectory newCodeSystemCatalogEntryDirectory, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY,
			newCodeSystemCatalogEntryDirectory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystemCatalogEntryDirectory(CodeSystemCatalogEntryDirectory newCodeSystemCatalogEntryDirectory) {
		((FeatureMap.Internal) getMixed()).set(
			CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY,
			newCodeSystemCatalogEntryDirectory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemCatalogEntryList getCodeSystemCatalogEntryList() {
		return (CodeSystemCatalogEntryList) getMixed().get(
			CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemCatalogEntryList(
			CodeSystemCatalogEntryList newCodeSystemCatalogEntryList, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_LIST, newCodeSystemCatalogEntryList,
			msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystemCatalogEntryList(CodeSystemCatalogEntryList newCodeSystemCatalogEntryList) {
		((FeatureMap.Internal) getMixed()).set(
			CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_LIST, newCodeSystemCatalogEntryList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemCatalogEntryMsg getCodeSystemCatalogEntryMsg() {
		return (CodeSystemCatalogEntryMsg) getMixed().get(
			CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemCatalogEntryMsg(CodeSystemCatalogEntryMsg newCodeSystemCatalogEntryMsg,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_MSG, newCodeSystemCatalogEntryMsg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystemCatalogEntryMsg(CodeSystemCatalogEntryMsg newCodeSystemCatalogEntryMsg) {
		((FeatureMap.Internal) getMixed()).set(
			CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_MSG, newCodeSystemCatalogEntryMsg);
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
			case CodeSystemPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
			case CodeSystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>) getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CodeSystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>) getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY:
				return basicSetCodeSystemCatalogEntry(null, msgs);
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY:
				return basicSetCodeSystemCatalogEntryDirectory(null, msgs);
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_LIST:
				return basicSetCodeSystemCatalogEntryList(null, msgs);
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_MSG:
				return basicSetCodeSystemCatalogEntryMsg(null, msgs);
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
			case CodeSystemPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) {
					return getMixed();
				}
				return ((FeatureMap.Internal) getMixed()).getWrapper();
			case CodeSystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) {
					return getXMLNSPrefixMap();
				} else {
					return getXMLNSPrefixMap().map();
				}
			case CodeSystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) {
					return getXSISchemaLocation();
				} else {
					return getXSISchemaLocation().map();
				}
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY:
				return getCodeSystemCatalogEntry();
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY:
				return getCodeSystemCatalogEntryDirectory();
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_LIST:
				return getCodeSystemCatalogEntryList();
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_MSG:
				return getCodeSystemCatalogEntryMsg();
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
			case CodeSystemPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
				return;
			case CodeSystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting) getXMLNSPrefixMap()).set(newValue);
				return;
			case CodeSystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting) getXSISchemaLocation()).set(newValue);
				return;
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY:
				setCodeSystemCatalogEntry((CodeSystemCatalogEntry) newValue);
				return;
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY:
				setCodeSystemCatalogEntryDirectory((CodeSystemCatalogEntryDirectory) newValue);
				return;
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_LIST:
				setCodeSystemCatalogEntryList((CodeSystemCatalogEntryList) newValue);
				return;
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_MSG:
				setCodeSystemCatalogEntryMsg((CodeSystemCatalogEntryMsg) newValue);
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
			case CodeSystemPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CodeSystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CodeSystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY:
				setCodeSystemCatalogEntry((CodeSystemCatalogEntry) null);
				return;
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY:
				setCodeSystemCatalogEntryDirectory((CodeSystemCatalogEntryDirectory) null);
				return;
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_LIST:
				setCodeSystemCatalogEntryList((CodeSystemCatalogEntryList) null);
				return;
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_MSG:
				setCodeSystemCatalogEntryMsg((CodeSystemCatalogEntryMsg) null);
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
			case CodeSystemPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CodeSystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CodeSystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY:
				return getCodeSystemCatalogEntry() != null;
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY:
				return getCodeSystemCatalogEntryDirectory() != null;
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_LIST:
				return getCodeSystemCatalogEntryList() != null;
			case CodeSystemPackage.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_MSG:
				return getCodeSystemCatalogEntryMsg() != null;
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
