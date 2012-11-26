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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Form Markup With Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FreeFormMarkupWithLanguageImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FreeFormMarkupWithLanguageImpl#getLastTranslated <em>Last Translated</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FreeFormMarkupWithLanguageImpl#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FreeFormMarkupWithLanguageImpl extends VariousMixedContentImpl implements FreeFormMarkupWithLanguage {
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
	 * The default value of the '{@link #getLastTranslated() <em>Last Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTranslated()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_TRANSLATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastTranslated() <em>Last Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTranslated()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastTranslated = LAST_TRANSLATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeFormMarkupWithLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.FREE_FORM_MARKUP_WITH_LANGUAGE;
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
				this, Notification.SET, Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__LANG, oldLang, lang, !oldLangESet));
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
				this, Notification.UNSET, Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__LANG, oldLang, LANG_EDEFAULT,
				oldLangESet));
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
	public XMLGregorianCalendar getLastTranslated() {
		return lastTranslated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastTranslated(XMLGregorianCalendar newLastTranslated) {
		XMLGregorianCalendar oldLastTranslated = lastTranslated;
		lastTranslated = newLastTranslated;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__LAST_TRANSLATED, oldLastTranslated,
				lastTranslated));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__MIME_TYPE, oldMimeType, mimeType));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__LANG:
				return getLang();
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__LAST_TRANSLATED:
				return getLastTranslated();
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__MIME_TYPE:
				return getMimeType();
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
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__LANG:
				setLang((String) newValue);
				return;
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__LAST_TRANSLATED:
				setLastTranslated((XMLGregorianCalendar) newValue);
				return;
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__MIME_TYPE:
				setMimeType((String) newValue);
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
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__LANG:
				unsetLang();
				return;
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__LAST_TRANSLATED:
				setLastTranslated(LAST_TRANSLATED_EDEFAULT);
				return;
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
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
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__LANG:
				return isSetLang();
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__LAST_TRANSLATED:
				return LAST_TRANSLATED_EDEFAULT == null
						? lastTranslated != null
						: !LAST_TRANSLATED_EDEFAULT.equals(lastTranslated);
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null
						? mimeType != null
						: !MIME_TYPE_EDEFAULT.equals(mimeType);
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
		result.append(" (lang: ");
		if (langESet) {
			result.append(lang);
		} else {
			result.append("<unset>");
		}
		result.append(", lastTranslated: ");
		result.append(lastTranslated);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(')');
		return result.toString();
	}

} // FreeFormMarkupWithLanguageImpl
