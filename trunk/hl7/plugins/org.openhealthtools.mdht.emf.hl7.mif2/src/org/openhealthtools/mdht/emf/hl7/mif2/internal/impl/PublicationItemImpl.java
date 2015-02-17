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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactRenderingStyleKind;
import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.ItemFilter;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageOrArtifactRef;
import org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publication Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationItemImpl#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationItemImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationItemImpl#getFollowingText <em>Following Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationItemImpl#getRenderingStyle <em>Rendering Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicationItemImpl extends PublicationBaseImpl implements PublicationItem {
	/**
	 * The cached value of the '{@link #getItemReference() <em>Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemReference()
	 * @generated
	 * @ordered
	 */
	protected PackageOrArtifactRef itemReference;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemFilter> filter;

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
	 * The default value of the '{@link #getRenderingStyle() <em>Rendering Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderingStyle()
	 * @generated
	 * @ordered
	 */
	protected static final ArtifactRenderingStyleKind RENDERING_STYLE_EDEFAULT = ArtifactRenderingStyleKind.GRAPHICAL_DETAILED;

	/**
	 * The cached value of the '{@link #getRenderingStyle() <em>Rendering Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderingStyle()
	 * @generated
	 * @ordered
	 */
	protected ArtifactRenderingStyleKind renderingStyle = RENDERING_STYLE_EDEFAULT;

	/**
	 * This is true if the Rendering Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean renderingStyleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.PUBLICATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageOrArtifactRef getItemReference() {
		return itemReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemReference(PackageOrArtifactRef newItemReference, NotificationChain msgs) {
		PackageOrArtifactRef oldItemReference = itemReference;
		itemReference = newItemReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.PUBLICATION_ITEM__ITEM_REFERENCE, oldItemReference,
				newItemReference);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemReference(PackageOrArtifactRef newItemReference) {
		if (newItemReference != itemReference) {
			NotificationChain msgs = null;
			if (itemReference != null) {
				msgs = ((InternalEObject) itemReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.PUBLICATION_ITEM__ITEM_REFERENCE, null, msgs);
			}
			if (newItemReference != null) {
				msgs = ((InternalEObject) newItemReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.PUBLICATION_ITEM__ITEM_REFERENCE, null, msgs);
			}
			msgs = basicSetItemReference(newItemReference, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PUBLICATION_ITEM__ITEM_REFERENCE, newItemReference,
				newItemReference));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemFilter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<ItemFilter>(
				ItemFilter.class, this, Mif2Package.PUBLICATION_ITEM__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexMarkupWithLanguage> getFollowingText() {
		if (followingText == null) {
			followingText = new EObjectContainmentEList<ComplexMarkupWithLanguage>(
				ComplexMarkupWithLanguage.class, this, Mif2Package.PUBLICATION_ITEM__FOLLOWING_TEXT);
		}
		return followingText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactRenderingStyleKind getRenderingStyle() {
		return renderingStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenderingStyle(ArtifactRenderingStyleKind newRenderingStyle) {
		ArtifactRenderingStyleKind oldRenderingStyle = renderingStyle;
		renderingStyle = newRenderingStyle == null
				? RENDERING_STYLE_EDEFAULT
				: newRenderingStyle;
		boolean oldRenderingStyleESet = renderingStyleESet;
		renderingStyleESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PUBLICATION_ITEM__RENDERING_STYLE, oldRenderingStyle,
				renderingStyle, !oldRenderingStyleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRenderingStyle() {
		ArtifactRenderingStyleKind oldRenderingStyle = renderingStyle;
		boolean oldRenderingStyleESet = renderingStyleESet;
		renderingStyle = RENDERING_STYLE_EDEFAULT;
		renderingStyleESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.PUBLICATION_ITEM__RENDERING_STYLE, oldRenderingStyle,
				RENDERING_STYLE_EDEFAULT, oldRenderingStyleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRenderingStyle() {
		return renderingStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.PUBLICATION_ITEM__ITEM_REFERENCE:
				return basicSetItemReference(null, msgs);
			case Mif2Package.PUBLICATION_ITEM__FILTER:
				return ((InternalEList<?>) getFilter()).basicRemove(otherEnd, msgs);
			case Mif2Package.PUBLICATION_ITEM__FOLLOWING_TEXT:
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
			case Mif2Package.PUBLICATION_ITEM__ITEM_REFERENCE:
				return getItemReference();
			case Mif2Package.PUBLICATION_ITEM__FILTER:
				return getFilter();
			case Mif2Package.PUBLICATION_ITEM__FOLLOWING_TEXT:
				return getFollowingText();
			case Mif2Package.PUBLICATION_ITEM__RENDERING_STYLE:
				return getRenderingStyle();
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
			case Mif2Package.PUBLICATION_ITEM__ITEM_REFERENCE:
				setItemReference((PackageOrArtifactRef) newValue);
				return;
			case Mif2Package.PUBLICATION_ITEM__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends ItemFilter>) newValue);
				return;
			case Mif2Package.PUBLICATION_ITEM__FOLLOWING_TEXT:
				getFollowingText().clear();
				getFollowingText().addAll((Collection<? extends ComplexMarkupWithLanguage>) newValue);
				return;
			case Mif2Package.PUBLICATION_ITEM__RENDERING_STYLE:
				setRenderingStyle((ArtifactRenderingStyleKind) newValue);
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
			case Mif2Package.PUBLICATION_ITEM__ITEM_REFERENCE:
				setItemReference((PackageOrArtifactRef) null);
				return;
			case Mif2Package.PUBLICATION_ITEM__FILTER:
				getFilter().clear();
				return;
			case Mif2Package.PUBLICATION_ITEM__FOLLOWING_TEXT:
				getFollowingText().clear();
				return;
			case Mif2Package.PUBLICATION_ITEM__RENDERING_STYLE:
				unsetRenderingStyle();
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
			case Mif2Package.PUBLICATION_ITEM__ITEM_REFERENCE:
				return itemReference != null;
			case Mif2Package.PUBLICATION_ITEM__FILTER:
				return filter != null && !filter.isEmpty();
			case Mif2Package.PUBLICATION_ITEM__FOLLOWING_TEXT:
				return followingText != null && !followingText.isEmpty();
			case Mif2Package.PUBLICATION_ITEM__RENDERING_STYLE:
				return isSetRenderingStyle();
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
		result.append(" (renderingStyle: ");
		if (renderingStyleESet) {
			result.append(renderingStyle);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // PublicationItemImpl
