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
import org.hl7.fhir.ConformanceResourceStatus;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationDefinitionContact;
import org.hl7.fhir.OperationDefinitionParameter;
import org.hl7.fhir.OperationKind;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getIdempotent <em>Idempotent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OperationDefinitionImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationDefinitionImpl extends DomainResourceImpl implements OperationDefinition {
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
	protected EList<OperationDefinitionContact> contact;

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
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected OperationKind kind;

	/**
	 * The cached value of the '{@link #getIdempotent() <em>Idempotent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdempotent()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean idempotent;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String notes;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Reference base;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean system;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> type;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean instance;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationDefinitionParameter> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getOperationDefinition();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationDefinitionContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<OperationDefinitionContact>(OperationDefinitionContact.class, this, FhirPackage.OPERATION_DEFINITION__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__REQUIREMENTS, oldRequirements, newRequirements);
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
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__REQUIREMENTS, newRequirements, newRequirements));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(OperationKind newKind, NotificationChain msgs) {
		OperationKind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__KIND, oldKind, newKind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(OperationKind newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getIdempotent() {
		return idempotent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdempotent(org.hl7.fhir.Boolean newIdempotent, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIdempotent = idempotent;
		idempotent = newIdempotent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__IDEMPOTENT, oldIdempotent, newIdempotent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdempotent(org.hl7.fhir.Boolean newIdempotent) {
		if (newIdempotent != idempotent) {
			NotificationChain msgs = null;
			if (idempotent != null)
				msgs = ((InternalEObject)idempotent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__IDEMPOTENT, null, msgs);
			if (newIdempotent != null)
				msgs = ((InternalEObject)newIdempotent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__IDEMPOTENT, null, msgs);
			msgs = basicSetIdempotent(newIdempotent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__IDEMPOTENT, newIdempotent, newIdempotent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotes(org.hl7.fhir.String newNotes, NotificationChain msgs) {
		org.hl7.fhir.String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__NOTES, oldNotes, newNotes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(org.hl7.fhir.String newNotes) {
		if (newNotes != notes) {
			NotificationChain msgs = null;
			if (notes != null)
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(Reference newBase, NotificationChain msgs) {
		Reference oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(Reference newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(org.hl7.fhir.Boolean newSystem, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(org.hl7.fhir.Boolean newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<Code>(Code.class, this, FhirPackage.OPERATION_DEFINITION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstance(org.hl7.fhir.Boolean newInstance, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__INSTANCE, oldInstance, newInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(org.hl7.fhir.Boolean newInstance) {
		if (newInstance != instance) {
			NotificationChain msgs = null;
			if (instance != null)
				msgs = ((InternalEObject)instance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__INSTANCE, null, msgs);
			if (newInstance != null)
				msgs = ((InternalEObject)newInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OPERATION_DEFINITION__INSTANCE, null, msgs);
			msgs = basicSetInstance(newInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OPERATION_DEFINITION__INSTANCE, newInstance, newInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationDefinitionParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<OperationDefinitionParameter>(OperationDefinitionParameter.class, this, FhirPackage.OPERATION_DEFINITION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OPERATION_DEFINITION__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.OPERATION_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__KIND:
				return basicSetKind(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__IDEMPOTENT:
				return basicSetIdempotent(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__NOTES:
				return basicSetNotes(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__BASE:
				return basicSetBase(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__SYSTEM:
				return basicSetSystem(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.OPERATION_DEFINITION__INSTANCE:
				return basicSetInstance(null, msgs);
			case FhirPackage.OPERATION_DEFINITION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.OPERATION_DEFINITION__URL:
				return getUrl();
			case FhirPackage.OPERATION_DEFINITION__VERSION:
				return getVersion();
			case FhirPackage.OPERATION_DEFINITION__NAME:
				return getName();
			case FhirPackage.OPERATION_DEFINITION__PUBLISHER:
				return getPublisher();
			case FhirPackage.OPERATION_DEFINITION__CONTACT:
				return getContact();
			case FhirPackage.OPERATION_DEFINITION__DESCRIPTION:
				return getDescription();
			case FhirPackage.OPERATION_DEFINITION__REQUIREMENTS:
				return getRequirements();
			case FhirPackage.OPERATION_DEFINITION__STATUS:
				return getStatus();
			case FhirPackage.OPERATION_DEFINITION__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.OPERATION_DEFINITION__DATE:
				return getDate();
			case FhirPackage.OPERATION_DEFINITION__KIND:
				return getKind();
			case FhirPackage.OPERATION_DEFINITION__IDEMPOTENT:
				return getIdempotent();
			case FhirPackage.OPERATION_DEFINITION__CODE:
				return getCode();
			case FhirPackage.OPERATION_DEFINITION__NOTES:
				return getNotes();
			case FhirPackage.OPERATION_DEFINITION__BASE:
				return getBase();
			case FhirPackage.OPERATION_DEFINITION__SYSTEM:
				return getSystem();
			case FhirPackage.OPERATION_DEFINITION__TYPE:
				return getType();
			case FhirPackage.OPERATION_DEFINITION__INSTANCE:
				return getInstance();
			case FhirPackage.OPERATION_DEFINITION__PARAMETER:
				return getParameter();
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
			case FhirPackage.OPERATION_DEFINITION__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends OperationDefinitionContact>)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__REQUIREMENTS:
				setRequirements((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__STATUS:
				setStatus((ConformanceResourceStatus)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__KIND:
				setKind((OperationKind)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__IDEMPOTENT:
				setIdempotent((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__CODE:
				setCode((Code)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__NOTES:
				setNotes((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__BASE:
				setBase((Reference)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__SYSTEM:
				setSystem((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__INSTANCE:
				setInstance((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.OPERATION_DEFINITION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends OperationDefinitionParameter>)newValue);
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
			case FhirPackage.OPERATION_DEFINITION__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.OPERATION_DEFINITION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__REQUIREMENTS:
				setRequirements((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__STATUS:
				setStatus((ConformanceResourceStatus)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__KIND:
				setKind((OperationKind)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__IDEMPOTENT:
				setIdempotent((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__CODE:
				setCode((Code)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__NOTES:
				setNotes((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__BASE:
				setBase((Reference)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__SYSTEM:
				setSystem((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__TYPE:
				getType().clear();
				return;
			case FhirPackage.OPERATION_DEFINITION__INSTANCE:
				setInstance((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.OPERATION_DEFINITION__PARAMETER:
				getParameter().clear();
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
			case FhirPackage.OPERATION_DEFINITION__URL:
				return url != null;
			case FhirPackage.OPERATION_DEFINITION__VERSION:
				return version != null;
			case FhirPackage.OPERATION_DEFINITION__NAME:
				return name != null;
			case FhirPackage.OPERATION_DEFINITION__PUBLISHER:
				return publisher != null;
			case FhirPackage.OPERATION_DEFINITION__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.OPERATION_DEFINITION__DESCRIPTION:
				return description != null;
			case FhirPackage.OPERATION_DEFINITION__REQUIREMENTS:
				return requirements != null;
			case FhirPackage.OPERATION_DEFINITION__STATUS:
				return status != null;
			case FhirPackage.OPERATION_DEFINITION__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.OPERATION_DEFINITION__DATE:
				return date != null;
			case FhirPackage.OPERATION_DEFINITION__KIND:
				return kind != null;
			case FhirPackage.OPERATION_DEFINITION__IDEMPOTENT:
				return idempotent != null;
			case FhirPackage.OPERATION_DEFINITION__CODE:
				return code != null;
			case FhirPackage.OPERATION_DEFINITION__NOTES:
				return notes != null;
			case FhirPackage.OPERATION_DEFINITION__BASE:
				return base != null;
			case FhirPackage.OPERATION_DEFINITION__SYSTEM:
				return system != null;
			case FhirPackage.OPERATION_DEFINITION__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.OPERATION_DEFINITION__INSTANCE:
				return instance != null;
			case FhirPackage.OPERATION_DEFINITION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationDefinitionImpl
