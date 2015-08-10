/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Uri;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.ValueSetCodeSystem;
import org.hl7.fhir.ValueSetCompose;
import org.hl7.fhir.ValueSetContact;
import org.hl7.fhir.ValueSetExpansion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getLockedDate <em>Locked Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getImmutable <em>Immutable</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getExtensible <em>Extensible</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getCompose <em>Compose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetImpl#getExpansion <em>Expansion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetImpl extends DomainResourceImpl implements ValueSet {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean experimental;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publisher;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetContact> contact;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getLockedDate() <em>Locked Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lockedDate;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getUseContext() <em>Use Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContext()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> useContext;

	/**
	 * The cached value of the '{@link #getImmutable() <em>Immutable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmutable()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean immutable;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String requirements;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String copyright;

	/**
	 * The cached value of the '{@link #getExtensible() <em>Extensible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensible()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean extensible;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected ValueSetCodeSystem codeSystem;

	/**
	 * The cached value of the '{@link #getCompose() <em>Compose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompose()
	 * @generated
	 * @ordered
	 */
	protected ValueSetCompose compose;

	/**
	 * The cached value of the '{@link #getExpansion() <em>Expansion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpansion()
	 * @generated
	 * @ordered
	 */
	protected ValueSetExpansion expansion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getValueSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimental(org.hl7.fhir.Boolean newExperimental, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__EXPERIMENTAL, oldExperimental, newExperimental);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperimental(org.hl7.fhir.Boolean newExperimental) {
		if (newExperimental != experimental) {
			NotificationChain msgs = null;
			if (experimental != null)
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(org.hl7.fhir.String newPublisher, NotificationChain msgs) {
		org.hl7.fhir.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(org.hl7.fhir.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ValueSetContact>(ValueSetContact.class, this, FhirPackage.VALUE_SET__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLockedDate() {
		return lockedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLockedDate(Date newLockedDate, NotificationChain msgs) {
		Date oldLockedDate = lockedDate;
		lockedDate = newLockedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__LOCKED_DATE, oldLockedDate, newLockedDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockedDate(Date newLockedDate) {
		if (newLockedDate != lockedDate) {
			NotificationChain msgs = null;
			if (lockedDate != null)
				msgs = ((InternalEObject)lockedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__LOCKED_DATE, null, msgs);
			if (newLockedDate != null)
				msgs = ((InternalEObject)newLockedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__LOCKED_DATE, null, msgs);
			msgs = basicSetLockedDate(newLockedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__LOCKED_DATE, newLockedDate, newLockedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.VALUE_SET__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getImmutable() {
		return immutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmutable(org.hl7.fhir.Boolean newImmutable, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldImmutable = immutable;
		immutable = newImmutable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__IMMUTABLE, oldImmutable, newImmutable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmutable(org.hl7.fhir.Boolean newImmutable) {
		if (newImmutable != immutable) {
			NotificationChain msgs = null;
			if (immutable != null)
				msgs = ((InternalEObject)immutable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__IMMUTABLE, null, msgs);
			if (newImmutable != null)
				msgs = ((InternalEObject)newImmutable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__IMMUTABLE, null, msgs);
			msgs = basicSetImmutable(newImmutable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__IMMUTABLE, newImmutable, newImmutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(org.hl7.fhir.String newRequirements, NotificationChain msgs) {
		org.hl7.fhir.String oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__REQUIREMENTS, oldRequirements, newRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(org.hl7.fhir.String newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(org.hl7.fhir.String newCopyright, NotificationChain msgs) {
		org.hl7.fhir.String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(org.hl7.fhir.String newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getExtensible() {
		return extensible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensible(org.hl7.fhir.Boolean newExtensible, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExtensible = extensible;
		extensible = newExtensible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__EXTENSIBLE, oldExtensible, newExtensible);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensible(org.hl7.fhir.Boolean newExtensible) {
		if (newExtensible != extensible) {
			NotificationChain msgs = null;
			if (extensible != null)
				msgs = ((InternalEObject)extensible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__EXTENSIBLE, null, msgs);
			if (newExtensible != null)
				msgs = ((InternalEObject)newExtensible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__EXTENSIBLE, null, msgs);
			msgs = basicSetExtensible(newExtensible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__EXTENSIBLE, newExtensible, newExtensible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCodeSystem getCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeSystem(ValueSetCodeSystem newCodeSystem, NotificationChain msgs) {
		ValueSetCodeSystem oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__CODE_SYSTEM, oldCodeSystem, newCodeSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystem(ValueSetCodeSystem newCodeSystem) {
		if (newCodeSystem != codeSystem) {
			NotificationChain msgs = null;
			if (codeSystem != null)
				msgs = ((InternalEObject)codeSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__CODE_SYSTEM, null, msgs);
			if (newCodeSystem != null)
				msgs = ((InternalEObject)newCodeSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__CODE_SYSTEM, null, msgs);
			msgs = basicSetCodeSystem(newCodeSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__CODE_SYSTEM, newCodeSystem, newCodeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCompose getCompose() {
		return compose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompose(ValueSetCompose newCompose, NotificationChain msgs) {
		ValueSetCompose oldCompose = compose;
		compose = newCompose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__COMPOSE, oldCompose, newCompose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompose(ValueSetCompose newCompose) {
		if (newCompose != compose) {
			NotificationChain msgs = null;
			if (compose != null)
				msgs = ((InternalEObject)compose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__COMPOSE, null, msgs);
			if (newCompose != null)
				msgs = ((InternalEObject)newCompose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__COMPOSE, null, msgs);
			msgs = basicSetCompose(newCompose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__COMPOSE, newCompose, newCompose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetExpansion getExpansion() {
		return expansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpansion(ValueSetExpansion newExpansion, NotificationChain msgs) {
		ValueSetExpansion oldExpansion = expansion;
		expansion = newExpansion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__EXPANSION, oldExpansion, newExpansion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpansion(ValueSetExpansion newExpansion) {
		if (newExpansion != expansion) {
			NotificationChain msgs = null;
			if (expansion != null)
				msgs = ((InternalEObject)expansion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__EXPANSION, null, msgs);
			if (newExpansion != null)
				msgs = ((InternalEObject)newExpansion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET__EXPANSION, null, msgs);
			msgs = basicSetExpansion(newExpansion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET__EXPANSION, newExpansion, newExpansion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VALUE_SET__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.VALUE_SET__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.VALUE_SET__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.VALUE_SET__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.VALUE_SET__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.VALUE_SET__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.VALUE_SET__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.VALUE_SET__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.VALUE_SET__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.VALUE_SET__LOCKED_DATE:
				return basicSetLockedDate(null, msgs);
			case FhirPackage.VALUE_SET__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.VALUE_SET__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.VALUE_SET__IMMUTABLE:
				return basicSetImmutable(null, msgs);
			case FhirPackage.VALUE_SET__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case FhirPackage.VALUE_SET__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.VALUE_SET__EXTENSIBLE:
				return basicSetExtensible(null, msgs);
			case FhirPackage.VALUE_SET__CODE_SYSTEM:
				return basicSetCodeSystem(null, msgs);
			case FhirPackage.VALUE_SET__COMPOSE:
				return basicSetCompose(null, msgs);
			case FhirPackage.VALUE_SET__EXPANSION:
				return basicSetExpansion(null, msgs);
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
			case FhirPackage.VALUE_SET__URL:
				return getUrl();
			case FhirPackage.VALUE_SET__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.VALUE_SET__VERSION:
				return getVersion();
			case FhirPackage.VALUE_SET__NAME:
				return getName();
			case FhirPackage.VALUE_SET__STATUS:
				return getStatus();
			case FhirPackage.VALUE_SET__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.VALUE_SET__PUBLISHER:
				return getPublisher();
			case FhirPackage.VALUE_SET__CONTACT:
				return getContact();
			case FhirPackage.VALUE_SET__DATE:
				return getDate();
			case FhirPackage.VALUE_SET__LOCKED_DATE:
				return getLockedDate();
			case FhirPackage.VALUE_SET__DESCRIPTION:
				return getDescription();
			case FhirPackage.VALUE_SET__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.VALUE_SET__IMMUTABLE:
				return getImmutable();
			case FhirPackage.VALUE_SET__REQUIREMENTS:
				return getRequirements();
			case FhirPackage.VALUE_SET__COPYRIGHT:
				return getCopyright();
			case FhirPackage.VALUE_SET__EXTENSIBLE:
				return getExtensible();
			case FhirPackage.VALUE_SET__CODE_SYSTEM:
				return getCodeSystem();
			case FhirPackage.VALUE_SET__COMPOSE:
				return getCompose();
			case FhirPackage.VALUE_SET__EXPANSION:
				return getExpansion();
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
			case FhirPackage.VALUE_SET__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.VALUE_SET__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.VALUE_SET__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VALUE_SET__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VALUE_SET__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirPackage.VALUE_SET__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.VALUE_SET__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VALUE_SET__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ValueSetContact>)newValue);
				return;
			case FhirPackage.VALUE_SET__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.VALUE_SET__LOCKED_DATE:
				setLockedDate((Date)newValue);
				return;
			case FhirPackage.VALUE_SET__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VALUE_SET__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.VALUE_SET__IMMUTABLE:
				setImmutable((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.VALUE_SET__REQUIREMENTS:
				setRequirements((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VALUE_SET__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VALUE_SET__EXTENSIBLE:
				setExtensible((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.VALUE_SET__CODE_SYSTEM:
				setCodeSystem((ValueSetCodeSystem)newValue);
				return;
			case FhirPackage.VALUE_SET__COMPOSE:
				setCompose((ValueSetCompose)newValue);
				return;
			case FhirPackage.VALUE_SET__EXPANSION:
				setExpansion((ValueSetExpansion)newValue);
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
			case FhirPackage.VALUE_SET__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.VALUE_SET__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.VALUE_SET__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VALUE_SET__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VALUE_SET__STATUS:
				setStatus((Code)null);
				return;
			case FhirPackage.VALUE_SET__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.VALUE_SET__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VALUE_SET__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.VALUE_SET__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.VALUE_SET__LOCKED_DATE:
				setLockedDate((Date)null);
				return;
			case FhirPackage.VALUE_SET__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VALUE_SET__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.VALUE_SET__IMMUTABLE:
				setImmutable((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.VALUE_SET__REQUIREMENTS:
				setRequirements((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VALUE_SET__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VALUE_SET__EXTENSIBLE:
				setExtensible((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.VALUE_SET__CODE_SYSTEM:
				setCodeSystem((ValueSetCodeSystem)null);
				return;
			case FhirPackage.VALUE_SET__COMPOSE:
				setCompose((ValueSetCompose)null);
				return;
			case FhirPackage.VALUE_SET__EXPANSION:
				setExpansion((ValueSetExpansion)null);
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
			case FhirPackage.VALUE_SET__URL:
				return url != null;
			case FhirPackage.VALUE_SET__IDENTIFIER:
				return identifier != null;
			case FhirPackage.VALUE_SET__VERSION:
				return version != null;
			case FhirPackage.VALUE_SET__NAME:
				return name != null;
			case FhirPackage.VALUE_SET__STATUS:
				return status != null;
			case FhirPackage.VALUE_SET__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.VALUE_SET__PUBLISHER:
				return publisher != null;
			case FhirPackage.VALUE_SET__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.VALUE_SET__DATE:
				return date != null;
			case FhirPackage.VALUE_SET__LOCKED_DATE:
				return lockedDate != null;
			case FhirPackage.VALUE_SET__DESCRIPTION:
				return description != null;
			case FhirPackage.VALUE_SET__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.VALUE_SET__IMMUTABLE:
				return immutable != null;
			case FhirPackage.VALUE_SET__REQUIREMENTS:
				return requirements != null;
			case FhirPackage.VALUE_SET__COPYRIGHT:
				return copyright != null;
			case FhirPackage.VALUE_SET__EXTENSIBLE:
				return extensible != null;
			case FhirPackage.VALUE_SET__CODE_SYSTEM:
				return codeSystem != null;
			case FhirPackage.VALUE_SET__COMPOSE:
				return compose != null;
			case FhirPackage.VALUE_SET__EXPANSION:
				return expansion != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueSetImpl
