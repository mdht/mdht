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

import org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BasicAnnotationImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BasicAnnotationImpl#getCombinedText <em>Combined Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BasicAnnotationImpl#getAppendAnnotationId <em>Append Annotation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BasicAnnotationImpl#getGraphicLinkId <em>Graphic Link Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BasicAnnotationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BasicAnnotationImpl#getPrependAnnotationId <em>Prepend Annotation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BasicAnnotationImpl#getSortKey <em>Sort Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicAnnotationImpl extends AnnotationBaseImpl implements BasicAnnotation {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexMarkupWithLanguage> text;

	/**
	 * The cached value of the '{@link #getCombinedText() <em>Combined Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedText()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexMarkupWithLanguage> combinedText;

	/**
	 * The default value of the '{@link #getAppendAnnotationId() <em>Append Annotation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppendAnnotationId()
	 * @generated
	 * @ordered
	 */
	protected static final String APPEND_ANNOTATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppendAnnotationId() <em>Append Annotation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppendAnnotationId()
	 * @generated
	 * @ordered
	 */
	protected String appendAnnotationId = APPEND_ANNOTATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGraphicLinkId() <em>Graphic Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicLinkId()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAPHIC_LINK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGraphicLinkId() <em>Graphic Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicLinkId()
	 * @generated
	 * @ordered
	 */
	protected String graphicLinkId = GRAPHIC_LINK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrependAnnotationId() <em>Prepend Annotation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrependAnnotationId()
	 * @generated
	 * @ordered
	 */
	protected static final String PREPEND_ANNOTATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrependAnnotationId() <em>Prepend Annotation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrependAnnotationId()
	 * @generated
	 * @ordered
	 */
	protected String prependAnnotationId = PREPEND_ANNOTATION_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.BASIC_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexMarkupWithLanguage> getText() {
		if (text == null) {
			text = new EObjectContainmentEList<ComplexMarkupWithLanguage>(
				ComplexMarkupWithLanguage.class, this, Mif2Package.BASIC_ANNOTATION__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexMarkupWithLanguage> getCombinedText() {
		if (combinedText == null) {
			combinedText = new EObjectContainmentEList<ComplexMarkupWithLanguage>(
				ComplexMarkupWithLanguage.class, this, Mif2Package.BASIC_ANNOTATION__COMBINED_TEXT);
		}
		return combinedText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppendAnnotationId() {
		return appendAnnotationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppendAnnotationId(String newAppendAnnotationId) {
		String oldAppendAnnotationId = appendAnnotationId;
		appendAnnotationId = newAppendAnnotationId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BASIC_ANNOTATION__APPEND_ANNOTATION_ID, oldAppendAnnotationId,
				appendAnnotationId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGraphicLinkId() {
		return graphicLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicLinkId(String newGraphicLinkId) {
		String oldGraphicLinkId = graphicLinkId;
		graphicLinkId = newGraphicLinkId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BASIC_ANNOTATION__GRAPHIC_LINK_ID, oldGraphicLinkId, graphicLinkId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.BASIC_ANNOTATION__ID, oldId, id));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrependAnnotationId() {
		return prependAnnotationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrependAnnotationId(String newPrependAnnotationId) {
		String oldPrependAnnotationId = prependAnnotationId;
		prependAnnotationId = newPrependAnnotationId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BASIC_ANNOTATION__PREPEND_ANNOTATION_ID, oldPrependAnnotationId,
				prependAnnotationId));
		}
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
				this, Notification.SET, Mif2Package.BASIC_ANNOTATION__SORT_KEY, oldSortKey, sortKey));
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
			case Mif2Package.BASIC_ANNOTATION__TEXT:
				return ((InternalEList<?>) getText()).basicRemove(otherEnd, msgs);
			case Mif2Package.BASIC_ANNOTATION__COMBINED_TEXT:
				return ((InternalEList<?>) getCombinedText()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.BASIC_ANNOTATION__TEXT:
				return getText();
			case Mif2Package.BASIC_ANNOTATION__COMBINED_TEXT:
				return getCombinedText();
			case Mif2Package.BASIC_ANNOTATION__APPEND_ANNOTATION_ID:
				return getAppendAnnotationId();
			case Mif2Package.BASIC_ANNOTATION__GRAPHIC_LINK_ID:
				return getGraphicLinkId();
			case Mif2Package.BASIC_ANNOTATION__ID:
				return getId();
			case Mif2Package.BASIC_ANNOTATION__PREPEND_ANNOTATION_ID:
				return getPrependAnnotationId();
			case Mif2Package.BASIC_ANNOTATION__SORT_KEY:
				return getSortKey();
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
			case Mif2Package.BASIC_ANNOTATION__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends ComplexMarkupWithLanguage>) newValue);
				return;
			case Mif2Package.BASIC_ANNOTATION__COMBINED_TEXT:
				getCombinedText().clear();
				getCombinedText().addAll((Collection<? extends ComplexMarkupWithLanguage>) newValue);
				return;
			case Mif2Package.BASIC_ANNOTATION__APPEND_ANNOTATION_ID:
				setAppendAnnotationId((String) newValue);
				return;
			case Mif2Package.BASIC_ANNOTATION__GRAPHIC_LINK_ID:
				setGraphicLinkId((String) newValue);
				return;
			case Mif2Package.BASIC_ANNOTATION__ID:
				setId((String) newValue);
				return;
			case Mif2Package.BASIC_ANNOTATION__PREPEND_ANNOTATION_ID:
				setPrependAnnotationId((String) newValue);
				return;
			case Mif2Package.BASIC_ANNOTATION__SORT_KEY:
				setSortKey((String) newValue);
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
			case Mif2Package.BASIC_ANNOTATION__TEXT:
				getText().clear();
				return;
			case Mif2Package.BASIC_ANNOTATION__COMBINED_TEXT:
				getCombinedText().clear();
				return;
			case Mif2Package.BASIC_ANNOTATION__APPEND_ANNOTATION_ID:
				setAppendAnnotationId(APPEND_ANNOTATION_ID_EDEFAULT);
				return;
			case Mif2Package.BASIC_ANNOTATION__GRAPHIC_LINK_ID:
				setGraphicLinkId(GRAPHIC_LINK_ID_EDEFAULT);
				return;
			case Mif2Package.BASIC_ANNOTATION__ID:
				setId(ID_EDEFAULT);
				return;
			case Mif2Package.BASIC_ANNOTATION__PREPEND_ANNOTATION_ID:
				setPrependAnnotationId(PREPEND_ANNOTATION_ID_EDEFAULT);
				return;
			case Mif2Package.BASIC_ANNOTATION__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
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
			case Mif2Package.BASIC_ANNOTATION__TEXT:
				return text != null && !text.isEmpty();
			case Mif2Package.BASIC_ANNOTATION__COMBINED_TEXT:
				return combinedText != null && !combinedText.isEmpty();
			case Mif2Package.BASIC_ANNOTATION__APPEND_ANNOTATION_ID:
				return APPEND_ANNOTATION_ID_EDEFAULT == null
						? appendAnnotationId != null
						: !APPEND_ANNOTATION_ID_EDEFAULT.equals(appendAnnotationId);
			case Mif2Package.BASIC_ANNOTATION__GRAPHIC_LINK_ID:
				return GRAPHIC_LINK_ID_EDEFAULT == null
						? graphicLinkId != null
						: !GRAPHIC_LINK_ID_EDEFAULT.equals(graphicLinkId);
			case Mif2Package.BASIC_ANNOTATION__ID:
				return ID_EDEFAULT == null
						? id != null
						: !ID_EDEFAULT.equals(id);
			case Mif2Package.BASIC_ANNOTATION__PREPEND_ANNOTATION_ID:
				return PREPEND_ANNOTATION_ID_EDEFAULT == null
						? prependAnnotationId != null
						: !PREPEND_ANNOTATION_ID_EDEFAULT.equals(prependAnnotationId);
			case Mif2Package.BASIC_ANNOTATION__SORT_KEY:
				return SORT_KEY_EDEFAULT == null
						? sortKey != null
						: !SORT_KEY_EDEFAULT.equals(sortKey);
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
		result.append(" (appendAnnotationId: ");
		result.append(appendAnnotationId);
		result.append(", graphicLinkId: ");
		result.append(graphicLinkId);
		result.append(", id: ");
		result.append(id);
		result.append(", prependAnnotationId: ");
		result.append(prependAnnotationId);
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(')');
		return result.toString();
	}

} // BasicAnnotationImpl
