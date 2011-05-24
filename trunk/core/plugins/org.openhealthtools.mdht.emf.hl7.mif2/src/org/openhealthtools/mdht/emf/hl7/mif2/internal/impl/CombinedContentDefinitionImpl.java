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

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.CombinedContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Content Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CombinedContentDefinitionImpl#getUnionWithContent <em>Union With Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CombinedContentDefinitionImpl#getIntersectionWithContent <em>Intersection With Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CombinedContentDefinitionImpl#getExcludeContent <em>Exclude Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombinedContentDefinitionImpl extends EObjectImpl implements CombinedContentDefinition {
	/**
	 * The cached value of the '{@link #getUnionWithContent() <em>Union With Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionWithContent()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentDefinition> unionWithContent;

	/**
	 * The cached value of the '{@link #getIntersectionWithContent() <em>Intersection With Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersectionWithContent()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentDefinition> intersectionWithContent;

	/**
	 * The cached value of the '{@link #getExcludeContent() <em>Exclude Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeContent()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentDefinition> excludeContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedContentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.COMBINED_CONTENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentDefinition> getUnionWithContent() {
		if (unionWithContent == null) {
			unionWithContent = new EObjectContainmentEList<ContentDefinition>(
				ContentDefinition.class, this, Mif2Package.COMBINED_CONTENT_DEFINITION__UNION_WITH_CONTENT);
		}
		return unionWithContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentDefinition> getIntersectionWithContent() {
		if (intersectionWithContent == null) {
			intersectionWithContent = new EObjectContainmentEList<ContentDefinition>(
				ContentDefinition.class, this, Mif2Package.COMBINED_CONTENT_DEFINITION__INTERSECTION_WITH_CONTENT);
		}
		return intersectionWithContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentDefinition> getExcludeContent() {
		if (excludeContent == null) {
			excludeContent = new EObjectContainmentEList<ContentDefinition>(
				ContentDefinition.class, this, Mif2Package.COMBINED_CONTENT_DEFINITION__EXCLUDE_CONTENT);
		}
		return excludeContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.COMBINED_CONTENT_DEFINITION__UNION_WITH_CONTENT:
				return ((InternalEList<?>) getUnionWithContent()).basicRemove(otherEnd, msgs);
			case Mif2Package.COMBINED_CONTENT_DEFINITION__INTERSECTION_WITH_CONTENT:
				return ((InternalEList<?>) getIntersectionWithContent()).basicRemove(otherEnd, msgs);
			case Mif2Package.COMBINED_CONTENT_DEFINITION__EXCLUDE_CONTENT:
				return ((InternalEList<?>) getExcludeContent()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.COMBINED_CONTENT_DEFINITION__UNION_WITH_CONTENT:
				return getUnionWithContent();
			case Mif2Package.COMBINED_CONTENT_DEFINITION__INTERSECTION_WITH_CONTENT:
				return getIntersectionWithContent();
			case Mif2Package.COMBINED_CONTENT_DEFINITION__EXCLUDE_CONTENT:
				return getExcludeContent();
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
			case Mif2Package.COMBINED_CONTENT_DEFINITION__UNION_WITH_CONTENT:
				getUnionWithContent().clear();
				getUnionWithContent().addAll((Collection<? extends ContentDefinition>) newValue);
				return;
			case Mif2Package.COMBINED_CONTENT_DEFINITION__INTERSECTION_WITH_CONTENT:
				getIntersectionWithContent().clear();
				getIntersectionWithContent().addAll((Collection<? extends ContentDefinition>) newValue);
				return;
			case Mif2Package.COMBINED_CONTENT_DEFINITION__EXCLUDE_CONTENT:
				getExcludeContent().clear();
				getExcludeContent().addAll((Collection<? extends ContentDefinition>) newValue);
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
			case Mif2Package.COMBINED_CONTENT_DEFINITION__UNION_WITH_CONTENT:
				getUnionWithContent().clear();
				return;
			case Mif2Package.COMBINED_CONTENT_DEFINITION__INTERSECTION_WITH_CONTENT:
				getIntersectionWithContent().clear();
				return;
			case Mif2Package.COMBINED_CONTENT_DEFINITION__EXCLUDE_CONTENT:
				getExcludeContent().clear();
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
			case Mif2Package.COMBINED_CONTENT_DEFINITION__UNION_WITH_CONTENT:
				return unionWithContent != null && !unionWithContent.isEmpty();
			case Mif2Package.COMBINED_CONTENT_DEFINITION__INTERSECTION_WITH_CONTENT:
				return intersectionWithContent != null && !intersectionWithContent.isEmpty();
			case Mif2Package.COMBINED_CONTENT_DEFINITION__EXCLUDE_CONTENT:
				return excludeContent != null && !excludeContent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CombinedContentDefinitionImpl
