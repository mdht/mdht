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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabulary Code Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyCodeRefImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyCodeRefImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyCodeRefImpl#getCodePrintName <em>Code Print Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyCodeRefImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyCodeRefImpl#getCodeSystemName <em>Code System Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyCodeRefImpl#getCodeSystemVersion <em>Code System Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocabularyCodeRefImpl extends EObjectImpl implements VocabularyCodeRef {
	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<VocabularyCodeRef> qualifier;

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
	 * The default value of the '{@link #getCodePrintName() <em>Code Print Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePrintName()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_PRINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodePrintName() <em>Code Print Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePrintName()
	 * @generated
	 * @ordered
	 */
	protected String codePrintName = CODE_PRINT_NAME_EDEFAULT;

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
	protected static final XMLGregorianCalendar CODE_SYSTEM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystemVersion() <em>Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar codeSystemVersion = CODE_SYSTEM_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyCodeRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.VOCABULARY_CODE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VocabularyCodeRef> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectContainmentEList<VocabularyCodeRef>(
				VocabularyCodeRef.class, this, Mif2Package.VOCABULARY_CODE_REF__QUALIFIER);
		}
		return qualifier;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.VOCABULARY_CODE_REF__CODE, oldCode, code));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodePrintName() {
		return codePrintName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePrintName(String newCodePrintName) {
		String oldCodePrintName = codePrintName;
		codePrintName = newCodePrintName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_CODE_REF__CODE_PRINT_NAME, oldCodePrintName,
				codePrintName));
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
				this, Notification.SET, Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM, oldCodeSystem, codeSystem));
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
				this, Notification.SET, Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM_NAME, oldCodeSystemName,
				codeSystemName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCodeSystemVersion() {
		return codeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystemVersion(XMLGregorianCalendar newCodeSystemVersion) {
		XMLGregorianCalendar oldCodeSystemVersion = codeSystemVersion;
		codeSystemVersion = newCodeSystemVersion;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM_VERSION, oldCodeSystemVersion,
				codeSystemVersion));
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
			case Mif2Package.VOCABULARY_CODE_REF__QUALIFIER:
				return ((InternalEList<?>) getQualifier()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.VOCABULARY_CODE_REF__QUALIFIER:
				return getQualifier();
			case Mif2Package.VOCABULARY_CODE_REF__CODE:
				return getCode();
			case Mif2Package.VOCABULARY_CODE_REF__CODE_PRINT_NAME:
				return getCodePrintName();
			case Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM:
				return getCodeSystem();
			case Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM_NAME:
				return getCodeSystemName();
			case Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM_VERSION:
				return getCodeSystemVersion();
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
			case Mif2Package.VOCABULARY_CODE_REF__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends VocabularyCodeRef>) newValue);
				return;
			case Mif2Package.VOCABULARY_CODE_REF__CODE:
				setCode((String) newValue);
				return;
			case Mif2Package.VOCABULARY_CODE_REF__CODE_PRINT_NAME:
				setCodePrintName((String) newValue);
				return;
			case Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM:
				setCodeSystem((String) newValue);
				return;
			case Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM_NAME:
				setCodeSystemName((String) newValue);
				return;
			case Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM_VERSION:
				setCodeSystemVersion((XMLGregorianCalendar) newValue);
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
			case Mif2Package.VOCABULARY_CODE_REF__QUALIFIER:
				getQualifier().clear();
				return;
			case Mif2Package.VOCABULARY_CODE_REF__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case Mif2Package.VOCABULARY_CODE_REF__CODE_PRINT_NAME:
				setCodePrintName(CODE_PRINT_NAME_EDEFAULT);
				return;
			case Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM:
				setCodeSystem(CODE_SYSTEM_EDEFAULT);
				return;
			case Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM_NAME:
				setCodeSystemName(CODE_SYSTEM_NAME_EDEFAULT);
				return;
			case Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM_VERSION:
				setCodeSystemVersion(CODE_SYSTEM_VERSION_EDEFAULT);
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
			case Mif2Package.VOCABULARY_CODE_REF__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case Mif2Package.VOCABULARY_CODE_REF__CODE:
				return CODE_EDEFAULT == null
						? code != null
						: !CODE_EDEFAULT.equals(code);
			case Mif2Package.VOCABULARY_CODE_REF__CODE_PRINT_NAME:
				return CODE_PRINT_NAME_EDEFAULT == null
						? codePrintName != null
						: !CODE_PRINT_NAME_EDEFAULT.equals(codePrintName);
			case Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM:
				return CODE_SYSTEM_EDEFAULT == null
						? codeSystem != null
						: !CODE_SYSTEM_EDEFAULT.equals(codeSystem);
			case Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM_NAME:
				return CODE_SYSTEM_NAME_EDEFAULT == null
						? codeSystemName != null
						: !CODE_SYSTEM_NAME_EDEFAULT.equals(codeSystemName);
			case Mif2Package.VOCABULARY_CODE_REF__CODE_SYSTEM_VERSION:
				return CODE_SYSTEM_VERSION_EDEFAULT == null
						? codeSystemVersion != null
						: !CODE_SYSTEM_VERSION_EDEFAULT.equals(codeSystemVersion);
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
		result.append(", codePrintName: ");
		result.append(codePrintName);
		result.append(", codeSystem: ");
		result.append(codeSystem);
		result.append(", codeSystemName: ");
		result.append(codeSystemName);
		result.append(", codeSystemVersion: ");
		result.append(codeSystemVersion);
		result.append(')');
		return result.toString();
	}

} // VocabularyCodeRefImpl
