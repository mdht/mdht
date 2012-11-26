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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PublicationGroup;
import org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publication Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationGroupImpl#getPublicationContent <em>Publication Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationGroupImpl#getPublishedItem <em>Published Item</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationGroupImpl#getPublishedGroup <em>Published Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationGroupImpl#getFollowingText <em>Following Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicationGroupImpl extends PublicationBaseImpl implements PublicationGroup {
	/**
	 * The cached value of the '{@link #getPublicationContent() <em>Publication Content</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationContent()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap publicationContent;

	/**
	 * The cached value of the '{@link #getFollowingText() <em>Following Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowingText()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexMarkupWithLanguage> followingText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.PUBLICATION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPublicationContent() {
		if (publicationContent == null) {
			publicationContent = new BasicFeatureMap(this, Mif2Package.PUBLICATION_GROUP__PUBLICATION_CONTENT);
		}
		return publicationContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PublicationItem> getPublishedItem() {
		return getPublicationContent().list(Mif2Package.Literals.PUBLICATION_GROUP__PUBLISHED_ITEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PublicationGroup> getPublishedGroup() {
		return getPublicationContent().list(Mif2Package.Literals.PUBLICATION_GROUP__PUBLISHED_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexMarkupWithLanguage> getFollowingText() {
		if (followingText == null) {
			followingText = new EObjectContainmentEList<ComplexMarkupWithLanguage>(
				ComplexMarkupWithLanguage.class, this, Mif2Package.PUBLICATION_GROUP__FOLLOWING_TEXT);
		}
		return followingText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.PUBLICATION_GROUP__PUBLICATION_CONTENT:
				return ((InternalEList<?>) getPublicationContent()).basicRemove(otherEnd, msgs);
			case Mif2Package.PUBLICATION_GROUP__PUBLISHED_ITEM:
				return ((InternalEList<?>) getPublishedItem()).basicRemove(otherEnd, msgs);
			case Mif2Package.PUBLICATION_GROUP__PUBLISHED_GROUP:
				return ((InternalEList<?>) getPublishedGroup()).basicRemove(otherEnd, msgs);
			case Mif2Package.PUBLICATION_GROUP__FOLLOWING_TEXT:
				return ((InternalEList<?>) getFollowingText()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.PUBLICATION_GROUP__PUBLICATION_CONTENT:
				if (coreType) {
					return getPublicationContent();
				}
				return ((FeatureMap.Internal) getPublicationContent()).getWrapper();
			case Mif2Package.PUBLICATION_GROUP__PUBLISHED_ITEM:
				return getPublishedItem();
			case Mif2Package.PUBLICATION_GROUP__PUBLISHED_GROUP:
				return getPublishedGroup();
			case Mif2Package.PUBLICATION_GROUP__FOLLOWING_TEXT:
				return getFollowingText();
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
			case Mif2Package.PUBLICATION_GROUP__PUBLICATION_CONTENT:
				((FeatureMap.Internal) getPublicationContent()).set(newValue);
				return;
			case Mif2Package.PUBLICATION_GROUP__PUBLISHED_ITEM:
				getPublishedItem().clear();
				getPublishedItem().addAll((Collection<? extends PublicationItem>) newValue);
				return;
			case Mif2Package.PUBLICATION_GROUP__PUBLISHED_GROUP:
				getPublishedGroup().clear();
				getPublishedGroup().addAll((Collection<? extends PublicationGroup>) newValue);
				return;
			case Mif2Package.PUBLICATION_GROUP__FOLLOWING_TEXT:
				getFollowingText().clear();
				getFollowingText().addAll((Collection<? extends ComplexMarkupWithLanguage>) newValue);
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
			case Mif2Package.PUBLICATION_GROUP__PUBLICATION_CONTENT:
				getPublicationContent().clear();
				return;
			case Mif2Package.PUBLICATION_GROUP__PUBLISHED_ITEM:
				getPublishedItem().clear();
				return;
			case Mif2Package.PUBLICATION_GROUP__PUBLISHED_GROUP:
				getPublishedGroup().clear();
				return;
			case Mif2Package.PUBLICATION_GROUP__FOLLOWING_TEXT:
				getFollowingText().clear();
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
			case Mif2Package.PUBLICATION_GROUP__PUBLICATION_CONTENT:
				return publicationContent != null && !publicationContent.isEmpty();
			case Mif2Package.PUBLICATION_GROUP__PUBLISHED_ITEM:
				return !getPublishedItem().isEmpty();
			case Mif2Package.PUBLICATION_GROUP__PUBLISHED_GROUP:
				return !getPublishedGroup().isEmpty();
			case Mif2Package.PUBLICATION_GROUP__FOLLOWING_TEXT:
				return followingText != null && !followingText.isEmpty();
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
		result.append(" (publicationContent: ");
		result.append(publicationContent);
		result.append(')');
		return result.toString();
	}

} // PublicationGroupImpl
