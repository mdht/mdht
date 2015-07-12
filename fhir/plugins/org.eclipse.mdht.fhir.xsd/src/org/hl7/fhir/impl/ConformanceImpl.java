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
import org.hl7.fhir.Conformance;
import org.hl7.fhir.ConformanceContact;
import org.hl7.fhir.ConformanceDocument;
import org.hl7.fhir.ConformanceImplementation;
import org.hl7.fhir.ConformanceMessaging;
import org.hl7.fhir.ConformanceResourceStatus;
import org.hl7.fhir.ConformanceRest;
import org.hl7.fhir.ConformanceSoftware;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getAcceptUnknown <em>Accept Unknown</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getRest <em>Rest</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getMessaging <em>Messaging</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceImpl#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceImpl extends DomainResourceImpl implements Conformance {
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
	protected EList<ConformanceContact> contact;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ConformanceResourceStatus status;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected ConformanceSoftware software;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected ConformanceImplementation implementation;

	/**
	 * The cached value of the '{@link #getFhirVersion() <em>Fhir Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirVersion()
	 * @generated
	 * @ordered
	 */
	protected Id fhirVersion;

	/**
	 * The cached value of the '{@link #getAcceptUnknown() <em>Accept Unknown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptUnknown()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean acceptUnknown;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> format;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> profile;

	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceRest> rest;

	/**
	 * The cached value of the '{@link #getMessaging() <em>Messaging</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessaging()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceMessaging> messaging;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceDocument> document;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConformance();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ConformanceContact>(ConformanceContact.class, this, FhirPackage.CONFORMANCE__CONTACT);
		}
		return contact;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__REQUIREMENTS, oldRequirements, newRequirements);
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
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__REQUIREMENTS, newRequirements, newRequirements));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceResourceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ConformanceResourceStatus newStatus, NotificationChain msgs) {
		ConformanceResourceStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ConformanceResourceStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceSoftware getSoftware() {
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftware(ConformanceSoftware newSoftware, NotificationChain msgs) {
		ConformanceSoftware oldSoftware = software;
		software = newSoftware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__SOFTWARE, oldSoftware, newSoftware);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware(ConformanceSoftware newSoftware) {
		if (newSoftware != software) {
			NotificationChain msgs = null;
			if (software != null)
				msgs = ((InternalEObject)software).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__SOFTWARE, null, msgs);
			if (newSoftware != null)
				msgs = ((InternalEObject)newSoftware).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__SOFTWARE, null, msgs);
			msgs = basicSetSoftware(newSoftware, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__SOFTWARE, newSoftware, newSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceImplementation getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(ConformanceImplementation newImplementation, NotificationChain msgs) {
		ConformanceImplementation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__IMPLEMENTATION, oldImplementation, newImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(ConformanceImplementation newImplementation) {
		if (newImplementation != implementation) {
			NotificationChain msgs = null;
			if (implementation != null)
				msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__IMPLEMENTATION, null, msgs);
			if (newImplementation != null)
				msgs = ((InternalEObject)newImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__IMPLEMENTATION, null, msgs);
			msgs = basicSetImplementation(newImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__IMPLEMENTATION, newImplementation, newImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getFhirVersion() {
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFhirVersion(Id newFhirVersion, NotificationChain msgs) {
		Id oldFhirVersion = fhirVersion;
		fhirVersion = newFhirVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__FHIR_VERSION, oldFhirVersion, newFhirVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFhirVersion(Id newFhirVersion) {
		if (newFhirVersion != fhirVersion) {
			NotificationChain msgs = null;
			if (fhirVersion != null)
				msgs = ((InternalEObject)fhirVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__FHIR_VERSION, null, msgs);
			if (newFhirVersion != null)
				msgs = ((InternalEObject)newFhirVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__FHIR_VERSION, null, msgs);
			msgs = basicSetFhirVersion(newFhirVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__FHIR_VERSION, newFhirVersion, newFhirVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getAcceptUnknown() {
		return acceptUnknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceptUnknown(org.hl7.fhir.Boolean newAcceptUnknown, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAcceptUnknown = acceptUnknown;
		acceptUnknown = newAcceptUnknown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__ACCEPT_UNKNOWN, oldAcceptUnknown, newAcceptUnknown);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptUnknown(org.hl7.fhir.Boolean newAcceptUnknown) {
		if (newAcceptUnknown != acceptUnknown) {
			NotificationChain msgs = null;
			if (acceptUnknown != null)
				msgs = ((InternalEObject)acceptUnknown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__ACCEPT_UNKNOWN, null, msgs);
			if (newAcceptUnknown != null)
				msgs = ((InternalEObject)newAcceptUnknown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE__ACCEPT_UNKNOWN, null, msgs);
			msgs = basicSetAcceptUnknown(newAcceptUnknown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE__ACCEPT_UNKNOWN, newAcceptUnknown, newAcceptUnknown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getFormat() {
		if (format == null) {
			format = new EObjectContainmentEList<Code>(Code.class, this, FhirPackage.CONFORMANCE__FORMAT);
		}
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getProfile() {
		if (profile == null) {
			profile = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONFORMANCE__PROFILE);
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceRest> getRest() {
		if (rest == null) {
			rest = new EObjectContainmentEList<ConformanceRest>(ConformanceRest.class, this, FhirPackage.CONFORMANCE__REST);
		}
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceMessaging> getMessaging() {
		if (messaging == null) {
			messaging = new EObjectContainmentEList<ConformanceMessaging>(ConformanceMessaging.class, this, FhirPackage.CONFORMANCE__MESSAGING);
		}
		return messaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceDocument> getDocument() {
		if (document == null) {
			document = new EObjectContainmentEList<ConformanceDocument>(ConformanceDocument.class, this, FhirPackage.CONFORMANCE__DOCUMENT);
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONFORMANCE__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.CONFORMANCE__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.CONFORMANCE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.CONFORMANCE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.CONFORMANCE__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.CONFORMANCE__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case FhirPackage.CONFORMANCE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.CONFORMANCE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CONFORMANCE__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.CONFORMANCE__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.CONFORMANCE__SOFTWARE:
				return basicSetSoftware(null, msgs);
			case FhirPackage.CONFORMANCE__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
			case FhirPackage.CONFORMANCE__FHIR_VERSION:
				return basicSetFhirVersion(null, msgs);
			case FhirPackage.CONFORMANCE__ACCEPT_UNKNOWN:
				return basicSetAcceptUnknown(null, msgs);
			case FhirPackage.CONFORMANCE__FORMAT:
				return ((InternalEList<?>)getFormat()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE__PROFILE:
				return ((InternalEList<?>)getProfile()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE__REST:
				return ((InternalEList<?>)getRest()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE__MESSAGING:
				return ((InternalEList<?>)getMessaging()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE__DOCUMENT:
				return ((InternalEList<?>)getDocument()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONFORMANCE__URL:
				return getUrl();
			case FhirPackage.CONFORMANCE__VERSION:
				return getVersion();
			case FhirPackage.CONFORMANCE__NAME:
				return getName();
			case FhirPackage.CONFORMANCE__PUBLISHER:
				return getPublisher();
			case FhirPackage.CONFORMANCE__CONTACT:
				return getContact();
			case FhirPackage.CONFORMANCE__DESCRIPTION:
				return getDescription();
			case FhirPackage.CONFORMANCE__REQUIREMENTS:
				return getRequirements();
			case FhirPackage.CONFORMANCE__COPYRIGHT:
				return getCopyright();
			case FhirPackage.CONFORMANCE__STATUS:
				return getStatus();
			case FhirPackage.CONFORMANCE__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.CONFORMANCE__DATE:
				return getDate();
			case FhirPackage.CONFORMANCE__SOFTWARE:
				return getSoftware();
			case FhirPackage.CONFORMANCE__IMPLEMENTATION:
				return getImplementation();
			case FhirPackage.CONFORMANCE__FHIR_VERSION:
				return getFhirVersion();
			case FhirPackage.CONFORMANCE__ACCEPT_UNKNOWN:
				return getAcceptUnknown();
			case FhirPackage.CONFORMANCE__FORMAT:
				return getFormat();
			case FhirPackage.CONFORMANCE__PROFILE:
				return getProfile();
			case FhirPackage.CONFORMANCE__REST:
				return getRest();
			case FhirPackage.CONFORMANCE__MESSAGING:
				return getMessaging();
			case FhirPackage.CONFORMANCE__DOCUMENT:
				return getDocument();
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
			case FhirPackage.CONFORMANCE__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.CONFORMANCE__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONFORMANCE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONFORMANCE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONFORMANCE__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ConformanceContact>)newValue);
				return;
			case FhirPackage.CONFORMANCE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONFORMANCE__REQUIREMENTS:
				setRequirements((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONFORMANCE__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONFORMANCE__STATUS:
				setStatus((ConformanceResourceStatus)newValue);
				return;
			case FhirPackage.CONFORMANCE__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONFORMANCE__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.CONFORMANCE__SOFTWARE:
				setSoftware((ConformanceSoftware)newValue);
				return;
			case FhirPackage.CONFORMANCE__IMPLEMENTATION:
				setImplementation((ConformanceImplementation)newValue);
				return;
			case FhirPackage.CONFORMANCE__FHIR_VERSION:
				setFhirVersion((Id)newValue);
				return;
			case FhirPackage.CONFORMANCE__ACCEPT_UNKNOWN:
				setAcceptUnknown((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONFORMANCE__FORMAT:
				getFormat().clear();
				getFormat().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirPackage.CONFORMANCE__PROFILE:
				getProfile().clear();
				getProfile().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONFORMANCE__REST:
				getRest().clear();
				getRest().addAll((Collection<? extends ConformanceRest>)newValue);
				return;
			case FhirPackage.CONFORMANCE__MESSAGING:
				getMessaging().clear();
				getMessaging().addAll((Collection<? extends ConformanceMessaging>)newValue);
				return;
			case FhirPackage.CONFORMANCE__DOCUMENT:
				getDocument().clear();
				getDocument().addAll((Collection<? extends ConformanceDocument>)newValue);
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
			case FhirPackage.CONFORMANCE__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.CONFORMANCE__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONFORMANCE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONFORMANCE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONFORMANCE__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.CONFORMANCE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONFORMANCE__REQUIREMENTS:
				setRequirements((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONFORMANCE__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONFORMANCE__STATUS:
				setStatus((ConformanceResourceStatus)null);
				return;
			case FhirPackage.CONFORMANCE__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CONFORMANCE__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.CONFORMANCE__SOFTWARE:
				setSoftware((ConformanceSoftware)null);
				return;
			case FhirPackage.CONFORMANCE__IMPLEMENTATION:
				setImplementation((ConformanceImplementation)null);
				return;
			case FhirPackage.CONFORMANCE__FHIR_VERSION:
				setFhirVersion((Id)null);
				return;
			case FhirPackage.CONFORMANCE__ACCEPT_UNKNOWN:
				setAcceptUnknown((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CONFORMANCE__FORMAT:
				getFormat().clear();
				return;
			case FhirPackage.CONFORMANCE__PROFILE:
				getProfile().clear();
				return;
			case FhirPackage.CONFORMANCE__REST:
				getRest().clear();
				return;
			case FhirPackage.CONFORMANCE__MESSAGING:
				getMessaging().clear();
				return;
			case FhirPackage.CONFORMANCE__DOCUMENT:
				getDocument().clear();
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
			case FhirPackage.CONFORMANCE__URL:
				return url != null;
			case FhirPackage.CONFORMANCE__VERSION:
				return version != null;
			case FhirPackage.CONFORMANCE__NAME:
				return name != null;
			case FhirPackage.CONFORMANCE__PUBLISHER:
				return publisher != null;
			case FhirPackage.CONFORMANCE__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.CONFORMANCE__DESCRIPTION:
				return description != null;
			case FhirPackage.CONFORMANCE__REQUIREMENTS:
				return requirements != null;
			case FhirPackage.CONFORMANCE__COPYRIGHT:
				return copyright != null;
			case FhirPackage.CONFORMANCE__STATUS:
				return status != null;
			case FhirPackage.CONFORMANCE__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.CONFORMANCE__DATE:
				return date != null;
			case FhirPackage.CONFORMANCE__SOFTWARE:
				return software != null;
			case FhirPackage.CONFORMANCE__IMPLEMENTATION:
				return implementation != null;
			case FhirPackage.CONFORMANCE__FHIR_VERSION:
				return fhirVersion != null;
			case FhirPackage.CONFORMANCE__ACCEPT_UNKNOWN:
				return acceptUnknown != null;
			case FhirPackage.CONFORMANCE__FORMAT:
				return format != null && !format.isEmpty();
			case FhirPackage.CONFORMANCE__PROFILE:
				return profile != null && !profile.isEmpty();
			case FhirPackage.CONFORMANCE__REST:
				return rest != null && !rest.isEmpty();
			case FhirPackage.CONFORMANCE__MESSAGING:
				return messaging != null && !messaging.isEmpty();
			case FhirPackage.CONFORMANCE__DOCUMENT:
				return document != null && !document.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConformanceImpl
