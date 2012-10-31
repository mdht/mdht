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
package org.openhealthtools.mdht.cts2.valuesetdefinition.impl;

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
import org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot;
import org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl#getIteratableResolvedValueSet <em>Iteratable Resolved Value Set
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl#getResolvedValueSet <em>Resolved Value Set</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl#getResolvedValueSetDirectory <em>Resolved Value Set Directory
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl#getResolvedValueSetMsg <em>Resolved Value Set Msg</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl#getResolvedValueSetSummary <em>Resolved Value Set Summary</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl#getValueSetDefinition <em>Value Set Definition</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl#getValueSetDefinitionDirectory <em>Value Set Definition Directory
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl#getValueSetDefinitionEntry <em>Value Set Definition Entry</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl#getValueSetDefinitionList <em>Value Set Definition List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.DocumentRootImpl#getValueSetDefinitionMsg <em>Value Set Definition Msg</em>}</li>
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
		return ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ValueSetDefinitionPackage.DOCUMENT_ROOT__MIXED);
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
				ValueSetDefinitionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
				ValueSetDefinitionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IteratableResolvedValueSet getIteratableResolvedValueSet() {
		return (IteratableResolvedValueSet) getMixed().get(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetIteratableResolvedValueSet(
			IteratableResolvedValueSet newIteratableResolvedValueSet, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET,
			newIteratableResolvedValueSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIteratableResolvedValueSet(IteratableResolvedValueSet newIteratableResolvedValueSet) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET,
			newIteratableResolvedValueSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSet getResolvedValueSet() {
		return (ResolvedValueSet) getMixed().get(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResolvedValueSet(ResolvedValueSet newResolvedValueSet, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET, newResolvedValueSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolvedValueSet(ResolvedValueSet newResolvedValueSet) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET, newResolvedValueSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSetDirectory getResolvedValueSetDirectory() {
		return (ResolvedValueSetDirectory) getMixed().get(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResolvedValueSetDirectory(ResolvedValueSetDirectory newResolvedValueSetDirectory,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY,
			newResolvedValueSetDirectory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolvedValueSetDirectory(ResolvedValueSetDirectory newResolvedValueSetDirectory) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY,
			newResolvedValueSetDirectory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSetMsg getResolvedValueSetMsg() {
		return (ResolvedValueSetMsg) getMixed().get(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResolvedValueSetMsg(ResolvedValueSetMsg newResolvedValueSetMsg,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG, newResolvedValueSetMsg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolvedValueSetMsg(ResolvedValueSetMsg newResolvedValueSetMsg) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG, newResolvedValueSetMsg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSetSummary getResolvedValueSetSummary() {
		return (ResolvedValueSetSummary) getMixed().get(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResolvedValueSetSummary(ResolvedValueSetSummary newResolvedValueSetSummary,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY, newResolvedValueSetSummary,
			msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolvedValueSetSummary(ResolvedValueSetSummary newResolvedValueSetSummary) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY, newResolvedValueSetSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinition getValueSetDefinition() {
		return (ValueSetDefinition) getMixed().get(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSetDefinition(ValueSetDefinition newValueSetDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION, newValueSetDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSetDefinition(ValueSetDefinition newValueSetDefinition) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION, newValueSetDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionDirectory getValueSetDefinitionDirectory() {
		return (ValueSetDefinitionDirectory) getMixed().get(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSetDefinitionDirectory(
			ValueSetDefinitionDirectory newValueSetDefinitionDirectory, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY,
			newValueSetDefinitionDirectory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSetDefinitionDirectory(ValueSetDefinitionDirectory newValueSetDefinitionDirectory) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY,
			newValueSetDefinitionDirectory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionEntry getValueSetDefinitionEntry() {
		return (ValueSetDefinitionEntry) getMixed().get(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSetDefinitionEntry(ValueSetDefinitionEntry newValueSetDefinitionEntry,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY, newValueSetDefinitionEntry,
			msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSetDefinitionEntry(ValueSetDefinitionEntry newValueSetDefinitionEntry) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY, newValueSetDefinitionEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionList getValueSetDefinitionList() {
		return (ValueSetDefinitionList) getMixed().get(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSetDefinitionList(ValueSetDefinitionList newValueSetDefinitionList,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST, newValueSetDefinitionList,
			msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSetDefinitionList(ValueSetDefinitionList newValueSetDefinitionList) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST, newValueSetDefinitionList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionMsg getValueSetDefinitionMsg() {
		return (ValueSetDefinitionMsg) getMixed().get(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSetDefinitionMsg(ValueSetDefinitionMsg newValueSetDefinitionMsg,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG, newValueSetDefinitionMsg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSetDefinitionMsg(ValueSetDefinitionMsg newValueSetDefinitionMsg) {
		((FeatureMap.Internal) getMixed()).set(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG, newValueSetDefinitionMsg);
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
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>) getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>) getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET:
				return basicSetIteratableResolvedValueSet(null, msgs);
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET:
				return basicSetResolvedValueSet(null, msgs);
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY:
				return basicSetResolvedValueSetDirectory(null, msgs);
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG:
				return basicSetResolvedValueSetMsg(null, msgs);
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY:
				return basicSetResolvedValueSetSummary(null, msgs);
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION:
				return basicSetValueSetDefinition(null, msgs);
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY:
				return basicSetValueSetDefinitionDirectory(null, msgs);
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY:
				return basicSetValueSetDefinitionEntry(null, msgs);
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST:
				return basicSetValueSetDefinitionList(null, msgs);
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG:
				return basicSetValueSetDefinitionMsg(null, msgs);
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
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) {
					return getMixed();
				}
				return ((FeatureMap.Internal) getMixed()).getWrapper();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) {
					return getXMLNSPrefixMap();
				} else {
					return getXMLNSPrefixMap().map();
				}
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) {
					return getXSISchemaLocation();
				} else {
					return getXSISchemaLocation().map();
				}
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET:
				return getIteratableResolvedValueSet();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET:
				return getResolvedValueSet();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY:
				return getResolvedValueSetDirectory();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG:
				return getResolvedValueSetMsg();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY:
				return getResolvedValueSetSummary();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION:
				return getValueSetDefinition();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY:
				return getValueSetDefinitionDirectory();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY:
				return getValueSetDefinitionEntry();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST:
				return getValueSetDefinitionList();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG:
				return getValueSetDefinitionMsg();
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
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting) getXMLNSPrefixMap()).set(newValue);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting) getXSISchemaLocation()).set(newValue);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET:
				setIteratableResolvedValueSet((IteratableResolvedValueSet) newValue);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET:
				setResolvedValueSet((ResolvedValueSet) newValue);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY:
				setResolvedValueSetDirectory((ResolvedValueSetDirectory) newValue);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG:
				setResolvedValueSetMsg((ResolvedValueSetMsg) newValue);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY:
				setResolvedValueSetSummary((ResolvedValueSetSummary) newValue);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION:
				setValueSetDefinition((ValueSetDefinition) newValue);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY:
				setValueSetDefinitionDirectory((ValueSetDefinitionDirectory) newValue);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY:
				setValueSetDefinitionEntry((ValueSetDefinitionEntry) newValue);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST:
				setValueSetDefinitionList((ValueSetDefinitionList) newValue);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG:
				setValueSetDefinitionMsg((ValueSetDefinitionMsg) newValue);
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
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET:
				setIteratableResolvedValueSet((IteratableResolvedValueSet) null);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET:
				setResolvedValueSet((ResolvedValueSet) null);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY:
				setResolvedValueSetDirectory((ResolvedValueSetDirectory) null);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG:
				setResolvedValueSetMsg((ResolvedValueSetMsg) null);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY:
				setResolvedValueSetSummary((ResolvedValueSetSummary) null);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION:
				setValueSetDefinition((ValueSetDefinition) null);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY:
				setValueSetDefinitionDirectory((ValueSetDefinitionDirectory) null);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY:
				setValueSetDefinitionEntry((ValueSetDefinitionEntry) null);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST:
				setValueSetDefinitionList((ValueSetDefinitionList) null);
				return;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG:
				setValueSetDefinitionMsg((ValueSetDefinitionMsg) null);
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
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET:
				return getIteratableResolvedValueSet() != null;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET:
				return getResolvedValueSet() != null;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY:
				return getResolvedValueSetDirectory() != null;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG:
				return getResolvedValueSetMsg() != null;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY:
				return getResolvedValueSetSummary() != null;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION:
				return getValueSetDefinition() != null;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY:
				return getValueSetDefinitionDirectory() != null;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY:
				return getValueSetDefinitionEntry() != null;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST:
				return getValueSetDefinitionList() != null;
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG:
				return getValueSetDefinitionMsg() != null;
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
