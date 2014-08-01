/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.datatypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl#getOriginalText <em>Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl#getQualifiers <em>Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl#getTranslations <em>Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl#getCodeSystemName <em>Code System Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl#getCodeSystemVersion <em>Code System Version</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl#getSDTCValueSet <em>SDTC Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl#getSDTCValueSetVersion <em>SDTC Value Set Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CDImpl extends ANYImpl implements CD {
	/**
	 * The cached value of the '{@link #getOriginalText() <em>Original Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalText()
	 * @generated
	 * @ordered
	 */
	protected ED originalText;

	/**
	 * The cached value of the '{@link #getQualifiers() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CR> qualifiers;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected EList<CD> translations;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSystem() <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected String codeSystem = CODE_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSystemName() <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystemName() <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystemName()
	 * @generated
	 * @ordered
	 */
	protected String codeSystemName = CODE_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSystemVersion() <em>Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystemVersion() <em>Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected String codeSystemVersion = CODE_SYSTEM_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSDTCValueSet() <em>SDTC Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDTCValueSet()
	 * @generated
	 * @ordered
	 */
	protected static final String SDTC_VALUE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSDTCValueSet() <em>SDTC Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDTCValueSet()
	 * @generated
	 * @ordered
	 */
	protected String sDTCValueSet = SDTC_VALUE_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSDTCValueSetVersion() <em>SDTC Value Set Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDTCValueSetVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SDTC_VALUE_SET_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSDTCValueSetVersion() <em>SDTC Value Set Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDTCValueSetVersion()
	 * @generated
	 * @ordered
	 */
	protected String sDTCValueSetVersion = SDTC_VALUE_SET_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.CD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED getOriginalText() {
		return originalText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalText(ED newOriginalText, NotificationChain msgs) {
		ED oldOriginalText = originalText;
		originalText = newOriginalText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.CD__ORIGINAL_TEXT, oldOriginalText, newOriginalText);
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
	public void setOriginalText(ED newOriginalText) {
		if (newOriginalText != originalText) {
			NotificationChain msgs = null;
			if (originalText != null) {
				msgs = ((InternalEObject) originalText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						DatatypesPackage.CD__ORIGINAL_TEXT, null, msgs);
			}
			if (newOriginalText != null) {
				msgs = ((InternalEObject) newOriginalText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						DatatypesPackage.CD__ORIGINAL_TEXT, null, msgs);
			}
			msgs = basicSetOriginalText(newOriginalText, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.CD__ORIGINAL_TEXT, newOriginalText, newOriginalText));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CR> getQualifiers() {
		if (qualifiers == null) {
			qualifiers = new EObjectContainmentEList<CR>(CR.class, this, DatatypesPackage.CD__QUALIFIER);
		}
		return qualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CD> getTranslations() {
		if (translations == null) {
			translations = new EObjectContainmentEList<CD>(CD.class, this, DatatypesPackage.CD__TRANSLATION);
		}
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.CD__CODE, oldCode, code));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystem(String newCodeSystem) {
		String oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.CD__CODE_SYSTEM, oldCodeSystem, codeSystem));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeSystemName() {
		return codeSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystemName(String newCodeSystemName) {
		String oldCodeSystemName = codeSystemName;
		codeSystemName = newCodeSystemName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.CD__CODE_SYSTEM_NAME, oldCodeSystemName, codeSystemName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeSystemVersion() {
		return codeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystemVersion(String newCodeSystemVersion) {
		String oldCodeSystemVersion = codeSystemVersion;
		codeSystemVersion = newCodeSystemVersion;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.CD__CODE_SYSTEM_VERSION, oldCodeSystemVersion,
				codeSystemVersion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.CD__DISPLAY_NAME, oldDisplayName, displayName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSDTCValueSet() {
		return sDTCValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDTCValueSet(String newSDTCValueSet) {
		String oldSDTCValueSet = sDTCValueSet;
		sDTCValueSet = newSDTCValueSet;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.CD__SDTC_VALUE_SET, oldSDTCValueSet, sDTCValueSet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSDTCValueSetVersion() {
		return sDTCValueSetVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDTCValueSetVersion(String newSDTCValueSetVersion) {
		String oldSDTCValueSetVersion = sDTCValueSetVersion;
		sDTCValueSetVersion = newSDTCValueSetVersion;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.CD__SDTC_VALUE_SET_VERSION, oldSDTCValueSetVersion,
				sDTCValueSetVersion));
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
			case DatatypesPackage.CD__ORIGINAL_TEXT:
				return basicSetOriginalText(null, msgs);
			case DatatypesPackage.CD__QUALIFIER:
				return ((InternalEList<?>) getQualifiers()).basicRemove(otherEnd, msgs);
			case DatatypesPackage.CD__TRANSLATION:
				return ((InternalEList<?>) getTranslations()).basicRemove(otherEnd, msgs);
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
			case DatatypesPackage.CD__ORIGINAL_TEXT:
				return getOriginalText();
			case DatatypesPackage.CD__QUALIFIER:
				return getQualifiers();
			case DatatypesPackage.CD__TRANSLATION:
				return getTranslations();
			case DatatypesPackage.CD__CODE:
				return getCode();
			case DatatypesPackage.CD__CODE_SYSTEM:
				return getCodeSystem();
			case DatatypesPackage.CD__CODE_SYSTEM_NAME:
				return getCodeSystemName();
			case DatatypesPackage.CD__CODE_SYSTEM_VERSION:
				return getCodeSystemVersion();
			case DatatypesPackage.CD__DISPLAY_NAME:
				return getDisplayName();
			case DatatypesPackage.CD__SDTC_VALUE_SET:
				return getSDTCValueSet();
			case DatatypesPackage.CD__SDTC_VALUE_SET_VERSION:
				return getSDTCValueSetVersion();
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
			case DatatypesPackage.CD__ORIGINAL_TEXT:
				setOriginalText((ED) newValue);
				return;
			case DatatypesPackage.CD__QUALIFIER:
				getQualifiers().clear();
				getQualifiers().addAll((Collection<? extends CR>) newValue);
				return;
			case DatatypesPackage.CD__TRANSLATION:
				getTranslations().clear();
				getTranslations().addAll((Collection<? extends CD>) newValue);
				return;
			case DatatypesPackage.CD__CODE:
				setCode((String) newValue);
				return;
			case DatatypesPackage.CD__CODE_SYSTEM:
				setCodeSystem((String) newValue);
				return;
			case DatatypesPackage.CD__CODE_SYSTEM_NAME:
				setCodeSystemName((String) newValue);
				return;
			case DatatypesPackage.CD__CODE_SYSTEM_VERSION:
				setCodeSystemVersion((String) newValue);
				return;
			case DatatypesPackage.CD__DISPLAY_NAME:
				setDisplayName((String) newValue);
				return;
			case DatatypesPackage.CD__SDTC_VALUE_SET:
				setSDTCValueSet((String) newValue);
				return;
			case DatatypesPackage.CD__SDTC_VALUE_SET_VERSION:
				setSDTCValueSetVersion((String) newValue);
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
			case DatatypesPackage.CD__ORIGINAL_TEXT:
				setOriginalText((ED) null);
				return;
			case DatatypesPackage.CD__QUALIFIER:
				getQualifiers().clear();
				return;
			case DatatypesPackage.CD__TRANSLATION:
				getTranslations().clear();
				return;
			case DatatypesPackage.CD__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DatatypesPackage.CD__CODE_SYSTEM:
				setCodeSystem(CODE_SYSTEM_EDEFAULT);
				return;
			case DatatypesPackage.CD__CODE_SYSTEM_NAME:
				setCodeSystemName(CODE_SYSTEM_NAME_EDEFAULT);
				return;
			case DatatypesPackage.CD__CODE_SYSTEM_VERSION:
				setCodeSystemVersion(CODE_SYSTEM_VERSION_EDEFAULT);
				return;
			case DatatypesPackage.CD__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case DatatypesPackage.CD__SDTC_VALUE_SET:
				setSDTCValueSet(SDTC_VALUE_SET_EDEFAULT);
				return;
			case DatatypesPackage.CD__SDTC_VALUE_SET_VERSION:
				setSDTCValueSetVersion(SDTC_VALUE_SET_VERSION_EDEFAULT);
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
			case DatatypesPackage.CD__ORIGINAL_TEXT:
				return originalText != null;
			case DatatypesPackage.CD__QUALIFIER:
				return qualifiers != null && !qualifiers.isEmpty();
			case DatatypesPackage.CD__TRANSLATION:
				return translations != null && !translations.isEmpty();
			case DatatypesPackage.CD__CODE:
				return CODE_EDEFAULT == null
						? code != null
						: !CODE_EDEFAULT.equals(code);
			case DatatypesPackage.CD__CODE_SYSTEM:
				return CODE_SYSTEM_EDEFAULT == null
						? codeSystem != null
						: !CODE_SYSTEM_EDEFAULT.equals(codeSystem);
			case DatatypesPackage.CD__CODE_SYSTEM_NAME:
				return CODE_SYSTEM_NAME_EDEFAULT == null
						? codeSystemName != null
						: !CODE_SYSTEM_NAME_EDEFAULT.equals(codeSystemName);
			case DatatypesPackage.CD__CODE_SYSTEM_VERSION:
				return CODE_SYSTEM_VERSION_EDEFAULT == null
						? codeSystemVersion != null
						: !CODE_SYSTEM_VERSION_EDEFAULT.equals(codeSystemVersion);
			case DatatypesPackage.CD__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null
						? displayName != null
						: !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case DatatypesPackage.CD__SDTC_VALUE_SET:
				return SDTC_VALUE_SET_EDEFAULT == null
						? sDTCValueSet != null
						: !SDTC_VALUE_SET_EDEFAULT.equals(sDTCValueSet);
			case DatatypesPackage.CD__SDTC_VALUE_SET_VERSION:
				return SDTC_VALUE_SET_VERSION_EDEFAULT == null
						? sDTCValueSetVersion != null
						: !SDTC_VALUE_SET_VERSION_EDEFAULT.equals(sDTCValueSetVersion);
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
		result.append(" (code: ");
		result.append(code);
		result.append(", codeSystem: ");
		result.append(codeSystem);
		result.append(", codeSystemName: ");
		result.append(codeSystemName);
		result.append(", codeSystemVersion: ");
		result.append(codeSystemVersion);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", sDTCValueSet: ");
		result.append(sDTCValueSet);
		result.append(", sDTCValueSetVersion: ");
		result.append(sDTCValueSetVersion);
		result.append(')');
		return result.toString();
	}

} // CDImpl
