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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.AnnotationDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.OtherAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.RealmElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.OtherAnnotationImpl#getOtherAnnotationContent <em>Other Annotation Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.OtherAnnotationImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.OtherAnnotationImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.OtherAnnotationImpl#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.OtherAnnotationImpl#getDerivationSupplier <em>Derivation Supplier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.OtherAnnotationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.OtherAnnotationImpl#getRealmNamespace <em>Realm Namespace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.OtherAnnotationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.OtherAnnotationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.OtherAnnotationImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.OtherAnnotationImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OtherAnnotationImpl extends AnnotationBaseImpl implements OtherAnnotation {
	/**
	 * The cached value of the '{@link #getOtherAnnotationContent() <em>Other Annotation Content</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAnnotationContent()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap otherAnnotationContent;

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
	 * The cached value of the '{@link #getDerivationSupplier() <em>Derivation Supplier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationSupplier()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationDerivation> derivationSupplier;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap context;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.OTHER_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOtherAnnotationContent() {
		if (otherAnnotationContent == null) {
			otherAnnotationContent = new BasicFeatureMap(this, Mif2Package.OTHER_ANNOTATION__OTHER_ANNOTATION_CONTENT);
		}
		return otherAnnotationContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexMarkupWithLanguage> getText() {
		return getOtherAnnotationContent().list(Mif2Package.Literals.OTHER_ANNOTATION__TEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FreeFormMarkupWithLanguage> getData() {
		return getOtherAnnotationContent().list(Mif2Package.Literals.OTHER_ANNOTATION__DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessName> getBusinessName() {
		if (businessName == null) {
			businessName = new EObjectContainmentEList<BusinessName>(
				BusinessName.class, this, Mif2Package.OTHER_ANNOTATION__BUSINESS_NAME);
		}
		return businessName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationDerivation> getDerivationSupplier() {
		if (derivationSupplier == null) {
			derivationSupplier = new EObjectContainmentEList<AnnotationDerivation>(
				AnnotationDerivation.class, this, Mif2Package.OTHER_ANNOTATION__DERIVATION_SUPPLIER);
		}
		return derivationSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContext() {
		if (context == null) {
			context = new BasicFeatureMap(this, Mif2Package.OTHER_ANNOTATION__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealmElement> getRealmNamespace() {
		return getContext().list(Mif2Package.Literals.OTHER_ANNOTATION__REALM_NAMESPACE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.OTHER_ANNOTATION__ID, oldId, id));
		}
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.OTHER_ANNOTATION__NAME, oldName, name));
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
				this, Notification.SET, Mif2Package.OTHER_ANNOTATION__SORT_KEY, oldSortKey, sortKey));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.OTHER_ANNOTATION__TYPE, oldType, type));
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
			case Mif2Package.OTHER_ANNOTATION__OTHER_ANNOTATION_CONTENT:
				return ((InternalEList<?>) getOtherAnnotationContent()).basicRemove(otherEnd, msgs);
			case Mif2Package.OTHER_ANNOTATION__TEXT:
				return ((InternalEList<?>) getText()).basicRemove(otherEnd, msgs);
			case Mif2Package.OTHER_ANNOTATION__DATA:
				return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
			case Mif2Package.OTHER_ANNOTATION__BUSINESS_NAME:
				return ((InternalEList<?>) getBusinessName()).basicRemove(otherEnd, msgs);
			case Mif2Package.OTHER_ANNOTATION__DERIVATION_SUPPLIER:
				return ((InternalEList<?>) getDerivationSupplier()).basicRemove(otherEnd, msgs);
			case Mif2Package.OTHER_ANNOTATION__CONTEXT:
				return ((InternalEList<?>) getContext()).basicRemove(otherEnd, msgs);
			case Mif2Package.OTHER_ANNOTATION__REALM_NAMESPACE:
				return ((InternalEList<?>) getRealmNamespace()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.OTHER_ANNOTATION__OTHER_ANNOTATION_CONTENT:
				if (coreType) {
					return getOtherAnnotationContent();
				}
				return ((FeatureMap.Internal) getOtherAnnotationContent()).getWrapper();
			case Mif2Package.OTHER_ANNOTATION__TEXT:
				return getText();
			case Mif2Package.OTHER_ANNOTATION__DATA:
				return getData();
			case Mif2Package.OTHER_ANNOTATION__BUSINESS_NAME:
				return getBusinessName();
			case Mif2Package.OTHER_ANNOTATION__DERIVATION_SUPPLIER:
				return getDerivationSupplier();
			case Mif2Package.OTHER_ANNOTATION__CONTEXT:
				if (coreType) {
					return getContext();
				}
				return ((FeatureMap.Internal) getContext()).getWrapper();
			case Mif2Package.OTHER_ANNOTATION__REALM_NAMESPACE:
				return getRealmNamespace();
			case Mif2Package.OTHER_ANNOTATION__ID:
				return getId();
			case Mif2Package.OTHER_ANNOTATION__NAME:
				return getName();
			case Mif2Package.OTHER_ANNOTATION__SORT_KEY:
				return getSortKey();
			case Mif2Package.OTHER_ANNOTATION__TYPE:
				return getType();
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
			case Mif2Package.OTHER_ANNOTATION__OTHER_ANNOTATION_CONTENT:
				((FeatureMap.Internal) getOtherAnnotationContent()).set(newValue);
				return;
			case Mif2Package.OTHER_ANNOTATION__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends ComplexMarkupWithLanguage>) newValue);
				return;
			case Mif2Package.OTHER_ANNOTATION__DATA:
				getData().clear();
				getData().addAll((Collection<? extends FreeFormMarkupWithLanguage>) newValue);
				return;
			case Mif2Package.OTHER_ANNOTATION__BUSINESS_NAME:
				getBusinessName().clear();
				getBusinessName().addAll((Collection<? extends BusinessName>) newValue);
				return;
			case Mif2Package.OTHER_ANNOTATION__DERIVATION_SUPPLIER:
				getDerivationSupplier().clear();
				getDerivationSupplier().addAll((Collection<? extends AnnotationDerivation>) newValue);
				return;
			case Mif2Package.OTHER_ANNOTATION__CONTEXT:
				((FeatureMap.Internal) getContext()).set(newValue);
				return;
			case Mif2Package.OTHER_ANNOTATION__REALM_NAMESPACE:
				getRealmNamespace().clear();
				getRealmNamespace().addAll((Collection<? extends RealmElement>) newValue);
				return;
			case Mif2Package.OTHER_ANNOTATION__ID:
				setId((String) newValue);
				return;
			case Mif2Package.OTHER_ANNOTATION__NAME:
				setName((String) newValue);
				return;
			case Mif2Package.OTHER_ANNOTATION__SORT_KEY:
				setSortKey((String) newValue);
				return;
			case Mif2Package.OTHER_ANNOTATION__TYPE:
				setType((String) newValue);
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
			case Mif2Package.OTHER_ANNOTATION__OTHER_ANNOTATION_CONTENT:
				getOtherAnnotationContent().clear();
				return;
			case Mif2Package.OTHER_ANNOTATION__TEXT:
				getText().clear();
				return;
			case Mif2Package.OTHER_ANNOTATION__DATA:
				getData().clear();
				return;
			case Mif2Package.OTHER_ANNOTATION__BUSINESS_NAME:
				getBusinessName().clear();
				return;
			case Mif2Package.OTHER_ANNOTATION__DERIVATION_SUPPLIER:
				getDerivationSupplier().clear();
				return;
			case Mif2Package.OTHER_ANNOTATION__CONTEXT:
				getContext().clear();
				return;
			case Mif2Package.OTHER_ANNOTATION__REALM_NAMESPACE:
				getRealmNamespace().clear();
				return;
			case Mif2Package.OTHER_ANNOTATION__ID:
				setId(ID_EDEFAULT);
				return;
			case Mif2Package.OTHER_ANNOTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.OTHER_ANNOTATION__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case Mif2Package.OTHER_ANNOTATION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case Mif2Package.OTHER_ANNOTATION__OTHER_ANNOTATION_CONTENT:
				return otherAnnotationContent != null && !otherAnnotationContent.isEmpty();
			case Mif2Package.OTHER_ANNOTATION__TEXT:
				return !getText().isEmpty();
			case Mif2Package.OTHER_ANNOTATION__DATA:
				return !getData().isEmpty();
			case Mif2Package.OTHER_ANNOTATION__BUSINESS_NAME:
				return businessName != null && !businessName.isEmpty();
			case Mif2Package.OTHER_ANNOTATION__DERIVATION_SUPPLIER:
				return derivationSupplier != null && !derivationSupplier.isEmpty();
			case Mif2Package.OTHER_ANNOTATION__CONTEXT:
				return context != null && !context.isEmpty();
			case Mif2Package.OTHER_ANNOTATION__REALM_NAMESPACE:
				return !getRealmNamespace().isEmpty();
			case Mif2Package.OTHER_ANNOTATION__ID:
				return ID_EDEFAULT == null
						? id != null
						: !ID_EDEFAULT.equals(id);
			case Mif2Package.OTHER_ANNOTATION__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case Mif2Package.OTHER_ANNOTATION__SORT_KEY:
				return SORT_KEY_EDEFAULT == null
						? sortKey != null
						: !SORT_KEY_EDEFAULT.equals(sortKey);
			case Mif2Package.OTHER_ANNOTATION__TYPE:
				return TYPE_EDEFAULT == null
						? type != null
						: !TYPE_EDEFAULT.equals(type);
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
		result.append(" (otherAnnotationContent: ");
		result.append(otherAnnotationContent);
		result.append(", context: ");
		result.append(context);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // OtherAnnotationImpl
