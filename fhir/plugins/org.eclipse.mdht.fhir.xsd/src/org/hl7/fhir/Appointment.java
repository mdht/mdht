/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Appointment#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getOrder <em>Order</em>}</li>
 *   <li>{@link org.hl7.fhir.Appointment#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAppointment()
 * @model extendedMetaData="name='Appointment' kind='elementOnly'"
 * @generated
 */
public interface Appointment extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this appointment concern that are defined by business processed and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(AppointmentStatus)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	AppointmentStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AppointmentStatus value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of appointment that is being booked (This may also be associated with participants for location, and/or a HealthcareService).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason that this appointment is being scheduled, this is more clinical than administrative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/Time that the appointment is to take place.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Instant)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Start()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Instant value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/Time that the appointment is to conclude.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Instant)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_End()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Instant value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The slot that this appointment is filling. If provided then the schedule will not be provided as slots are not recursive, and the start/end values MUST be the same as from the slot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Slot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='slot' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSlot();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional comments about the appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Order that lead to the creation of this appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Order()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='order' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Appointment#getOrder <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' containment reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Reference value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AppointmentParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of participants involved in the appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAppointment_Participant()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AppointmentParticipant> getParticipant();

} // Appointment
