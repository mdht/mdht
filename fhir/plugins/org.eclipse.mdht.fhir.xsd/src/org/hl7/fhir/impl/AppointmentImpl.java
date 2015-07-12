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

import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentImpl#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentImpl extends DomainResourceImpl implements Appointment {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected AppointmentStatus status;

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
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt priority;

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
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Instant start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Instant end;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> slot;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Reference order;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<AppointmentParticipant> participant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAppointment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.APPOINTMENT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(AppointmentStatus newStatus, NotificationChain msgs) {
		AppointmentStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(AppointmentStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__REASON, oldReason, newReason);
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
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(UnsignedInt newPriority, NotificationChain msgs) {
		UnsignedInt oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(UnsignedInt newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__PRIORITY, newPriority, newPriority));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Instant newStart, NotificationChain msgs) {
		Instant oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Instant newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Instant newEnd, NotificationChain msgs) {
		Instant oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Instant newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.APPOINTMENT__SLOT);
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(Reference newOrder, NotificationChain msgs) {
		Reference oldOrder = order;
		order = newOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__ORDER, oldOrder, newOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(Reference newOrder) {
		if (newOrder != order) {
			NotificationChain msgs = null;
			if (order != null)
				msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__ORDER, null, msgs);
			if (newOrder != null)
				msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT__ORDER, null, msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT__ORDER, newOrder, newOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AppointmentParticipant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<AppointmentParticipant>(AppointmentParticipant.class, this, FhirPackage.APPOINTMENT__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.APPOINTMENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.APPOINTMENT__REASON:
				return basicSetReason(null, msgs);
			case FhirPackage.APPOINTMENT__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.APPOINTMENT__START:
				return basicSetStart(null, msgs);
			case FhirPackage.APPOINTMENT__END:
				return basicSetEnd(null, msgs);
			case FhirPackage.APPOINTMENT__SLOT:
				return ((InternalEList<?>)getSlot()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT__COMMENT:
				return basicSetComment(null, msgs);
			case FhirPackage.APPOINTMENT__ORDER:
				return basicSetOrder(null, msgs);
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.APPOINTMENT__STATUS:
				return getStatus();
			case FhirPackage.APPOINTMENT__TYPE:
				return getType();
			case FhirPackage.APPOINTMENT__REASON:
				return getReason();
			case FhirPackage.APPOINTMENT__PRIORITY:
				return getPriority();
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				return getDescription();
			case FhirPackage.APPOINTMENT__START:
				return getStart();
			case FhirPackage.APPOINTMENT__END:
				return getEnd();
			case FhirPackage.APPOINTMENT__SLOT:
				return getSlot();
			case FhirPackage.APPOINTMENT__COMMENT:
				return getComment();
			case FhirPackage.APPOINTMENT__ORDER:
				return getOrder();
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				return getParticipant();
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
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.APPOINTMENT__STATUS:
				setStatus((AppointmentStatus)newValue);
				return;
			case FhirPackage.APPOINTMENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.APPOINTMENT__REASON:
				setReason((CodeableConcept)newValue);
				return;
			case FhirPackage.APPOINTMENT__PRIORITY:
				setPriority((UnsignedInt)newValue);
				return;
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.APPOINTMENT__START:
				setStart((Instant)newValue);
				return;
			case FhirPackage.APPOINTMENT__END:
				setEnd((Instant)newValue);
				return;
			case FhirPackage.APPOINTMENT__SLOT:
				getSlot().clear();
				getSlot().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.APPOINTMENT__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.APPOINTMENT__ORDER:
				setOrder((Reference)newValue);
				return;
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends AppointmentParticipant>)newValue);
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
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.APPOINTMENT__STATUS:
				setStatus((AppointmentStatus)null);
				return;
			case FhirPackage.APPOINTMENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.APPOINTMENT__REASON:
				setReason((CodeableConcept)null);
				return;
			case FhirPackage.APPOINTMENT__PRIORITY:
				setPriority((UnsignedInt)null);
				return;
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.APPOINTMENT__START:
				setStart((Instant)null);
				return;
			case FhirPackage.APPOINTMENT__END:
				setEnd((Instant)null);
				return;
			case FhirPackage.APPOINTMENT__SLOT:
				getSlot().clear();
				return;
			case FhirPackage.APPOINTMENT__COMMENT:
				setComment((org.hl7.fhir.String)null);
				return;
			case FhirPackage.APPOINTMENT__ORDER:
				setOrder((Reference)null);
				return;
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				getParticipant().clear();
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
			case FhirPackage.APPOINTMENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.APPOINTMENT__STATUS:
				return status != null;
			case FhirPackage.APPOINTMENT__TYPE:
				return type != null;
			case FhirPackage.APPOINTMENT__REASON:
				return reason != null;
			case FhirPackage.APPOINTMENT__PRIORITY:
				return priority != null;
			case FhirPackage.APPOINTMENT__DESCRIPTION:
				return description != null;
			case FhirPackage.APPOINTMENT__START:
				return start != null;
			case FhirPackage.APPOINTMENT__END:
				return end != null;
			case FhirPackage.APPOINTMENT__SLOT:
				return slot != null && !slot.isEmpty();
			case FhirPackage.APPOINTMENT__COMMENT:
				return comment != null;
			case FhirPackage.APPOINTMENT__ORDER:
				return order != null;
			case FhirPackage.APPOINTMENT__PARTICIPANT:
				return participant != null && !participant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppointmentImpl
