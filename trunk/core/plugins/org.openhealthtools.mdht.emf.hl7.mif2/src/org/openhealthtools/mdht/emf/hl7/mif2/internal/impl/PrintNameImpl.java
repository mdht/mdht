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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.CodeIcon;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PrintName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Print Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PrintNameImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PrintNameImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PrintNameImpl#isPreferredForLanguage <em>Preferred For Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PrintNameImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrintNameImpl extends EObjectImpl implements PrintName {
	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected CodeIcon icon;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPreferredForLanguage() <em>Preferred For Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreferredForLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREFERRED_FOR_LANGUAGE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPreferredForLanguage() <em>Preferred For Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreferredForLanguage()
	 * @generated
	 * @ordered
	 */
	protected boolean preferredForLanguage = PREFERRED_FOR_LANGUAGE_EDEFAULT;

	/**
	 * This is true if the Preferred For Language attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preferredForLanguageESet;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrintNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.PRINT_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeIcon getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(CodeIcon newIcon, NotificationChain msgs) {
		CodeIcon oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.PRINT_NAME__ICON, oldIcon, newIcon);
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
	public void setIcon(CodeIcon newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null) {
				msgs = ((InternalEObject) icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.PRINT_NAME__ICON, null, msgs);
			}
			if (newIcon != null) {
				msgs = ((InternalEObject) newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.PRINT_NAME__ICON, null, msgs);
			}
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PRINT_NAME__ICON, newIcon, newIcon));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PRINT_NAME__LANGUAGE, oldLanguage, language));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPreferredForLanguage() {
		return preferredForLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredForLanguage(boolean newPreferredForLanguage) {
		boolean oldPreferredForLanguage = preferredForLanguage;
		preferredForLanguage = newPreferredForLanguage;
		boolean oldPreferredForLanguageESet = preferredForLanguageESet;
		preferredForLanguageESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PRINT_NAME__PREFERRED_FOR_LANGUAGE, oldPreferredForLanguage,
				preferredForLanguage, !oldPreferredForLanguageESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreferredForLanguage() {
		boolean oldPreferredForLanguage = preferredForLanguage;
		boolean oldPreferredForLanguageESet = preferredForLanguageESet;
		preferredForLanguage = PREFERRED_FOR_LANGUAGE_EDEFAULT;
		preferredForLanguageESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.PRINT_NAME__PREFERRED_FOR_LANGUAGE, oldPreferredForLanguage,
				PREFERRED_FOR_LANGUAGE_EDEFAULT, oldPreferredForLanguageESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreferredForLanguage() {
		return preferredForLanguageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PRINT_NAME__TEXT, oldText, text));
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
			case Mif2Package.PRINT_NAME__ICON:
				return basicSetIcon(null, msgs);
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
			case Mif2Package.PRINT_NAME__ICON:
				return getIcon();
			case Mif2Package.PRINT_NAME__LANGUAGE:
				return getLanguage();
			case Mif2Package.PRINT_NAME__PREFERRED_FOR_LANGUAGE:
				return isPreferredForLanguage()
						? Boolean.TRUE
						: Boolean.FALSE;
			case Mif2Package.PRINT_NAME__TEXT:
				return getText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.PRINT_NAME__ICON:
				setIcon((CodeIcon) newValue);
				return;
			case Mif2Package.PRINT_NAME__LANGUAGE:
				setLanguage((String) newValue);
				return;
			case Mif2Package.PRINT_NAME__PREFERRED_FOR_LANGUAGE:
				setPreferredForLanguage(((Boolean) newValue).booleanValue());
				return;
			case Mif2Package.PRINT_NAME__TEXT:
				setText((String) newValue);
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
			case Mif2Package.PRINT_NAME__ICON:
				setIcon((CodeIcon) null);
				return;
			case Mif2Package.PRINT_NAME__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case Mif2Package.PRINT_NAME__PREFERRED_FOR_LANGUAGE:
				unsetPreferredForLanguage();
				return;
			case Mif2Package.PRINT_NAME__TEXT:
				setText(TEXT_EDEFAULT);
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
			case Mif2Package.PRINT_NAME__ICON:
				return icon != null;
			case Mif2Package.PRINT_NAME__LANGUAGE:
				return LANGUAGE_EDEFAULT == null
						? language != null
						: !LANGUAGE_EDEFAULT.equals(language);
			case Mif2Package.PRINT_NAME__PREFERRED_FOR_LANGUAGE:
				return isSetPreferredForLanguage();
			case Mif2Package.PRINT_NAME__TEXT:
				return TEXT_EDEFAULT == null
						? text != null
						: !TEXT_EDEFAULT.equals(text);
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
		result.append(" (language: ");
		result.append(language);
		result.append(", preferredForLanguage: ");
		if (preferredForLanguageESet) {
			result.append(preferredForLanguage);
		} else {
			result.append("<unset>");
		}
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} // PrintNameImpl
