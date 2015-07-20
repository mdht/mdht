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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.PractitionerPractitionerRole;
import org.hl7.fhir.PractitionerQualification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practitioner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getPractitionerRole <em>Practitioner Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getCommunication <em>Communication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PractitionerImpl extends DomainResourceImpl implements Practitioner {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected HumanName name;

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
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> address;

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
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> photo;

	/**
	 * The cached value of the '{@link #getPractitionerRole() <em>Practitioner Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractitionerRole()
	 * @generated
	 * @ordered
	 */
	protected EList<PractitionerPractitionerRole> practitionerRole;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected EList<PractitionerQualification> qualification;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> communication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PractitionerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPractitioner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PRACTITIONER__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(HumanName newName, NotificationChain msgs) {
		HumanName oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(HumanName newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.PRACTITIONER__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<Address>(Address.class, this, FhirPackage.PRACTITIONER__ADDRESS);
		}
		return address;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER__GENDER, oldGender, newGender);
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
				msgs = ((InternalEObject)gender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER__GENDER, null, msgs);
			if (newGender != null)
				msgs = ((InternalEObject)newGender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER__GENDER, null, msgs);
			msgs = basicSetGender(newGender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER__GENDER, newGender, newGender));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER__BIRTH_DATE, oldBirthDate, newBirthDate);
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
				msgs = ((InternalEObject)birthDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER__BIRTH_DATE, null, msgs);
			if (newBirthDate != null)
				msgs = ((InternalEObject)newBirthDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRACTITIONER__BIRTH_DATE, null, msgs);
			msgs = basicSetBirthDate(newBirthDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRACTITIONER__BIRTH_DATE, newBirthDate, newBirthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getPhoto() {
		if (photo == null) {
			photo = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.PRACTITIONER__PHOTO);
		}
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PractitionerPractitionerRole> getPractitionerRole() {
		if (practitionerRole == null) {
			practitionerRole = new EObjectContainmentEList<PractitionerPractitionerRole>(PractitionerPractitionerRole.class, this, FhirPackage.PRACTITIONER__PRACTITIONER_ROLE);
		}
		return practitionerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PractitionerQualification> getQualification() {
		if (qualification == null) {
			qualification = new EObjectContainmentEList<PractitionerQualification>(PractitionerQualification.class, this, FhirPackage.PRACTITIONER__QUALIFICATION);
		}
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCommunication() {
		if (communication == null) {
			communication = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PRACTITIONER__COMMUNICATION);
		}
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PRACTITIONER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.PRACTITIONER__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER__GENDER:
				return basicSetGender(null, msgs);
			case FhirPackage.PRACTITIONER__BIRTH_DATE:
				return basicSetBirthDate(null, msgs);
			case FhirPackage.PRACTITIONER__PHOTO:
				return ((InternalEList<?>)getPhoto()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER__PRACTITIONER_ROLE:
				return ((InternalEList<?>)getPractitionerRole()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER__QUALIFICATION:
				return ((InternalEList<?>)getQualification()).basicRemove(otherEnd, msgs);
			case FhirPackage.PRACTITIONER__COMMUNICATION:
				return ((InternalEList<?>)getCommunication()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PRACTITIONER__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PRACTITIONER__NAME:
				return getName();
			case FhirPackage.PRACTITIONER__TELECOM:
				return getTelecom();
			case FhirPackage.PRACTITIONER__ADDRESS:
				return getAddress();
			case FhirPackage.PRACTITIONER__GENDER:
				return getGender();
			case FhirPackage.PRACTITIONER__BIRTH_DATE:
				return getBirthDate();
			case FhirPackage.PRACTITIONER__PHOTO:
				return getPhoto();
			case FhirPackage.PRACTITIONER__PRACTITIONER_ROLE:
				return getPractitionerRole();
			case FhirPackage.PRACTITIONER__QUALIFICATION:
				return getQualification();
			case FhirPackage.PRACTITIONER__COMMUNICATION:
				return getCommunication();
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
			case FhirPackage.PRACTITIONER__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PRACTITIONER__NAME:
				setName((HumanName)newValue);
				return;
			case FhirPackage.PRACTITIONER__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.PRACTITIONER__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends Address>)newValue);
				return;
			case FhirPackage.PRACTITIONER__GENDER:
				setGender((Code)newValue);
				return;
			case FhirPackage.PRACTITIONER__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case FhirPackage.PRACTITIONER__PHOTO:
				getPhoto().clear();
				getPhoto().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirPackage.PRACTITIONER__PRACTITIONER_ROLE:
				getPractitionerRole().clear();
				getPractitionerRole().addAll((Collection<? extends PractitionerPractitionerRole>)newValue);
				return;
			case FhirPackage.PRACTITIONER__QUALIFICATION:
				getQualification().clear();
				getQualification().addAll((Collection<? extends PractitionerQualification>)newValue);
				return;
			case FhirPackage.PRACTITIONER__COMMUNICATION:
				getCommunication().clear();
				getCommunication().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.PRACTITIONER__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PRACTITIONER__NAME:
				setName((HumanName)null);
				return;
			case FhirPackage.PRACTITIONER__TELECOM:
				getTelecom().clear();
				return;
			case FhirPackage.PRACTITIONER__ADDRESS:
				getAddress().clear();
				return;
			case FhirPackage.PRACTITIONER__GENDER:
				setGender((Code)null);
				return;
			case FhirPackage.PRACTITIONER__BIRTH_DATE:
				setBirthDate((Date)null);
				return;
			case FhirPackage.PRACTITIONER__PHOTO:
				getPhoto().clear();
				return;
			case FhirPackage.PRACTITIONER__PRACTITIONER_ROLE:
				getPractitionerRole().clear();
				return;
			case FhirPackage.PRACTITIONER__QUALIFICATION:
				getQualification().clear();
				return;
			case FhirPackage.PRACTITIONER__COMMUNICATION:
				getCommunication().clear();
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
			case FhirPackage.PRACTITIONER__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PRACTITIONER__NAME:
				return name != null;
			case FhirPackage.PRACTITIONER__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case FhirPackage.PRACTITIONER__ADDRESS:
				return address != null && !address.isEmpty();
			case FhirPackage.PRACTITIONER__GENDER:
				return gender != null;
			case FhirPackage.PRACTITIONER__BIRTH_DATE:
				return birthDate != null;
			case FhirPackage.PRACTITIONER__PHOTO:
				return photo != null && !photo.isEmpty();
			case FhirPackage.PRACTITIONER__PRACTITIONER_ROLE:
				return practitionerRole != null && !practitionerRole.isEmpty();
			case FhirPackage.PRACTITIONER__QUALIFICATION:
				return qualification != null && !qualification.isEmpty();
			case FhirPackage.PRACTITIONER__COMMUNICATION:
				return communication != null && !communication.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PractitionerImpl
