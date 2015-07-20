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
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NamingSystemContact;
import org.hl7.fhir.NamingSystemType;
import org.hl7.fhir.NamingSystemUniqueId;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Naming System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemImpl#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NamingSystemImpl#getReplacedBy <em>Replaced By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamingSystemImpl extends DomainResourceImpl implements NamingSystem {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NamingSystemType type;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

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
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Code country;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String responsible;

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
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String usage;

	/**
	 * The cached value of the '{@link #getUniqueId() <em>Unique Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueId()
	 * @generated
	 * @ordered
	 */
	protected EList<NamingSystemUniqueId> uniqueId;

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
	protected EList<NamingSystemContact> contact;

	/**
	 * The cached value of the '{@link #getReplacedBy() <em>Replaced By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacedBy()
	 * @generated
	 * @ordered
	 */
	protected Reference replacedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNamingSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(NamingSystemType newType, NotificationChain msgs) {
		NamingSystemType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(NamingSystemType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(Code newCountry, NotificationChain msgs) {
		Code oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__COUNTRY, oldCountry, newCountry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Code newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject)country).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__COUNTRY, null, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__COUNTRY, null, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__COUNTRY, newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsible(org.hl7.fhir.String newResponsible, NotificationChain msgs) {
		org.hl7.fhir.String oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__RESPONSIBLE, oldResponsible, newResponsible);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsible(org.hl7.fhir.String newResponsible) {
		if (newResponsible != responsible) {
			NotificationChain msgs = null;
			if (responsible != null)
				msgs = ((InternalEObject)responsible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__RESPONSIBLE, null, msgs);
			if (newResponsible != null)
				msgs = ((InternalEObject)newResponsible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__RESPONSIBLE, null, msgs);
			msgs = basicSetResponsible(newResponsible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__RESPONSIBLE, newResponsible, newResponsible));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsage(org.hl7.fhir.String newUsage, NotificationChain msgs) {
		org.hl7.fhir.String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__USAGE, oldUsage, newUsage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(org.hl7.fhir.String newUsage) {
		if (newUsage != usage) {
			NotificationChain msgs = null;
			if (usage != null)
				msgs = ((InternalEObject)usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__USAGE, null, msgs);
			if (newUsage != null)
				msgs = ((InternalEObject)newUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__USAGE, null, msgs);
			msgs = basicSetUsage(newUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__USAGE, newUsage, newUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamingSystemUniqueId> getUniqueId() {
		if (uniqueId == null) {
			uniqueId = new EObjectContainmentEList<NamingSystemUniqueId>(NamingSystemUniqueId.class, this, FhirPackage.NAMING_SYSTEM__UNIQUE_ID);
		}
		return uniqueId;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamingSystemContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<NamingSystemContact>(NamingSystemContact.class, this, FhirPackage.NAMING_SYSTEM__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReplacedBy() {
		return replacedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplacedBy(Reference newReplacedBy, NotificationChain msgs) {
		Reference oldReplacedBy = replacedBy;
		replacedBy = newReplacedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__REPLACED_BY, oldReplacedBy, newReplacedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacedBy(Reference newReplacedBy) {
		if (newReplacedBy != replacedBy) {
			NotificationChain msgs = null;
			if (replacedBy != null)
				msgs = ((InternalEObject)replacedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__REPLACED_BY, null, msgs);
			if (newReplacedBy != null)
				msgs = ((InternalEObject)newReplacedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NAMING_SYSTEM__REPLACED_BY, null, msgs);
			msgs = basicSetReplacedBy(newReplacedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NAMING_SYSTEM__REPLACED_BY, newReplacedBy, newReplacedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.NAMING_SYSTEM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.NAMING_SYSTEM__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.NAMING_SYSTEM__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.NAMING_SYSTEM__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.NAMING_SYSTEM__COUNTRY:
				return basicSetCountry(null, msgs);
			case FhirPackage.NAMING_SYSTEM__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.NAMING_SYSTEM__RESPONSIBLE:
				return basicSetResponsible(null, msgs);
			case FhirPackage.NAMING_SYSTEM__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.NAMING_SYSTEM__USAGE:
				return basicSetUsage(null, msgs);
			case FhirPackage.NAMING_SYSTEM__UNIQUE_ID:
				return ((InternalEList<?>)getUniqueId()).basicRemove(otherEnd, msgs);
			case FhirPackage.NAMING_SYSTEM__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.NAMING_SYSTEM__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.NAMING_SYSTEM__REPLACED_BY:
				return basicSetReplacedBy(null, msgs);
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
			case FhirPackage.NAMING_SYSTEM__TYPE:
				return getType();
			case FhirPackage.NAMING_SYSTEM__NAME:
				return getName();
			case FhirPackage.NAMING_SYSTEM__DATE:
				return getDate();
			case FhirPackage.NAMING_SYSTEM__STATUS:
				return getStatus();
			case FhirPackage.NAMING_SYSTEM__COUNTRY:
				return getCountry();
			case FhirPackage.NAMING_SYSTEM__CATEGORY:
				return getCategory();
			case FhirPackage.NAMING_SYSTEM__RESPONSIBLE:
				return getResponsible();
			case FhirPackage.NAMING_SYSTEM__DESCRIPTION:
				return getDescription();
			case FhirPackage.NAMING_SYSTEM__USAGE:
				return getUsage();
			case FhirPackage.NAMING_SYSTEM__UNIQUE_ID:
				return getUniqueId();
			case FhirPackage.NAMING_SYSTEM__PUBLISHER:
				return getPublisher();
			case FhirPackage.NAMING_SYSTEM__CONTACT:
				return getContact();
			case FhirPackage.NAMING_SYSTEM__REPLACED_BY:
				return getReplacedBy();
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
			case FhirPackage.NAMING_SYSTEM__TYPE:
				setType((NamingSystemType)newValue);
				return;
			case FhirPackage.NAMING_SYSTEM__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.NAMING_SYSTEM__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.NAMING_SYSTEM__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirPackage.NAMING_SYSTEM__COUNTRY:
				setCountry((Code)newValue);
				return;
			case FhirPackage.NAMING_SYSTEM__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.NAMING_SYSTEM__RESPONSIBLE:
				setResponsible((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.NAMING_SYSTEM__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.NAMING_SYSTEM__USAGE:
				setUsage((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.NAMING_SYSTEM__UNIQUE_ID:
				getUniqueId().clear();
				getUniqueId().addAll((Collection<? extends NamingSystemUniqueId>)newValue);
				return;
			case FhirPackage.NAMING_SYSTEM__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.NAMING_SYSTEM__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends NamingSystemContact>)newValue);
				return;
			case FhirPackage.NAMING_SYSTEM__REPLACED_BY:
				setReplacedBy((Reference)newValue);
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
			case FhirPackage.NAMING_SYSTEM__TYPE:
				setType((NamingSystemType)null);
				return;
			case FhirPackage.NAMING_SYSTEM__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.NAMING_SYSTEM__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.NAMING_SYSTEM__STATUS:
				setStatus((Code)null);
				return;
			case FhirPackage.NAMING_SYSTEM__COUNTRY:
				setCountry((Code)null);
				return;
			case FhirPackage.NAMING_SYSTEM__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.NAMING_SYSTEM__RESPONSIBLE:
				setResponsible((org.hl7.fhir.String)null);
				return;
			case FhirPackage.NAMING_SYSTEM__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.NAMING_SYSTEM__USAGE:
				setUsage((org.hl7.fhir.String)null);
				return;
			case FhirPackage.NAMING_SYSTEM__UNIQUE_ID:
				getUniqueId().clear();
				return;
			case FhirPackage.NAMING_SYSTEM__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.NAMING_SYSTEM__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.NAMING_SYSTEM__REPLACED_BY:
				setReplacedBy((Reference)null);
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
			case FhirPackage.NAMING_SYSTEM__TYPE:
				return type != null;
			case FhirPackage.NAMING_SYSTEM__NAME:
				return name != null;
			case FhirPackage.NAMING_SYSTEM__DATE:
				return date != null;
			case FhirPackage.NAMING_SYSTEM__STATUS:
				return status != null;
			case FhirPackage.NAMING_SYSTEM__COUNTRY:
				return country != null;
			case FhirPackage.NAMING_SYSTEM__CATEGORY:
				return category != null;
			case FhirPackage.NAMING_SYSTEM__RESPONSIBLE:
				return responsible != null;
			case FhirPackage.NAMING_SYSTEM__DESCRIPTION:
				return description != null;
			case FhirPackage.NAMING_SYSTEM__USAGE:
				return usage != null;
			case FhirPackage.NAMING_SYSTEM__UNIQUE_ID:
				return uniqueId != null && !uniqueId.isEmpty();
			case FhirPackage.NAMING_SYSTEM__PUBLISHER:
				return publisher != null;
			case FhirPackage.NAMING_SYSTEM__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.NAMING_SYSTEM__REPLACED_BY:
				return replacedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //NamingSystemImpl
