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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.ContentsLevelKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PublicationBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publication Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationBaseImpl#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationBaseImpl#getRenderedText <em>Rendered Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationBaseImpl#getPrecedingText <em>Preceding Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationBaseImpl#getContentsLevel <em>Contents Level</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationBaseImpl#getRenderToLocation <em>Render To Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationBaseImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationBaseImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PublicationBaseImpl extends EObjectImpl implements PublicationBase {
	/**
	 * The cached value of the '{@link #getBusinessName() <em>Business Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessName()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessName> businessName;

	/**
	 * The cached value of the '{@link #getRenderedText() <em>Rendered Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderedText()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexMarkupWithLanguage> renderedText;

	/**
	 * The cached value of the '{@link #getPrecedingText() <em>Preceding Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedingText()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexMarkupWithLanguage> precedingText;

	/**
	 * The default value of the '{@link #getContentsLevel() <em>Contents Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentsLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ContentsLevelKind CONTENTS_LEVEL_EDEFAULT = ContentsLevelKind.NONE;

	/**
	 * The cached value of the '{@link #getContentsLevel() <em>Contents Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentsLevel()
	 * @generated
	 * @ordered
	 */
	protected ContentsLevelKind contentsLevel = CONTENTS_LEVEL_EDEFAULT;

	/**
	 * This is true if the Contents Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contentsLevelESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRenderToLocation() <em>Render To Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderToLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String RENDER_TO_LOCATION_EDEFAULT = "false";

	/**
	 * The cached value of the '{@link #getRenderToLocation() <em>Render To Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderToLocation()
	 * @generated
	 * @ordered
	 */
	protected String renderToLocation = RENDER_TO_LOCATION_EDEFAULT;

	/**
	 * This is true if the Render To Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean renderToLocationESet;

	/**
	 * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SORT_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected String sortKey = SORT_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicationBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.PUBLICATION_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessName> getBusinessName() {
		if (businessName == null) {
			businessName = new EObjectContainmentEList<BusinessName>(
				BusinessName.class, this, Mif2Package.PUBLICATION_BASE__BUSINESS_NAME);
		}
		return businessName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexMarkupWithLanguage> getRenderedText() {
		if (renderedText == null) {
			renderedText = new EObjectContainmentEList<ComplexMarkupWithLanguage>(
				ComplexMarkupWithLanguage.class, this, Mif2Package.PUBLICATION_BASE__RENDERED_TEXT);
		}
		return renderedText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexMarkupWithLanguage> getPrecedingText() {
		if (precedingText == null) {
			precedingText = new EObjectContainmentEList<ComplexMarkupWithLanguage>(
				ComplexMarkupWithLanguage.class, this, Mif2Package.PUBLICATION_BASE__PRECEDING_TEXT);
		}
		return precedingText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentsLevelKind getContentsLevel() {
		return contentsLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentsLevel(ContentsLevelKind newContentsLevel) {
		ContentsLevelKind oldContentsLevel = contentsLevel;
		contentsLevel = newContentsLevel == null
				? CONTENTS_LEVEL_EDEFAULT
				: newContentsLevel;
		boolean oldContentsLevelESet = contentsLevelESet;
		contentsLevelESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PUBLICATION_BASE__CONTENTS_LEVEL, oldContentsLevel, contentsLevel,
				!oldContentsLevelESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContentsLevel() {
		ContentsLevelKind oldContentsLevel = contentsLevel;
		boolean oldContentsLevelESet = contentsLevelESet;
		contentsLevel = CONTENTS_LEVEL_EDEFAULT;
		contentsLevelESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.PUBLICATION_BASE__CONTENTS_LEVEL, oldContentsLevel,
				CONTENTS_LEVEL_EDEFAULT, oldContentsLevelESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContentsLevel() {
		return contentsLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PUBLICATION_BASE__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRenderToLocation() {
		return renderToLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenderToLocation(String newRenderToLocation) {
		String oldRenderToLocation = renderToLocation;
		renderToLocation = newRenderToLocation;
		boolean oldRenderToLocationESet = renderToLocationESet;
		renderToLocationESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PUBLICATION_BASE__RENDER_TO_LOCATION, oldRenderToLocation,
				renderToLocation, !oldRenderToLocationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRenderToLocation() {
		String oldRenderToLocation = renderToLocation;
		boolean oldRenderToLocationESet = renderToLocationESet;
		renderToLocation = RENDER_TO_LOCATION_EDEFAULT;
		renderToLocationESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.PUBLICATION_BASE__RENDER_TO_LOCATION, oldRenderToLocation,
				RENDER_TO_LOCATION_EDEFAULT, oldRenderToLocationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRenderToLocation() {
		return renderToLocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortKey() {
		return sortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(String newSortKey) {
		String oldSortKey = sortKey;
		sortKey = newSortKey;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PUBLICATION_BASE__SORT_KEY, oldSortKey, sortKey));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PUBLICATION_BASE__TITLE, oldTitle, title));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.PUBLICATION_BASE__BUSINESS_NAME:
				return ((InternalEList<?>) getBusinessName()).basicRemove(otherEnd, msgs);
			case Mif2Package.PUBLICATION_BASE__RENDERED_TEXT:
				return ((InternalEList<?>) getRenderedText()).basicRemove(otherEnd, msgs);
			case Mif2Package.PUBLICATION_BASE__PRECEDING_TEXT:
				return ((InternalEList<?>) getPrecedingText()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.PUBLICATION_BASE__BUSINESS_NAME:
				return getBusinessName();
			case Mif2Package.PUBLICATION_BASE__RENDERED_TEXT:
				return getRenderedText();
			case Mif2Package.PUBLICATION_BASE__PRECEDING_TEXT:
				return getPrecedingText();
			case Mif2Package.PUBLICATION_BASE__CONTENTS_LEVEL:
				return getContentsLevel();
			case Mif2Package.PUBLICATION_BASE__NAME:
				return getName();
			case Mif2Package.PUBLICATION_BASE__RENDER_TO_LOCATION:
				return getRenderToLocation();
			case Mif2Package.PUBLICATION_BASE__SORT_KEY:
				return getSortKey();
			case Mif2Package.PUBLICATION_BASE__TITLE:
				return getTitle();
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
			case Mif2Package.PUBLICATION_BASE__BUSINESS_NAME:
				getBusinessName().clear();
				getBusinessName().addAll((Collection<? extends BusinessName>) newValue);
				return;
			case Mif2Package.PUBLICATION_BASE__RENDERED_TEXT:
				getRenderedText().clear();
				getRenderedText().addAll((Collection<? extends ComplexMarkupWithLanguage>) newValue);
				return;
			case Mif2Package.PUBLICATION_BASE__PRECEDING_TEXT:
				getPrecedingText().clear();
				getPrecedingText().addAll((Collection<? extends ComplexMarkupWithLanguage>) newValue);
				return;
			case Mif2Package.PUBLICATION_BASE__CONTENTS_LEVEL:
				setContentsLevel((ContentsLevelKind) newValue);
				return;
			case Mif2Package.PUBLICATION_BASE__NAME:
				setName((String) newValue);
				return;
			case Mif2Package.PUBLICATION_BASE__RENDER_TO_LOCATION:
				setRenderToLocation((String) newValue);
				return;
			case Mif2Package.PUBLICATION_BASE__SORT_KEY:
				setSortKey((String) newValue);
				return;
			case Mif2Package.PUBLICATION_BASE__TITLE:
				setTitle((String) newValue);
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
			case Mif2Package.PUBLICATION_BASE__BUSINESS_NAME:
				getBusinessName().clear();
				return;
			case Mif2Package.PUBLICATION_BASE__RENDERED_TEXT:
				getRenderedText().clear();
				return;
			case Mif2Package.PUBLICATION_BASE__PRECEDING_TEXT:
				getPrecedingText().clear();
				return;
			case Mif2Package.PUBLICATION_BASE__CONTENTS_LEVEL:
				unsetContentsLevel();
				return;
			case Mif2Package.PUBLICATION_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.PUBLICATION_BASE__RENDER_TO_LOCATION:
				unsetRenderToLocation();
				return;
			case Mif2Package.PUBLICATION_BASE__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case Mif2Package.PUBLICATION_BASE__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case Mif2Package.PUBLICATION_BASE__BUSINESS_NAME:
				return businessName != null && !businessName.isEmpty();
			case Mif2Package.PUBLICATION_BASE__RENDERED_TEXT:
				return renderedText != null && !renderedText.isEmpty();
			case Mif2Package.PUBLICATION_BASE__PRECEDING_TEXT:
				return precedingText != null && !precedingText.isEmpty();
			case Mif2Package.PUBLICATION_BASE__CONTENTS_LEVEL:
				return isSetContentsLevel();
			case Mif2Package.PUBLICATION_BASE__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case Mif2Package.PUBLICATION_BASE__RENDER_TO_LOCATION:
				return isSetRenderToLocation();
			case Mif2Package.PUBLICATION_BASE__SORT_KEY:
				return SORT_KEY_EDEFAULT == null
						? sortKey != null
						: !SORT_KEY_EDEFAULT.equals(sortKey);
			case Mif2Package.PUBLICATION_BASE__TITLE:
				return TITLE_EDEFAULT == null
						? title != null
						: !TITLE_EDEFAULT.equals(title);
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
		result.append(" (contentsLevel: ");
		if (contentsLevelESet) {
			result.append(contentsLevel);
		} else {
			result.append("<unset>");
		}
		result.append(", name: ");
		result.append(name);
		result.append(", renderToLocation: ");
		if (renderToLocationESet) {
			result.append(renderToLocation);
		} else {
			result.append("<unset>");
		}
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} // PublicationBaseImpl
