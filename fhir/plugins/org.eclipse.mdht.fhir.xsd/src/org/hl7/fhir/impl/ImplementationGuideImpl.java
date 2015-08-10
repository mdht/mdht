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
import org.hl7.fhir.Id;
import org.hl7.fhir.ImplementationGuide;
import org.hl7.fhir.ImplementationGuideContact;
import org.hl7.fhir.ImplementationGuideDependency;
import org.hl7.fhir.ImplementationGuideGlobal;
import org.hl7.fhir.ImplementationGuidePackage;
import org.hl7.fhir.ImplementationGuidePage;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideImpl#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideImpl extends DomainResourceImpl implements ImplementationGuide {
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
	protected EList<ImplementationGuideContact> contact;

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
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String copyright;

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
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideDependency> dependency;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuidePackage> package_;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideGlobal> global;

	/**
	 * The cached value of the '{@link #getBinary() <em>Binary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinary()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> binary;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected ImplementationGuidePage page;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImplementationGuide();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ImplementationGuideContact>(ImplementationGuideContact.class, this, FhirPackage.IMPLEMENTATION_GUIDE__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMPLEMENTATION_GUIDE__USE_CONTEXT);
		}
		return useContext;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__COPYRIGHT, newCopyright, newCopyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION, oldFhirVersion, newFhirVersion);
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
				msgs = ((InternalEObject)fhirVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION, null, msgs);
			if (newFhirVersion != null)
				msgs = ((InternalEObject)newFhirVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION, null, msgs);
			msgs = basicSetFhirVersion(newFhirVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION, newFhirVersion, newFhirVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideDependency> getDependency() {
		if (dependency == null) {
			dependency = new EObjectContainmentEList<ImplementationGuideDependency>(ImplementationGuideDependency.class, this, FhirPackage.IMPLEMENTATION_GUIDE__DEPENDENCY);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuidePackage> getPackage() {
		if (package_ == null) {
			package_ = new EObjectContainmentEList<ImplementationGuidePackage>(ImplementationGuidePackage.class, this, FhirPackage.IMPLEMENTATION_GUIDE__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideGlobal> getGlobal() {
		if (global == null) {
			global = new EObjectContainmentEList<ImplementationGuideGlobal>(ImplementationGuideGlobal.class, this, FhirPackage.IMPLEMENTATION_GUIDE__GLOBAL);
		}
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getBinary() {
		if (binary == null) {
			binary = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.IMPLEMENTATION_GUIDE__BINARY);
		}
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePage getPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(ImplementationGuidePage newPage, NotificationChain msgs) {
		ImplementationGuidePage oldPage = page;
		page = newPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__PAGE, oldPage, newPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(ImplementationGuidePage newPage) {
		if (newPage != page) {
			NotificationChain msgs = null;
			if (page != null)
				msgs = ((InternalEObject)page).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__PAGE, null, msgs);
			if (newPage != null)
				msgs = ((InternalEObject)newPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE__PAGE, null, msgs);
			msgs = basicSetPage(newPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE__PAGE, newPage, newPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION:
				return basicSetFhirVersion(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__DEPENDENCY:
				return ((InternalEList<?>)getDependency()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__GLOBAL:
				return ((InternalEList<?>)getGlobal()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__BINARY:
				return ((InternalEList<?>)getBinary()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE__PAGE:
				return basicSetPage(null, msgs);
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
			case FhirPackage.IMPLEMENTATION_GUIDE__URL:
				return getUrl();
			case FhirPackage.IMPLEMENTATION_GUIDE__VERSION:
				return getVersion();
			case FhirPackage.IMPLEMENTATION_GUIDE__NAME:
				return getName();
			case FhirPackage.IMPLEMENTATION_GUIDE__STATUS:
				return getStatus();
			case FhirPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.IMPLEMENTATION_GUIDE__PUBLISHER:
				return getPublisher();
			case FhirPackage.IMPLEMENTATION_GUIDE__CONTACT:
				return getContact();
			case FhirPackage.IMPLEMENTATION_GUIDE__DATE:
				return getDate();
			case FhirPackage.IMPLEMENTATION_GUIDE__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMPLEMENTATION_GUIDE__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.IMPLEMENTATION_GUIDE__COPYRIGHT:
				return getCopyright();
			case FhirPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION:
				return getFhirVersion();
			case FhirPackage.IMPLEMENTATION_GUIDE__DEPENDENCY:
				return getDependency();
			case FhirPackage.IMPLEMENTATION_GUIDE__PACKAGE:
				return getPackage();
			case FhirPackage.IMPLEMENTATION_GUIDE__GLOBAL:
				return getGlobal();
			case FhirPackage.IMPLEMENTATION_GUIDE__BINARY:
				return getBinary();
			case FhirPackage.IMPLEMENTATION_GUIDE__PAGE:
				return getPage();
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
			case FhirPackage.IMPLEMENTATION_GUIDE__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ImplementationGuideContact>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION:
				setFhirVersion((Id)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends ImplementationGuideDependency>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends ImplementationGuidePackage>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__GLOBAL:
				getGlobal().clear();
				getGlobal().addAll((Collection<? extends ImplementationGuideGlobal>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__BINARY:
				getBinary().clear();
				getBinary().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__PAGE:
				setPage((ImplementationGuidePage)newValue);
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
			case FhirPackage.IMPLEMENTATION_GUIDE__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__STATUS:
				setStatus((Code)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION:
				setFhirVersion((Id)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__DEPENDENCY:
				getDependency().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__PACKAGE:
				getPackage().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__GLOBAL:
				getGlobal().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__BINARY:
				getBinary().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE__PAGE:
				setPage((ImplementationGuidePage)null);
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
			case FhirPackage.IMPLEMENTATION_GUIDE__URL:
				return url != null;
			case FhirPackage.IMPLEMENTATION_GUIDE__VERSION:
				return version != null;
			case FhirPackage.IMPLEMENTATION_GUIDE__NAME:
				return name != null;
			case FhirPackage.IMPLEMENTATION_GUIDE__STATUS:
				return status != null;
			case FhirPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.IMPLEMENTATION_GUIDE__PUBLISHER:
				return publisher != null;
			case FhirPackage.IMPLEMENTATION_GUIDE__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE__DATE:
				return date != null;
			case FhirPackage.IMPLEMENTATION_GUIDE__DESCRIPTION:
				return description != null;
			case FhirPackage.IMPLEMENTATION_GUIDE__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE__COPYRIGHT:
				return copyright != null;
			case FhirPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION:
				return fhirVersion != null;
			case FhirPackage.IMPLEMENTATION_GUIDE__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE__GLOBAL:
				return global != null && !global.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE__BINARY:
				return binary != null && !binary.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE__PAGE:
				return page != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideImpl
