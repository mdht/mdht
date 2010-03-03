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

import org.openhealthtools.mdht.uml.term.core.profile.BindingKind;
import org.openhealthtools.mdht.uml.term.core.profile.TermPackage;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.StatusKind;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetType;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getRevisionDate <em>Revision Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetVersionImpl#getBase_Enumeration <em>Base Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueSetVersionImpl extends EObjectImpl implements ValueSetVersion {
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
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected String definition = DEFINITION_EDEFAULT;

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
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected String expirationDate = EXPIRATION_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getRevisionDate() <em>Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionDate() <em>Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected String revisionDate = REVISION_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ValueSetType TYPE_EDEFAULT = ValueSetType.EXTENSIONAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ValueSetType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected static final BindingKind BINDING_EDEFAULT = BindingKind.STATIC;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected BindingKind binding = BINDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersion codeSystem;

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
	protected ValueSetVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermPackage.Literals.VALUE_SET_VERSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__FULL_NAME, oldFullName, fullName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(String newDefinition) {
		String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__DEFINITION, oldDefinition, definition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__EFFECTIVE_DATE, oldEffectiveDate, effectiveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(String newExpirationDate) {
		String oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__EXPIRATION_DATE, oldExpirationDate, expirationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__RELEASE_DATE, oldReleaseDate, releaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevisionDate() {
		return revisionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionDate(String newRevisionDate) {
		String oldRevisionDate = revisionDate;
		revisionDate = newRevisionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__REVISION_DATE, oldRevisionDate, revisionDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__STATUS_DATE, oldStatusDate, statusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ValueSetType newType) {
		ValueSetType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingKind getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(BindingKind newBinding) {
		BindingKind oldBinding = binding;
		binding = newBinding == null ? BINDING_EDEFAULT : newBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemVersion getCodeSystem() {
		if (codeSystem != null && codeSystem.eIsProxy()) {
			InternalEObject oldCodeSystem = (InternalEObject)codeSystem;
			codeSystem = (CodeSystemVersion)eResolveProxy(oldCodeSystem);
			if (codeSystem != oldCodeSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TermPackage.VALUE_SET_VERSION__CODE_SYSTEM, oldCodeSystem, codeSystem));
			}
		}
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemVersion basicGetCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystem(CodeSystemVersion newCodeSystem) {
		CodeSystemVersion oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__CODE_SYSTEM, oldCodeSystem, codeSystem));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TermPackage.VALUE_SET_VERSION__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_VERSION__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TermPackage.VALUE_SET_VERSION__IDENTIFIER:
				return getIdentifier();
			case TermPackage.VALUE_SET_VERSION__VERSION:
				return getVersion();
			case TermPackage.VALUE_SET_VERSION__FULL_NAME:
				return getFullName();
			case TermPackage.VALUE_SET_VERSION__SOURCE:
				return getSource();
			case TermPackage.VALUE_SET_VERSION__URL:
				return getUrl();
			case TermPackage.VALUE_SET_VERSION__DEFINITION:
				return getDefinition();
			case TermPackage.VALUE_SET_VERSION__EFFECTIVE_DATE:
				return getEffectiveDate();
			case TermPackage.VALUE_SET_VERSION__EXPIRATION_DATE:
				return getExpirationDate();
			case TermPackage.VALUE_SET_VERSION__RELEASE_DATE:
				return getReleaseDate();
			case TermPackage.VALUE_SET_VERSION__REVISION_DATE:
				return getRevisionDate();
			case TermPackage.VALUE_SET_VERSION__STATUS:
				return getStatus();
			case TermPackage.VALUE_SET_VERSION__STATUS_DATE:
				return getStatusDate();
			case TermPackage.VALUE_SET_VERSION__TYPE:
				return getType();
			case TermPackage.VALUE_SET_VERSION__BINDING:
				return getBinding();
			case TermPackage.VALUE_SET_VERSION__CODE_SYSTEM:
				if (resolve) return getCodeSystem();
				return basicGetCodeSystem();
			case TermPackage.VALUE_SET_VERSION__BASE_ENUMERATION:
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
			case TermPackage.VALUE_SET_VERSION__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__VERSION:
				setVersion((String)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__FULL_NAME:
				setFullName((String)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__SOURCE:
				setSource((String)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__URL:
				setUrl((String)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__DEFINITION:
				setDefinition((String)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__EFFECTIVE_DATE:
				setEffectiveDate((String)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__EXPIRATION_DATE:
				setExpirationDate((String)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__RELEASE_DATE:
				setReleaseDate((String)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__REVISION_DATE:
				setRevisionDate((String)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__STATUS:
				setStatus((StatusKind)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__STATUS_DATE:
				setStatusDate((String)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__TYPE:
				setType((ValueSetType)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__BINDING:
				setBinding((BindingKind)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__CODE_SYSTEM:
				setCodeSystem((CodeSystemVersion)newValue);
				return;
			case TermPackage.VALUE_SET_VERSION__BASE_ENUMERATION:
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
			case TermPackage.VALUE_SET_VERSION__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__URL:
				setUrl(URL_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__EFFECTIVE_DATE:
				setEffectiveDate(EFFECTIVE_DATE_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__REVISION_DATE:
				setRevisionDate(REVISION_DATE_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__STATUS_DATE:
				setStatusDate(STATUS_DATE_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__BINDING:
				setBinding(BINDING_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_VERSION__CODE_SYSTEM:
				setCodeSystem((CodeSystemVersion)null);
				return;
			case TermPackage.VALUE_SET_VERSION__BASE_ENUMERATION:
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
			case TermPackage.VALUE_SET_VERSION__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case TermPackage.VALUE_SET_VERSION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case TermPackage.VALUE_SET_VERSION__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
			case TermPackage.VALUE_SET_VERSION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case TermPackage.VALUE_SET_VERSION__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case TermPackage.VALUE_SET_VERSION__DEFINITION:
				return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
			case TermPackage.VALUE_SET_VERSION__EFFECTIVE_DATE:
				return EFFECTIVE_DATE_EDEFAULT == null ? effectiveDate != null : !EFFECTIVE_DATE_EDEFAULT.equals(effectiveDate);
			case TermPackage.VALUE_SET_VERSION__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
			case TermPackage.VALUE_SET_VERSION__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? releaseDate != null : !RELEASE_DATE_EDEFAULT.equals(releaseDate);
			case TermPackage.VALUE_SET_VERSION__REVISION_DATE:
				return REVISION_DATE_EDEFAULT == null ? revisionDate != null : !REVISION_DATE_EDEFAULT.equals(revisionDate);
			case TermPackage.VALUE_SET_VERSION__STATUS:
				return status != STATUS_EDEFAULT;
			case TermPackage.VALUE_SET_VERSION__STATUS_DATE:
				return STATUS_DATE_EDEFAULT == null ? statusDate != null : !STATUS_DATE_EDEFAULT.equals(statusDate);
			case TermPackage.VALUE_SET_VERSION__TYPE:
				return type != TYPE_EDEFAULT;
			case TermPackage.VALUE_SET_VERSION__BINDING:
				return binding != BINDING_EDEFAULT;
			case TermPackage.VALUE_SET_VERSION__CODE_SYSTEM:
				return codeSystem != null;
			case TermPackage.VALUE_SET_VERSION__BASE_ENUMERATION:
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
//		result.append(", definition: ");
//		result.append(definition);
//		result.append(", effectiveDate: ");
//		result.append(effectiveDate);
//		result.append(", expirationDate: ");
//		result.append(expirationDate);
//		result.append(", releaseDate: ");
//		result.append(releaseDate);
//		result.append(", revisionDate: ");
//		result.append(revisionDate);
//		result.append(", status: ");
//		result.append(status);
//		result.append(", statusDate: ");
//		result.append(statusDate);
//		result.append(", type: ");
//		result.append(type);
//		result.append(", binding: ");
//		result.append(binding);
//		result.append(')');
//		return result.toString();
	}

} //ValueSetVersionImpl
