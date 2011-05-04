/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.term.core.profile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.uml.term.core.profile.CD;
import org.openhealthtools.mdht.uml.term.core.profile.CR;
import org.openhealthtools.mdht.uml.term.core.profile.TermPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CDImpl#getQualifier <em>Qualifier</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CDImpl#getTranslation <em>Translation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CDImpl#getCode <em>Code</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CDImpl#getCodeSystem <em>Code System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CDImpl#getCodeSystemName <em>Code System Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CDImpl#getCodeSystemVersion <em>Code System Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CDImpl#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CDImpl extends EObjectImpl implements CD {
	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CR> qualifier;

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected EList<CD> translation;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSystem() <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected String codeSystem = CODE_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSystemName() <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystemName() <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemName()
	 * @generated
	 * @ordered
	 */
	protected String codeSystemName = CODE_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSystemVersion() <em>Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystemVersion() <em>Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected String codeSystemVersion = CODE_SYSTEM_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermPackage.Literals.CD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CR> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectContainmentEList<CR>(CR.class, this, TermPackage.CD__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CD> getTranslation() {
		if (translation == null) {
			translation = new EObjectContainmentEList<CD>(CD.class, this, TermPackage.CD__TRANSLATION);
		}
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CD__CODE, oldCode, code));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystem(String newCodeSystem) {
		String oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.CD__CODE_SYSTEM, oldCodeSystem, codeSystem));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCodeSystemName() {
		return codeSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystemName(String newCodeSystemName) {
		String oldCodeSystemName = codeSystemName;
		codeSystemName = newCodeSystemName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.CD__CODE_SYSTEM_NAME, oldCodeSystemName, codeSystemName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCodeSystemVersion() {
		return codeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystemVersion(String newCodeSystemVersion) {
		String oldCodeSystemVersion = codeSystemVersion;
		codeSystemVersion = newCodeSystemVersion;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.CD__CODE_SYSTEM_VERSION, oldCodeSystemVersion, codeSystemVersion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.CD__DISPLAY_NAME, oldDisplayName, displayName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermPackage.CD__QUALIFIER:
				return ((InternalEList<?>) getQualifier()).basicRemove(otherEnd, msgs);
			case TermPackage.CD__TRANSLATION:
				return ((InternalEList<?>) getTranslation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TermPackage.CD__QUALIFIER:
				return getQualifier();
			case TermPackage.CD__TRANSLATION:
				return getTranslation();
			case TermPackage.CD__CODE:
				return getCode();
			case TermPackage.CD__CODE_SYSTEM:
				return getCodeSystem();
			case TermPackage.CD__CODE_SYSTEM_NAME:
				return getCodeSystemName();
			case TermPackage.CD__CODE_SYSTEM_VERSION:
				return getCodeSystemVersion();
			case TermPackage.CD__DISPLAY_NAME:
				return getDisplayName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TermPackage.CD__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends CR>) newValue);
				return;
			case TermPackage.CD__TRANSLATION:
				getTranslation().clear();
				getTranslation().addAll((Collection<? extends CD>) newValue);
				return;
			case TermPackage.CD__CODE:
				setCode((String) newValue);
				return;
			case TermPackage.CD__CODE_SYSTEM:
				setCodeSystem((String) newValue);
				return;
			case TermPackage.CD__CODE_SYSTEM_NAME:
				setCodeSystemName((String) newValue);
				return;
			case TermPackage.CD__CODE_SYSTEM_VERSION:
				setCodeSystemVersion((String) newValue);
				return;
			case TermPackage.CD__DISPLAY_NAME:
				setDisplayName((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TermPackage.CD__QUALIFIER:
				getQualifier().clear();
				return;
			case TermPackage.CD__TRANSLATION:
				getTranslation().clear();
				return;
			case TermPackage.CD__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case TermPackage.CD__CODE_SYSTEM:
				setCodeSystem(CODE_SYSTEM_EDEFAULT);
				return;
			case TermPackage.CD__CODE_SYSTEM_NAME:
				setCodeSystemName(CODE_SYSTEM_NAME_EDEFAULT);
				return;
			case TermPackage.CD__CODE_SYSTEM_VERSION:
				setCodeSystemVersion(CODE_SYSTEM_VERSION_EDEFAULT);
				return;
			case TermPackage.CD__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TermPackage.CD__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case TermPackage.CD__TRANSLATION:
				return translation != null && !translation.isEmpty();
			case TermPackage.CD__CODE:
				return CODE_EDEFAULT == null
						? code != null
						: !CODE_EDEFAULT.equals(code);
			case TermPackage.CD__CODE_SYSTEM:
				return CODE_SYSTEM_EDEFAULT == null
						? codeSystem != null
						: !CODE_SYSTEM_EDEFAULT.equals(codeSystem);
			case TermPackage.CD__CODE_SYSTEM_NAME:
				return CODE_SYSTEM_NAME_EDEFAULT == null
						? codeSystemName != null
						: !CODE_SYSTEM_NAME_EDEFAULT.equals(codeSystemName);
			case TermPackage.CD__CODE_SYSTEM_VERSION:
				return CODE_SYSTEM_VERSION_EDEFAULT == null
						? codeSystemVersion != null
						: !CODE_SYSTEM_VERSION_EDEFAULT.equals(codeSystemVersion);
			case TermPackage.CD__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null
						? displayName != null
						: !DISPLAY_NAME_EDEFAULT.equals(displayName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
		result.append(')');
		return result.toString();
	}

} // CDImpl
