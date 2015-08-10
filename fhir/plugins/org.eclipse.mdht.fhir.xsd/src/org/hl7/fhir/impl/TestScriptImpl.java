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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.TestScript;
import org.hl7.fhir.TestScriptContact;
import org.hl7.fhir.TestScriptFixture;
import org.hl7.fhir.TestScriptMetadata;
import org.hl7.fhir.TestScriptSetup;
import org.hl7.fhir.TestScriptTeardown;
import org.hl7.fhir.TestScriptTest;
import org.hl7.fhir.TestScriptVariable;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getMultiserver <em>Multiserver</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getFixture <em>Fixture</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getSetup <em>Setup</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptImpl#getTeardown <em>Teardown</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptImpl extends DomainResourceImpl implements TestScript {
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
	protected EList<TestScriptContact> contact;

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
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected TestScriptMetadata metadata;

	/**
	 * The cached value of the '{@link #getMultiserver() <em>Multiserver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiserver()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean multiserver;

	/**
	 * The cached value of the '{@link #getFixture() <em>Fixture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixture()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptFixture> fixture;

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
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptVariable> variable;

	/**
	 * The cached value of the '{@link #getSetup() <em>Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetup()
	 * @generated
	 * @ordered
	 */
	protected TestScriptSetup setup;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptTest> test;

	/**
	 * The cached value of the '{@link #getTeardown() <em>Teardown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeardown()
	 * @generated
	 * @ordered
	 */
	protected TestScriptTeardown teardown;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestScript();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<TestScriptContact>(TestScriptContact.class, this, FhirPackage.TEST_SCRIPT__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.TEST_SCRIPT__USE_CONTEXT);
		}
		return useContext;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__REQUIREMENTS, oldRequirements, newRequirements);
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
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__REQUIREMENTS, newRequirements, newRequirements));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptMetadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(TestScriptMetadata newMetadata, NotificationChain msgs) {
		TestScriptMetadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(TestScriptMetadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getMultiserver() {
		return multiserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiserver(org.hl7.fhir.Boolean newMultiserver, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldMultiserver = multiserver;
		multiserver = newMultiserver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__MULTISERVER, oldMultiserver, newMultiserver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiserver(org.hl7.fhir.Boolean newMultiserver) {
		if (newMultiserver != multiserver) {
			NotificationChain msgs = null;
			if (multiserver != null)
				msgs = ((InternalEObject)multiserver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__MULTISERVER, null, msgs);
			if (newMultiserver != null)
				msgs = ((InternalEObject)newMultiserver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__MULTISERVER, null, msgs);
			msgs = basicSetMultiserver(newMultiserver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__MULTISERVER, newMultiserver, newMultiserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptFixture> getFixture() {
		if (fixture == null) {
			fixture = new EObjectContainmentEList<TestScriptFixture>(TestScriptFixture.class, this, FhirPackage.TEST_SCRIPT__FIXTURE);
		}
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getProfile() {
		if (profile == null) {
			profile = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.TEST_SCRIPT__PROFILE);
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptVariable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<TestScriptVariable>(TestScriptVariable.class, this, FhirPackage.TEST_SCRIPT__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetup getSetup() {
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetup(TestScriptSetup newSetup, NotificationChain msgs) {
		TestScriptSetup oldSetup = setup;
		setup = newSetup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__SETUP, oldSetup, newSetup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetup(TestScriptSetup newSetup) {
		if (newSetup != setup) {
			NotificationChain msgs = null;
			if (setup != null)
				msgs = ((InternalEObject)setup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__SETUP, null, msgs);
			if (newSetup != null)
				msgs = ((InternalEObject)newSetup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__SETUP, null, msgs);
			msgs = basicSetSetup(newSetup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__SETUP, newSetup, newSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptTest> getTest() {
		if (test == null) {
			test = new EObjectContainmentEList<TestScriptTest>(TestScriptTest.class, this, FhirPackage.TEST_SCRIPT__TEST);
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTeardown getTeardown() {
		return teardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeardown(TestScriptTeardown newTeardown, NotificationChain msgs) {
		TestScriptTeardown oldTeardown = teardown;
		teardown = newTeardown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__TEARDOWN, oldTeardown, newTeardown);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeardown(TestScriptTeardown newTeardown) {
		if (newTeardown != teardown) {
			NotificationChain msgs = null;
			if (teardown != null)
				msgs = ((InternalEObject)teardown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__TEARDOWN, null, msgs);
			if (newTeardown != null)
				msgs = ((InternalEObject)newTeardown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT__TEARDOWN, null, msgs);
			msgs = basicSetTeardown(newTeardown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT__TEARDOWN, newTeardown, newTeardown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.TEST_SCRIPT__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.TEST_SCRIPT__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.TEST_SCRIPT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.TEST_SCRIPT__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.TEST_SCRIPT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.TEST_SCRIPT__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_SCRIPT__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.TEST_SCRIPT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.TEST_SCRIPT__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_SCRIPT__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case FhirPackage.TEST_SCRIPT__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.TEST_SCRIPT__METADATA:
				return basicSetMetadata(null, msgs);
			case FhirPackage.TEST_SCRIPT__MULTISERVER:
				return basicSetMultiserver(null, msgs);
			case FhirPackage.TEST_SCRIPT__FIXTURE:
				return ((InternalEList<?>)getFixture()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_SCRIPT__PROFILE:
				return ((InternalEList<?>)getProfile()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_SCRIPT__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_SCRIPT__SETUP:
				return basicSetSetup(null, msgs);
			case FhirPackage.TEST_SCRIPT__TEST:
				return ((InternalEList<?>)getTest()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_SCRIPT__TEARDOWN:
				return basicSetTeardown(null, msgs);
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
			case FhirPackage.TEST_SCRIPT__URL:
				return getUrl();
			case FhirPackage.TEST_SCRIPT__VERSION:
				return getVersion();
			case FhirPackage.TEST_SCRIPT__NAME:
				return getName();
			case FhirPackage.TEST_SCRIPT__STATUS:
				return getStatus();
			case FhirPackage.TEST_SCRIPT__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.TEST_SCRIPT__PUBLISHER:
				return getPublisher();
			case FhirPackage.TEST_SCRIPT__CONTACT:
				return getContact();
			case FhirPackage.TEST_SCRIPT__DATE:
				return getDate();
			case FhirPackage.TEST_SCRIPT__DESCRIPTION:
				return getDescription();
			case FhirPackage.TEST_SCRIPT__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.TEST_SCRIPT__REQUIREMENTS:
				return getRequirements();
			case FhirPackage.TEST_SCRIPT__COPYRIGHT:
				return getCopyright();
			case FhirPackage.TEST_SCRIPT__METADATA:
				return getMetadata();
			case FhirPackage.TEST_SCRIPT__MULTISERVER:
				return getMultiserver();
			case FhirPackage.TEST_SCRIPT__FIXTURE:
				return getFixture();
			case FhirPackage.TEST_SCRIPT__PROFILE:
				return getProfile();
			case FhirPackage.TEST_SCRIPT__VARIABLE:
				return getVariable();
			case FhirPackage.TEST_SCRIPT__SETUP:
				return getSetup();
			case FhirPackage.TEST_SCRIPT__TEST:
				return getTest();
			case FhirPackage.TEST_SCRIPT__TEARDOWN:
				return getTeardown();
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
			case FhirPackage.TEST_SCRIPT__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends TestScriptContact>)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__REQUIREMENTS:
				setRequirements((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__METADATA:
				setMetadata((TestScriptMetadata)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__MULTISERVER:
				setMultiserver((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__FIXTURE:
				getFixture().clear();
				getFixture().addAll((Collection<? extends TestScriptFixture>)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__PROFILE:
				getProfile().clear();
				getProfile().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends TestScriptVariable>)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__SETUP:
				setSetup((TestScriptSetup)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends TestScriptTest>)newValue);
				return;
			case FhirPackage.TEST_SCRIPT__TEARDOWN:
				setTeardown((TestScriptTeardown)newValue);
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
			case FhirPackage.TEST_SCRIPT__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.TEST_SCRIPT__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT__STATUS:
				setStatus((Code)null);
				return;
			case FhirPackage.TEST_SCRIPT__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TEST_SCRIPT__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.TEST_SCRIPT__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.TEST_SCRIPT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.TEST_SCRIPT__REQUIREMENTS:
				setRequirements((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT__METADATA:
				setMetadata((TestScriptMetadata)null);
				return;
			case FhirPackage.TEST_SCRIPT__MULTISERVER:
				setMultiserver((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TEST_SCRIPT__FIXTURE:
				getFixture().clear();
				return;
			case FhirPackage.TEST_SCRIPT__PROFILE:
				getProfile().clear();
				return;
			case FhirPackage.TEST_SCRIPT__VARIABLE:
				getVariable().clear();
				return;
			case FhirPackage.TEST_SCRIPT__SETUP:
				setSetup((TestScriptSetup)null);
				return;
			case FhirPackage.TEST_SCRIPT__TEST:
				getTest().clear();
				return;
			case FhirPackage.TEST_SCRIPT__TEARDOWN:
				setTeardown((TestScriptTeardown)null);
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
			case FhirPackage.TEST_SCRIPT__URL:
				return url != null;
			case FhirPackage.TEST_SCRIPT__VERSION:
				return version != null;
			case FhirPackage.TEST_SCRIPT__NAME:
				return name != null;
			case FhirPackage.TEST_SCRIPT__STATUS:
				return status != null;
			case FhirPackage.TEST_SCRIPT__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.TEST_SCRIPT__PUBLISHER:
				return publisher != null;
			case FhirPackage.TEST_SCRIPT__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.TEST_SCRIPT__DATE:
				return date != null;
			case FhirPackage.TEST_SCRIPT__DESCRIPTION:
				return description != null;
			case FhirPackage.TEST_SCRIPT__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.TEST_SCRIPT__REQUIREMENTS:
				return requirements != null;
			case FhirPackage.TEST_SCRIPT__COPYRIGHT:
				return copyright != null;
			case FhirPackage.TEST_SCRIPT__METADATA:
				return metadata != null;
			case FhirPackage.TEST_SCRIPT__MULTISERVER:
				return multiserver != null;
			case FhirPackage.TEST_SCRIPT__FIXTURE:
				return fixture != null && !fixture.isEmpty();
			case FhirPackage.TEST_SCRIPT__PROFILE:
				return profile != null && !profile.isEmpty();
			case FhirPackage.TEST_SCRIPT__VARIABLE:
				return variable != null && !variable.isEmpty();
			case FhirPackage.TEST_SCRIPT__SETUP:
				return setup != null;
			case FhirPackage.TEST_SCRIPT__TEST:
				return test != null && !test.isEmpty();
			case FhirPackage.TEST_SCRIPT__TEARDOWN:
				return teardown != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptImpl
