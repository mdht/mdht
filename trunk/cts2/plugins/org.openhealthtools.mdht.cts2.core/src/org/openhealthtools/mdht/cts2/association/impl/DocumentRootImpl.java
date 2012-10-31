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
package org.openhealthtools.mdht.cts2.association.impl;

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
import org.openhealthtools.mdht.cts2.association.Association;
import org.openhealthtools.mdht.cts2.association.AssociationDirectory;
import org.openhealthtools.mdht.cts2.association.AssociationGraph;
import org.openhealthtools.mdht.cts2.association.AssociationList;
import org.openhealthtools.mdht.cts2.association.AssociationMsg;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;
import org.openhealthtools.mdht.cts2.association.DocumentRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.DocumentRootImpl#getAssociation <em>Association</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.DocumentRootImpl#getAssociationDirectory <em>Association Directory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.DocumentRootImpl#getAssociationGraph <em>Association Graph</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.DocumentRootImpl#getAssociationList <em>Association List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.DocumentRootImpl#getAssociationMsg <em>Association Msg</em>}</li>
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
		return AssociationPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, AssociationPackage.DOCUMENT_ROOT__MIXED);
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
				AssociationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
				AssociationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Association getAssociation() {
		return (Association) getMixed().get(AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION, newAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		((FeatureMap.Internal) getMixed()).set(AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION, newAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationDirectory getAssociationDirectory() {
		return (AssociationDirectory) getMixed().get(
			AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_DIRECTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssociationDirectory(AssociationDirectory newAssociationDirectory,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_DIRECTORY, newAssociationDirectory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssociationDirectory(AssociationDirectory newAssociationDirectory) {
		((FeatureMap.Internal) getMixed()).set(
			AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_DIRECTORY, newAssociationDirectory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationGraph getAssociationGraph() {
		return (AssociationGraph) getMixed().get(AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_GRAPH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssociationGraph(AssociationGraph newAssociationGraph, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_GRAPH, newAssociationGraph, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssociationGraph(AssociationGraph newAssociationGraph) {
		((FeatureMap.Internal) getMixed()).set(
			AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_GRAPH, newAssociationGraph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationList getAssociationList() {
		return (AssociationList) getMixed().get(AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssociationList(AssociationList newAssociationList, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_LIST, newAssociationList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssociationList(AssociationList newAssociationList) {
		((FeatureMap.Internal) getMixed()).set(
			AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_LIST, newAssociationList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationMsg getAssociationMsg() {
		return (AssociationMsg) getMixed().get(AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssociationMsg(AssociationMsg newAssociationMsg, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_MSG, newAssociationMsg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssociationMsg(AssociationMsg newAssociationMsg) {
		((FeatureMap.Internal) getMixed()).set(
			AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_MSG, newAssociationMsg);
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
			case AssociationPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
			case AssociationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>) getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case AssociationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>) getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION:
				return basicSetAssociation(null, msgs);
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_DIRECTORY:
				return basicSetAssociationDirectory(null, msgs);
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_GRAPH:
				return basicSetAssociationGraph(null, msgs);
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_LIST:
				return basicSetAssociationList(null, msgs);
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_MSG:
				return basicSetAssociationMsg(null, msgs);
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
			case AssociationPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) {
					return getMixed();
				}
				return ((FeatureMap.Internal) getMixed()).getWrapper();
			case AssociationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) {
					return getXMLNSPrefixMap();
				} else {
					return getXMLNSPrefixMap().map();
				}
			case AssociationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) {
					return getXSISchemaLocation();
				} else {
					return getXSISchemaLocation().map();
				}
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION:
				return getAssociation();
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_DIRECTORY:
				return getAssociationDirectory();
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_GRAPH:
				return getAssociationGraph();
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_LIST:
				return getAssociationList();
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_MSG:
				return getAssociationMsg();
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
			case AssociationPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
				return;
			case AssociationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting) getXMLNSPrefixMap()).set(newValue);
				return;
			case AssociationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting) getXSISchemaLocation()).set(newValue);
				return;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION:
				setAssociation((Association) newValue);
				return;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_DIRECTORY:
				setAssociationDirectory((AssociationDirectory) newValue);
				return;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_GRAPH:
				setAssociationGraph((AssociationGraph) newValue);
				return;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_LIST:
				setAssociationList((AssociationList) newValue);
				return;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_MSG:
				setAssociationMsg((AssociationMsg) newValue);
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
			case AssociationPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case AssociationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case AssociationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION:
				setAssociation((Association) null);
				return;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_DIRECTORY:
				setAssociationDirectory((AssociationDirectory) null);
				return;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_GRAPH:
				setAssociationGraph((AssociationGraph) null);
				return;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_LIST:
				setAssociationList((AssociationList) null);
				return;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_MSG:
				setAssociationMsg((AssociationMsg) null);
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
			case AssociationPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case AssociationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case AssociationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION:
				return getAssociation() != null;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_DIRECTORY:
				return getAssociationDirectory() != null;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_GRAPH:
				return getAssociationGraph() != null;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_LIST:
				return getAssociationList() != null;
			case AssociationPackage.DOCUMENT_ROOT__ASSOCIATION_MSG:
				return getAssociationMsg() != null;
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
