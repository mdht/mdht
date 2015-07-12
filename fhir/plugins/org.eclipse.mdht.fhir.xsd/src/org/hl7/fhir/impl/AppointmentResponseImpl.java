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

import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.ParticipantStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getParticipantType <em>Participant Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getParticipantStatus <em>Participant Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AppointmentResponseImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentResponseImpl extends DomainResourceImpl implements AppointmentResponse {
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
	 * The cached value of the '{@link #getAppointment() <em>Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment()
	 * @generated
	 * @ordered
	 */
	protected Reference appointment;

	/**
	 * The cached value of the '{@link #getParticipantType() <em>Participant Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> participantType;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Reference actor;

	/**
	 * The cached value of the '{@link #getParticipantStatus() <em>Participant Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantStatus()
	 * @generated
	 * @ordered
	 */
	protected ParticipantStatus participantStatus;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAppointmentResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.APPOINTMENT_RESPONSE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAppointment() {
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointment(Reference newAppointment, NotificationChain msgs) {
		Reference oldAppointment = appointment;
		appointment = newAppointment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT, oldAppointment, newAppointment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointment(Reference newAppointment) {
		if (newAppointment != appointment) {
			NotificationChain msgs = null;
			if (appointment != null)
				msgs = ((InternalEObject)appointment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT, null, msgs);
			if (newAppointment != null)
				msgs = ((InternalEObject)newAppointment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT, null, msgs);
			msgs = basicSetAppointment(newAppointment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT, newAppointment, newAppointment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getParticipantType() {
		if (participantType == null) {
			participantType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE);
		}
		return participantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActor(Reference newActor, NotificationChain msgs) {
		Reference oldActor = actor;
		actor = newActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__ACTOR, oldActor, newActor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Reference newActor) {
		if (newActor != actor) {
			NotificationChain msgs = null;
			if (actor != null)
				msgs = ((InternalEObject)actor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__ACTOR, null, msgs);
			if (newActor != null)
				msgs = ((InternalEObject)newActor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__ACTOR, null, msgs);
			msgs = basicSetActor(newActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__ACTOR, newActor, newActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantStatus getParticipantStatus() {
		return participantStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantStatus(ParticipantStatus newParticipantStatus, NotificationChain msgs) {
		ParticipantStatus oldParticipantStatus = participantStatus;
		participantStatus = newParticipantStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS, oldParticipantStatus, newParticipantStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantStatus(ParticipantStatus newParticipantStatus) {
		if (newParticipantStatus != participantStatus) {
			NotificationChain msgs = null;
			if (participantStatus != null)
				msgs = ((InternalEObject)participantStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS, null, msgs);
			if (newParticipantStatus != null)
				msgs = ((InternalEObject)newParticipantStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS, null, msgs);
			msgs = basicSetParticipantStatus(newParticipantStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS, newParticipantStatus, newParticipantStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__COMMENT, oldComment, newComment);
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
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__COMMENT, newComment, newComment));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__START, oldStart, newStart);
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
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__START, newStart, newStart));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__END, oldEnd, newEnd);
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
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.APPOINTMENT_RESPONSE__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.APPOINTMENT_RESPONSE__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				return basicSetAppointment(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				return ((InternalEList<?>)getParticipantType()).basicRemove(otherEnd, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__ACTOR:
				return basicSetActor(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				return basicSetParticipantStatus(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__COMMENT:
				return basicSetComment(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__START:
				return basicSetStart(null, msgs);
			case FhirPackage.APPOINTMENT_RESPONSE__END:
				return basicSetEnd(null, msgs);
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
			case FhirPackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				return getAppointment();
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				return getParticipantType();
			case FhirPackage.APPOINTMENT_RESPONSE__ACTOR:
				return getActor();
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				return getParticipantStatus();
			case FhirPackage.APPOINTMENT_RESPONSE__COMMENT:
				return getComment();
			case FhirPackage.APPOINTMENT_RESPONSE__START:
				return getStart();
			case FhirPackage.APPOINTMENT_RESPONSE__END:
				return getEnd();
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
			case FhirPackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				setAppointment((Reference)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				getParticipantType().clear();
				getParticipantType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__ACTOR:
				setActor((Reference)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				setParticipantStatus((ParticipantStatus)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__START:
				setStart((Instant)newValue);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__END:
				setEnd((Instant)newValue);
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
			case FhirPackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				setAppointment((Reference)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				getParticipantType().clear();
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__ACTOR:
				setActor((Reference)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				setParticipantStatus((ParticipantStatus)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__COMMENT:
				setComment((org.hl7.fhir.String)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__START:
				setStart((Instant)null);
				return;
			case FhirPackage.APPOINTMENT_RESPONSE__END:
				setEnd((Instant)null);
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
			case FhirPackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				return appointment != null;
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				return participantType != null && !participantType.isEmpty();
			case FhirPackage.APPOINTMENT_RESPONSE__ACTOR:
				return actor != null;
			case FhirPackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				return participantStatus != null;
			case FhirPackage.APPOINTMENT_RESPONSE__COMMENT:
				return comment != null;
			case FhirPackage.APPOINTMENT_RESPONSE__START:
				return start != null;
			case FhirPackage.APPOINTMENT_RESPONSE__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

} //AppointmentResponseImpl
