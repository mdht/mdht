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

import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.RealmElement;
import org.openhealthtools.mdht.emf.hl7.mif2.StoryboardNarrative;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storyboard Narrative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardNarrativeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardNarrativeImpl#getRealmNamespace <em>Realm Namespace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardNarrativeImpl#getDeprecatedPackageLocation <em>Deprecated Package Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardNarrativeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardNarrativeImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryboardNarrativeImpl extends PackageBaseImpl implements StoryboardNarrative {
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
	 * The cached value of the '{@link #getDeprecatedPackageLocation() <em>Deprecated Package Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecatedPackageLocation()
	 * @generated
	 * @ordered
	 */
	protected PackageRef deprecatedPackageLocation;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected ComplexMarkupWithLanguage text;

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
	protected StoryboardNarrativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.STORYBOARD_NARRATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContext() {
		if (context == null) {
			context = new BasicFeatureMap(this, Mif2Package.STORYBOARD_NARRATIVE__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealmElement> getRealmNamespace() {
		return getContext().list(Mif2Package.Literals.STORYBOARD_NARRATIVE__REALM_NAMESPACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getDeprecatedPackageLocation() {
		return deprecatedPackageLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeprecatedPackageLocation(PackageRef newDeprecatedPackageLocation,
			NotificationChain msgs) {
		PackageRef oldDeprecatedPackageLocation = deprecatedPackageLocation;
		deprecatedPackageLocation = newDeprecatedPackageLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD_NARRATIVE__DEPRECATED_PACKAGE_LOCATION,
				oldDeprecatedPackageLocation, newDeprecatedPackageLocation);
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
	public void setDeprecatedPackageLocation(PackageRef newDeprecatedPackageLocation) {
		if (newDeprecatedPackageLocation != deprecatedPackageLocation) {
			NotificationChain msgs = null;
			if (deprecatedPackageLocation != null) {
				msgs = ((InternalEObject) deprecatedPackageLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD_NARRATIVE__DEPRECATED_PACKAGE_LOCATION, null, msgs);
			}
			if (newDeprecatedPackageLocation != null) {
				msgs = ((InternalEObject) newDeprecatedPackageLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD_NARRATIVE__DEPRECATED_PACKAGE_LOCATION, null, msgs);
			}
			msgs = basicSetDeprecatedPackageLocation(newDeprecatedPackageLocation, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD_NARRATIVE__DEPRECATED_PACKAGE_LOCATION,
				newDeprecatedPackageLocation, newDeprecatedPackageLocation));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexMarkupWithLanguage getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(ComplexMarkupWithLanguage newText, NotificationChain msgs) {
		ComplexMarkupWithLanguage oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD_NARRATIVE__TEXT, oldText, newText);
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
	public void setText(ComplexMarkupWithLanguage newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null) {
				msgs = ((InternalEObject) text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD_NARRATIVE__TEXT, null, msgs);
			}
			if (newText != null) {
				msgs = ((InternalEObject) newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD_NARRATIVE__TEXT, null, msgs);
			}
			msgs = basicSetText(newText, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD_NARRATIVE__TEXT, newText, newText));
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
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD_NARRATIVE__TITLE, oldTitle, title));
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
			case Mif2Package.STORYBOARD_NARRATIVE__CONTEXT:
				return ((InternalEList<?>) getContext()).basicRemove(otherEnd, msgs);
			case Mif2Package.STORYBOARD_NARRATIVE__REALM_NAMESPACE:
				return ((InternalEList<?>) getRealmNamespace()).basicRemove(otherEnd, msgs);
			case Mif2Package.STORYBOARD_NARRATIVE__DEPRECATED_PACKAGE_LOCATION:
				return basicSetDeprecatedPackageLocation(null, msgs);
			case Mif2Package.STORYBOARD_NARRATIVE__TEXT:
				return basicSetText(null, msgs);
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
			case Mif2Package.STORYBOARD_NARRATIVE__CONTEXT:
				if (coreType) {
					return getContext();
				}
				return ((FeatureMap.Internal) getContext()).getWrapper();
			case Mif2Package.STORYBOARD_NARRATIVE__REALM_NAMESPACE:
				return getRealmNamespace();
			case Mif2Package.STORYBOARD_NARRATIVE__DEPRECATED_PACKAGE_LOCATION:
				return getDeprecatedPackageLocation();
			case Mif2Package.STORYBOARD_NARRATIVE__TEXT:
				return getText();
			case Mif2Package.STORYBOARD_NARRATIVE__TITLE:
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
			case Mif2Package.STORYBOARD_NARRATIVE__CONTEXT:
				((FeatureMap.Internal) getContext()).set(newValue);
				return;
			case Mif2Package.STORYBOARD_NARRATIVE__REALM_NAMESPACE:
				getRealmNamespace().clear();
				getRealmNamespace().addAll((Collection<? extends RealmElement>) newValue);
				return;
			case Mif2Package.STORYBOARD_NARRATIVE__DEPRECATED_PACKAGE_LOCATION:
				setDeprecatedPackageLocation((PackageRef) newValue);
				return;
			case Mif2Package.STORYBOARD_NARRATIVE__TEXT:
				setText((ComplexMarkupWithLanguage) newValue);
				return;
			case Mif2Package.STORYBOARD_NARRATIVE__TITLE:
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
			case Mif2Package.STORYBOARD_NARRATIVE__CONTEXT:
				getContext().clear();
				return;
			case Mif2Package.STORYBOARD_NARRATIVE__REALM_NAMESPACE:
				getRealmNamespace().clear();
				return;
			case Mif2Package.STORYBOARD_NARRATIVE__DEPRECATED_PACKAGE_LOCATION:
				setDeprecatedPackageLocation((PackageRef) null);
				return;
			case Mif2Package.STORYBOARD_NARRATIVE__TEXT:
				setText((ComplexMarkupWithLanguage) null);
				return;
			case Mif2Package.STORYBOARD_NARRATIVE__TITLE:
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
			case Mif2Package.STORYBOARD_NARRATIVE__CONTEXT:
				return context != null && !context.isEmpty();
			case Mif2Package.STORYBOARD_NARRATIVE__REALM_NAMESPACE:
				return !getRealmNamespace().isEmpty();
			case Mif2Package.STORYBOARD_NARRATIVE__DEPRECATED_PACKAGE_LOCATION:
				return deprecatedPackageLocation != null;
			case Mif2Package.STORYBOARD_NARRATIVE__TEXT:
				return text != null;
			case Mif2Package.STORYBOARD_NARRATIVE__TITLE:
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
		result.append(" (context: ");
		result.append(context);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} // StoryboardNarrativeImpl
