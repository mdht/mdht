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

import org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollection;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollectionAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.Header;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Translation Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeTranslationCollectionImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeTranslationCollectionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeTranslationCollectionImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeTranslationCollectionImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeTranslationCollectionImpl extends PackageBaseImpl implements CodeTranslationCollection {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected Header header;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected CodeTranslationCollectionAnnotations annotations;

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeTranslation> translation;

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
	protected CodeTranslationCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CODE_TRANSLATION_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(Header newHeader, NotificationChain msgs) {
		Header oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.CODE_TRANSLATION_COLLECTION__HEADER, oldHeader, newHeader);
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
	public void setHeader(Header newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null) {
				msgs = ((InternalEObject) header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CODE_TRANSLATION_COLLECTION__HEADER, null, msgs);
			}
			if (newHeader != null) {
				msgs = ((InternalEObject) newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CODE_TRANSLATION_COLLECTION__HEADER, null, msgs);
			}
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CODE_TRANSLATION_COLLECTION__HEADER, newHeader, newHeader));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeTranslationCollectionAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(CodeTranslationCollectionAnnotations newAnnotations,
			NotificationChain msgs) {
		CodeTranslationCollectionAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.CODE_TRANSLATION_COLLECTION__ANNOTATIONS, oldAnnotations,
				newAnnotations);
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
	public void setAnnotations(CodeTranslationCollectionAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CODE_TRANSLATION_COLLECTION__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CODE_TRANSLATION_COLLECTION__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CODE_TRANSLATION_COLLECTION__ANNOTATIONS, newAnnotations,
				newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeTranslation> getTranslation() {
		if (translation == null) {
			translation = new EObjectContainmentEList<CodeTranslation>(
				CodeTranslation.class, this, Mif2Package.CODE_TRANSLATION_COLLECTION__TRANSLATION);
		}
		return translation;
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
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CODE_TRANSLATION_COLLECTION__TITLE, oldTitle, title));
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
			case Mif2Package.CODE_TRANSLATION_COLLECTION__HEADER:
				return basicSetHeader(null, msgs);
			case Mif2Package.CODE_TRANSLATION_COLLECTION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.CODE_TRANSLATION_COLLECTION__TRANSLATION:
				return ((InternalEList<?>) getTranslation()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CODE_TRANSLATION_COLLECTION__HEADER:
				return getHeader();
			case Mif2Package.CODE_TRANSLATION_COLLECTION__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.CODE_TRANSLATION_COLLECTION__TRANSLATION:
				return getTranslation();
			case Mif2Package.CODE_TRANSLATION_COLLECTION__TITLE:
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
			case Mif2Package.CODE_TRANSLATION_COLLECTION__HEADER:
				setHeader((Header) newValue);
				return;
			case Mif2Package.CODE_TRANSLATION_COLLECTION__ANNOTATIONS:
				setAnnotations((CodeTranslationCollectionAnnotations) newValue);
				return;
			case Mif2Package.CODE_TRANSLATION_COLLECTION__TRANSLATION:
				getTranslation().clear();
				getTranslation().addAll((Collection<? extends CodeTranslation>) newValue);
				return;
			case Mif2Package.CODE_TRANSLATION_COLLECTION__TITLE:
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
			case Mif2Package.CODE_TRANSLATION_COLLECTION__HEADER:
				setHeader((Header) null);
				return;
			case Mif2Package.CODE_TRANSLATION_COLLECTION__ANNOTATIONS:
				setAnnotations((CodeTranslationCollectionAnnotations) null);
				return;
			case Mif2Package.CODE_TRANSLATION_COLLECTION__TRANSLATION:
				getTranslation().clear();
				return;
			case Mif2Package.CODE_TRANSLATION_COLLECTION__TITLE:
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
			case Mif2Package.CODE_TRANSLATION_COLLECTION__HEADER:
				return header != null;
			case Mif2Package.CODE_TRANSLATION_COLLECTION__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.CODE_TRANSLATION_COLLECTION__TRANSLATION:
				return translation != null && !translation.isEmpty();
			case Mif2Package.CODE_TRANSLATION_COLLECTION__TITLE:
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} // CodeTranslationCollectionImpl
