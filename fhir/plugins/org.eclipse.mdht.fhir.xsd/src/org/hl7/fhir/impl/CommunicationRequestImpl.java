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
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.CommunicationRequestStatus;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getScheduledTime <em>Scheduled Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getOrderedOn <em>Ordered On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationRequestImpl extends DomainResourceImpl implements CommunicationRequest {
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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Reference sender;

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
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationRequestPayload> payload;

	/**
	 * The cached value of the '{@link #getMedium() <em>Medium</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> medium;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CommunicationRequestStatus status;

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
	 * The cached value of the '{@link #getScheduledTime() <em>Scheduled Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime scheduledTime;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reason;

	/**
	 * The cached value of the '{@link #getOrderedOn() <em>Ordered On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime orderedOn;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCommunicationRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.COMMUNICATION_REQUEST__IDENTIFIER);
		}
		return identifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__CATEGORY, oldCategory, newCategory);
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
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(Reference newSender, NotificationChain msgs) {
		Reference oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SENDER, oldSender, newSender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(Reference newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRecipient() {
		if (recipient == null) {
			recipient = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COMMUNICATION_REQUEST__RECIPIENT);
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationRequestPayload> getPayload() {
		if (payload == null) {
			payload = new EObjectContainmentEList<CommunicationRequestPayload>(CommunicationRequestPayload.class, this, FhirPackage.COMMUNICATION_REQUEST__PAYLOAD);
		}
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getMedium() {
		if (medium == null) {
			medium = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COMMUNICATION_REQUEST__MEDIUM);
		}
		return medium;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__REQUESTER, oldRequester, newRequester);
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
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CommunicationRequestStatus newStatus, NotificationChain msgs) {
		CommunicationRequestStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CommunicationRequestStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getScheduledTime() {
		return scheduledTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledTime(DateTime newScheduledTime, NotificationChain msgs) {
		DateTime oldScheduledTime = scheduledTime;
		scheduledTime = newScheduledTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_TIME, oldScheduledTime, newScheduledTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledTime(DateTime newScheduledTime) {
		if (newScheduledTime != scheduledTime) {
			NotificationChain msgs = null;
			if (scheduledTime != null)
				msgs = ((InternalEObject)scheduledTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_TIME, null, msgs);
			if (newScheduledTime != null)
				msgs = ((InternalEObject)newScheduledTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_TIME, null, msgs);
			msgs = basicSetScheduledTime(newScheduledTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_TIME, newScheduledTime, newScheduledTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COMMUNICATION_REQUEST__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOrderedOn() {
		return orderedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderedOn(DateTime newOrderedOn, NotificationChain msgs) {
		DateTime oldOrderedOn = orderedOn;
		orderedOn = newOrderedOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__ORDERED_ON, oldOrderedOn, newOrderedOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedOn(DateTime newOrderedOn) {
		if (newOrderedOn != orderedOn) {
			NotificationChain msgs = null;
			if (orderedOn != null)
				msgs = ((InternalEObject)orderedOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__ORDERED_ON, null, msgs);
			if (newOrderedOn != null)
				msgs = ((InternalEObject)newOrderedOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__ORDERED_ON, null, msgs);
			msgs = basicSetOrderedOn(newOrderedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__ORDERED_ON, newOrderedOn, newOrderedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__PRIORITY, oldPriority, newPriority);
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
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				return basicSetSender(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__RECIPIENT:
				return ((InternalEList<?>)getRecipient()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__PAYLOAD:
				return ((InternalEList<?>)getPayload()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__MEDIUM:
				return ((InternalEList<?>)getMedium()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				return basicSetRequester(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_TIME:
				return basicSetScheduledTime(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__ORDERED_ON:
				return basicSetOrderedOn(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
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
			case FhirPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				return getCategory();
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				return getSender();
			case FhirPackage.COMMUNICATION_REQUEST__RECIPIENT:
				return getRecipient();
			case FhirPackage.COMMUNICATION_REQUEST__PAYLOAD:
				return getPayload();
			case FhirPackage.COMMUNICATION_REQUEST__MEDIUM:
				return getMedium();
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				return getRequester();
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.COMMUNICATION_REQUEST__ENCOUNTER:
				return getEncounter();
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_TIME:
				return getScheduledTime();
			case FhirPackage.COMMUNICATION_REQUEST__REASON:
				return getReason();
			case FhirPackage.COMMUNICATION_REQUEST__ORDERED_ON:
				return getOrderedOn();
			case FhirPackage.COMMUNICATION_REQUEST__SUBJECT:
				return getSubject();
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				return getPriority();
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
			case FhirPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				setSender((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__RECIPIENT:
				getRecipient().clear();
				getRecipient().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__PAYLOAD:
				getPayload().clear();
				getPayload().addAll((Collection<? extends CommunicationRequestPayload>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__MEDIUM:
				getMedium().clear();
				getMedium().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				setStatus((CommunicationRequestStatus)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_TIME:
				setScheduledTime((DateTime)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__ORDERED_ON:
				setOrderedOn((DateTime)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				setPriority((CodeableConcept)newValue);
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
			case FhirPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				setSender((Reference)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__RECIPIENT:
				getRecipient().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__PAYLOAD:
				getPayload().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__MEDIUM:
				getMedium().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				setRequester((Reference)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				setStatus((CommunicationRequestStatus)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_TIME:
				setScheduledTime((DateTime)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REASON:
				getReason().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__ORDERED_ON:
				setOrderedOn((DateTime)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				setPriority((CodeableConcept)null);
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
			case FhirPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				return category != null;
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				return sender != null;
			case FhirPackage.COMMUNICATION_REQUEST__RECIPIENT:
				return recipient != null && !recipient.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__PAYLOAD:
				return payload != null && !payload.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__MEDIUM:
				return medium != null && !medium.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				return requester != null;
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				return status != null;
			case FhirPackage.COMMUNICATION_REQUEST__ENCOUNTER:
				return encounter != null;
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_TIME:
				return scheduledTime != null;
			case FhirPackage.COMMUNICATION_REQUEST__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__ORDERED_ON:
				return orderedOn != null;
			case FhirPackage.COMMUNICATION_REQUEST__SUBJECT:
				return subject != null;
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				return priority != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationRequestImpl
