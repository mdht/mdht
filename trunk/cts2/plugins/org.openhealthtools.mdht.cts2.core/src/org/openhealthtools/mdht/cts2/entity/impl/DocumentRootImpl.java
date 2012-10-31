/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity.impl;

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
import org.openhealthtools.mdht.cts2.entity.DocumentRoot;
import org.openhealthtools.mdht.cts2.entity.EntityDescription;
import org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg;
import org.openhealthtools.mdht.cts2.entity.EntityDirectory;
import org.openhealthtools.mdht.cts2.entity.EntityList;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;
import org.openhealthtools.mdht.cts2.entity.EntityReferenceMsg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DocumentRootImpl#getEntityDescription <em>Entity Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DocumentRootImpl#getEntityDescriptionMsg <em>Entity Description Msg</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DocumentRootImpl#getEntityDirectory <em>Entity Directory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DocumentRootImpl#getEntityList <em>Entity List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DocumentRootImpl#getEntityReferenceMsg <em>Entity Reference Msg</em>}</li>
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
		return EntityPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EntityPackage.DOCUMENT_ROOT__MIXED);
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
				EntityPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
				EntityPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityDescription getEntityDescription() {
		return (EntityDescription) getMixed().get(EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEntityDescription(EntityDescription newEntityDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_DESCRIPTION, newEntityDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntityDescription(EntityDescription newEntityDescription) {
		((FeatureMap.Internal) getMixed()).set(
			EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_DESCRIPTION, newEntityDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityDescriptionMsg getEntityDescriptionMsg() {
		return (EntityDescriptionMsg) getMixed().get(EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_DESCRIPTION_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEntityDescriptionMsg(EntityDescriptionMsg newEntityDescriptionMsg,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_DESCRIPTION_MSG, newEntityDescriptionMsg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntityDescriptionMsg(EntityDescriptionMsg newEntityDescriptionMsg) {
		((FeatureMap.Internal) getMixed()).set(
			EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_DESCRIPTION_MSG, newEntityDescriptionMsg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityDirectory getEntityDirectory() {
		return (EntityDirectory) getMixed().get(EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_DIRECTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEntityDirectory(EntityDirectory newEntityDirectory, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_DIRECTORY, newEntityDirectory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntityDirectory(EntityDirectory newEntityDirectory) {
		((FeatureMap.Internal) getMixed()).set(
			EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_DIRECTORY, newEntityDirectory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityList getEntityList() {
		return (EntityList) getMixed().get(EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEntityList(EntityList newEntityList, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_LIST, newEntityList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntityList(EntityList newEntityList) {
		((FeatureMap.Internal) getMixed()).set(EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_LIST, newEntityList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityReferenceMsg getEntityReferenceMsg() {
		return (EntityReferenceMsg) getMixed().get(EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_REFERENCE_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEntityReferenceMsg(EntityReferenceMsg newEntityReferenceMsg, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_REFERENCE_MSG, newEntityReferenceMsg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntityReferenceMsg(EntityReferenceMsg newEntityReferenceMsg) {
		((FeatureMap.Internal) getMixed()).set(
			EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_REFERENCE_MSG, newEntityReferenceMsg);
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
			case EntityPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
			case EntityPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>) getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case EntityPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>) getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DESCRIPTION:
				return basicSetEntityDescription(null, msgs);
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DESCRIPTION_MSG:
				return basicSetEntityDescriptionMsg(null, msgs);
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DIRECTORY:
				return basicSetEntityDirectory(null, msgs);
			case EntityPackage.DOCUMENT_ROOT__ENTITY_LIST:
				return basicSetEntityList(null, msgs);
			case EntityPackage.DOCUMENT_ROOT__ENTITY_REFERENCE_MSG:
				return basicSetEntityReferenceMsg(null, msgs);
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
			case EntityPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) {
					return getMixed();
				}
				return ((FeatureMap.Internal) getMixed()).getWrapper();
			case EntityPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) {
					return getXMLNSPrefixMap();
				} else {
					return getXMLNSPrefixMap().map();
				}
			case EntityPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) {
					return getXSISchemaLocation();
				} else {
					return getXSISchemaLocation().map();
				}
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DESCRIPTION:
				return getEntityDescription();
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DESCRIPTION_MSG:
				return getEntityDescriptionMsg();
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DIRECTORY:
				return getEntityDirectory();
			case EntityPackage.DOCUMENT_ROOT__ENTITY_LIST:
				return getEntityList();
			case EntityPackage.DOCUMENT_ROOT__ENTITY_REFERENCE_MSG:
				return getEntityReferenceMsg();
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
			case EntityPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
				return;
			case EntityPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting) getXMLNSPrefixMap()).set(newValue);
				return;
			case EntityPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting) getXSISchemaLocation()).set(newValue);
				return;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DESCRIPTION:
				setEntityDescription((EntityDescription) newValue);
				return;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DESCRIPTION_MSG:
				setEntityDescriptionMsg((EntityDescriptionMsg) newValue);
				return;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DIRECTORY:
				setEntityDirectory((EntityDirectory) newValue);
				return;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_LIST:
				setEntityList((EntityList) newValue);
				return;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_REFERENCE_MSG:
				setEntityReferenceMsg((EntityReferenceMsg) newValue);
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
			case EntityPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case EntityPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case EntityPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DESCRIPTION:
				setEntityDescription((EntityDescription) null);
				return;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DESCRIPTION_MSG:
				setEntityDescriptionMsg((EntityDescriptionMsg) null);
				return;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DIRECTORY:
				setEntityDirectory((EntityDirectory) null);
				return;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_LIST:
				setEntityList((EntityList) null);
				return;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_REFERENCE_MSG:
				setEntityReferenceMsg((EntityReferenceMsg) null);
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
			case EntityPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EntityPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case EntityPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DESCRIPTION:
				return getEntityDescription() != null;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DESCRIPTION_MSG:
				return getEntityDescriptionMsg() != null;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_DIRECTORY:
				return getEntityDirectory() != null;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_LIST:
				return getEntityList() != null;
			case EntityPackage.DOCUMENT_ROOT__ENTITY_REFERENCE_MSG:
				return getEntityReferenceMsg() != null;
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
