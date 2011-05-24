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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent;
import org.openhealthtools.mdht.emf.hl7.mif2.AttributeContent;
import org.openhealthtools.mdht.emf.hl7.mif2.AttributeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.ElementChange;
import org.openhealthtools.mdht.emf.hl7.mif2.ElementRef;
import org.openhealthtools.mdht.emf.hl7.mif2.GroupChange;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.ReplaceElementContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementChangeImpl#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementChangeImpl#getAddAttribute <em>Add Attribute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementChangeImpl#getAddElement <em>Add Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementChangeImpl#getRemoveAttribute <em>Remove Attribute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementChangeImpl#getReplaceAttribute <em>Replace Attribute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementChangeImpl#getRemoveElement <em>Remove Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementChangeImpl#getReplaceElement <em>Replace Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementChangeImpl#getChangeElement <em>Change Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementChangeImpl#getChangeGroup <em>Change Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementChangeImpl extends ElementRefImpl implements ElementChange {
	/**
	 * The cached value of the '{@link #getChangeItems() <em>Change Items</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeItems()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap changeItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ELEMENT_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeItems() {
		if (changeItems == null) {
			changeItems = new BasicFeatureMap(this, Mif2Package.ELEMENT_CHANGE__CHANGE_ITEMS);
		}
		return changeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeContent> getAddAttribute() {
		return getChangeItems().list(Mif2Package.Literals.ELEMENT_CHANGE__ADD_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddElementContent> getAddElement() {
		return getChangeItems().list(Mif2Package.Literals.ELEMENT_CHANGE__ADD_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeRef> getRemoveAttribute() {
		return getChangeItems().list(Mif2Package.Literals.ELEMENT_CHANGE__REMOVE_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeContent> getReplaceAttribute() {
		return getChangeItems().list(Mif2Package.Literals.ELEMENT_CHANGE__REPLACE_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementRef> getRemoveElement() {
		return getChangeItems().list(Mif2Package.Literals.ELEMENT_CHANGE__REMOVE_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReplaceElementContent> getReplaceElement() {
		return getChangeItems().list(Mif2Package.Literals.ELEMENT_CHANGE__REPLACE_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementChange> getChangeElement() {
		return getChangeItems().list(Mif2Package.Literals.ELEMENT_CHANGE__CHANGE_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupChange> getChangeGroup() {
		return getChangeItems().list(Mif2Package.Literals.ELEMENT_CHANGE__CHANGE_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.ELEMENT_CHANGE__CHANGE_ITEMS:
				return ((InternalEList<?>) getChangeItems()).basicRemove(otherEnd, msgs);
			case Mif2Package.ELEMENT_CHANGE__ADD_ATTRIBUTE:
				return ((InternalEList<?>) getAddAttribute()).basicRemove(otherEnd, msgs);
			case Mif2Package.ELEMENT_CHANGE__ADD_ELEMENT:
				return ((InternalEList<?>) getAddElement()).basicRemove(otherEnd, msgs);
			case Mif2Package.ELEMENT_CHANGE__REMOVE_ATTRIBUTE:
				return ((InternalEList<?>) getRemoveAttribute()).basicRemove(otherEnd, msgs);
			case Mif2Package.ELEMENT_CHANGE__REPLACE_ATTRIBUTE:
				return ((InternalEList<?>) getReplaceAttribute()).basicRemove(otherEnd, msgs);
			case Mif2Package.ELEMENT_CHANGE__REMOVE_ELEMENT:
				return ((InternalEList<?>) getRemoveElement()).basicRemove(otherEnd, msgs);
			case Mif2Package.ELEMENT_CHANGE__REPLACE_ELEMENT:
				return ((InternalEList<?>) getReplaceElement()).basicRemove(otherEnd, msgs);
			case Mif2Package.ELEMENT_CHANGE__CHANGE_ELEMENT:
				return ((InternalEList<?>) getChangeElement()).basicRemove(otherEnd, msgs);
			case Mif2Package.ELEMENT_CHANGE__CHANGE_GROUP:
				return ((InternalEList<?>) getChangeGroup()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.ELEMENT_CHANGE__CHANGE_ITEMS:
				if (coreType) {
					return getChangeItems();
				}
				return ((FeatureMap.Internal) getChangeItems()).getWrapper();
			case Mif2Package.ELEMENT_CHANGE__ADD_ATTRIBUTE:
				return getAddAttribute();
			case Mif2Package.ELEMENT_CHANGE__ADD_ELEMENT:
				return getAddElement();
			case Mif2Package.ELEMENT_CHANGE__REMOVE_ATTRIBUTE:
				return getRemoveAttribute();
			case Mif2Package.ELEMENT_CHANGE__REPLACE_ATTRIBUTE:
				return getReplaceAttribute();
			case Mif2Package.ELEMENT_CHANGE__REMOVE_ELEMENT:
				return getRemoveElement();
			case Mif2Package.ELEMENT_CHANGE__REPLACE_ELEMENT:
				return getReplaceElement();
			case Mif2Package.ELEMENT_CHANGE__CHANGE_ELEMENT:
				return getChangeElement();
			case Mif2Package.ELEMENT_CHANGE__CHANGE_GROUP:
				return getChangeGroup();
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
			case Mif2Package.ELEMENT_CHANGE__CHANGE_ITEMS:
				((FeatureMap.Internal) getChangeItems()).set(newValue);
				return;
			case Mif2Package.ELEMENT_CHANGE__ADD_ATTRIBUTE:
				getAddAttribute().clear();
				getAddAttribute().addAll((Collection<? extends AttributeContent>) newValue);
				return;
			case Mif2Package.ELEMENT_CHANGE__ADD_ELEMENT:
				getAddElement().clear();
				getAddElement().addAll((Collection<? extends AddElementContent>) newValue);
				return;
			case Mif2Package.ELEMENT_CHANGE__REMOVE_ATTRIBUTE:
				getRemoveAttribute().clear();
				getRemoveAttribute().addAll((Collection<? extends AttributeRef>) newValue);
				return;
			case Mif2Package.ELEMENT_CHANGE__REPLACE_ATTRIBUTE:
				getReplaceAttribute().clear();
				getReplaceAttribute().addAll((Collection<? extends AttributeContent>) newValue);
				return;
			case Mif2Package.ELEMENT_CHANGE__REMOVE_ELEMENT:
				getRemoveElement().clear();
				getRemoveElement().addAll((Collection<? extends ElementRef>) newValue);
				return;
			case Mif2Package.ELEMENT_CHANGE__REPLACE_ELEMENT:
				getReplaceElement().clear();
				getReplaceElement().addAll((Collection<? extends ReplaceElementContent>) newValue);
				return;
			case Mif2Package.ELEMENT_CHANGE__CHANGE_ELEMENT:
				getChangeElement().clear();
				getChangeElement().addAll((Collection<? extends ElementChange>) newValue);
				return;
			case Mif2Package.ELEMENT_CHANGE__CHANGE_GROUP:
				getChangeGroup().clear();
				getChangeGroup().addAll((Collection<? extends GroupChange>) newValue);
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
			case Mif2Package.ELEMENT_CHANGE__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case Mif2Package.ELEMENT_CHANGE__ADD_ATTRIBUTE:
				getAddAttribute().clear();
				return;
			case Mif2Package.ELEMENT_CHANGE__ADD_ELEMENT:
				getAddElement().clear();
				return;
			case Mif2Package.ELEMENT_CHANGE__REMOVE_ATTRIBUTE:
				getRemoveAttribute().clear();
				return;
			case Mif2Package.ELEMENT_CHANGE__REPLACE_ATTRIBUTE:
				getReplaceAttribute().clear();
				return;
			case Mif2Package.ELEMENT_CHANGE__REMOVE_ELEMENT:
				getRemoveElement().clear();
				return;
			case Mif2Package.ELEMENT_CHANGE__REPLACE_ELEMENT:
				getReplaceElement().clear();
				return;
			case Mif2Package.ELEMENT_CHANGE__CHANGE_ELEMENT:
				getChangeElement().clear();
				return;
			case Mif2Package.ELEMENT_CHANGE__CHANGE_GROUP:
				getChangeGroup().clear();
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
			case Mif2Package.ELEMENT_CHANGE__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case Mif2Package.ELEMENT_CHANGE__ADD_ATTRIBUTE:
				return !getAddAttribute().isEmpty();
			case Mif2Package.ELEMENT_CHANGE__ADD_ELEMENT:
				return !getAddElement().isEmpty();
			case Mif2Package.ELEMENT_CHANGE__REMOVE_ATTRIBUTE:
				return !getRemoveAttribute().isEmpty();
			case Mif2Package.ELEMENT_CHANGE__REPLACE_ATTRIBUTE:
				return !getReplaceAttribute().isEmpty();
			case Mif2Package.ELEMENT_CHANGE__REMOVE_ELEMENT:
				return !getRemoveElement().isEmpty();
			case Mif2Package.ELEMENT_CHANGE__REPLACE_ELEMENT:
				return !getReplaceElement().isEmpty();
			case Mif2Package.ELEMENT_CHANGE__CHANGE_ELEMENT:
				return !getChangeElement().isEmpty();
			case Mif2Package.ELEMENT_CHANGE__CHANGE_GROUP:
				return !getChangeGroup().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (changeItems: ");
		result.append(changeItems);
		result.append(')');
		return result.toString();
	}

} // ElementChangeImpl
