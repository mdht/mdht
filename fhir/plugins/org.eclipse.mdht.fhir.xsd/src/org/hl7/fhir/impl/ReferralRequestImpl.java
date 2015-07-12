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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ReferralRequest;
import org.hl7.fhir.ReferralStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referral Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getDateSent <em>Date Sent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getServiceRequested <em>Service Requested</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getFulfillmentTime <em>Fulfillment Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferralRequestImpl extends DomainResourceImpl implements ReferralRequest {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ReferralStatus status;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept specialty;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected Reference requester;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> recipient;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getDateSent() <em>Date Sent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSent()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateSent;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

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
	 * The cached value of the '{@link #getServiceRequested() <em>Service Requested</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRequested()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceRequested;

	/**
	 * The cached value of the '{@link #getSupportingInformation() <em>Supporting Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInformation;

	/**
	 * The cached value of the '{@link #getFulfillmentTime() <em>Fulfillment Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentTime()
	 * @generated
	 * @ordered
	 */
	protected Period fulfillmentTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferralRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getReferralRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ReferralStatus newStatus, NotificationChain msgs) {
		ReferralStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ReferralStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.REFERRAL_REQUEST__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSpecialty() {
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialty(CodeableConcept newSpecialty, NotificationChain msgs) {
		CodeableConcept oldSpecialty = specialty;
		specialty = newSpecialty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__SPECIALTY, oldSpecialty, newSpecialty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialty(CodeableConcept newSpecialty) {
		if (newSpecialty != specialty) {
			NotificationChain msgs = null;
			if (specialty != null)
				msgs = ((InternalEObject)specialty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__SPECIALTY, null, msgs);
			if (newSpecialty != null)
				msgs = ((InternalEObject)newSpecialty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__SPECIALTY, null, msgs);
			msgs = basicSetSpecialty(newSpecialty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__SPECIALTY, newSpecialty, newSpecialty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(CodeableConcept newPriority, NotificationChain msgs) {
		CodeableConcept oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(CodeableConcept newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequester(Reference newRequester, NotificationChain msgs) {
		Reference oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__REQUESTER, oldRequester, newRequester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(Reference newRequester) {
		if (newRequester != requester) {
			NotificationChain msgs = null;
			if (requester != null)
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRecipient() {
		if (recipient == null) {
			recipient = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.REFERRAL_REQUEST__RECIPIENT);
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateSent() {
		return dateSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateSent(DateTime newDateSent, NotificationChain msgs) {
		DateTime oldDateSent = dateSent;
		dateSent = newDateSent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__DATE_SENT, oldDateSent, newDateSent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateSent(DateTime newDateSent) {
		if (newDateSent != dateSent) {
			NotificationChain msgs = null;
			if (dateSent != null)
				msgs = ((InternalEObject)dateSent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__DATE_SENT, null, msgs);
			if (newDateSent != null)
				msgs = ((InternalEObject)newDateSent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__DATE_SENT, null, msgs);
			msgs = basicSetDateSent(newDateSent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__DATE_SENT, newDateSent, newDateSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(CodeableConcept newReason, NotificationChain msgs) {
		CodeableConcept oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__REASON, oldReason, newReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(CodeableConcept newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__REASON, newReason, newReason));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServiceRequested() {
		if (serviceRequested == null) {
			serviceRequested = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.REFERRAL_REQUEST__SERVICE_REQUESTED);
		}
		return serviceRequested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingInformation() {
		if (supportingInformation == null) {
			supportingInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.REFERRAL_REQUEST__SUPPORTING_INFORMATION);
		}
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getFulfillmentTime() {
		return fulfillmentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFulfillmentTime(Period newFulfillmentTime, NotificationChain msgs) {
		Period oldFulfillmentTime = fulfillmentTime;
		fulfillmentTime = newFulfillmentTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME, oldFulfillmentTime, newFulfillmentTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFulfillmentTime(Period newFulfillmentTime) {
		if (newFulfillmentTime != fulfillmentTime) {
			NotificationChain msgs = null;
			if (fulfillmentTime != null)
				msgs = ((InternalEObject)fulfillmentTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME, null, msgs);
			if (newFulfillmentTime != null)
				msgs = ((InternalEObject)newFulfillmentTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME, null, msgs);
			msgs = basicSetFulfillmentTime(newFulfillmentTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME, newFulfillmentTime, newFulfillmentTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.REFERRAL_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.REFERRAL_REQUEST__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__SPECIALTY:
				return basicSetSpecialty(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__REQUESTER:
				return basicSetRequester(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__RECIPIENT:
				return ((InternalEList<?>)getRecipient()).basicRemove(otherEnd, msgs);
			case FhirPackage.REFERRAL_REQUEST__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__DATE_SENT:
				return basicSetDateSent(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__REASON:
				return basicSetReason(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				return ((InternalEList<?>)getServiceRequested()).basicRemove(otherEnd, msgs);
			case FhirPackage.REFERRAL_REQUEST__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformation()).basicRemove(otherEnd, msgs);
			case FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				return basicSetFulfillmentTime(null, msgs);
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
			case FhirPackage.REFERRAL_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.REFERRAL_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.REFERRAL_REQUEST__TYPE:
				return getType();
			case FhirPackage.REFERRAL_REQUEST__SPECIALTY:
				return getSpecialty();
			case FhirPackage.REFERRAL_REQUEST__PRIORITY:
				return getPriority();
			case FhirPackage.REFERRAL_REQUEST__PATIENT:
				return getPatient();
			case FhirPackage.REFERRAL_REQUEST__REQUESTER:
				return getRequester();
			case FhirPackage.REFERRAL_REQUEST__RECIPIENT:
				return getRecipient();
			case FhirPackage.REFERRAL_REQUEST__ENCOUNTER:
				return getEncounter();
			case FhirPackage.REFERRAL_REQUEST__DATE_SENT:
				return getDateSent();
			case FhirPackage.REFERRAL_REQUEST__REASON:
				return getReason();
			case FhirPackage.REFERRAL_REQUEST__DESCRIPTION:
				return getDescription();
			case FhirPackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				return getServiceRequested();
			case FhirPackage.REFERRAL_REQUEST__SUPPORTING_INFORMATION:
				return getSupportingInformation();
			case FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				return getFulfillmentTime();
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
			case FhirPackage.REFERRAL_REQUEST__STATUS:
				setStatus((ReferralStatus)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__SPECIALTY:
				setSpecialty((CodeableConcept)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__RECIPIENT:
				getRecipient().clear();
				getRecipient().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__DATE_SENT:
				setDateSent((DateTime)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__REASON:
				setReason((CodeableConcept)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				getServiceRequested().clear();
				getServiceRequested().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				getSupportingInformation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				setFulfillmentTime((Period)newValue);
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
			case FhirPackage.REFERRAL_REQUEST__STATUS:
				setStatus((ReferralStatus)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.REFERRAL_REQUEST__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__SPECIALTY:
				setSpecialty((CodeableConcept)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__REQUESTER:
				setRequester((Reference)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__RECIPIENT:
				getRecipient().clear();
				return;
			case FhirPackage.REFERRAL_REQUEST__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__DATE_SENT:
				setDateSent((DateTime)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__REASON:
				setReason((CodeableConcept)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				getServiceRequested().clear();
				return;
			case FhirPackage.REFERRAL_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				return;
			case FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				setFulfillmentTime((Period)null);
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
			case FhirPackage.REFERRAL_REQUEST__STATUS:
				return status != null;
			case FhirPackage.REFERRAL_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.REFERRAL_REQUEST__TYPE:
				return type != null;
			case FhirPackage.REFERRAL_REQUEST__SPECIALTY:
				return specialty != null;
			case FhirPackage.REFERRAL_REQUEST__PRIORITY:
				return priority != null;
			case FhirPackage.REFERRAL_REQUEST__PATIENT:
				return patient != null;
			case FhirPackage.REFERRAL_REQUEST__REQUESTER:
				return requester != null;
			case FhirPackage.REFERRAL_REQUEST__RECIPIENT:
				return recipient != null && !recipient.isEmpty();
			case FhirPackage.REFERRAL_REQUEST__ENCOUNTER:
				return encounter != null;
			case FhirPackage.REFERRAL_REQUEST__DATE_SENT:
				return dateSent != null;
			case FhirPackage.REFERRAL_REQUEST__REASON:
				return reason != null;
			case FhirPackage.REFERRAL_REQUEST__DESCRIPTION:
				return description != null;
			case FhirPackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				return serviceRequested != null && !serviceRequested.isEmpty();
			case FhirPackage.REFERRAL_REQUEST__SUPPORTING_INFORMATION:
				return supportingInformation != null && !supportingInformation.isEmpty();
			case FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				return fulfillmentTime != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferralRequestImpl
