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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PublicationAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.PublicationGroup;
import org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem;
import org.openhealthtools.mdht.emf.hl7.mif2.PublicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publication Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationPackageImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationPackageImpl#getPublicationContent <em>Publication Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationPackageImpl#getPublishedItem <em>Published Item</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationPackageImpl#getPublishedGroup <em>Published Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicationPackageImpl extends PackageImpl implements PublicationPackage {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected PublicationAnnotations annotations;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicationPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.PUBLICATION_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(PublicationAnnotations newAnnotations, NotificationChain msgs) {
		PublicationAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.PUBLICATION_PACKAGE__ANNOTATIONS, oldAnnotations, newAnnotations);
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
	public void setAnnotations(PublicationAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.PUBLICATION_PACKAGE__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.PUBLICATION_PACKAGE__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PUBLICATION_PACKAGE__ANNOTATIONS, newAnnotations, newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPublicationContent() {
		if (publicationContent == null) {
			publicationContent = new BasicFeatureMap(this, Mif2Package.PUBLICATION_PACKAGE__PUBLICATION_CONTENT);
		}
		return publicationContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PublicationItem> getPublishedItem() {
		return getPublicationContent().list(Mif2Package.Literals.PUBLICATION_PACKAGE__PUBLISHED_ITEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PublicationGroup> getPublishedGroup() {
		return getPublicationContent().list(Mif2Package.Literals.PUBLICATION_PACKAGE__PUBLISHED_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.PUBLICATION_PACKAGE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.PUBLICATION_PACKAGE__PUBLICATION_CONTENT:
				return ((InternalEList<?>) getPublicationContent()).basicRemove(otherEnd, msgs);
			case Mif2Package.PUBLICATION_PACKAGE__PUBLISHED_ITEM:
				return ((InternalEList<?>) getPublishedItem()).basicRemove(otherEnd, msgs);
			case Mif2Package.PUBLICATION_PACKAGE__PUBLISHED_GROUP:
				return ((InternalEList<?>) getPublishedGroup()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.PUBLICATION_PACKAGE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.PUBLICATION_PACKAGE__PUBLICATION_CONTENT:
				if (coreType) {
					return getPublicationContent();
				}
				return ((FeatureMap.Internal) getPublicationContent()).getWrapper();
			case Mif2Package.PUBLICATION_PACKAGE__PUBLISHED_ITEM:
				return getPublishedItem();
			case Mif2Package.PUBLICATION_PACKAGE__PUBLISHED_GROUP:
				return getPublishedGroup();
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
			case Mif2Package.PUBLICATION_PACKAGE__ANNOTATIONS:
				setAnnotations((PublicationAnnotations) newValue);
				return;
			case Mif2Package.PUBLICATION_PACKAGE__PUBLICATION_CONTENT:
				((FeatureMap.Internal) getPublicationContent()).set(newValue);
				return;
			case Mif2Package.PUBLICATION_PACKAGE__PUBLISHED_ITEM:
				getPublishedItem().clear();
				getPublishedItem().addAll((Collection<? extends PublicationItem>) newValue);
				return;
			case Mif2Package.PUBLICATION_PACKAGE__PUBLISHED_GROUP:
				getPublishedGroup().clear();
				getPublishedGroup().addAll((Collection<? extends PublicationGroup>) newValue);
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
			case Mif2Package.PUBLICATION_PACKAGE__ANNOTATIONS:
				setAnnotations((PublicationAnnotations) null);
				return;
			case Mif2Package.PUBLICATION_PACKAGE__PUBLICATION_CONTENT:
				getPublicationContent().clear();
				return;
			case Mif2Package.PUBLICATION_PACKAGE__PUBLISHED_ITEM:
				getPublishedItem().clear();
				return;
			case Mif2Package.PUBLICATION_PACKAGE__PUBLISHED_GROUP:
				getPublishedGroup().clear();
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
			case Mif2Package.PUBLICATION_PACKAGE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.PUBLICATION_PACKAGE__PUBLICATION_CONTENT:
				return publicationContent != null && !publicationContent.isEmpty();
			case Mif2Package.PUBLICATION_PACKAGE__PUBLISHED_ITEM:
				return !getPublishedItem().isEmpty();
			case Mif2Package.PUBLICATION_PACKAGE__PUBLISHED_GROUP:
				return !getPublishedGroup().isEmpty();
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

} // PublicationPackageImpl
