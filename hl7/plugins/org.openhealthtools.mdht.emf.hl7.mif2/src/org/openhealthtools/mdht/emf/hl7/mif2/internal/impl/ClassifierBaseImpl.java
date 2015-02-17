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

import org.openhealthtools.mdht.emf.hl7.mif2.ClassDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassifierBase;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassifierBaseImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassifierBaseImpl#getDefiningVocabulary <em>Defining Vocabulary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassifierBaseImpl#getGraphicLinkId <em>Graphic Link Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierBaseImpl extends ClassifierImpl implements ClassifierBase {
	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDerivation> derivedFrom;

	/**
	 * The cached value of the '{@link #getDefiningVocabulary() <em>Defining Vocabulary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningVocabulary()
	 * @generated
	 * @ordered
	 */
	protected VocabularySpecification definingVocabulary;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CLASSIFIER_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassDerivation> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<ClassDerivation>(
				ClassDerivation.class, this, Mif2Package.CLASSIFIER_BASE__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularySpecification getDefiningVocabulary() {
		return definingVocabulary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefiningVocabulary(VocabularySpecification newDefiningVocabulary,
			NotificationChain msgs) {
		VocabularySpecification oldDefiningVocabulary = definingVocabulary;
		definingVocabulary = newDefiningVocabulary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASSIFIER_BASE__DEFINING_VOCABULARY, oldDefiningVocabulary,
				newDefiningVocabulary);
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
	public void setDefiningVocabulary(VocabularySpecification newDefiningVocabulary) {
		if (newDefiningVocabulary != definingVocabulary) {
			NotificationChain msgs = null;
			if (definingVocabulary != null) {
				msgs = ((InternalEObject) definingVocabulary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CLASSIFIER_BASE__DEFINING_VOCABULARY, null, msgs);
			}
			if (newDefiningVocabulary != null) {
				msgs = ((InternalEObject) newDefiningVocabulary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CLASSIFIER_BASE__DEFINING_VOCABULARY, null, msgs);
			}
			msgs = basicSetDefiningVocabulary(newDefiningVocabulary, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASSIFIER_BASE__DEFINING_VOCABULARY, newDefiningVocabulary,
				newDefiningVocabulary));
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
				this, Notification.SET, Mif2Package.CLASSIFIER_BASE__GRAPHIC_LINK_ID, oldGraphicLinkId, graphicLinkId));
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
			case Mif2Package.CLASSIFIER_BASE__DERIVED_FROM:
				return ((InternalEList<?>) getDerivedFrom()).basicRemove(otherEnd, msgs);
			case Mif2Package.CLASSIFIER_BASE__DEFINING_VOCABULARY:
				return basicSetDefiningVocabulary(null, msgs);
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
			case Mif2Package.CLASSIFIER_BASE__DERIVED_FROM:
				return getDerivedFrom();
			case Mif2Package.CLASSIFIER_BASE__DEFINING_VOCABULARY:
				return getDefiningVocabulary();
			case Mif2Package.CLASSIFIER_BASE__GRAPHIC_LINK_ID:
				return getGraphicLinkId();
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
			case Mif2Package.CLASSIFIER_BASE__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends ClassDerivation>) newValue);
				return;
			case Mif2Package.CLASSIFIER_BASE__DEFINING_VOCABULARY:
				setDefiningVocabulary((VocabularySpecification) newValue);
				return;
			case Mif2Package.CLASSIFIER_BASE__GRAPHIC_LINK_ID:
				setGraphicLinkId((String) newValue);
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
			case Mif2Package.CLASSIFIER_BASE__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case Mif2Package.CLASSIFIER_BASE__DEFINING_VOCABULARY:
				setDefiningVocabulary((VocabularySpecification) null);
				return;
			case Mif2Package.CLASSIFIER_BASE__GRAPHIC_LINK_ID:
				setGraphicLinkId(GRAPHIC_LINK_ID_EDEFAULT);
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
			case Mif2Package.CLASSIFIER_BASE__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case Mif2Package.CLASSIFIER_BASE__DEFINING_VOCABULARY:
				return definingVocabulary != null;
			case Mif2Package.CLASSIFIER_BASE__GRAPHIC_LINK_ID:
				return GRAPHIC_LINK_ID_EDEFAULT == null
						? graphicLinkId != null
						: !GRAPHIC_LINK_ID_EDEFAULT.equals(graphicLinkId);
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
		result.append(" (graphicLinkId: ");
		result.append(graphicLinkId);
		result.append(')');
		return result.toString();
	}

} // ClassifierBaseImpl
