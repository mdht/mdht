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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.RealmElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BusinessNameImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BusinessNameImpl#getRealmNamespace <em>Realm Namespace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BusinessNameImpl#getCascadeInfo <em>Cascade Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BusinessNameImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.BusinessNameImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessNameImpl extends EObjectImpl implements BusinessName {
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
	 * The cached value of the '{@link #getCascadeInfo() <em>Cascade Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascadeInfo()
	 * @generated
	 * @ordered
	 */
	protected AnnotationCascadeInfo cascadeInfo;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = "EN";

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * This is true if the Lang attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean langESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.BUSINESS_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContext() {
		if (context == null) {
			context = new BasicFeatureMap(this, Mif2Package.BUSINESS_NAME__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealmElement> getRealmNamespace() {
		return getContext().list(Mif2Package.Literals.BUSINESS_NAME__REALM_NAMESPACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationCascadeInfo getCascadeInfo() {
		return cascadeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCascadeInfo(AnnotationCascadeInfo newCascadeInfo, NotificationChain msgs) {
		AnnotationCascadeInfo oldCascadeInfo = cascadeInfo;
		cascadeInfo = newCascadeInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.BUSINESS_NAME__CASCADE_INFO, oldCascadeInfo, newCascadeInfo);
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
	public void setCascadeInfo(AnnotationCascadeInfo newCascadeInfo) {
		if (newCascadeInfo != cascadeInfo) {
			NotificationChain msgs = null;
			if (cascadeInfo != null) {
				msgs = ((InternalEObject) cascadeInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.BUSINESS_NAME__CASCADE_INFO, null, msgs);
			}
			if (newCascadeInfo != null) {
				msgs = ((InternalEObject) newCascadeInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.BUSINESS_NAME__CASCADE_INFO, null, msgs);
			}
			msgs = basicSetCascadeInfo(newCascadeInfo, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BUSINESS_NAME__CASCADE_INFO, newCascadeInfo, newCascadeInfo));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		boolean oldLangESet = langESet;
		langESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.BUSINESS_NAME__LANG, oldLang, lang, !oldLangESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLang() {
		String oldLang = lang;
		boolean oldLangESet = langESet;
		lang = LANG_EDEFAULT;
		langESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.BUSINESS_NAME__LANG, oldLang, LANG_EDEFAULT, oldLangESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLang() {
		return langESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.BUSINESS_NAME__NAME, oldName, name));
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
			case Mif2Package.BUSINESS_NAME__CONTEXT:
				return ((InternalEList<?>) getContext()).basicRemove(otherEnd, msgs);
			case Mif2Package.BUSINESS_NAME__REALM_NAMESPACE:
				return ((InternalEList<?>) getRealmNamespace()).basicRemove(otherEnd, msgs);
			case Mif2Package.BUSINESS_NAME__CASCADE_INFO:
				return basicSetCascadeInfo(null, msgs);
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
			case Mif2Package.BUSINESS_NAME__CONTEXT:
				if (coreType) {
					return getContext();
				}
				return ((FeatureMap.Internal) getContext()).getWrapper();
			case Mif2Package.BUSINESS_NAME__REALM_NAMESPACE:
				return getRealmNamespace();
			case Mif2Package.BUSINESS_NAME__CASCADE_INFO:
				return getCascadeInfo();
			case Mif2Package.BUSINESS_NAME__LANG:
				return getLang();
			case Mif2Package.BUSINESS_NAME__NAME:
				return getName();
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
			case Mif2Package.BUSINESS_NAME__CONTEXT:
				((FeatureMap.Internal) getContext()).set(newValue);
				return;
			case Mif2Package.BUSINESS_NAME__REALM_NAMESPACE:
				getRealmNamespace().clear();
				getRealmNamespace().addAll((Collection<? extends RealmElement>) newValue);
				return;
			case Mif2Package.BUSINESS_NAME__CASCADE_INFO:
				setCascadeInfo((AnnotationCascadeInfo) newValue);
				return;
			case Mif2Package.BUSINESS_NAME__LANG:
				setLang((String) newValue);
				return;
			case Mif2Package.BUSINESS_NAME__NAME:
				setName((String) newValue);
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
			case Mif2Package.BUSINESS_NAME__CONTEXT:
				getContext().clear();
				return;
			case Mif2Package.BUSINESS_NAME__REALM_NAMESPACE:
				getRealmNamespace().clear();
				return;
			case Mif2Package.BUSINESS_NAME__CASCADE_INFO:
				setCascadeInfo((AnnotationCascadeInfo) null);
				return;
			case Mif2Package.BUSINESS_NAME__LANG:
				unsetLang();
				return;
			case Mif2Package.BUSINESS_NAME__NAME:
				setName(NAME_EDEFAULT);
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
			case Mif2Package.BUSINESS_NAME__CONTEXT:
				return context != null && !context.isEmpty();
			case Mif2Package.BUSINESS_NAME__REALM_NAMESPACE:
				return !getRealmNamespace().isEmpty();
			case Mif2Package.BUSINESS_NAME__CASCADE_INFO:
				return cascadeInfo != null;
			case Mif2Package.BUSINESS_NAME__LANG:
				return isSetLang();
			case Mif2Package.BUSINESS_NAME__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
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
		result.append(" (context: ");
		result.append(context);
		result.append(", lang: ");
		if (langESet) {
			result.append(lang);
		} else {
			result.append("<unset>");
		}
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // BusinessNameImpl
