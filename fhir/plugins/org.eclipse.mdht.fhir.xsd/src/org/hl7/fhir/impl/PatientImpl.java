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

import org.hl7.fhir.Address;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PatientAnimal;
import org.hl7.fhir.PatientCommunication;
import org.hl7.fhir.PatientContact;
import org.hl7.fhir.PatientLink;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getDeceasedBoolean <em>Deceased Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getDeceasedDateTime <em>Deceased Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getMaritalStatus <em>Marital Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getMultipleBirthBoolean <em>Multiple Birth Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getMultipleBirthInteger <em>Multiple Birth Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getAnimal <em>Animal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getCareProvider <em>Care Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PatientImpl#getActive <em>Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends DomainResourceImpl implements Patient {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<HumanName> name;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecom;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Code gender;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate;

	/**
	 * The cached value of the '{@link #getDeceasedBoolean() <em>Deceased Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean deceasedBoolean;

	/**
	 * The cached value of the '{@link #getDeceasedDateTime() <em>Deceased Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime deceasedDateTime;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> address;

	/**
	 * The cached value of the '{@link #getMaritalStatus() <em>Marital Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaritalStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept maritalStatus;

	/**
	 * The cached value of the '{@link #getMultipleBirthBoolean() <em>Multiple Birth Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleBirthBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean multipleBirthBoolean;

	/**
	 * The cached value of the '{@link #getMultipleBirthInteger() <em>Multiple Birth Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleBirthInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer multipleBirthInteger;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> photo;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientContact> contact;

	/**
	 * The cached value of the '{@link #getAnimal() <em>Animal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimal()
	 * @generated
	 * @ordered
	 */
	protected PatientAnimal animal;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientCommunication> communication;

	/**
	 * The cached value of the '{@link #getCareProvider() <em>Care Provider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> careProvider;

	/**
	 * The cached value of the '{@link #getManagingOrganization() <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference managingOrganization;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientLink> link;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean active;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPatient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PATIENT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HumanName> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<HumanName>(HumanName.class, this, FhirPackage.PATIENT__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.PATIENT__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGender(Code newGender, NotificationChain msgs) {
		Code oldGender = gender;
		gender = newGender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__GENDER, oldGender, newGender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Code newGender) {
		if (newGender != gender) {
			NotificationChain msgs = null;
			if (gender != null)
				msgs = ((InternalEObject)gender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__GENDER, null, msgs);
			if (newGender != null)
				msgs = ((InternalEObject)newGender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__GENDER, null, msgs);
			msgs = basicSetGender(newGender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__GENDER, newGender, newGender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirthDate(Date newBirthDate, NotificationChain msgs) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__BIRTH_DATE, oldBirthDate, newBirthDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthDate(Date newBirthDate) {
		if (newBirthDate != birthDate) {
			NotificationChain msgs = null;
			if (birthDate != null)
				msgs = ((InternalEObject)birthDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__BIRTH_DATE, null, msgs);
			if (newBirthDate != null)
				msgs = ((InternalEObject)newBirthDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__BIRTH_DATE, null, msgs);
			msgs = basicSetBirthDate(newBirthDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__BIRTH_DATE, newBirthDate, newBirthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getDeceasedBoolean() {
		return deceasedBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeceasedBoolean(org.hl7.fhir.Boolean newDeceasedBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldDeceasedBoolean = deceasedBoolean;
		deceasedBoolean = newDeceasedBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__DECEASED_BOOLEAN, oldDeceasedBoolean, newDeceasedBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeceasedBoolean(org.hl7.fhir.Boolean newDeceasedBoolean) {
		if (newDeceasedBoolean != deceasedBoolean) {
			NotificationChain msgs = null;
			if (deceasedBoolean != null)
				msgs = ((InternalEObject)deceasedBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__DECEASED_BOOLEAN, null, msgs);
			if (newDeceasedBoolean != null)
				msgs = ((InternalEObject)newDeceasedBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__DECEASED_BOOLEAN, null, msgs);
			msgs = basicSetDeceasedBoolean(newDeceasedBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__DECEASED_BOOLEAN, newDeceasedBoolean, newDeceasedBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDeceasedDateTime() {
		return deceasedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeceasedDateTime(DateTime newDeceasedDateTime, NotificationChain msgs) {
		DateTime oldDeceasedDateTime = deceasedDateTime;
		deceasedDateTime = newDeceasedDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__DECEASED_DATE_TIME, oldDeceasedDateTime, newDeceasedDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeceasedDateTime(DateTime newDeceasedDateTime) {
		if (newDeceasedDateTime != deceasedDateTime) {
			NotificationChain msgs = null;
			if (deceasedDateTime != null)
				msgs = ((InternalEObject)deceasedDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__DECEASED_DATE_TIME, null, msgs);
			if (newDeceasedDateTime != null)
				msgs = ((InternalEObject)newDeceasedDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__DECEASED_DATE_TIME, null, msgs);
			msgs = basicSetDeceasedDateTime(newDeceasedDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__DECEASED_DATE_TIME, newDeceasedDateTime, newDeceasedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<Address>(Address.class, this, FhirPackage.PATIENT__ADDRESS);
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaritalStatus(CodeableConcept newMaritalStatus, NotificationChain msgs) {
		CodeableConcept oldMaritalStatus = maritalStatus;
		maritalStatus = newMaritalStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__MARITAL_STATUS, oldMaritalStatus, newMaritalStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaritalStatus(CodeableConcept newMaritalStatus) {
		if (newMaritalStatus != maritalStatus) {
			NotificationChain msgs = null;
			if (maritalStatus != null)
				msgs = ((InternalEObject)maritalStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__MARITAL_STATUS, null, msgs);
			if (newMaritalStatus != null)
				msgs = ((InternalEObject)newMaritalStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__MARITAL_STATUS, null, msgs);
			msgs = basicSetMaritalStatus(newMaritalStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__MARITAL_STATUS, newMaritalStatus, newMaritalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getMultipleBirthBoolean() {
		return multipleBirthBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleBirthBoolean(org.hl7.fhir.Boolean newMultipleBirthBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldMultipleBirthBoolean = multipleBirthBoolean;
		multipleBirthBoolean = newMultipleBirthBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__MULTIPLE_BIRTH_BOOLEAN, oldMultipleBirthBoolean, newMultipleBirthBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleBirthBoolean(org.hl7.fhir.Boolean newMultipleBirthBoolean) {
		if (newMultipleBirthBoolean != multipleBirthBoolean) {
			NotificationChain msgs = null;
			if (multipleBirthBoolean != null)
				msgs = ((InternalEObject)multipleBirthBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__MULTIPLE_BIRTH_BOOLEAN, null, msgs);
			if (newMultipleBirthBoolean != null)
				msgs = ((InternalEObject)newMultipleBirthBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__MULTIPLE_BIRTH_BOOLEAN, null, msgs);
			msgs = basicSetMultipleBirthBoolean(newMultipleBirthBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__MULTIPLE_BIRTH_BOOLEAN, newMultipleBirthBoolean, newMultipleBirthBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getMultipleBirthInteger() {
		return multipleBirthInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleBirthInteger(org.hl7.fhir.Integer newMultipleBirthInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMultipleBirthInteger = multipleBirthInteger;
		multipleBirthInteger = newMultipleBirthInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__MULTIPLE_BIRTH_INTEGER, oldMultipleBirthInteger, newMultipleBirthInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleBirthInteger(org.hl7.fhir.Integer newMultipleBirthInteger) {
		if (newMultipleBirthInteger != multipleBirthInteger) {
			NotificationChain msgs = null;
			if (multipleBirthInteger != null)
				msgs = ((InternalEObject)multipleBirthInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__MULTIPLE_BIRTH_INTEGER, null, msgs);
			if (newMultipleBirthInteger != null)
				msgs = ((InternalEObject)newMultipleBirthInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__MULTIPLE_BIRTH_INTEGER, null, msgs);
			msgs = basicSetMultipleBirthInteger(newMultipleBirthInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__MULTIPLE_BIRTH_INTEGER, newMultipleBirthInteger, newMultipleBirthInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getPhoto() {
		if (photo == null) {
			photo = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.PATIENT__PHOTO);
		}
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<PatientContact>(PatientContact.class, this, FhirPackage.PATIENT__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAnimal getAnimal() {
		return animal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimal(PatientAnimal newAnimal, NotificationChain msgs) {
		PatientAnimal oldAnimal = animal;
		animal = newAnimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__ANIMAL, oldAnimal, newAnimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimal(PatientAnimal newAnimal) {
		if (newAnimal != animal) {
			NotificationChain msgs = null;
			if (animal != null)
				msgs = ((InternalEObject)animal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__ANIMAL, null, msgs);
			if (newAnimal != null)
				msgs = ((InternalEObject)newAnimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__ANIMAL, null, msgs);
			msgs = basicSetAnimal(newAnimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__ANIMAL, newAnimal, newAnimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientCommunication> getCommunication() {
		if (communication == null) {
			communication = new EObjectContainmentEList<PatientCommunication>(PatientCommunication.class, this, FhirPackage.PATIENT__COMMUNICATION);
		}
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getCareProvider() {
		if (careProvider == null) {
			careProvider = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PATIENT__CARE_PROVIDER);
		}
		return careProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getManagingOrganization() {
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagingOrganization(Reference newManagingOrganization, NotificationChain msgs) {
		Reference oldManagingOrganization = managingOrganization;
		managingOrganization = newManagingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__MANAGING_ORGANIZATION, oldManagingOrganization, newManagingOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagingOrganization(Reference newManagingOrganization) {
		if (newManagingOrganization != managingOrganization) {
			NotificationChain msgs = null;
			if (managingOrganization != null)
				msgs = ((InternalEObject)managingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__MANAGING_ORGANIZATION, null, msgs);
			if (newManagingOrganization != null)
				msgs = ((InternalEObject)newManagingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__MANAGING_ORGANIZATION, null, msgs);
			msgs = basicSetManagingOrganization(newManagingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__MANAGING_ORGANIZATION, newManagingOrganization, newManagingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientLink> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<PatientLink>(PatientLink.class, this, FhirPackage.PATIENT__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(org.hl7.fhir.Boolean newActive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__ACTIVE, oldActive, newActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(org.hl7.fhir.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PATIENT__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PATIENT__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PATIENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PATIENT__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case FhirPackage.PATIENT__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case FhirPackage.PATIENT__GENDER:
				return basicSetGender(null, msgs);
			case FhirPackage.PATIENT__BIRTH_DATE:
				return basicSetBirthDate(null, msgs);
			case FhirPackage.PATIENT__DECEASED_BOOLEAN:
				return basicSetDeceasedBoolean(null, msgs);
			case FhirPackage.PATIENT__DECEASED_DATE_TIME:
				return basicSetDeceasedDateTime(null, msgs);
			case FhirPackage.PATIENT__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case FhirPackage.PATIENT__MARITAL_STATUS:
				return basicSetMaritalStatus(null, msgs);
			case FhirPackage.PATIENT__MULTIPLE_BIRTH_BOOLEAN:
				return basicSetMultipleBirthBoolean(null, msgs);
			case FhirPackage.PATIENT__MULTIPLE_BIRTH_INTEGER:
				return basicSetMultipleBirthInteger(null, msgs);
			case FhirPackage.PATIENT__PHOTO:
				return ((InternalEList<?>)getPhoto()).basicRemove(otherEnd, msgs);
			case FhirPackage.PATIENT__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.PATIENT__ANIMAL:
				return basicSetAnimal(null, msgs);
			case FhirPackage.PATIENT__COMMUNICATION:
				return ((InternalEList<?>)getCommunication()).basicRemove(otherEnd, msgs);
			case FhirPackage.PATIENT__CARE_PROVIDER:
				return ((InternalEList<?>)getCareProvider()).basicRemove(otherEnd, msgs);
			case FhirPackage.PATIENT__MANAGING_ORGANIZATION:
				return basicSetManagingOrganization(null, msgs);
			case FhirPackage.PATIENT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case FhirPackage.PATIENT__ACTIVE:
				return basicSetActive(null, msgs);
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
			case FhirPackage.PATIENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PATIENT__NAME:
				return getName();
			case FhirPackage.PATIENT__TELECOM:
				return getTelecom();
			case FhirPackage.PATIENT__GENDER:
				return getGender();
			case FhirPackage.PATIENT__BIRTH_DATE:
				return getBirthDate();
			case FhirPackage.PATIENT__DECEASED_BOOLEAN:
				return getDeceasedBoolean();
			case FhirPackage.PATIENT__DECEASED_DATE_TIME:
				return getDeceasedDateTime();
			case FhirPackage.PATIENT__ADDRESS:
				return getAddress();
			case FhirPackage.PATIENT__MARITAL_STATUS:
				return getMaritalStatus();
			case FhirPackage.PATIENT__MULTIPLE_BIRTH_BOOLEAN:
				return getMultipleBirthBoolean();
			case FhirPackage.PATIENT__MULTIPLE_BIRTH_INTEGER:
				return getMultipleBirthInteger();
			case FhirPackage.PATIENT__PHOTO:
				return getPhoto();
			case FhirPackage.PATIENT__CONTACT:
				return getContact();
			case FhirPackage.PATIENT__ANIMAL:
				return getAnimal();
			case FhirPackage.PATIENT__COMMUNICATION:
				return getCommunication();
			case FhirPackage.PATIENT__CARE_PROVIDER:
				return getCareProvider();
			case FhirPackage.PATIENT__MANAGING_ORGANIZATION:
				return getManagingOrganization();
			case FhirPackage.PATIENT__LINK:
				return getLink();
			case FhirPackage.PATIENT__ACTIVE:
				return getActive();
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
			case FhirPackage.PATIENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PATIENT__NAME:
				getName().clear();
				getName().addAll((Collection<? extends HumanName>)newValue);
				return;
			case FhirPackage.PATIENT__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.PATIENT__GENDER:
				setGender((Code)newValue);
				return;
			case FhirPackage.PATIENT__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case FhirPackage.PATIENT__DECEASED_BOOLEAN:
				setDeceasedBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.PATIENT__DECEASED_DATE_TIME:
				setDeceasedDateTime((DateTime)newValue);
				return;
			case FhirPackage.PATIENT__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends Address>)newValue);
				return;
			case FhirPackage.PATIENT__MARITAL_STATUS:
				setMaritalStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.PATIENT__MULTIPLE_BIRTH_BOOLEAN:
				setMultipleBirthBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.PATIENT__MULTIPLE_BIRTH_INTEGER:
				setMultipleBirthInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.PATIENT__PHOTO:
				getPhoto().clear();
				getPhoto().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirPackage.PATIENT__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends PatientContact>)newValue);
				return;
			case FhirPackage.PATIENT__ANIMAL:
				setAnimal((PatientAnimal)newValue);
				return;
			case FhirPackage.PATIENT__COMMUNICATION:
				getCommunication().clear();
				getCommunication().addAll((Collection<? extends PatientCommunication>)newValue);
				return;
			case FhirPackage.PATIENT__CARE_PROVIDER:
				getCareProvider().clear();
				getCareProvider().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PATIENT__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)newValue);
				return;
			case FhirPackage.PATIENT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends PatientLink>)newValue);
				return;
			case FhirPackage.PATIENT__ACTIVE:
				setActive((org.hl7.fhir.Boolean)newValue);
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
			case FhirPackage.PATIENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PATIENT__NAME:
				getName().clear();
				return;
			case FhirPackage.PATIENT__TELECOM:
				getTelecom().clear();
				return;
			case FhirPackage.PATIENT__GENDER:
				setGender((Code)null);
				return;
			case FhirPackage.PATIENT__BIRTH_DATE:
				setBirthDate((Date)null);
				return;
			case FhirPackage.PATIENT__DECEASED_BOOLEAN:
				setDeceasedBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.PATIENT__DECEASED_DATE_TIME:
				setDeceasedDateTime((DateTime)null);
				return;
			case FhirPackage.PATIENT__ADDRESS:
				getAddress().clear();
				return;
			case FhirPackage.PATIENT__MARITAL_STATUS:
				setMaritalStatus((CodeableConcept)null);
				return;
			case FhirPackage.PATIENT__MULTIPLE_BIRTH_BOOLEAN:
				setMultipleBirthBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.PATIENT__MULTIPLE_BIRTH_INTEGER:
				setMultipleBirthInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.PATIENT__PHOTO:
				getPhoto().clear();
				return;
			case FhirPackage.PATIENT__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.PATIENT__ANIMAL:
				setAnimal((PatientAnimal)null);
				return;
			case FhirPackage.PATIENT__COMMUNICATION:
				getCommunication().clear();
				return;
			case FhirPackage.PATIENT__CARE_PROVIDER:
				getCareProvider().clear();
				return;
			case FhirPackage.PATIENT__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)null);
				return;
			case FhirPackage.PATIENT__LINK:
				getLink().clear();
				return;
			case FhirPackage.PATIENT__ACTIVE:
				setActive((org.hl7.fhir.Boolean)null);
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
			case FhirPackage.PATIENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PATIENT__NAME:
				return name != null && !name.isEmpty();
			case FhirPackage.PATIENT__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case FhirPackage.PATIENT__GENDER:
				return gender != null;
			case FhirPackage.PATIENT__BIRTH_DATE:
				return birthDate != null;
			case FhirPackage.PATIENT__DECEASED_BOOLEAN:
				return deceasedBoolean != null;
			case FhirPackage.PATIENT__DECEASED_DATE_TIME:
				return deceasedDateTime != null;
			case FhirPackage.PATIENT__ADDRESS:
				return address != null && !address.isEmpty();
			case FhirPackage.PATIENT__MARITAL_STATUS:
				return maritalStatus != null;
			case FhirPackage.PATIENT__MULTIPLE_BIRTH_BOOLEAN:
				return multipleBirthBoolean != null;
			case FhirPackage.PATIENT__MULTIPLE_BIRTH_INTEGER:
				return multipleBirthInteger != null;
			case FhirPackage.PATIENT__PHOTO:
				return photo != null && !photo.isEmpty();
			case FhirPackage.PATIENT__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.PATIENT__ANIMAL:
				return animal != null;
			case FhirPackage.PATIENT__COMMUNICATION:
				return communication != null && !communication.isEmpty();
			case FhirPackage.PATIENT__CARE_PROVIDER:
				return careProvider != null && !careProvider.isEmpty();
			case FhirPackage.PATIENT__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case FhirPackage.PATIENT__LINK:
				return link != null && !link.isEmpty();
			case FhirPackage.PATIENT__ACTIVE:
				return active != null;
		}
		return super.eIsSet(featureID);
	}

} //PatientImpl
