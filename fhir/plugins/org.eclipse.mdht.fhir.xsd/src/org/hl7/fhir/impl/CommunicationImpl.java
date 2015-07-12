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
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.CommunicationStatus;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getSent <em>Sent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getReceived <em>Received</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationImpl extends DomainResourceImpl implements Communication {
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
	protected EList<CommunicationPayload> payload;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CommunicationStatus status;

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
	 * The cached value of the '{@link #getSent() <em>Sent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSent()
	 * @generated
	 * @ordered
	 */
	protected DateTime sent;

	/**
	 * The cached value of the '{@link #getReceived() <em>Received</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceived()
	 * @generated
	 * @ordered
	 */
	protected DateTime received;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCommunication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.COMMUNICATION__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__CATEGORY, oldCategory, newCategory);
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
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__CATEGORY, newCategory, newCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__SENDER, oldSender, newSender);
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
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRecipient() {
		if (recipient == null) {
			recipient = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COMMUNICATION__RECIPIENT);
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationPayload> getPayload() {
		if (payload == null) {
			payload = new EObjectContainmentEList<CommunicationPayload>(CommunicationPayload.class, this, FhirPackage.COMMUNICATION__PAYLOAD);
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
			medium = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COMMUNICATION__MEDIUM);
		}
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CommunicationStatus newStatus, NotificationChain msgs) {
		CommunicationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CommunicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getSent() {
		return sent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSent(DateTime newSent, NotificationChain msgs) {
		DateTime oldSent = sent;
		sent = newSent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__SENT, oldSent, newSent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSent(DateTime newSent) {
		if (newSent != sent) {
			NotificationChain msgs = null;
			if (sent != null)
				msgs = ((InternalEObject)sent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__SENT, null, msgs);
			if (newSent != null)
				msgs = ((InternalEObject)newSent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__SENT, null, msgs);
			msgs = basicSetSent(newSent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__SENT, newSent, newSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getReceived() {
		return received;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceived(DateTime newReceived, NotificationChain msgs) {
		DateTime oldReceived = received;
		received = newReceived;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__RECEIVED, oldReceived, newReceived);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceived(DateTime newReceived) {
		if (newReceived != received) {
			NotificationChain msgs = null;
			if (received != null)
				msgs = ((InternalEObject)received).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__RECEIVED, null, msgs);
			if (newReceived != null)
				msgs = ((InternalEObject)newReceived).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__RECEIVED, null, msgs);
			msgs = basicSetReceived(newReceived, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__RECEIVED, newReceived, newReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COMMUNICATION__REASON);
		}
		return reason;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COMMUNICATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.COMMUNICATION__SENDER:
				return basicSetSender(null, msgs);
			case FhirPackage.COMMUNICATION__RECIPIENT:
				return ((InternalEList<?>)getRecipient()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__PAYLOAD:
				return ((InternalEList<?>)getPayload()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__MEDIUM:
				return ((InternalEList<?>)getMedium()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.COMMUNICATION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.COMMUNICATION__SENT:
				return basicSetSent(null, msgs);
			case FhirPackage.COMMUNICATION__RECEIVED:
				return basicSetReceived(null, msgs);
			case FhirPackage.COMMUNICATION__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__SUBJECT:
				return basicSetSubject(null, msgs);
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
			case FhirPackage.COMMUNICATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.COMMUNICATION__CATEGORY:
				return getCategory();
			case FhirPackage.COMMUNICATION__SENDER:
				return getSender();
			case FhirPackage.COMMUNICATION__RECIPIENT:
				return getRecipient();
			case FhirPackage.COMMUNICATION__PAYLOAD:
				return getPayload();
			case FhirPackage.COMMUNICATION__MEDIUM:
				return getMedium();
			case FhirPackage.COMMUNICATION__STATUS:
				return getStatus();
			case FhirPackage.COMMUNICATION__ENCOUNTER:
				return getEncounter();
			case FhirPackage.COMMUNICATION__SENT:
				return getSent();
			case FhirPackage.COMMUNICATION__RECEIVED:
				return getReceived();
			case FhirPackage.COMMUNICATION__REASON:
				return getReason();
			case FhirPackage.COMMUNICATION__SUBJECT:
				return getSubject();
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
			case FhirPackage.COMMUNICATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.COMMUNICATION__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.COMMUNICATION__SENDER:
				setSender((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION__RECIPIENT:
				getRecipient().clear();
				getRecipient().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COMMUNICATION__PAYLOAD:
				getPayload().clear();
				getPayload().addAll((Collection<? extends CommunicationPayload>)newValue);
				return;
			case FhirPackage.COMMUNICATION__MEDIUM:
				getMedium().clear();
				getMedium().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.COMMUNICATION__STATUS:
				setStatus((CommunicationStatus)newValue);
				return;
			case FhirPackage.COMMUNICATION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION__SENT:
				setSent((DateTime)newValue);
				return;
			case FhirPackage.COMMUNICATION__RECEIVED:
				setReceived((DateTime)newValue);
				return;
			case FhirPackage.COMMUNICATION__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.COMMUNICATION__SUBJECT:
				setSubject((Reference)newValue);
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
			case FhirPackage.COMMUNICATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.COMMUNICATION__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.COMMUNICATION__SENDER:
				setSender((Reference)null);
				return;
			case FhirPackage.COMMUNICATION__RECIPIENT:
				getRecipient().clear();
				return;
			case FhirPackage.COMMUNICATION__PAYLOAD:
				getPayload().clear();
				return;
			case FhirPackage.COMMUNICATION__MEDIUM:
				getMedium().clear();
				return;
			case FhirPackage.COMMUNICATION__STATUS:
				setStatus((CommunicationStatus)null);
				return;
			case FhirPackage.COMMUNICATION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.COMMUNICATION__SENT:
				setSent((DateTime)null);
				return;
			case FhirPackage.COMMUNICATION__RECEIVED:
				setReceived((DateTime)null);
				return;
			case FhirPackage.COMMUNICATION__REASON:
				getReason().clear();
				return;
			case FhirPackage.COMMUNICATION__SUBJECT:
				setSubject((Reference)null);
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
			case FhirPackage.COMMUNICATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.COMMUNICATION__CATEGORY:
				return category != null;
			case FhirPackage.COMMUNICATION__SENDER:
				return sender != null;
			case FhirPackage.COMMUNICATION__RECIPIENT:
				return recipient != null && !recipient.isEmpty();
			case FhirPackage.COMMUNICATION__PAYLOAD:
				return payload != null && !payload.isEmpty();
			case FhirPackage.COMMUNICATION__MEDIUM:
				return medium != null && !medium.isEmpty();
			case FhirPackage.COMMUNICATION__STATUS:
				return status != null;
			case FhirPackage.COMMUNICATION__ENCOUNTER:
				return encounter != null;
			case FhirPackage.COMMUNICATION__SENT:
				return sent != null;
			case FhirPackage.COMMUNICATION__RECEIVED:
				return received != null;
			case FhirPackage.COMMUNICATION__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.COMMUNICATION__SUBJECT:
				return subject != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationImpl
