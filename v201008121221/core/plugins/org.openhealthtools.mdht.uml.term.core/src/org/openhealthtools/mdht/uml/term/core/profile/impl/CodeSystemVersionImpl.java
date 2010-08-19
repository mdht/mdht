/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.term.core.profile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Enumeration;

import org.openhealthtools.mdht.uml.term.core.profile.TermPackage;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.StatusKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemVersionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemVersionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemVersionImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemVersionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemVersionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemVersionImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemVersionImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemVersionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemVersionImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemVersionImpl#getBase_Enumeration <em>Base Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeSystemVersionImpl extends EObjectImpl implements CodeSystemVersion {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected String fullName = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECTIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected String effectiveDate = EFFECTIVE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected String releaseDate = RELEASE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final StatusKind STATUS_EDEFAULT = StatusKind.ACTIVE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusKind status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected String statusDate = STATUS_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Enumeration() <em>Base Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Enumeration()
	 * @generated
	 * @ordered
	 */
	protected Enumeration base_Enumeration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSystemVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermPackage.Literals.CODE_SYSTEM_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CODE_SYSTEM_VERSION__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CODE_SYSTEM_VERSION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		String oldFullName = fullName;
		fullName = newFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CODE_SYSTEM_VERSION__FULL_NAME, oldFullName, fullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CODE_SYSTEM_VERSION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CODE_SYSTEM_VERSION__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDate(String newEffectiveDate) {
		String oldEffectiveDate = effectiveDate;
		effectiveDate = newEffectiveDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CODE_SYSTEM_VERSION__EFFECTIVE_DATE, oldEffectiveDate, effectiveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseDate(String newReleaseDate) {
		String oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CODE_SYSTEM_VERSION__RELEASE_DATE, oldReleaseDate, releaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusKind getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusKind newStatus) {
		StatusKind oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CODE_SYSTEM_VERSION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDate(String newStatusDate) {
		String oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CODE_SYSTEM_VERSION__STATUS_DATE, oldStatusDate, statusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getBase_Enumeration() {
		if (base_Enumeration != null && base_Enumeration.eIsProxy()) {
			InternalEObject oldBase_Enumeration = (InternalEObject)base_Enumeration;
			base_Enumeration = (Enumeration)eResolveProxy(oldBase_Enumeration);
			if (base_Enumeration != oldBase_Enumeration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TermPackage.CODE_SYSTEM_VERSION__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
			}
		}
		return base_Enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetBase_Enumeration() {
		return base_Enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Enumeration(Enumeration newBase_Enumeration) {
		Enumeration oldBase_Enumeration = base_Enumeration;
		base_Enumeration = newBase_Enumeration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CODE_SYSTEM_VERSION__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TermPackage.CODE_SYSTEM_VERSION__IDENTIFIER:
				return getIdentifier();
			case TermPackage.CODE_SYSTEM_VERSION__VERSION:
				return getVersion();
			case TermPackage.CODE_SYSTEM_VERSION__FULL_NAME:
				return getFullName();
			case TermPackage.CODE_SYSTEM_VERSION__SOURCE:
				return getSource();
			case TermPackage.CODE_SYSTEM_VERSION__URL:
				return getUrl();
			case TermPackage.CODE_SYSTEM_VERSION__EFFECTIVE_DATE:
				return getEffectiveDate();
			case TermPackage.CODE_SYSTEM_VERSION__RELEASE_DATE:
				return getReleaseDate();
			case TermPackage.CODE_SYSTEM_VERSION__STATUS:
				return getStatus();
			case TermPackage.CODE_SYSTEM_VERSION__STATUS_DATE:
				return getStatusDate();
			case TermPackage.CODE_SYSTEM_VERSION__BASE_ENUMERATION:
				if (resolve) return getBase_Enumeration();
				return basicGetBase_Enumeration();
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
			case TermPackage.CODE_SYSTEM_VERSION__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__VERSION:
				setVersion((String)newValue);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__FULL_NAME:
				setFullName((String)newValue);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__SOURCE:
				setSource((String)newValue);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__URL:
				setUrl((String)newValue);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__EFFECTIVE_DATE:
				setEffectiveDate((String)newValue);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__RELEASE_DATE:
				setReleaseDate((String)newValue);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__STATUS:
				setStatus((StatusKind)newValue);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__STATUS_DATE:
				setStatusDate((String)newValue);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__BASE_ENUMERATION:
				setBase_Enumeration((Enumeration)newValue);
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
			case TermPackage.CODE_SYSTEM_VERSION__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__URL:
				setUrl(URL_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__EFFECTIVE_DATE:
				setEffectiveDate(EFFECTIVE_DATE_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__STATUS_DATE:
				setStatusDate(STATUS_DATE_EDEFAULT);
				return;
			case TermPackage.CODE_SYSTEM_VERSION__BASE_ENUMERATION:
				setBase_Enumeration((Enumeration)null);
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
			case TermPackage.CODE_SYSTEM_VERSION__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case TermPackage.CODE_SYSTEM_VERSION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case TermPackage.CODE_SYSTEM_VERSION__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
			case TermPackage.CODE_SYSTEM_VERSION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case TermPackage.CODE_SYSTEM_VERSION__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case TermPackage.CODE_SYSTEM_VERSION__EFFECTIVE_DATE:
				return EFFECTIVE_DATE_EDEFAULT == null ? effectiveDate != null : !EFFECTIVE_DATE_EDEFAULT.equals(effectiveDate);
			case TermPackage.CODE_SYSTEM_VERSION__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? releaseDate != null : !RELEASE_DATE_EDEFAULT.equals(releaseDate);
			case TermPackage.CODE_SYSTEM_VERSION__STATUS:
				return status != STATUS_EDEFAULT;
			case TermPackage.CODE_SYSTEM_VERSION__STATUS_DATE:
				return STATUS_DATE_EDEFAULT == null ? statusDate != null : !STATUS_DATE_EDEFAULT.equals(statusDate);
			case TermPackage.CODE_SYSTEM_VERSION__BASE_ENUMERATION:
				return base_Enumeration != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		
		return base_Enumeration.getQualifiedName();

//		StringBuffer result = new StringBuffer(super.toString());
//		result.append(" (identifier: ");
//		result.append(identifier);
//		result.append(", version: ");
//		result.append(version);
//		result.append(", fullName: ");
//		result.append(fullName);
//		result.append(", source: ");
//		result.append(source);
//		result.append(", url: ");
//		result.append(url);
//		result.append(", effectiveDate: ");
//		result.append(effectiveDate);
//		result.append(", releaseDate: ");
//		result.append(releaseDate);
//		result.append(", status: ");
//		result.append(status);
//		result.append(", statusDate: ");
//		result.append(statusDate);
//		result.append(')');
//		return result.toString();
	}

} //CodeSystemVersionImpl
